n1 = int(input("Digite a sua idade: "))

if n1 <= 9:
    print("\033[7mYour category is MIRIM")
elif n1 <= 14:
    print("\033[7mYour category is infantile")
elif n1 <= 19:
    print("\033[7mYour category is junior")
elif n1 <= 20:
    print("\033[7mYour category is senior")
else:
    print("\033[7mYour category is master")

