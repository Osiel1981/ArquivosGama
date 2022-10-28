'''Faça um programa que imprima na tela os números de 1 a 20, um abaixo do outro. Depois modifique o programa para que ele mostre os números um ao lado do outro.'''

from pickle import APPEND


contador = 0
for contador in range (0,21,1):
    contador + 1
    print(contador)
    
lista = [0]
for i in range(0, 20, 1):
    lista.append(i+1)
print(*lista, sep= ' ')



