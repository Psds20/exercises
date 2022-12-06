n1 = input("type your complete name: ").strip()

upper = n1.upper()

print(upper)

lower = n1.lower()

print(lower)

lista = n1.split()

print("the complete name has {} letters".format(len("".join(lista))))

print("the firt's name is {} and it has {} letters".format(lista[0], len(lista[0])))
