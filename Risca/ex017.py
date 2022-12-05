from math import(pow, sqrt)
al = int(input("type the value of AL (adjacent leg): "))
ol = int(input("type the value of OL (opossite leg): "))

sum1 = (pow(al, 2)) + (pow(ol, 2))
rsl = (sqrt(sum1))

print("the value of AL is {}, OL is {} and the hypotenuse of them result in {}".format(al, ol, rsl))