from datetime import date
ano = date.today().year
tol = 0
tol2 = 0
for c in range(1, 7+1):
  n1 = int(input("Em que ano a {} primeira pessoa nasceu: ".format(c)))
  idade = ano - n1
  if idade >= 21:
   tol += 1

  else:
   tol2 += 1



print("Existem {} pessoas maiores de idade.".format(tol))
print("Existe {} pessoas menores de idade.".format(tol2))