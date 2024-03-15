import java.util.Scanner;

public class Desafio {
    public static void main(String[] args) {
        Scanner cliente = new Scanner(System.in);
        int opcao = 0;
        double deposito = 0;
        double transferencia = 0;
        // recebe dados do cliente
        System.out.println("Digite seu nome: ");
        String nome = cliente.nextLine();
        System.out.println("Qual o tipo da sua conta?");
        String tipoConta = cliente.nextLine();
        System.out.println("Digite o saldo existente na sua conta: ");
        double saldoConta = cliente.nextDouble();
        // imprime dados recebidos do cliente
        System.out.println("*************************************");
        System.out.println("\nOlá, sr(a) " + nome);
        System.out.println("Sua conta é do tipo: " + tipoConta);
        System.out.println("Seu saldo atual é de: R$ " + saldoConta);
        System.out.println("\n*************************************");

        String menu = """
                    \n** Menu de opções **
                    1- Consultar saldo.
                    2- Transferir valor.
                    3- Depositar valor.
                    4- Sair.
                    
                    Escolha uma opção:
                    """;
        Scanner leitura = new Scanner(System.in);


        while (opcao != 4) {
            System.out.println(menu);
            opcao = leitura.nextInt();

            if (opcao == 1){
                System.out.println("O saldo atual é R$ " + saldoConta);
            } else if (opcao == 2) {
                System.out.println("Qual valor será transferido? ");
                double valor = leitura.nextDouble();
                if (valor > saldoConta){
                    System.out.println("Saldo insuficiente.");
                } else {
                    saldoConta -= valor;
                    System.out.println("\nSeu saldo agora é de: R$ " + saldoConta);
                }
            } else if (opcao == 3) {
                System.out.println("Valor a ser depositado: ");
                double valor = leitura.nextDouble();
                saldoConta += valor;
                System.out.println("\nSeu saldo agora é de: R$ " + saldoConta);
            } else if (opcao != 4) {
                System.out.println("Opção inválida!");
            }
        }
        }
    }