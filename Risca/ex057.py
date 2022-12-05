print("\033[34mM = masculino")
print("\033[31mF = feminino")
c = 0
contm = 0
contf = 0


while c < 4:
   n1 = str(input("Digite o seu Sexo: ")).upper().strip()
   if n1 == "M":
     sexo = "Masculino"
     print("Seu sexo é {}".format(sexo))
     contm += 1

   elif n1 == "F":
     sexo = "feminino"
     contf += 1
     print("Seu sexo é {}".format(sexo))
   else:
    print("\033[32mInvalido")
    c += 1
print("quantidade de homens {}".format(contm))
print("quantidade de mulheres {}".format(contf))

