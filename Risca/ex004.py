n1 = input("Digite algo: ")

print("O tipo desse valor é:", type(n1))
print("Só tem espaçõs:", n1.isspace())
print("É um númerico: ", n1.isnumeric())
print("È alfabético: ", n1.isalpha())
print("É alfanumerico:", n1.isalnum())
print("Esta me maiusculo: ", n1.isupper())
print("Está em minúsculo:", n1.islower())
print("Está capitalizada: ", n1.istitle())