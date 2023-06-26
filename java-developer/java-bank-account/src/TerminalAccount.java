import java.util.Locale;
import java.util.Scanner;

public class TerminalAccount {

  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in).useLocale(Locale.US);

    float balance = 0;
    System.out.print("Por favor, digite o número da Conta\n");
    int accountNumber = scanner.nextInt();
    System.out.print("Por favor, digite o número da Agência\n");
    String agencyCode = scanner.next();
    System.out.print("Por favor, digite seu nome\n");
    String clientName = scanner.next();

    scanner.close();
    String greetings = String.format(
        "Olá, %s! Obrigado por criar uma conta em nosso banco, sua agência é %s, conta %d.\n\nSaldo atual: %f",
        clientName, agencyCode, accountNumber, balance);
    System.out.print("-----------------------------------------------------------\n");
    System.out.println(greetings);
  }
}
