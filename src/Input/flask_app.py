from flask import Flask, render_template, request, redirect, url_for

app = Flask(__name__)

# بيانات تجريبية
products = [
    {"id": 1, "name": "Phone", "price": 100, "details": "Smart phone", "image": "phone.jpg"},
    {"id": 2, "name": "Laptop", "price": 500, "details": "Powerful laptop", "image": "laptop.jpg"}
]

# ==========================
# عرض جميع المنتجات
# ==========================
@app.route("/products")
def show_products():
    return render_template(
        "products.html",
        products=products,
        title="All Products"
    )

# ==========================
# تفاصيل منتج
# ==========================
@app.route("/product/<int:pid>")
def product_detail(pid):
    product = None
    for p in products:
        if p["id"] == pid:
            product = p
            break

    return render_template(
        "product_detail.html",
        product=product
    )

# ==========================
# إضافة منتج
# ==========================
@app.route("/add", methods=["GET", "POST"])
def add_product():
    if request.method == "POST":
        new_id = products[-1]["id"] + 1 if products else 1

        new_product = {
            "id": new_id,
            "name": request.form["name"],
            "price": float(request.form["price"]),
            "details": request.form["details"],
            "image": request.form["image"]
        }

        products.append(new_product)
        return redirect(url_for("show_products"))

    return render_template("add_product.html")
