# Validador de Cartão de Crédito

Bem-vindo ao **ValidadorCartaoCredito**, um projeto Java simples e poderoso que valida números de cartões de crédito com o algoritmo de **Luhn** e identifica automaticamente a **bandeira** do cartão usando **expressões regulares**.

***

## 🚀 Funcionalidades

✅ Validação completa do número do cartão\
✅ Verificação com o algoritmo de **Luhn**\
✅ Identificação automática da **bandeira** do cartão\
✅ Suporte a múltiplas bandeiras conhecidas

***

## 🏷️ Bandeiras Suportadas

O validador reconhece automaticamente as seguintes bandeiras:

* 🟦 **Visa**
* 🟥 **Mastercard**
* 🟨 **American Express**
* 🟧 **Diners Club**
* 🟩 **Discover**
* 🟪 **JCB**
* ⚪ **Voyager**
* 🟫 **Hiper Card**
* 🔵 **Aura**
* 🔴 **Enroute**

***

## 🛠️ Como Usar

### 📦 Requisitos

* Java JDK 8 ou superior

### 📌 Exemplo de uso

```java
import validade.ValidadorCartaoCredito;

public class Main {
    public static void main(String[] args) {
        ValidadorCartaoCredito validador = new ValidadorCartaoCredito();

        String numero = "4111111111111111"; // Exemplo de cartão Visa

        if (validador.validarCartao(numero)) {
            System.out.println("✅ Cartão válido!");
            System.out.println("🏷️ Bandeira: " + validador.identificarBandeira(numero));
        } else {
            System.out.println("❌ Cartão inválido.");
        }
    }
}

## 🧩 Estrutura do Projeto

src/
    └── validade/
    └── ValidadorCartaoCredito.java

---

---

## 👨‍💻 Autor

Desenvolvido com 💻 por **[José Romualdo]**

---
```
