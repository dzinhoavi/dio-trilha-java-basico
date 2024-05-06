import java.util.Scanner;

public class ContaTerminal{

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.println("Por favor, digite o número da Agência! ");
        String agencia = scanner.next();
        
        System.out.println("Por favor, digite o número da Conta! ");
        int conta = scanner.nextInt();
        scanner.nextLine();

        System.out.println("Por favor, digite seu nome! ");
        String nomeCliente = scanner.nextLine();
        
        System.out.println("Por favor, digite seu saldo! ");
        double saldo = 0;
        saldo = Double.parseDouble(scanner.nextLine());

        System.out.println("Olá! " + nomeCliente + ", obrigado por criar uma conta em nosso banco, sua agência é " + agencia + ", conta " + conta + " e seu saldo " + saldo + " já está disponível para saque.");

        scanner.close();
    }

}