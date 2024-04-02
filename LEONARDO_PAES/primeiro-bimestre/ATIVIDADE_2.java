import java.util.ArrayList;
import java.util.Scanner;

public class ATIVIDADE_2 {

    static Scanner sc = new Scanner(System.in);
    static ArrayList<Float> preco = new ArrayList<>();
    static ArrayList<Float> quant = new ArrayList<>();
    static ArrayList<Float> precoTotal = new ArrayList<>();

    public static void main(String[] args) {
        int menu = 0;
        @SuppressWarnings("unused")
        int conta = 0; // Contador de operações

        // Loop principal do menu
        while (menu != 4) {
            System.out.println("\nMenu");
            System.out.println("[1] - Calcular Preço Total");
            System.out.println("[2] - Calcular Troco");
            System.out.println("[3] - Banco de Dados");
            System.out.println("[4] - Sair");
            menu = sc.nextInt(); // Ler a opção do usuário

            // Executar a operação correspondente à opção selecionada
            switch (menu) {
                case 1:
                    calcularPrecoTotal(); // Calcular o preço total dos produtos
                    conta++; // Incrementar o contador de operações
                    break;
                case 2:
                    calcularTroco(); // Calcular o troco
                    conta++; // Incrementar o contador de operações
                    break;
                case 3:
                    imprimirBancoDados(); // Imprimir o banco de dados
                    conta++; // Incrementar o contador de operações
                    break;
                case 4:
                    System.out.println("\nSaindo..."); // Mensagem de saída
                    break;
                default:
                    System.out.println("\nOpção inválida!"); // Mensagem de opção inválida
                    break;
            }
        }
        sc.close(); // Fechar o scanner
    }

    // Função para calcular o preço total dos produtos
    static void calcularPrecoTotal() {
        System.out.println("\nDigite a quantidade de Plantas:");
        float quantidade = sc.nextFloat();
        quant.add(quantidade);

        System.out.println("\nDigite o Preço do Produto: R$");
        float precoProduto = sc.nextFloat();
        if (quantidade >= 10) {
            precoProduto *= 0.95; // Aplicar desconto de 5% se a quantidade for maior ou igual a 10
        }
        preco.add(precoProduto);

        float total = quantidade * precoProduto;
        precoTotal.add(total);

        System.out.println("\nO Preço total é = R$" + total); // Exibir o preço total
    }

    // Função para calcular o troco
    static void calcularTroco() {
        System.out.println("\nDigite o valor total dos produtos: R$");
        float valorTotal = sc.nextFloat();

        System.out.println("\nDigite o valor pago: R$");
        float valorPago = sc.nextFloat();

        if (valorPago >= valorTotal) {
            System.out.println("\nO valor do troco é: R$" + (valorPago - valorTotal)); // Exibir o troco
        } else {
            System.out.println("\nFaltou o valor a ser pago de: R$" + (valorTotal - valorPago)); // Exibir a falta de pagamento
        }
    }

    // Função para imprimir o banco de dados
    static void imprimirBancoDados() {
        System.out.println("\nBanco de Dados");
        for (int i = 0; i < preco.size(); i++) {
            System.out.println("Posição: " + i + ", Quantidade: " + quant.get(i) +
                    ", Valor Unitário: R$" + preco.get(i) + ", Valor Total: R$" + precoTotal.get(i) + ", Desconto: R$" + (precoTotal.get(i) * 0.1));
        }
    }
}
