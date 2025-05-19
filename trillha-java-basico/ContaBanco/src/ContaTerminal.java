import java.util.Scanner;

public class ContaTerminal {
    // Variaveis
    int numero;
    String agencia;
    String nomeCliente;
    double saldo;

    public void terminal() {
        Scanner input = new Scanner(System.in);

        System.out.println("Digite o número da conta: ");
        numero = input.nextInt();
        System.out.println("Digite o número da agência: ");
        agencia = input.next();
        System.out.println("Digite seu Nome: ");
        nomeCliente = input.next();
        System.out.println("Digite o seu Saldo: ");
        saldo = input.nextDouble();

        input.close();

        System.out.println("Olá " + nomeCliente + ", obrigado por criar uma conta em nosso banco, sua agência é " +
                agencia + ", conta " + numero + " e seu saldo " + saldo + " já está disponível para saque.");

    }

    public static void main(String[] args) throws Exception {
        ContaTerminal terminal = new ContaTerminal();
        terminal.terminal();
    }
}
