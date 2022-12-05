import random
import emoji
print("\33[1;31mVamos ver se você ganha de mim no pedra, papel e tesoura\033[m")
print(emoji.emojize('0 = :hand:', use_aliases=True))
print(emoji.emojize('1 = :v:', use_aliases=True))
print(emoji.emojize('2 = :facepunch:', use_aliases=True))
emoji0 = emoji.emojize(':hand:', use_aliases=True)
emoji1 = emoji.emojize(':v:', use_aliases=True)
emoji2 = emoji.emojize(':facepunch:', use_aliases=True)
bravo = emoji.emojize(':angry:', use_aliases=True)
oculos = emoji.emojize(':sunglasses:',use_aliases=True)


n1 = int(input("Escolha entre 0, 1 e 2: "))

sorteio = random.randint(0, 2)

if sorteio == 0 and n1 == 2:
    print("Eu ganhei {}".format(oculos))
    print("Você perdeu!!HAHAHA")
    print("Eu escolhi {} e você {}".format(emoji0, emoji2))
elif sorteio == 0 and n1 == 1:
    print("Infelizmento você ganhou.{}".format(bravo))
    print("Eu escolhi {} e você {}".format(emoji0, emoji1))
elif sorteio == 1 and n1 == 0:
    print("Eu ganhei {}".format(oculos))
    print("Você perdeu!!HAHAHA")
    print("Eu escolhi {} e você {}".format(emoji1, emoji0))
elif sorteio == 1 and n1 == 2:
    print("Infelizmento você ganhou.{}".format(bravo))
    print("Eu escolhi {} e você {}".format(emoji0, emoji1))
elif sorteio == 2 and n1 == 1:
    print("Eu ganhei {}".format(oculos))
    print("Você perdeu!!HAHAHA")
    print("Eu escolhi {} e você {}".format(emoji2, emoji1))

elif sorteio == 2 and n1 == 0:
    print("Infelizmento você ganhou.{}".format(bravo))
    print("Eu escolhi {} e você {}".format(emoji2, emoji0))

elif sorteio == n1:
    print("Nós empatamos.Jogue denovo!!!!!!")

else:
    print("Resultado invalido")