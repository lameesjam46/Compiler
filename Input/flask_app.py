from flask import Flask, render_template, request, redirect, url_for

app = Flask(__name__)

# =========================
# بيانات مخزنة (List + Dict)
# =========================
products = [
    {
        "id": 1,
        "name": "Phone",
        "price": 100,
        "details": "Smart phone",
        "image": "phone.jpg"
    },
    {
        "id": 2,
        "name": "Laptop",
        "price": 500,
        "details": "Powerful laptop",
        "image": "laptop.jpg"
    }
]

# =========================
# الصفحة الرئيسية
# =========================
@app.route("/")
def home():
    total = 0
    for p in products:
        total = total + p["price"]

    avg_price = total / len(products) if products else 0

    return render_template(
        "index.html",
        products=products,
        avg_price=avg_price
    )

# =========================
# عرض جميع المنتجات
# =========================
@app.route("/products")
def show_products():
    return render_template(
        "products.html",
        products=products,
        count=len(products)
    )

# =========================
# تفاصيل منتج
# =========================
@app.route("/product/<int:pid>")
def product_detail(pid):
    product = None

    for p in products:
        if p["id"] == pid:
            product = p
            break

    if product is None:
        return "Product not found"

    return render_template(
        "product_detail.html",
        product=product
    )

# =========================
# إضافة منتج
# =========================
@app.route("/add", methods=["GET", "POST"])
def add_product():
    if request.method == "POST":

        # حساب ID جديد (بدون comprehension)
        new_id = 1
        if products:
            last = products[-1]
            new_id = last["id"] + 1

        price_value = float(request.form["price"])

        new_product = {
            "id": new_id,
            "name": request.form["name"],
            "price": price_value,
            "details": request.form["details"],
            "image": request.form["image"]
        }

        products.append(new_product)

        return redirect(url_for("show_products"))

    return render_template("add_product.html")

# =========================
# حذف منتج
# =========================
@app.route("/delete/<int:pid>")
def delete_product():
    index = -1

    for i in range(len(products)):
        if products[i]["id"] == pid:
            index = i
            break

    if index != -1:
        products.pop(index)

    return redirect(url_for("show_products"))

# =========================
# بحث عن منتج
# =========================
@app.route("/search")
def search():
    keyword = request.args.get("q")
    results = []

    if keyword:
        for p in products:
            if keyword.lower() in p["name"].lower():
                results.append(p)
            else:
                continue

    return render_template(
        "search.html",
        keyword=keyword,
        results=results
    )
