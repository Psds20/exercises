n1 = int(input('Digite o primeiro número: '))
n2 = int(input('Digite o segundo número: '))
n3 = int(input('Digite o terceiro número: '))

if n1<n2 and n1<n3:
    mn = n1
if n2<n1 and n2<n3:
    mn = n2
if n3<n1 and n3<n2:
    mn = n3
if n1>n2 and n1>n3:
    mr = n1
if n2>n1 and n2>n3:
   mr = n2
if n3>n1 and n3>n2:
   mr = n3

print("O maior número é {} e o menor é {}".format(mr, mn))

