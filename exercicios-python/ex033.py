n1 = int(input('type the first number: '))
n2 = int(input('type the second number: '))
n3 = int(input('type the third number: '))

if n1<n2 and n1<n3:
    smaller= n1
if n2<n1 and n2<n3:
    smaller = n2
if n3<n1 and n3<n2:
    smaller = n3
if n1>n2 and n1>n3:
    higher = n1
if n2>n1 and n2>n3:
    higher = n2
if n3>n1 and n3>n2:
    higher = n3

print("the higher number is {} ant the smaller is {}".format(higher, smaller))

