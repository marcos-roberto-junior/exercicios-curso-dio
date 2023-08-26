import java.util.Locale;
import java.util.Scanner;

public class ContaTerminal {
    public static void main(String[] args) {
        int numero;
        String agencia;
        String nomeCliente;
        double saldo;
        Scanner imput = new Scanner(System.in).useLocale(Locale.US);

        System.out.println("Por favor, digite o seu nome! ");
        nomeCliente = imput.next();
        System.out.println("Por favor, digite o numero da conta! ");
        numero = imput.nextInt();
        System.out.println("Por favor, digite o numero da agencia! ");
        agencia = imput.next();
        System.out.println("Por favor, digite o saldo inicial! ");
        saldo = imput.nextDouble();

        System.out.println("Ola "+nomeCliente+", " +
                "obrigado por criar uma conta em nosso banco, " +
                "sua agencia é "+agencia+", conta "+numero+
                " e seu saldo "+saldo+" já esta disponivel.");
    }
}