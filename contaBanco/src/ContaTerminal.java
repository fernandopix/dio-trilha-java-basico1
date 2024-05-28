import java.util.Scanner;

public class ContaTerminal {
    public static void main(String[] args) {
    
          
    Scanner scanner = new Scanner(System.in);

        // Solicitar e ler o número da conta
        System.out.print("Por favor, digite o número da Conta: ");
        int numero = scanner.nextInt();
        scanner.nextLine();

        // Solicitar e ler a agência
        System.out.print("Por favor, digite o número da Agência: ");
        scanner.nextLine(); // Consumir a nova linha deixada pelo nextInt()
        String agencia = scanner.nextLine();

        // Solicitar e ler o nome do cliente
        System.out.print("Por favor, digite o nome do Cliente: ");
        String nomeCliente = scanner.nextLine();

        // Solicitar e ler o saldo
        System.out.print("Por favor, digite o saldo da Conta: ");
        double saldo = scanner.nextDouble();

        // Exibir a mensagem final com as informações inseridas pelo usuário
        System.out.println("Olá " + nomeCliente + ", obrigado por criar uma conta em nosso banco, sua agência é " + agencia +
                ", conta " + numero + " e seu saldo " + saldo + " já está disponível para saque.");

        // Fechar o scanner
        scanner.close();
    }
}
