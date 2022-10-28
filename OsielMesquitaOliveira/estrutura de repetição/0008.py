'''Faça um programa que leia 5 números e informe a soma e a média dos números.
'''

from statistics import mean, median

lista = []
for i in range(0,5,1):
    lista.append(int(input("Insira o número: ")))
    i = i+1
print(float(mean(lista)))


