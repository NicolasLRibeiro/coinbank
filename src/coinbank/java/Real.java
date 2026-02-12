package coinbank.java;

/**
 * Classe Real
 * Representa a moeda Real (BRL).
 * Como já está na moeda base do sistema,
 * não necessita conversão.
 */
public class Real extends Moeda {

    /**
     * Construtor da moeda Real
     * @param valor valor em reais
     */
    public Real(double valor) {
        super(valor);
    }

    /**
     * Retorna o próprio valor,
     * pois o Real já é a moeda base
     */
    @Override
    public double converterParaReal() {
        return valor;
    }

    /**
     * Retorna o nome do tipo da moeda
     */
    @Override
    public String getTipo() {
        return "Real";
    }
}
