print("1 = celsius para fahrenheit")
print("2 = fahrenheit para Celsius")
print("3 = celsius para kelvin")
print("4 = fahrenheit para kelvin")
print("5 = kelvin para Celsius")
print("6 = kelvin para fahrenheit")
print("7= Para calcular a dilatação linear:")
n1 = float(input("Digite a opção de sua preferencia: "))

if(n1 == 1):
    n2 = float(input("Digite o Valor em Celsius: "))
    rsl = (n2 * 9/5) + 32
    print("O valor de Celsius é {} e em fahrenheit é {} ".format(n2, rsl))
elif n1 == 2:
    n2 = float(input("Digite o Valor em fahrenheit : "))
    rsl = (n2 - 32) * (9/5)
    print("O valor em fahrenheit é {} e em conversão para Celsius é {} ".format(n2, rsl))
elif n1 == 3:
    n2 = float(input("Digite o Valor em Celsius: "))
    rsl = n2 + 273.15
    print("O valor em  Celsius é {} e convertido para kelvin é {} ".format(n2, rsl))
elif n1 == 4:
    n2 = float(input("Digite o Valor em fahrenheit: "))
    rsl = (n2 - 32) * 5/9 + 273.15
    print("O valor em fahrenheit  {} e convertido para kelvin é {} ".format(n2, rsl))
elif n1 == 5:
    n2 = float(input("Digite o Valor em Kelvin: "))
    rsl = n2 - 273.15
    print("O valor em  kelvin é {} e convertido para Celsius é {} ".format(n2, rsl))
elif n1 == 6:
    n2 = float(input("Digite o Valor em Kelvin: "))
    rsl = (n2 - 273.15) * (9/5) + 32
    print("O valor em  kelvin é {} e convertido para fahrenheit  é {} ".format(n2, rsl))
elif n1 == 7:
    li = float(input("Digite o valor de Li: "))
    a = float(input("Digite o valor do coefeciente: "))
    t = float(input("Digite o Valor de ▲T: "))

    rsl = li * a * t

    print("O valor de ▲L é {} ".format(rsl))
