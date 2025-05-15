# Este módulo contém uma função para verificar se uma palavra é um palíndromo.
def verificar_palindromo(palavra):
    palavra_invertida = palavra[::-1]
    if palavra == palavra_invertida:
        return "É um palíndromo!"
    else:
        return "Não é um palíndromo!"

# Função principal
palavra = input("Insira uma palavra: ")
resultado = verificar_palindromo(palavra)
print(resultado)