'''Faça um programa que peça 10 números inteiros, calcule e mostre a quantidade de números pares e a quantidade de números impares.
'''
from itertools import count


impares = 0
pares = 0

for i in range(0,10,1):
    numero = int(input("Número:\n"))
    
    if numero % 2 == 0:
        pares = pares + 1

    else:
        impares = impares +1 
print("Impares ",impares)
print("Pares ",pares)


