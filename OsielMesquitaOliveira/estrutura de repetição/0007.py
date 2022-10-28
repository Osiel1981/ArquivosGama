'''Faça um programa que leia 5 números e informe o maior número.
'''

lista = []
for i in range(0,5,1):
    lista.append(float(input("Insira um valor")))
    i = i+1
print(max(*lista))

