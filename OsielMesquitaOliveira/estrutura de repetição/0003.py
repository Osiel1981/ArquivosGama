'''Faça um programa que leia e valide as seguintes informações:
Nome: maior que 3 caracteres;
Idade: entre 0 e 150;
Salário: maior que zero;
Sexo: 'f' ou 'm';
Estado Civil: 's', 'c', 'v', 'd';'''

nome = input("Digite seu nome: \n")
while not len(nome) >3:
    nome = input("Nome deve ter mais de 3 caracteres! \nDigite seu nome: \n")

idade = int(input("Qual a sua idade? "))
while (idade < 0  or idade > 151):
    idade = int(input("Idade inválida! \nQual a sua idade? "))

salario = float(input("Qual o seu salário atual? "))
while not salario > 0 :
    salario = float(input("Salário inválido! \nQual o seu salário? "))

sexo = input("Qual o seu sexo? ").upper()
while  not sexo == 'M' or sexo == 'F':
    sexo = input("Sexo inválido! \nQual o seu sexo? ").upper()

lista_est_civil = {'S', 'C', 'V', 'D'}

Est_civ = input("Entre com seu estado civil:\nS = Solteiro\nC = Casado\nV = Viúvo\nD = Divorciado").upper()
while not Est_civ in lista_est_civil:
    print("Valor inválido!!!")
    Est_civ = input("Entre com seu estado civil:\nS = Solteiro\nC = Casado\nV = Viúvo\nD = Divorciado").upper()

print( "\n", nome, "\n", idade , "\n", salario, "\n", sexo, "\n", Est_civ)



