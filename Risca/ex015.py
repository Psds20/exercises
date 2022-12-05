n1 = float(input("how many days do you rent: "))
n2 = float(input("how many KM do you run: "))

payment = (n1 * 60)+(n2 * 0.15)
print("the total to pay is {}".format(payment))