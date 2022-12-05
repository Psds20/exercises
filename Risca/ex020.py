from random import shuffle
n1 = input("type the name of the first's student: ")
n2 = input("type the name of the second's student: ")
n3 = input("type the name of the third's student: ")
n4 = input("type the name of the fourth's student: ")

list1 = [n1, n2, n3, n4]
shuffle(list1)
print("A ordem de apresentação será {} ".format(list1))
