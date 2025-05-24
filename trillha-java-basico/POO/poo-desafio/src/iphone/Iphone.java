package iphone;

import AparelhoTelefonico.AparelhoTelefonico;
import NavegadorInternet.NavegadorInternet;
import ReprodutorMusical.ReprodutorMusical;

public class Iphone implements AparelhoTelefonico, NavegadorInternet, ReprodutorMusical {

    // Aparelho Telefônico
    @Override
    public void ligar(String numero) {
        System.out.println("Ligando Aparelho telefônico no número: " + numero);
    }

        @Override
    public void atender() {
        System.out.println("Atendendo Telefone.");
    }

    @Override
    public void iniciarCorreioVoz() {
        System.out.println("Iniciando Correio de Voz.");
    }

    // Navegador de Internet
    @Override
    public void exibirPagina(String url) {
        System.out.println("Entrando na pagina: " + url);
    }

    @Override
    public void adicionarNovaAba() {
        System.out.println("Adicionando Nova Aba.");
    }

    @Override
    public void atualizarPagina() {
        System.out.println("Atualizando Página");
    }

    // Reprodutor Musical
    @Override
    public void tocar() {
        System.out.println("Tocando Música.");
    }

    @Override
    public void pausar() {
        System.out.println("Pausando Música.");
    }

    @Override
    public void selecionarMusica(String musica) {
        System.out.println("Selecionando a Música: " + musica);
    }
}
