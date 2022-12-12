frase = str(input("type a phrase: ").upper().strip().replace(" ", ""))
if frase[::-1] == frase:
    print("the frase is a palindrome.")
else:
    print("the frase isn't a palindrome.")




