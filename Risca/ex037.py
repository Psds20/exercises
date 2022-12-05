print('\033[31mPROGRAMA PARA CONVERTER DECIMAL PARA BINARIO, HEXADECIMAL E OCTAL')

print('\033[1;36mBinario = 0')
print('\033[1;36mHexadecimal = 1')
print('\033[1;36moctal = 2')

n1 = int(input("\033[32mDigite para o que você quer converter segundo a lista de cima: "))
n2 = int(input("\033[32mDigite o valor que você que voce quer converter: "))

if n1 == 0:

    print("O valor em binario é {}".format(bin(n2)[2:]))
elif n1 == 1:
    print("O valor em hexadecimal é {}".format(hex(n2)[2:]))
elif n1 == 2:
    print("O valor em octal é {}".format(oct(n2)[2:]))
else:
 print("\033[1;31mValor invalido")


print('______________________________________________')
