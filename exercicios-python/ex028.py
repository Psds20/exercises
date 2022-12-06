from random import(randint)
from time import sleep
n2 = randint(0, 5)
n1 = int(input("try quess what number will be draw between 0 and 5: "))
print("processing...")
sleep(1)
if n1 == n2:
    print("Gratters!!")
    print("you guess the number")
    print('the number draw was the {}'.format(n2))

else:

    print("you missed!!!")
    print("you put {} and the number draw was {}".format(n1, n2))


