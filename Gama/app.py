from flask import Flask, redirect
import pandas as pd

faturamento = 0
numero_de_vendas = 0
carrinho = {}
somaCarrinho = 0
produtos = {'maça':2.5, 'pera':3}
vendidos = {}
preco = 0


app = Flask(__name__)

@app.route("/")
def home():
    return redirect('static\index2.html')




if __name__ == "__main__":
    app.run(debug=True)
