import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String nome = "Antonio Francisco";
        String tipoConta = "Conta Corrente";
        double saldo = 2800.77;
        int opcao = 0;

        System.out.println("******************************************");
        System.out.println("\nNome do cliente: " + nome);
        System.out.println("Tipo de conta: " + tipoConta);
        System.out.println("Saldo da conta: " + saldo);
        System.out.println("****************************************\n");

        String menu = """
                ** Digite sua opção **
                1 - Consultar saldo
                2 - Transferir valor
                3 - Receber valor
                4 - Sair
                """;

        
        
        while (opcao != 4) {
            System.out.println(menu);
            opcao = sc.nextInt();

            if (opcao == 1) {
                System.out.println("Saldo total: " + saldo);
            } 
            else if (opcao == 2) {
                System.out.println("Qual valor que deseja transferir");
                double valor = sc.nextDouble();
                if (valor > saldo) {
                    System.out.println("Não há saldo para realizar a transferência");
                } else  {
                    saldo -= valor;
                    System.out.println("Novo saldo: " + saldo);
                } } 
                if  (opcao == 3) {
                    System.out.println("Valor a receber: ");
                    double valor = sc.nextDouble();
                    saldo += valor;
                    System.out.println("Novo saldo: " + saldo);
                } else if (opcao != 4) {
                    System.out.println("Opção inválida");
                }
                    
                }
                  
          sc.close();      
        }
    }
