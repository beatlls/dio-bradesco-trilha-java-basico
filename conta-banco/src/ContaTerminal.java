
import java.util.Locale;
import java.util.Scanner;

public class ContaTerminal {
    public static void main(String[] args) throws Exception {
       Scanner scanner = new Scanner(System.in) .useLocale(Locale.US);

        System.out.println("Digite o número da sua conta");
        int numeroConta = scanner.nextInt();
        scanner.nextLine();

        System.out.println("Digite sua agência");
        String agenciaConta = scanner.nextLine();

        System.out.println("Digite seu nome");
        String nomeConta = scanner.nextLine();

        System.out.println("Digite seu saldo:");
        double saldoConta = scanner.nextDouble();


        System.out.println("Olá " + nomeConta + ", obrigado por criar uma conta em nosso banco, sua agência é " + agenciaConta + ",conta número " + numeroConta + "e seu saldo " + saldoConta + " já está disponível");
    }
}
