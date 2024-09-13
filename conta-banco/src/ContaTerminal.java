import java.util.Locale;
import java.util.Scanner;

public class ContaTerminal {
    public static void main(String[] args) {
        // System.out.println("Hello, World!");
        Scanner scanner = new Scanner(System.in).useLocale(Locale.US);
        double saldo = 237.48;

        System.out.println("Entre com o número da conta: TESTE EDICAO");
        int conta = scanner.nextInt();

        System.out.println("Entre com o número da agência: ");
        String agencia = scanner.next();

        System.out.println("Digite seu nome:");
        String nome = scanner.next();

        System.out.println("Sobrenome:");
        String sobrenome = scanner.next();

        System.out.println(" agencia " + agencia + " conta " + conta + " Nome " + nome + " saldo " + saldo);

        System.out.println(" Olá, " + nome + " " + sobrenome
                + " obrigado por criar uma conta em nosso banco, sua agência é " + agencia
                + ", conta " + conta + " e seu saldo, \n" + saldo + " já está disponível para saque!");
    }
}
