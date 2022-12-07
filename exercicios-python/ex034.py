n1 = float(input("Type the value of your wage: "))

if n1 <= 1250.00:
    n2 = n1 * 0.15
    n3 = n2 + n1
    print("The pay raise will be of {}$ and it now the wage is {}$".format(n2, n3))
else:
    n2 = n1 * 0.10
    n3 = n2 + n1
    print("The pay raise will be of {}$ and it now the wage is {}$".format(n2, n3))