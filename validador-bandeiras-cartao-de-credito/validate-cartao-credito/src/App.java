import validade.ValidadorCartaoCredito;

public class App {
    /**
     * Exemplo de uso da classe ValidadorCartaoCredito.
     */
    public static void main(String[] args) {
        ValidadorCartaoCredito validador = new ValidadorCartaoCredito();

        // Exemplos de números de cartões para teste
        // Observe que estes são números fictícios para demonstração
        String[] exemplos = {
                "5536 7867 7232 7801", // Mastercard válido
                "4539 0036 7573 1125", // Visa válido
                "3454 892757 74981", // America Express válido
                "3023 293300 3728", // Diners Club válido
                "6011 9637 6813 8482", // Discover válido
                "2014 6652350 0106", // Enroute válido
                "3507 4490 7440 2737", // JCB válido
                "86990 9160 58369 8", // Voyager válido
                "6062 8233 3747 5112", // HiperCard válido
                "5069 5128 7816 2446", // Aura válido
                "123456789" // Inválido
        };

        for (String exemplo : exemplos) {
            boolean valido = validador.validarCartao(exemplo);
            String bandeira = validador.identificarBandeira(exemplo.replaceAll("\\s+|-", ""));

            System.out.println("Cartão: " + exemplo);
            System.out.println("Válido: " + valido);
            System.out.println("Bandeira: " + (bandeira != null ? bandeira : "Não reconhecida"));
            System.out.println();
        }
    }
}
