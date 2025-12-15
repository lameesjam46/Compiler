from flask import Flask, render_template, request


app = Flask(__name__)


products =[
    {"id": 1, "name": "Phone",  "price": 100, "details": "Smart phone", "image":"phone.jpg"},
    {"id": 2, "name": "Laptop", "price": 500, "details": "Powerful laptop", "image":"laptop.jpg"}
]


app.route("/products")
def show_products():

    return render_template("display.html", products=products)

app.route("/add")
def add_product():
    new_product ={"id": 3, "name": "Lamp", "price": 15.75, "details": "A lamp", "image": "lamp.jpg"}
    return render_template("add.html", new_product=new_product)

app.route("/detail")
def detail_product():
    product ={"id": 1, "name": "Phone", "price": 100, "details": "Smart phone", "image":"phone.jpg"}
    return render_template("detail.html", product=product)
