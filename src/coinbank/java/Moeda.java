package coinbank.java;

/**
 * Classe abstrata Moeda
 * Representa uma moeda genérica do sistema.
 * Serve como base para outras moedas específicas.
 */
public abstract class Moeda {

    // Valor da moeda (em sua moeda de origem)
    protected double valor;

    /**
     * Construtor da classe Moeda
     * @param valor valor inicial da moeda
     */
    public Moeda(double valor) {
        this.valor = valor;
    }

    /**
     * Método abstrato responsável por converter
     * o valor da moeda para Real.
     * Cada moeda implementa sua própria conversão.
     */
    public abstract double converterParaReal();

    /**
     * Retorna o tipo da moeda (Real, Dólar, Euro, etc.)
     */
    public abstract String getTipo();

    /**
     * Retorna o valor original da moeda
     */
    public double getValor() {
        return valor;
    }
}
