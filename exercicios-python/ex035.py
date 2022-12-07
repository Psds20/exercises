a = int(input("type value of side a: "))
b = int(input("type value of side b: "))
c = int(input("type value of side c: "))

if a + b > c and c + a > b and b + c > a:
    print('the values {}, {} e {} will be form a triangle'.format(a, b, c))
else:
    print("the values {}, {} e {} won't be form a triangle".format(a, b, c))
print('-=-' * 20)