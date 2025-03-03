import java.util.InputMismatchException;
import java.util.Scanner;

public class ContaTerminal {
    public static void main(String[] args){
        Scanner scanner;
        String nomeCliente;
        String agencia;
        int numeroBanco = 0;
        double saldo = 0;
        int num;

        try {
            scanner = new Scanner(System.in);
            System.out.println("\n\n******* Por favor, insira os dados que serão pedidos!! *******\n");
        
            System.out.print("\t\tNome: ");
            nomeCliente = scanner.nextLine();

            do { 
                num = 0;
                try {
                    System.out.print("\t\tNúmero do banco: ");
                    numeroBanco = scanner.nextInt();

                } catch (InputMismatchException e) {
                    num = 1;
                    System.out.println("\t\tDigite um número!!\n");
                    scanner.nextLine();
                }
                
            } while (num != 0);

            System.out.print("\t\tAgência bancária: ");
            agencia = scanner.next();

            do { 
                num = 0;
                System.out.print("\t\tSaldo: ");
                String valor = scanner.next();
                
                try {
                    saldo = Double.parseDouble(valor);
                } catch (NumberFormatException e) {
                    num = 1;
                    System.out.println("Digite um valor válido!! Que apresente apenas números (Ex: 0.0)");
                }
            } while (num != 0);
            
            scanner.close();
            
            System.out.println("\n\n**************************************************************\n");

            String mensagemFinal = "\n Olá " + nomeCliente + ", obrigado(a) por criar uma conta " +
            "em nosso banco, sua agência é " + agencia + ", \nconta " + numeroBanco +
            " e seu saldo " + saldo + " já está disponível para saque.\n";

            System.out.println(mensagemFinal);

        } catch (Exception e) {
            System.out.println("Ocorreu um erro inesperado. Tente novamente.");
        }
    }
}
