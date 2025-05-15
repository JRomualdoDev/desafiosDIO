# Função para repetir textos de acordo com num de entrada
def repetirTextos (str, num):
    for i in range(int(num)):
        print(str)

# String para repetir
string = input("Digite uma string para repetir: \n")
# Quantidade de repetições
qtd = input("Digite o numero de repetições: \n")

# Executando
repetirTextos(string, qtd)
