package bank.system.model;

import java.util.ArrayList;
import java.util.List;

import bank.account.EnterpriseAccount;
import bank.account.PersonalAccount;
import bank.account.model.Account;

public class Bank {
  private List<Account> accountList = new ArrayList<Account>();

  private void addAccountToList(Account account) {
    if (account != null)
      accountList.add(account);
    else
      throw new NullPointerException("Nenhuma conta foi informada");
  }

  public Account createAccount(String name, String password, boolean accountIsPersonal) {
    String[] newAccountProps = new String[2];
    newAccountProps[0] = name;
    newAccountProps[1] = password;

    Account newAccount = accountIsPersonal ? new PersonalAccount(newAccountProps, "any_cpf")
        : new EnterpriseAccount(newAccountProps, "any_cnpj");
    addAccountToList(newAccount);
    return newAccount;
  }

  public void deleteAccount(int token) {
    try {
      for (Account account : accountList) {
        if (account.getToken("a") == token)
          this.accountList.remove(0);
      }
    } catch (Exception error) {
      System.out.println(error.getMessage());
    }
  }

  public List<Account> listAccounts() {
    return this.accountList;
  }
}
