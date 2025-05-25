
public class ContaPoupanca extends Conta {

    public ContaPoupanca(Cliente cliente) {
        super(cliente);
    }

    @Override
    public void imprimirExtrato() {
        System.out.println("=== Extrato Conta Poupan�a ===");
        super.imprimirInfosComuns();
    }

    @Override
    public String toString() {
        return "\n" +
                "Tipo: Conta Poupança" + "\n" +
                String.format("Titular: %s", this.cliente.getNome()) + "\n" +
                String.format("Agencia: %d", this.agencia) + "\n" +
                String.format("Numero: %d", this.numero) + "\n" +
                String.format("Saldo: %.2f", this.saldo) + "\n";
    }
}