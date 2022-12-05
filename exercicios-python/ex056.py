idade1 = 0
idade2 = 0
media = 0
nomev = 0
tot = 0
for c in range(1, 5):
    print("-------{}ª pessoa----------".format(c))
    nome = str(input("Digite seu nome: ")).strip()
    idade = float(input("Digite sua idade: "))
    sexo = str(input("Sexo F/M:")).upper().strip()
    media += idade
    if c == 1 and sexo == "M":
        idade1 = idade
        idade2 = idade
        nomev = nome

    if idade > idade1 and sexo == "M":
            idade1 = idade
    if c == 1 and sexo == "F" and idade > 20:
        tot += 1


media1 = media / 4
print("A média de idade do grupo é {}".format(media1))
print("O homem mais velho é {} com {} anos".format(nomev, idade1))
print("Existem {} mulheres menores que 20 anos".format(tot))

