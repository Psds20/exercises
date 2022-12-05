import math
n1 = int(input("Digite o valor do lado A: "))
n2 = int(input("Digite o valor do lado B: "))
n3 = int(input("Digite o valor do lado C: "))

p = (n1 + n2 + n3) / 2
a = p * (p - n1) * (p - n2) * (p - n3)
rsl = (math.sqrt(a))

print("O valor do perimetro do triâgulo é {} e a area do triangulo é {}".format(p, rsl))
