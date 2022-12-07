ano = int(input("Type a year to know if it's leap year: "))

if ano % 4 == 0:
    if ano % 100 != 0:
       print("the year {} is leap year".format(ano))
    else:

       if ano % 400 == 0:
         print("the year {} is leap year".format(ano))
       else:
         print("the year {} isn't leap year".format(ano))
print('________________________________________________')