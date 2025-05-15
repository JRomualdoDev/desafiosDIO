# Operações simples
def operacoesMatematicas(num1, num2, simbol):

    try:
        num1 = int(num1)
        num2 = int(num2)
        
        match simbol:
            case "+":
                return num1 + num2
            case "-":
                return num1 - num2
            case "/":
                return num1 / num2
            case "*":
                return num1 * num2
            case _:
                return "Somente utilizar esses operadores: + , - , / , *"
    except ValueError:
        return "O numero1 e numero2 devem ser somente números."

        

# Número 1
numero1 = input("Insira o primeiro número: \n")
# Número 2
numero2 = input("Insira o segundo número: \n")
# Symbol
symbol = input("Digite a operação a ser usada: \n")

# Execução
print("O resultado é: ", operacoesMatematicas(numero1, numero2, symbol))