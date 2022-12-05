viagem = float(input("Digite a distancia da sua viagem em km: "))

if viagem < 200:
   rsl = viagem * 0.50
   print("O valor a pagar na viagem é {}R$".format(rsl))
else:
    rsl = viagem * 0.45
    print('O valor a pagar na viagem é {}R$'.format(rsl))
print("_______________________________________________")