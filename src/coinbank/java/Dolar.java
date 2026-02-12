package coinbank.java;

/**
 * Classe Dolar
 * Representa a moeda Dólar.
 * Possui uma taxa de câmbio fixa para conversão em Real.
 */
public class Dolar extends Moeda {

    // Taxa de conversão do Dólar para Real
    private static final double TAXA_CAMBIO = 5.0;

    /**
     * Construtor da moeda Dólar
     * @param valor valor em dólar
     */
    public Dolar(double valor) {
        super(valor);
    }

    /**
     * Converte o valor do dólar para real
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
        return "Dólar";
    }
}
