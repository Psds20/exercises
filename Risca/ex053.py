frase = str(input("Digite uma frase: ").upper().strip().replace(" ", ""))
if frase[::-1] == frase:
    print("A frase é um palindromo.")
else:
    print("A frase não é um palindromo")




