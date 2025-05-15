# Função para concatenar 2 strings
def concat_strings(str1, str2):
    if not isinstance(str1, str) or not isinstance(str2, str):
        raise ValueError("As entradas devem ser strings")
    return str1 + str2

# Primeira String
string1 = input("Insira a primeira palavra: \n")

# Segunda String
string2 = input("Insira a segunda palavra: \n")

# Palavras Concatenadas
resultado = concat_strings(string1, string2)
print("Resultado: " + resultado)

