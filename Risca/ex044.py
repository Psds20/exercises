print("0 - à vista dinheiro/cheque: 10% de desconto")
print("1 - à vista no cartão: 5% de desconto")
print("2 - em até 2x no cartão: preço formal")
print("3 - 3x ou mais no cartão: 20% de juros")


numero = float(input("Qual é a opção:"))
preco = float(input("Digite o valor do preço normal do produto: "))

if numero == 0:
      desconto = preco - (preco * 0.10)
      print("O valor à pagar será {}".format(desconto))
elif numero == 1:
      desconto = preco - (preco * 0.05)
elif numero == 2:
    parcelas = preco / 2
    print("Você tera que pagar 2 parcelas de {}".format(parcelas))
elif numero == 3:
    parcelas1 = int(input("Em quantas vezes você vai querer parcelar: "))
    parcelas = preco / parcelas1
    parcelas2 = parcelas * 0.20
    parcelas3 = parcelas + parcelas2
    print("Você tera que pagar {} parcelas de {}R$".format(parcelas1, parcelas3))
else:
    print("\033[1;31mValor invalido")