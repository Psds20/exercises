casa = float(input("\033[1;34mDigite o valor da casa: R$"))
salario = float(input("\033[1;34mDigite o valor do seu salário: R$"))
anos = int(input("\033[1;34mEm Quantos anos você vai pagar a casa: "))

valor = (casa / anos) / 12
salario30 = (salario * 0.30)




if  salario30 >=  valor :
    print("\033[1;32m Você pode pagar isso. ")
    print("\033[1;32m A prestação mensal a pagar será {}R$ em {} anos".format(valor, anos))
else:
    print("A prestação sera de {}R$ em {} anos".format(valor, anos))
    print("\033[1;31mVocê não pode pagar isso nesse total de anos")
    print("\033[1;31mEmprestimo negado")

