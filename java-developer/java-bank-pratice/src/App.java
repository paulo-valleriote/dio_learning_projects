import bank.account.model.Account;
import bank.system.N_Bank;

public class App {
    public static void main(String[] args) throws Exception {
        System.out.println("\nCriação da conta");
        N_Bank N_Bank = new N_Bank("N Bank Finanças");
        Account userAccount = N_Bank.createAccount("José", "1234", true);

        System.out.println("\nTransações monetárias");
        System.out.println("R$" + userAccount.getBalance());
        userAccount.deposit(50);
        System.out.println("R$" + userAccount.getBalance());
        userAccount.withdraw(25);
        System.out.println("R$" + userAccount.getBalance());
        System.out.println("\n" + userAccount.getStatment());
    }
}
