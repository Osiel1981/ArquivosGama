'''A série de Fibonacci é formada pela seqüência 1,1,2,3,5,8,13,21,34,55,... Faça um programa capaz de gerar a série até o n−ésimo termo.
'''

n = int(input("entre com um número:"))
ant1 = 0
ant2 = 1
fibo = 0
for i in range(0,n,1):
    fibo = ant1 + ant2
    ant2 = ant1 
    ant1 = fibo
    
    print(fibo, end=" ") 
