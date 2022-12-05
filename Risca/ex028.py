from random import(randint)
from time import sleep
n2 = randint(0, 5)
n1 = int(input("Tente adivinhar qual número será sorteado entre 0 e 5: "))
print("PROCESSANDO...")
sleep(3)
if n1 == n2:
    print("Parabêns!!")
    print("Você acertou o número")
    print('O número sorteado foi o {}'.format(n2))

else:

    print("Que pena")
    print("Você errou!!!")
    print("Você colocou {} e o número sorteado foi {}".format(n1, n2))


