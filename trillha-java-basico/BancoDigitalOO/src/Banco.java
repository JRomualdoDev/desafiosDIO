import java.util.ArrayList;
import java.util.List;

public class Banco {

    private String nome;
    private List<Conta> contas;
    protected List<Cliente> clientes;
    protected Cliente cliente;

    public Banco() {
        this.clientes = new ArrayList<>();
        this.contas = new ArrayList<>();
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public List<Conta> getContas() {
        return contas;
    }

    public void addContaCorrente(String nome) {
        // Cliente Exite?
        for (int i = 0; i < clientes.size(); i++) {
            if (clientes.get(i).getNome().equalsIgnoreCase(nome)) {
                ContaCorrente cc = new ContaCorrente(this.buscarClientePorNome(nome));
                contas.add(cc);
            }
        }
    }

    public void addContaPoupanca(String nome) {
        // Cliente Exite?
        for (int i = 0; i < clientes.size(); i++) {
            if (clientes.get(i).getNome().equalsIgnoreCase(nome)) {
                ContaPoupanca cp = new ContaPoupanca(this.buscarClientePorNome(nome));
                contas.add(cp);
            }
        }
    }

    public void addCliente(String nome) {
        Cliente novoCliente = new Cliente();
        novoCliente.setNome(nome);
        this.clientes.add(novoCliente);
    }

    public Cliente buscarClientePorNome(String nome) {
        return clientes.stream()
                .filter(cliente -> cliente.getNome().equalsIgnoreCase(nome))
                .findFirst()
                .orElse(null);
    }

    public List<Cliente> getClientes() {
        return clientes;
    }

}