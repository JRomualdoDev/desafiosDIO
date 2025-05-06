package validade;

import java.util.regex.Pattern;

/**
 * Classe que valida cartões de crédito usando o algoritmo de Luhn
 * e identificando a bandeira do cartão através de expressões regulares.
 */
public class ValidadorCartaoCredito {

    // Expressões regulares para validar bandeiras de cartões
    private static final Pattern MASTERCARD = Pattern
            .compile("^5[1-5][0-9]{14}$|^2(?:2(?:2[1-9]|[3-9][0-9])|[3-6][0-9][0-9]|7(?:[01][0-9]|20))[0-9]{12}$");
    private static final Pattern VISA = Pattern.compile("^4[0-9]{12}(?:[0-9]{3})?$");
    private static final Pattern AMEX = Pattern.compile("^3[47][0-9]{13}$");
    private static final Pattern DINERS_CLUB = Pattern.compile("^3(?:0[0-5]|[68][0-9])[0-9]{11}$");
    private static final Pattern DISCOVER = Pattern.compile(
            "^65[4-9][0-9]{13}|64[4-9][0-9]{13}|6011[0-9]{12}|(622(?:12[6-9]|1[3-9][0-9]|[2-8][0-9][0-9]|9[01][0-9]|92[0-5])[0-9]{10})$");
    private static final Pattern ENROUTE = Pattern.compile("^2(?:014|149)[0-9]{11}$");
    private static final Pattern JCB = Pattern.compile("^(?:2131|1800|35[0-9]{3})[0-9]{11}$");
    private static final Pattern Voyager = Pattern.compile("^8699[0-9]{11}$");
    private static final Pattern Hiper_Card = Pattern
            .compile("^(606282|3841[0-9]{3})[0-9]{10}$|^3841[0-9]{3}[0-9]{11}$");
    private static final Pattern Aura = Pattern.compile(
            "^(50)\\d{14}$|" + // 16 dígitos
                    "^(50)\\d{12}$"); // 14 dígitos

    /**
     * Valida um número de cartão de crédito.
     * 
     * @param numeroCartao Número do cartão a ser validado (apenas dígitos)
     * @return true se o cartão for válido, false caso contrário
     */
    public boolean validarCartao(String numeroCartao) {
        // Remover espaços e traços que possam existir
        String cartao = numeroCartao.replaceAll("\\s+|-", "");

        // Verificar se contém apenas dígitos
        if (!cartao.matches("\\d+")) {
            return false;
        }

        // Verificar se está vazio ou tem menos de 13 dígitos
        if (cartao.isEmpty() || cartao.length() < 13) {
            return false;
        }

        // Verificar se o cartão passa no algoritmo de Luhn
        if (!validarLuhn(cartao)) {
            return false;
        }

        // Verificar se o cartão corresponde a alguma bandeira conhecida
        return identificarBandeira(cartao) != null;
    }

    /**
     * Identifica a bandeira do cartão de crédito.
     * 
     * @param numeroCartao Número do cartão a identificar
     * @return Nome da bandeira ou null se não for reconhecida
     */
    public String identificarBandeira(String numeroCartao) {
        String cartao = numeroCartao.replaceAll("\\s+|-", "");

        if (MASTERCARD.matcher(cartao).matches()) {
            return "Mastercard";
        } else if (VISA.matcher(cartao).matches()) {
            return "Visa";
        } else if (AMEX.matcher(cartao).matches()) {
            return "American Express";
        } else if (DISCOVER.matcher(cartao).matches()) {
            return "Discover";
        } else if (DINERS_CLUB.matcher(cartao).matches()) {
            return "Diners Club";
        } else if (JCB.matcher(cartao).matches()) {
            return "JCB";
        } else if (Voyager.matcher(cartao).matches()) {
            return "Voyager";
        } else if (Hiper_Card.matcher(cartao).matches()) {
            return "Hiper Card";
        } else if (Aura.matcher(cartao).matches()) {
            return "Aura";
        } else if (ENROUTE.matcher(cartao).matches()) {
            return "Enroute";
        }

        return null;
    }

    /**
     * Implementa o algoritmo de Luhn para validar o número do cartão.
     * 
     * @param numeroCartao Número do cartão a validar
     * @return true se passar na validação de Luhn, false caso contrário
     */
    private boolean validarLuhn(String numeroCartao) {
        int soma = 0;
        boolean alternar = false;

        // Iterar de trás para frente
        for (int i = numeroCartao.length() - 1; i >= 0; i--) {
            int digito = Character.getNumericValue(numeroCartao.charAt(i));

            if (alternar) {
                digito *= 2;
                if (digito > 9) {
                    digito -= 9;
                }
            }

            soma += digito;
            alternar = !alternar;
        }

        // Verificar se a soma é múltiplo de 10
        return (soma % 10 == 0);
    }

}