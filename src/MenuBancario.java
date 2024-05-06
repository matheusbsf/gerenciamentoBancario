import java.util.Scanner;

public class MenuBancario {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        
        System.out.println("""
                            Por favor preencha os seguintes dados:
                           1. Primeiro nome
                           2. Sobrenome
                           3. Número do CPF
                           """);

        String nome = scanner.nextLine();
        String sobrenome = scanner.nextLine();
        String cpf = scanner.nextLine();
        
        Cliente cliente1 = new Cliente(nome, sobrenome, cpf);
        System.out.println("\nSeja bem-vindo(a). O que deseja?");
        
        boolean loop = true;
        
        do{
            System.out.println("""
                               
                                1. Consultar Saldo
                                2. Depositar Valor
                                3. Sacar Valor
                               
                                0. Encerrar Menu
                               """);
            
            int escolha = scanner.nextInt();
            
            switch (escolha){
                case 1:
                    cliente1.consultarSaldo();
                    break;
                case 2:
                    System.out.println("\nInsira o valor a ser depositado:\n");
                    double valorDeposito = scanner.nextDouble();
                    cliente1.depositar(valorDeposito);
                    break;
                case 3:
                    System.out.println("\nInsira o valor a ser sacado:\n");
                    double valorSaque = scanner.nextDouble();
                    cliente1.sacar(valorSaque);
                    break;
                case 0:
                    scanner.close();
                    System.out.println("\nEncerrando o programa.\nAté mais.");
                    loop = false;
                    break;
                default:
                    System.out.println("\nOpção inválida, tente novamente.");
            }
        } while(loop);
    }
}