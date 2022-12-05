from math import(pow, sqrt)
n1 = int(input("Digite o valor de CA (cateto adjascente): "))
n2 = int(input("Digite o valor de CO (cateto oposto): "))

res = (pow(n1, 2)) + (pow(n2, 2))
rsl = (sqrt(res))

print("o valor de CA é {} e de CO é {} e a hipotenusa deles resulta em {}".format(n1, n2, rsl))