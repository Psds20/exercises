n1 = int(input("Digite a sua idade: "))

if n1 <= 9:
    print("\033[7mA sua categoria é MIRIM")
elif n1 <= 14:
    print("\033[7mA sua categoria é INFANTIL")
elif n1 <= 19:
    print("\033[7mA sua categoria é JUNIOR")
elif n1 <= 20:
    print("\033[7mA sua categoria é SÊNIOR")
else:
    print("\033[7mA sua categoria é MESTRE")

