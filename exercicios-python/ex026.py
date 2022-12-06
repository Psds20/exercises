frase = str(input("type a phrase: ").strip().upper())

print("the phrase has {} letter A ".format(frase.count("A")))

pla = frase.find('A') + 1
ula = frase.rfind('A') + 1

print("the first letter A appeared in position {}".format(pla))
print("the last letter A appeared in position {}".format(ula))
