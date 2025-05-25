
public class Main {

    public static void main(String[] args) {

        Banco banco = new Banco();
        banco.addCliente("Venilton");
        banco.addCliente("Dalva");

        banco.addContaCorrente("venilton");
        banco.addContaPoupanca("dalva");

        System.out.println(banco.getContas());
        // System.out.println(banco.getClientes());
    }

}