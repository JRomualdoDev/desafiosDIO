# Verifica se o número é par ou ímpar
def verificar_par_impar(numero):

    try:
        numero = int(numero)

        if numero % 2 == 0:
            return "par"
        else:
            return "ímpar"

    except ValueError:
        return "Somente números."

   

# Número
numero = input("Insira um número: \n")
# Execução
print("O número é: ", verificar_par_impar(numero))