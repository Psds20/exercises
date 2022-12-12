height = float(input("type your height: "))
weight = float(input("type your weight: "))

result = weight / (height ** 2)

if result < 18.5:
    print("you're below of your BMI  of {}".format(result))
elif result < 25:
    print("You're in ideal weight with BMI of {}".format(result))
elif result < 30:
    print("You're in overweight with BMI of {}".format(result))
elif result < 40:
    print("You're in obesity with imc BMI of {}".format(result))
else:
    print("You're in morbid obesity with imc BMI of {}".format(result))