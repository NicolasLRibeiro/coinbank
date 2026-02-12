package coinbank.java;

import java.util.ArrayList;
import java.util.List;

/**
 * Classe CoinBank
 * Responsável por armazenar e gerenciar as moedas inseridas pelo usuário.
 * Atua como a camada de regra de negócio do sistema.
 */
public class CoinBank {

    // Lista que armazena objetos do tipo Moeda
    // Uso de List para permitir polimorfismo
    private List<Moeda> moedas = new ArrayList<>();

    /**
     * Adiciona uma moeda ao banco
     * @param moeda objeto do tipo Moeda (Real, Euro, Dolar, etc.)
     */
    public void adicionar(Moeda moeda) {
        moedas.add(moeda);
    }

    /**
     * Remove uma moeda com base no índice informado
     * @param index posição da moeda na lista
     * @return true se removeu com sucesso, false se o índice for inválido
     */
    public boolean remover(int index) {
        if (index >= 0 && index < moedas.size()) {
            moedas.remove(index);
            return true;
        }
        return false;
    }

    /**
     * Lista todas as moedas armazenadas no banco
     * Exibe tipo e valor de cada moeda
     */
    public void listar() {
        if (moedas.isEmpty()) {
            System.out.println("Banco vazio.");
            return;
        }

        for (int i = 0; i < moedas.size(); i++) {
            Moeda m = moedas.get(i);
            System.out.println(
                (i + 1) + ". " + m.getTipo() + " - Valor: " + m.getValor()
            );
        }
    }

    /**
     * Calcula o valor total convertido para Real
     * Utiliza polimorfismo para conversão
     * @return valor total em reais
     */
    public double calcularTotal() {
        double total = 0;

        for (Moeda moeda : moedas) {
            total += moeda.converterParaReal();
        }

        return total;
    }
}
