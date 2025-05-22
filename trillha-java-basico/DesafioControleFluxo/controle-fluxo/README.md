# 📊 Contador Java

Este é um simples programa em Java que realiza uma contagem entre dois números informados pelo usuário. O programa solicita dois parâmetros e faz a contagem do primeiro até o segundo, validando se os valores estão corretos.

## 🚀 Funcionalidades

- Recebe dois números inteiros via terminal.
- Verifica se o segundo número é maior que o primeiro.
- Caso a validação seja correta, faz uma contagem do primeiro até o segundo número.
- Se o segundo número for menor que o primeiro, lança uma exceção personalizada.

## 🛠️ Tecnologias Utilizadas

- Java 17 ou superior
- IDE de sua preferência (Eclipse, IntelliJ, VS Code, etc.)
- Terminal/Console para execução

## 📦 Como executar o projeto

1. Clone o repositório:

```bash
git clone https://github.com/JRomualdoDev/controle-fluxo.git
```

2. Acesse a pasta do projeto:

```bash
cd controle-fluxo
```

3. Compile os arquivos:

```bash
javac Contador.java ParametrosInvalidosException.java
```

4. Execute o programa:

```bash
java Contador
```

## 🚨 Exceções

O programa possui uma exceção personalizada chamada `ParametrosInvalidosException`, que é lançada quando o segundo número informado é menor que o primeiro.

## 📄 Arquivos no projeto

- `Contador.java` — Arquivo principal que executa a contagem.
- `ParametrosInvalidosException.java` — Classe da exceção personalizada.
- `README.md` — Documentação do projeto.

## 💡 Exemplo de uso

```bash
Digite o primeiro parâmetro
2
Digite o segundo parâmetro
5
Imprimindo o número 1
Imprimindo o número 2
Imprimindo o número 3
```

## 📝 Licença

Este projeto está sob a licença MIT.