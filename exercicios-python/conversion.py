print("1 = celsius to fahrenheit")
print("2 = fahrenheit to Celsius")
print("3 = celsius to kelvin")
print("4 = fahrenheit to kelvin")
print("5 = kelvin to Celsius")
print("6 = kelvin to fahrenheit")
print("7=  to calculate linear dilation:")
n1 = float(input("type the option of your preference:"))

if(n1 == 1):
    n2 = float(input("type the value in Celsius"))
    rsl = (n2 * 9/5) + 32
    print("The value in Celsius is {} and it in fahrenheit is {} ".format(n2, rsl))
elif n1 == 2:
    n2 = float(input("type the value in fahrenheit : "))
    rsl = (n2 - 32) * (9/5)
    print("The value in fahrenheit is {} and it in celsius is {} ".format(n2, rsl))
elif n1 == 3:
    n2 = float(input("type the value in Celsius: "))
    rsl = n2 + 273.15
    print("The value in Celsius is {} and it in kelvin is {} ".format(n2, rsl))
elif n1 == 4:
    n2 = float(input("type the value in fahrenheit: "))
    rsl = (n2 - 32) * 5/9 + 273.15
    print("The value in fahrenheit is {} and it in kelvin is {} ".format(n2, rsl))
elif n1 == 5:
    n2 = float(input("type the value in Kelvin: "))
    rsl = n2 - 273.15
    print("The value in  kelvin is {} and it in Celsius is {} ".format(n2, rsl))
elif n1 == 6:
    n2 = float(input("type the value in Kelvin: "))
    rsl = (n2 - 273.15) * (9/5) + 32
    print("The value in kelvin é {} and it in fahrenheit is {} ".format(n2, rsl))
elif n1 == 7:
    li = float(input("type the value of Li: "))
    a = float(input("type the value of coefficient: "))
    t = float(input("type the value of ▲T: "))

    rsl = li * a * t

    print("the value of ▲L is {} ".format(rsl))
else:
    print("\033[1;31m___________________________________")
    print(" ")
    print("            Incorret              ")
    print("___________________________________\033[m")