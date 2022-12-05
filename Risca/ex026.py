frase = str(input("Digite uma frase: ").strip().upper())

print("A frase tem {} letra A ".format(frase.count("A")))

pla = frase.find('A') + 1
ula = frase.rfind('A') + 1

print("A primeira letra A apareceu na posição {}".format(pla))
print("A ultima letra A apareceu na posição {}".format(ula))
