package coinbank.java;

/**
 * Classe Euro
 * Representa a moeda Euro.
 * Utiliza uma taxa fixa para conversão.
 */
public class Euro extends Moeda {

    // Taxa de conversão do Euro para Real
    private static final double TAXA_CAMBIO = 5.5;

    /**
     * Construtor da moeda Euro
     * @param valor valor em euro
     */
    public Euro(double valor) {
        super(valor);
    }

    /**
     * Converte o valor do euro para real
     */
    @Override
    public double converterParaReal() {
        return valor * TAXA_CAMBIO;
    }

    /**
     * Retorna o tipo da moeda
     */
    @Override
    public String getTipo() {
        return "Euro";
    }
}
