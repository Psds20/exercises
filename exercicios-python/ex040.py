n1 = float(input("\033[4;37mType the grade of you first two months: "))
n2 = float(input("\033[4;37mType the grade of you second two months: "))

media = (n1 + n2) / 2

if media < 5.0:
    print("\033[1;31mstudent reprobate.")
elif media < 7.0 and media > 4.9:
    print("\033[1;31mThe Student will be grade recovery.")

else:
    print("\033[1;32mO Student approved")












