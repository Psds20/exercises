import datetime
n1 = int(input("What year do you want analize?If it is current year type 0: "))
if n1 == 0:
 n1 = datetime.date.today().year
if n1 % 4 == 0 and n1 % 100 != 0 or n1 % 400 == 0:
    print("the year {} is leap year.".format(n1))
else:
    print("the year {} isn't leap year.".format(n1))
print('_________________________________________________')