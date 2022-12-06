numero = int(input("type a number between 0 and 9999: "))
units = numero // 1 % 10
tens = numero // 10 % 10
hun = numero // 100 % 10
tho = numero // 1000 % 10

print("the number typed has {} thousands, {}hundreds, {} tens e {} units ".format(tho, hun, tens, units))



