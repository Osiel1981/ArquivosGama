'''Faça um programa que, dado um conjunto de N números, determine o menor valor, o maior valor e a soma dos valores.
'''

valor = 1
n = []
while not valor == 0:
    valor = int(input(" numero \n"))
    if valor != 0:
        n.append(valor)
    else:
        print("Realizando calculos")

print(f'''
        maior número                                : {max(n)}
        _______________________________________________________
        Menor número                                : {min(n)}
        _______________________________________________________
        Soma dos números                            : {sum(n)}
        _______________________________________________________
 ''')