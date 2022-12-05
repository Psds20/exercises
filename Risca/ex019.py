import random
n = input("Digite o nome do primeiro aluno: ")
n1 = input("Digite o nome do segundo aluno: ")
n2 = input("Digite o nome do terceiro aluno: ")
n3 = input ("Digite o nome do quarto aluno: ")


lista = [n, n1, n2, n3]

sorteio = random.choice(lista)

print("O aluno sorteado foi {}".format(sorteio))