from datetime import date
n1 = int(input("Type the year of your birthday: "))
ano = date.today().year
rsl = (ano - n1) - 18

if rsl < 0:
    neg = rsl * -1
    print("left {} year to you enlist.".format(neg))
elif rsl == 0:
    print("It's time to inlist.you're 18.")
elif rsl > 0:
    print("you already inlist yourself inlist {} years ago.".format(rsl))








