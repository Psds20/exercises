sum1 = 0
for c in range(0, 6):
    n1 = int(input("type a value: "))
    if n1 % 2 == 0:
        sum1 += n1
print("the sum of all even number is {}".format(sum1))