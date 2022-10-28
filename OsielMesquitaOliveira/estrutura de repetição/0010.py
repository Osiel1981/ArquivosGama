'''Faça um programa que receba dois números inteiros e gere os números inteiros que estão no intervalo compreendido por eles.
'''
num1 = int(input("Entre com primeiro número:\n"))
num2 = int(input("Entre com segundo numero:\n"))

for i in range(num1+1,num2,1):
    print(i)
