'''Faça um programa que calcule o fatorial de um número inteiro fornecido pelo usuário. Ex.: 5!=5.4.3.2.1=120
'''
numero = int(input("Insira um número"))

fator = 1
for i in range(1,numero+1):
    fator *= i
    print(fator)
    
print(fator)