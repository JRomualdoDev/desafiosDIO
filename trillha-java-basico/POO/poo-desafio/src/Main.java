import iphone.Iphone;

public class Main {
    public static void main(String[] args) throws Exception {

        Iphone iphone = new Iphone();

        // Executando Aparelho telefônico
        System.out.println("####### Aparelho Telefônico ########");
        iphone.ligar("12345678");
        iphone.atender();
        iphone.iniciarCorreioVoz();

        System.out.println("####### Navegador Internet ########");
        iphone.exibirPagina("https://www.google.com.br");
        iphone.adicionarNovaAba();
        iphone.atualizarPagina();

        System.out.println("####### Reprodutor Musical ########");
        iphone.tocar();
        iphone.pausar();
        iphone.selecionarMusica("Música instrumental.");

    }
}
