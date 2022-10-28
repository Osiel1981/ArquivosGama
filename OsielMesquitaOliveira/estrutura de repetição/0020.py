
numero = 1

while numero != 0:
    numero = int(input(f'''
    ------------------------------------------------------
    Insira um valor entre 1 e 16 para calcular o fatorial.
    ------------------------------------------------------
                insira '0' para finalizar!
    ------------------------------------------------------
    '''))

    if numero >= 1 and numero<= 17:
        fator = 1
        for i in range(1,numero+1):
            fator *= i
            #print(fator)
            
        print(fator)
    elif numero == 0:
        print("Finalizando o Programa")

    else:
        print("Numero inválido")

print("Obrigado por utilizar nosso programa")