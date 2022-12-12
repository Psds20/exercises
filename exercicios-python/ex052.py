n1 = int(input("type a number: "))
tot = 0
for c in range(1, n1 + 1):


    if n1 % c == 0:
        print("\033[33m", c, end=" ")
        tot += 1
    else:
        print("\033[31m", c, end=" ")
print("\n\033[mthe number {} was divide {} times".format(n1, tot))

if tot == 2:
    print("The number is prime.")

else:
    print("The number isn't prime.")