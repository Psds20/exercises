print("\033[1;35;7mPrograma para Conversão de temperaturas")
print("                  e                    ")
print("      Calculo da Dilatação linear       \033[m")
print("")

print("\033[1;35m1 = se você ter o número em °C:")
print("2 = se você ter o número em °F:")
print("3 = se você ter o número em °K:")
print("4 = Para calcular a dilatação linear:\033[m")
print("")



n1 = (int(input("\033[1;34mDigite a opção de sua preferência: \033[m")))

if n1 == 1:
    n2 = (float(input("\033[1;34mDigite o valor em Celsius: \033[m")))
    f = (n2 * 9/5) + 32
    k = n2 + 273.15
    print("\033[1;36m{}°C é equivalente à {}°F e {}°K\033[m".format(n2, f, k))
elif n1 == 2:
    n2 = (float(input("\033[1;34mDigite o valor em fahrenheit: \033[m")))
    c = (n2 - 32) * 5/9
    k = (n2 - 32) * (5/9) + 273.15
    print("\033[1;36m{}°F é equivalente à {}°C e {}°K\033[m".format(n2, c, k))
elif n1 == 3:
    n2 = (float(input("\033[1;34mDigite o valor em Kelvin: \033[m")))
    c = n2 - 273.15
    f = (n2 - 273.15) * (9/5) + 32
    print("\033[1;36m{}°K é equivalente à {}°C e {}°F\033[m".format(n2, c, f))
elif n1 == 4:
   li = float(input("\033[1;34mDigite o valor de Li: \033[m"))
   a = float(input("\033[1;34mDigite o valor do coefeciente: \033[m"))
   t = float(input("\033[1;34mDigite o Valor de ▲T: \033[m"))


   rsl = li * a * t

   print("\033[1;36mO valor de ▲L é {} \033[m".format(rsl))
else:
    print("\033[1;31m___________________________________")
    print(" ")
    print("            Incorreto              ")
    print("___________________________________\033[m")