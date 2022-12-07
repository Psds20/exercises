travel = float(input("type the distance at your travel in km: "))

if travel < 200:
   rsl = travel * 0.50
   print("The value to pay in the travel is{}$".format(rsl))
else:
    rsl = travel * 0.45
    print("The value to pay in the travel is{}$".format(rsl))
print("_______________________________________________")