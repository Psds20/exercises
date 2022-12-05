a = int(input("Digite o valor do lado A: "))
b = int(input("Digite o valor do lado B: "))
c = int(input("Digite o valor do lado C: "))

if a + b > c and c + a > b and c + b > a:
 if a == b and b == c:
      print("O resultado dos três lados é um triângulo equilatero.")
 else:
  if a != b and b != c and c != a:
      print("O resultado dos três lados é um triângulo escaleno.")
  else:
      print('O resultado dos três lados é um triângulo isósceles.')

else:
 print("Estes lados não forman um triângulo")