'''Altere o programa anterior para que ele aceite apenas números entre 0 e 1000.
'''
valor = input('''
            -------------------------------------------------------
            pressione qualquer caracter e press enter para iniciar!
            -------------------------------------------------------
                para finalizar o programa insira o valor -1
            -------------------------------------------------------
            ''')
n = []
while not valor == -1:

    valor = int(input(" numero \n"))
    if  valor < 0 or valor > 1000:
        
        print("valor não será computado")
    else:
        n.append(valor)



print(f'''
        maior número                                : {max(n)}
        _______________________________________________________
        Menor número                                : {min(n)}
        _______________________________________________________
        Soma dos números                            : {sum(n)}
        _______________________________________________________
 ''')