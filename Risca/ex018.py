from math import(cos, sin, tan)
n1 = int(input("Qual é o angulo: "))

rsl = cos(n1)
rsl1 = sin(n1)
rsl2 = tan(n1)

print("O seno de {} é {:.2f} o cosseno é {:.2f} e tangente é {:.2f}".format(n1, rsl, rsl1, rsl2))