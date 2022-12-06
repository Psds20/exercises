km = float(input("type the value of car speed(km/h): "))

if km < 80:
    print("Gratters!!!!! ")
    print("You are inside of speed limit")

else:
   rsl = km - 80
   penalty = rsl * 7.00
   print("You are above of speed limit and you will have pay {}$ of penalty".format(penalty))