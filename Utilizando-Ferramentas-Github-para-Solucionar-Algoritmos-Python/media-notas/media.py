# Função para calcular a média de 3 notas
def calcularMedia(notas):
    return (notas[0] + notas[1] + notas[2]) / 3

# Notas
notas = []
for i in range(3):
    nota = float(input(f"Insira a {i+1} nota: "))
    notas.append(nota)

# Execução
media = calcularMedia(notas)
print(f"A média das notas é: {media:.2f}")
