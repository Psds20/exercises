a = int(input("Digite o valor do lado a: "))
b = int(input("Digite o valor do lado b: "))
c = int(input("Digite o valor do lado c: "))

if a + b > c and c + a > b and b + c > a:
    print('Os valores {}, {} e {} vão formar um triângulo'.format(a, b, c))
else:
    print("Os valores {}, {} e {} não vão formar um triângulo".format(a, b, c))
print('-=-' * 20)