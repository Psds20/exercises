from datetime import date
ano = date.today().year
tol = 0
tol2 = 0
for c in range(1, 7+1):
    n1 = int(input("what year {} person born: ".format(c)))
    age = ano - n1
    if age >= 21:
        tol += 1

    else:
        tol2 += 1



print("Exist {} people of legal age".format(tol))
print("Exist {} people under age.".format(tol2))