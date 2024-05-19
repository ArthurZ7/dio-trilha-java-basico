import java.util.Scanner;

public class ContaTerminal {
    public static void main(String[] args) throws Exception {
        Scanner ler = new Scanner(System.in);

        int numero;
        String agencia;
        String nomeCliente;
        float saldo;

        System.out.println("Por favor, digite o número da sua conta: ");
        numero = ler.nextInt();

        System.out.println("Por favor, digite o número da Agência: ");
        ler.nextLine();
        agencia = ler.nextLine();

        System.out.println("Por favor, digite seu nome: ");
        nomeCliente = ler.nextLine();

        System.out.println("Por favor, digite o seu saldo: ");
        saldo = ler.nextFloat();

        System.out.printf("Olá %s, obrigado por criar uma conta em nosso banco, sua agência é %s, conta %d e seu saldo %.4123f já está disponível para saque.", nomeCliente, agencia, numero, saldo);

        ler.close();
    }
}
