n1 = int(input("type a width of the wall in meters: "))
n2 = int(input("type a height of the wall in meters: "))


area = n1 * n2
paint = area / 2

print("The Wall Area is equivalent to {}M and it will use {}L of paint".format(area, paint))
