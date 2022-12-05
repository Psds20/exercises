from datetime import date
n1 = int(input("Digite o seu ano de nascimento: "))
ano = date.today().year
rsl = (ano - n1) - 18

if rsl < 0:
    neg = rsl * -1
    print("Falta {} anos para você se alistar.".format(neg))
elif rsl == 0:
    print("Está na sua hora de se alistar.Você ja tem 18.")
elif rsl > 0:
    print("Você ja se alistou à {} ano.".format(rsl))








