numero = int(input("Digite um número de 0 a 9999: "))
u = numero // 1 % 10
d = numero // 10 % 10
c = numero // 100 % 10
m = numero // 1000 % 10



print("o numero digitado tem {} milhar, {} centena, {} dezena e {} unidades ".format(u, d, c, m))



