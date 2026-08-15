let pyFileHandle = null;

function openDB() {
    return new Promise((resolve, reject) => {
        const req = indexedDB.open("FileStore", 1);
        req.onupgradeneeded = () => req.result.createObjectStore("handles");
        req.onsuccess = () => resolve(req.result);
        req.onerror = () => reject(req.error);
    });
}

async function saveHandleToDB(handle) {
    const db = await openDB();
    const tx = db.transaction("handles", "readwrite");
    tx.objectStore("handles").put(handle, "py_file");
}

async function getHandleFromDB() {
    try {
        const db = await openDB();
        return new Promise((resolve) => {
            const tx = db.transaction("handles", "readonly");
            const req = tx.objectStore("handles").get("py_file");
            req.onsuccess = () => resolve(req.result || null);
            req.onerror = () => resolve(null);
        });
    } catch {
        return null;
    }
}

// جلب مرجع الملف وإعادة التنشيط المباشر للأذونات
async function getPyFileHandle() {
    let handle = pyFileHandle || (await getHandleFromDB());

    if (handle) {
        try {
            let perm = await handle.queryPermission({ mode: 'readwrite' });
            if (perm !== 'granted') {
                perm = await handle.requestPermission({ mode: 'readwrite' });
            }
            if (perm === 'granted') {
                await handle.getFile(); // فحص صلاحية الوصول
                pyFileHandle = handle;
                return handle;
            }
        } catch (e) {
            // في حال انتهاء صلاحية المرجع المخزن
            handle = null;
        }
    }

    // إذا لم تكن الأذونات مفعلة، نطلب فتح النافذة بحدث مباشر
    try {
        [handle] = await window.showOpenFilePicker({
            types: [{ description: 'Python File', accept: { 'text/x-python': ['.py'] } }]
        });
        await saveHandleToDB(handle);
        pyFileHandle = handle;
        return handle;
    } catch (err) {
        alert("يجب اختيار ملف flask_app.py لتنفيذ العملية.");
        return null;
    }
}

function cleanPythonCode(content) {
    content = content.replace(/\r\n/g, "\n").replace(/\r/g, "\n");
    content = content.replace(/,\s*,/g, ",");
    content = content.replace(/,\s*\]/g, "\n]");
    return content;
}

function filterProducts() {
    const searchBox = document.getElementById("searchBox");
    const resultsGrid = document.getElementById("resultsGrid");
    const searchInfo = document.getElementById("searchInfo");

    if (!searchBox || !resultsGrid || typeof allProducts === "undefined") return;

    const query = searchBox.value.trim().toLowerCase();

    if (query === "") {
        resultsGrid.innerHTML = "";
        searchInfo.textContent = "اكتبي اسم منتج بالأعلى للبحث عنه.";
        return;
    }

    const filtered = allProducts.filter(p => p.name.toLowerCase().includes(query));

    if (filtered.length === 0) {
        resultsGrid.innerHTML = '<p class="empty-state">لا يوجد نتائج تطابق بحثك.</p>';
        searchInfo.textContent = `نتائج البحث عن "${query}": 0`;
    } else {
        searchInfo.textContent = `عدد النتائج المعروضة: ${filtered.length}`;
        resultsGrid.innerHTML = filtered.map(p => `
            <div class="product-card">
                <h3>${p.name}</h3>
                <p class="price">${p.price}$</p>
                <a href="product_detail_${p.id}.html" class="btn-details">عرض التفاصيل</a>
            </div>
        `).join("");
    }
}

document.addEventListener("DOMContentLoaded", function () {

    // --- 1. إضافة منتج ---
    const addForm = document.querySelector(".product-form");
    if (addForm) {
        addForm.addEventListener("submit", async function (e) {
            e.preventDefault();

            // الحصول على الملف أولاً أثناء استجابة الضغط المباشرة
            const handle = await getPyFileHandle();
            if (!handle) return;

            const name = document.getElementById("name").value.trim();
            const price = document.getElementById("price").value.trim();
            const details = document.getElementById("details").value.trim();
            const imageInput = document.getElementById("image");
            const image = (imageInput && imageInput.value.trim()) ? imageInput.value.trim() : "default.jpg";

            try {
                const file = await handle.getFile();
                let content = await file.text();

                const idMatches = [...content.matchAll(/"id":\s*(\d+)/g)];
                const existingIds = idMatches.map(m => parseInt(m[1]));
                const maxId = existingIds.length > 0 ? Math.max(...existingIds) : 0;
                const newId = maxId + 1;

                const newProdStr = `,\n    {\n        "id": ${newId},\n        "name": "${name}",\n        "price": ${price},\n        "details": "${details}",\n        "image": "${image}"\n    }`;

                const productsRegex = /(products\s*=\s*\[[\s\S]*?)(\n\s*\])/;
                if (productsRegex.test(content)) {
                    content = content.replace(productsRegex, `$1${newProdStr}$2`);
                } else {
                    alert("تعذر تحديد مصفوفة products بداخل الملف!");
                    return;
                }

                content = cleanPythonCode(content);

                const writable = await handle.createWritable();
                await writable.write(content);
                await writable.close();

                alert("تم إضافة المنتج بنجاح!");
                window.location.href = "products.html";
            } catch (err) {
                alert("خطأ أثناء الحفظ: " + err.message);
            }
        });
    }

    // --- 2. حذف منتج ---
    document.addEventListener("click", async function (e) {
        if (e.target && e.target.classList.contains("btn-delete")) {
            e.preventDefault();

            const href = e.target.getAttribute("href") || "";
            const match = href.match(/delete[=\/](\d+)/);
            if (!match) return;

            const productId = match[1];

            // 1. طلب صلاحيات الملف أولاً (قبل التوقف عند confirm)
            const handle = await getPyFileHandle();
            if (!handle) return;

            // 2. طلب التأكيد بعد تأمين وصول الملف
            if (!confirm("هل أنتِ متأكدة من حذف المنتج رقم " + productId + "؟")) return;

            try {
                const file = await handle.getFile();
                let content = await file.text();

                const regex = new RegExp(`\\{\\s*"id":\\s*${productId}[^}]*\\},?`, "g");
                content = content.replace(regex, "");

                content = cleanPythonCode(content);

                const writable = await handle.createWritable();
                await writable.write(content);
                await writable.close();

                alert("تم الحذف بنجاح!");
                window.location.reload();
            } catch (err) {
                alert("خطأ أثناء الحذف: " + err.message);
            }
        }
    });
});