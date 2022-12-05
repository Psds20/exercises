altura = float(input("Digite a sua altura: "))
peso = float(input("Digite o seu peso: "))

resultado = peso / (altura ** 2)

if resultado < 18.5:
    print("Você está ABAIXO DO PESO com imc de {}".format(resultado))
elif resultado < 25:
    print("Você está no PESO IDEAL com imc de {}".format(resultado))
elif resultado < 30:
    print("Você está com SOBREPESO com imc de {}".format(resultado))
elif resultado < 40:
    print("Você está com OBESIDADE com imc de {}".format(resultado))
else:
    print("Você está com OBESIDADE MORBIDA com imc de {}".format(resultado))