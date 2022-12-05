n1 = input("Digite o seu nome completo: ").strip()

maiuscula = n1.upper()

print(maiuscula)

minuscula = n1.lower()

print(minuscula)

lista = n1.split()

print("O seu nome Completo tem {} letras".format(len("".join(lista))))

print("O seu primeiro nome é {} e possui {} letras".format(lista[0], len(lista[0])))
