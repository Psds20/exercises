s = 0
for c in range(1, 500):
 if c % 3 == 0:
     if c % 2 == 1:
         s += c

print("The sum of all values are {}".format(s))