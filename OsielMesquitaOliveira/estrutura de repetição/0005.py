'''Altere o programa anterior permitindo ao usuário informar as populações e as taxas de crescimento iniciais. Valide a entrada e permita repetir a operação.'''

opcao = (input('''
    ********************************************
           1 a 9 para calcular crescimento

      Qualquer outra tecla finaliza o programa
    ********************************************
        '''))

validos = ('1','2','3','4','5','6','7','8','9')

while opcao in validos:
    A = float(input("Digite a população do primeiro país: \n"))
    B = float(input("Digite a população do segundo país : \n"))
    ano = 0
    taxa_a = float(input("Digite a taxa de crescimento do país: \n"))/100
    taxa_b = float(input("Digite a taxa de crescimento do país: \n"))/100

    while A < B:
        A = A*(1+taxa_a)
        B = B*(1+taxa_b)

        ano = ano + 1

    print(f'''
    quantidade de anos para 1ª cidade superar 2ª cidade: {ano} anos''')

    opcao = input('''
            ********************************************
                1 a 9 para calcular crescimento

                press outras para finalizar o programa
            ********************************************
        ''')
else:    
    print("Obrigado por utilizar nosso sistema!")
