import datetime
n1 = int(input("Que ano você quer analisar?se for o ano atual digite 0: "))
if n1 == 0:
 n1 = datetime.date.today().year
if n1 % 4 == 0 and n1 % 100 != 0 or n1 % 400 == 0:
    print("O ano {} é bissexto.".format(n1))
else:
    print("O ano {} não é bissexto.".format(n1))
print('_________________________________________________')