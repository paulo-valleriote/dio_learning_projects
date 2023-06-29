package bank.account.model;

import java.util.ArrayList;
import java.util.List;

public class BankOperations {
  private double balance = 0;
  private List<String> statment = new ArrayList<String>();

  public void deposit(double amount) {
    this.balance = amount;
    registerDeposit(amount);
  }

  public void withdraw(double amount) throws Exception {
    if (amount > this.balance) {
      throw new Exception("Você não tem saldo o suficiente para a operação");
    }

    this.balance -= amount;
    registerWithdraw(amount);
  }

  public void transfer(double amount, Account accountToTransfer) throws Exception {
    if (amount > this.balance) {
      throw new Exception("Você não tem saldo o suficiente para a operação");
    }

    this.balance -= amount;
    accountToTransfer.deposit(amount);
    registerTransfer(accountToTransfer.getName(), amount);
  }

  public double getBalance() {
    return this.balance;
  }

  public List<String> getStatment() {
    return this.statment;
  }

  private void registerDeposit(double amount) {
    String message = String.format("Depósito de R$%.2f", amount);
    this.statment.add(message);
  }

  private void registerWithdraw(double amount) {
    String message = String.format("Saque de R$%.2f", amount);
    this.statment.add(message);
  }

  private void registerTransfer(String accountWhoReceived, double amount) {
    String message = String.format("Transferência de R$%.2f para %s", amount, accountWhoReceived);
    this.statment.add(message);
  }
}
