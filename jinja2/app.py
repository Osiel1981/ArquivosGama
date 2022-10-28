from flask import Flask, url_for, render_template, redirect
import pandas as pd

app = Flask(__name__)

@app.route('/')
def home():
    return render_template('templates.html' ,user='Joaquim')

@app.route("/templates/<int:numero>")
def decisao(numero):
    return render_template('decisao.html', opcao = numero)

@app.route("/produto")
def produtos():
    df = pd.read_csv('arquivos/lista.csv')
    #produtos = df['produto'].to_list()#
    return render_template('lista.html', lista = df)

@app.route('/condicao')
def condicao():
    df = pd.read_csv('arquivos/lista.csv')
    return render_template('listacondicional.html', lista=df)

@app.route('/table')
def table():
    df = pd.read_csv('arquivos\lista.csv')
    table = df.to_html()
    return render_template('table.html', table=table)

    
app.run(debug=True)
