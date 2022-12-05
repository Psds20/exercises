import random
n1 = input("type the name of first's student: ")
n2 = input("type the name of second's student: ")
n3 = input("type the name of third's student: ")
n4 = input("type the name of fourth's student: ")


list1 = [n1, n2, n3, n4]

sort = random.choice(list1)

print("the random student is {}".format(sort))