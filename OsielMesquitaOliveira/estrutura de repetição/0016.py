'''A série de Fibonacci é formada pela seqüência 0,1,1,2,3,5,8,13,21,34,55,... Faça um programa que gere a série até que o valor seja maior que 500.
'''


num1 = 0
num2 = 1
fibo = 0
i = 0
while i < 3000 :
    fibo = num2 + num1
    num2 = num1
    num1 = fibo

    i =+ fibo
    

    print(fibo, end=" ")