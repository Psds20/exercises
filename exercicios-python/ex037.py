print('\033[31mPROGRAM TO CONVERT DECIMAL TO BINARY, HEXADECIMAL AND OCTAL')

print('\033[1;36mBinary = 0')
print('\033[1;36mHexadecimal = 1')
print('\033[1;36moctal = 2')

n1 = int(input("\033[32mType '0' or '1' or '2': "))
n2 = int(input("\033[32mType the value that you want convert: "))

if n1 == 0:

    print("The value in binary is {}".format(bin(n2)[2:]))
elif n1 == 1:
    print("The value in hexadecimal is {}".format(hex(n2)[2:]))
elif n1 == 2:
    print("The value in octal is {}".format(oct(n2)[2:]))
else:
 print("\033[1;31mInvalid value")


print('______________________________________________')
