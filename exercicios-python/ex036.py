house = float(input("\033[1;34mtype value of your house: R$"))
wage = float(input("\033[1;34mtype value of your wage: R$"))
years = int(input("\033[1;34mEmHow many years do you pay this house: "))

value = (house / years) / 12
wage30 = (wage * 0.30)




if  wage30 >=  value :
    print("\033[1;32m you can pay this. ")
    print("\033[1;32m the monthly installment to pay will be {}$ and {} years".format(value, years))
else:
    print("the monthly installment to pay will be {}$ and {} years".format(value, years))
    print("\033[1;31myou can't pay this")
    print("\033[1;31mLoan denied")

