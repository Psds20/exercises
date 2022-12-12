a = int(input("Type the value of A side: "))
b = int(input("Type the value of B side: "))
c = int(input("Type the value of C side "))

if a + b > c and c + a > b and c + b > a:
    if a == b and b == c:
         print("The result of three sides is a equilateral triangle.")
    else:
         if a != b and b != c and c != a:
             print("The result of three sides is a scalene triangle.")
         else:
             print('The result of three sides is a Isosceles triangle.')

else:
    print("The three sides don't form a triangle")