n1 = int(input("Digite um número: "))
tot = 0
for c in range(1, n1 + 1):


    if n1 % c == 0:
        print("\033[33m", c, end=" ")
        tot += 1
    else:
        print("\033[31m", c, end=" ")
print("\n\033[mO número {} foi divido {} vezes".format(n1, tot))

if tot == 2:
    print("O número é primo.")

else:
    print("O número não é primo.")