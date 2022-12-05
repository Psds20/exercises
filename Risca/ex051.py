pt = int(input("Digite o valor do primeiro termo:"))
razao = int(input("Digite o valor da razão: "))
decimo = pt + 9 * razao
for c in range(pt, decimo + razao, razao):
   print("{}".format(c), end="-")
print("Acabou!!!!")
