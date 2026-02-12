package coinbank.java;

import java.util.Scanner;

/**
 * Classe Menu
 * Responsável pela interação com o usuário via console.
 * Controla as opções disponíveis no sistema.
 */
public class Menu {

    // Scanner para leitura de dados do usuário
    private Scanner scanner = new Scanner(System.in);

    // Instância do CoinBank (regra de negócio)
    private CoinBank coinBank = new CoinBank();

    /**
     * Inicia o menu principal do sistema
     */
    public void iniciar() {
        int opcao;

        do {
            System.out.println("\n--- COINBANK ---");
            System.out.println("1 - Adicionar moeda");
            System.out.println("2 - Remover moeda");
            System.out.println("3 - Listar moedas");
            System.out.println("4 - Calcular total em Reais");
            System.out.println("5 - Sair");
            System.out.print("Escolha uma opção: ");

            opcao = scanner.nextInt();

            switch (opcao) {
                case 1 -> adicionarMoeda();
                case 2 -> removerMoeda();
                case 3 -> coinBank.listar();
                case 4 -> System.out.printf(
                        "Total em Reais: R$ %.2f%n",
                        coinBank.calcularTotal()
                );
                case 5 -> System.out.println("Encerrando o sistema...");
                default -> System.out.println("Opção inválida.");
            }

        } while (opcao != 5);
    }

    /**
     * Responsável por adicionar moedas ao sistema
     */
    private void adicionarMoeda() {
        System.out.println("\nTipo de moeda:");
        System.out.println("1 - Real");
        System.out.println("2 - Dólar");
        System.out.println("3 - Euro");
        System.out.print("Escolha: ");

        int tipo = scanner.nextInt();

        System.out.print("Valor: ");
        double valor = scanner.nextDouble();

        Moeda moeda;

        switch (tipo) {
            case 1 -> moeda = new Real(valor);
            case 2 -> moeda = new Dolar(valor);
            case 3 -> moeda = new Euro(valor);
            default -> {
                System.out.println("Tipo inválido.");
                return;
            }
        }

        coinBank.adicionar(moeda);
        System.out.println("Moeda adicionada com sucesso!");
    }

    /**
     * Remove uma moeda escolhida pelo usuário
     */
    private void removerMoeda() {
        coinBank.listar();
        System.out.print("Digite o número da moeda para remover: ");

        int index = scanner.nextInt() - 1;

        if (coinBank.remover(index)) {
            System.out.println("Moeda removida com sucesso.");
        } else {
            System.out.println("Índice inválido.");
        }
    }
}
