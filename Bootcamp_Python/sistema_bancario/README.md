# Sistema Bancário em Python

Este é um sistema bancário simples implementado em Python. Ele permite realizar operações básicas como criar usuários, contas bancárias, realizar depósitos, saques e consultar extratos.

## Funcionalidades

- [x] Criar Usuário
- [x] Listar Usuários
- [x] Criar Conta
- [x] Listar Contas
- [x] Realizar Depósito
- [x] Realizar Saque (com limite de R$500 por saque e até 3 saques por dia)
- [x] Exibir Extrato

## Como usar

1. Certifique-se de ter o Python 3 instalado.
2. Clone este repositório ou copie o código para um arquivo chamado `banco.py`.
3. Execute o script com:

```bash
python banco.py
```

4. Use o menu interativo para navegar pelas opções:

```
[u]  Criar Usuário
[lu] Listar Usuários
[c]  Criar Conta
[lc] Listar Contas
[d]  Depositar
[s]  Sacar
[e]  Extrato
[q]  Sair
```

## Exemplo de uso

- Criar um usuário: forneça nome, data de nascimento, CPF e endereço completo.
- Criar uma conta: informe o nome do usuário (deve ser um nome já cadastrado).
- Realizar um depósito: informe o valor (positivo).
- Realizar um saque: respeite o limite de R$500 por saque e até 3 saques diários.
- Ver o extrato: mostra os depósitos, saques e saldo atual.

## Observações

- Os dados são armazenados em listas em memória, ou seja, são perdidos ao encerrar o programa.
- O CPF não é validado de forma mais rigorosa (formato ou duplicidade).
- O sistema é feito para fins educacionais.

---

Desenvolvido como um projeto de prática com Python. ✨
