km = float(input("Digite O valor da velocidade do seu carro: "))

if km < 80:
    print("Parabéns!!!!! ")
    print("Você está dentro da velocidade")

else:
   rsl = km - 80
   multa = rsl * 7.00
   print("Você estava acima da velocidade permitida e vai ter que pagar {}R$ de multa".format(multa))