import random
import emoji
print("\33[1;31mLet's see if you win of me in the  rock, paper, scissor\033[m")
print(emoji.emojize('0 = :hand:', use_aliases=True))
print(emoji.emojize('1 = :v:', use_aliases=True))
print(emoji.emojize('2 = :facepunch:', use_aliases=True))
emoji0 = emoji.emojize(':hand:', use_aliases=True)
emoji1 = emoji.emojize(':v:', use_aliases=True)
emoji2 = emoji.emojize(':facepunch:', use_aliases=True)
bravo = emoji.emojize(':angry:', use_aliases=True)
oculos = emoji.emojize(':sunglasses:',use_aliases=True)


n1 = int(input("Choose between 0, 1 and 2: "))

sorteio = random.randint(0, 2)

if sorteio == 0 and n1 == 2:
    print("I win!! {}".format(oculos))
    print("You lost!!HAHAHA")
    print("I choose{} and you {}".format(emoji0, emoji2))
elif sorteio == 0 and n1 == 1:
    print("unfortunately you win.{}".format(bravo))
    print("I choose{} and you {}".format(emoji0, emoji1))
elif sorteio == 1 and n1 == 0:
    print("I win!! {}".format(oculos))
    print("You lost!!HAHAHA")
    print("I choose{} and you {}".format(emoji0, emoji2))
elif sorteio == 1 and n1 == 2:
    print("unfortunately you win.{}".format(bravo))
    print("I choose{} and you {}".format(emoji0, emoji1))
elif sorteio == 2 and n1 == 1:
    print("I win!! {}".format(oculos))
    print("You lost!!HAHAHA")
    print("I choose{} and you {}".format(emoji0, emoji2))

elif sorteio == 2 and n1 == 0:
    print("unfortunately you win.{}".format(bravo))
    print("I choose{} and you {}".format(emoji0, emoji1))
elif sorteio == n1:
    print("We draw.Play again!!!!!!")

else:
    print("invalid result")