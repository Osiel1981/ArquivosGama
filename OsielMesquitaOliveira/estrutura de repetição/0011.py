'''Altere o programa anterior para mostrar no final a soma dos números.
'''
num1 = int(input("Entre com primeiro número:\n"))
num2 = int(input("Entre com segundo numero:\n"))
lista= []
for i in range(num1+1,num2,1):
    lista.append(i)
print(sum(lista))
