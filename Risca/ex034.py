n1 = float(input("Digite o valor do seu salario: "))

if n1 <= 1250.00:
    n2 = n1 * 0.15
    n3 = n2 + n1
    print("O aumento dele vai ser de {}R$ e agora o salario dele é {}R$".format(n2, n3))
else:
    n2 = n1 * 0.10
    n3 = n2 + n1
    print("O aumento dele vai ser de {}R$ e agora o salario dele é {}R$".format(n2, n3))