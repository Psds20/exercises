n1 = float(input("\033[4;37mDigite o valor da nota do primeiro bimestre: "))
n2 = float(input("\033[4;37mDigite o valor da nota do segundo bimestre: "))

media = (n1 + n2) / 2

if media < 5.0:
    print("\033[1;31mAluno reprovado.")
elif media < 7.0 and media > 4.9:
    print("\033[1;31mO Aluno Está de RECUPERAÇÃO.")

else:
    print("\033[1;32mO Aluno Está APROVADO")












