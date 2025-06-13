import os


menu = """
[u]  Criar Usuário
[lu] Listar Usuários
[c]  Criar Conta
[lc] Listar Contas
[d]  Depositar
[s]  Sacar
[e]  Extrato
[q]  Sair

=> """


usuarios = []
contas = []

saldo = 0
limite = 500
extrato = ""
nro_conta = 0
numero_saques = 0
LIMITE_SAQUES = 3
AGENCIA = "0001"


def saque(saldo, valor, extrato, limite, numero_saques, limite_saques):
    
    excedeu_saldo = valor > saldo
    excedeu_limite = valor > limite
    excedeu_saques = numero_saques >= limite_saques

    if excedeu_saldo:
       return "Operação falhou! Você não tem saldo suficiente."

    elif excedeu_limite:
       return "Operação falhou! O valor do saque excede o limite."

    elif excedeu_saques:
       return "Operação falhou! Número máximo de saques excedido."

    elif valor > 0:
        saldo -= valor
        extrato += f"Saque: R$ {valor:.2f}\n"
        numero_saques += 1
    else:
       return "Operação falhou! O valor informado é inválido."

    return saldo, extrato


def deposito(saldo, valor, extrato):

    if valor > 0:
        saldo += valor
        extrato += f"Depósito: R$ {valor:.2f}\n"

    else:
        return "Operação falhou! O valor informado é inválido."
    
    return saldo, extrato


def mostrar(saldo, extrato):
    print("\n================ EXTRATO ================")
    print("Não foram realizadas movimentações." if not extrato else extrato)
    print(f"\nSaldo: R$ {saldo:.2f}")
    print("==========================================")
    input("Tecle enter para sair da listagem")

def listar_usuarios():
    print(usuarios)
    input("Tecle enter para sair da listagem")

def listar_contas():
    print(contas)
    input("Tecle enter para sair da listagem")

def cadastrar_usuario(nome, data_nascimento, cpf, endereco):

    endereco = f"{endereco['logradouro']}-{endereco['nro']}-{endereco['bairro']}-{endereco['cidade']}/{endereco['sigla']}"

    usuarios.append({
        'nome': nome,
        'data_nascimento': data_nascimento,
        'cpf': cpf,
        'endereco': endereco
    })



while True:

    os.system('cls' if os.name == 'nt' else 'clear')

    opcao = input(menu)

    if opcao == "u":
        nome = input("Cadastrar Usuário: ")
        data_nascimento = input("Informe a data de nascimento: ")
        cpf = input("Informe o cpf: ")
        logradouro = input("Informe logradouro: ")
        nro = input("Informe o numero: ")
        bairro = input("Informe o bairro: ")
        cidade = input("Informe a cidade: ")
        sigla = input("Informe a sigla: ")
      
        endereco = {
            'logradouro': logradouro,
            'nro': nro,
            'bairro': bairro,
            'cidade': cidade,
            'sigla': sigla
        }

        cadastrar_usuario(nome, data_nascimento, cpf, endereco)
    
    elif opcao == "c":
        msg = False
        nro_conta += 1
        usuario = input("Informe o usuário: ")

        for acc in contas:
            print(acc)
            if acc["nro_conta"] == nro_conta:
                msg = True
                
        
        if not msg:
            contas.append({
                'agencia': AGENCIA,
                'nro_conta': nro_conta,
                'usuario': usuario
            })
        else:
            print("Conta já existe.")

    elif opcao == "d":
        valor = float(input("Informe o valor do depósito: "))
        mov = deposito(saldo, valor, extrato)
        saldo = mov[0]
        extrato = mov[1]


    elif opcao == "s":
        valor = float(input("Informe o valor do saque: "))
        mov = saque(saldo, valor, extrato, limite, numero_saques, LIMITE_SAQUES)
        saldo = mov[0]
        extrato = mov[1]

    elif opcao == "e":
        mostrar(saldo, extrato)

    elif opcao == "lu":
        listar_usuarios()

    elif opcao == "lc":
        listar_contas()

    elif opcao == "q":
        break

    else:
        print("Operação inválida, por favor selecione novamente a operação desejada.")
