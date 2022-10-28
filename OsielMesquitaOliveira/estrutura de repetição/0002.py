'''Faça um programa que leia um nome de usuário e a sua senha e não aceite a senha igual ao nome do usuário, mostrando uma mensagem de erro e voltando a pedir as informações.'''

username = ""
senha = ""
while username == senha:
    username = input("Digite seu nome: \n")
    senha = input("Digite uma senha \n")
exit(0)
