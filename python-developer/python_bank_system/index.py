class Bank_Manager:
    registered_accounts = 0
    accounts_list = []

    def __init__(self, *, name):
        self.manager_name = name

    def create_account(self, *, name):
        self.registered_accounts = self.registered_accounts + 1
        self.accounts_list.append(name)
        account = Account(id=self.registered_accounts, name=name)

        return account

    def list_accounts(self):
        print([f"{i}: {account}" for i, account in enumerate(self.accounts_list)])


class Account:
    def __init__(
        self,
        *,
        id: int,
        name: str,
    ):
        self.id = id
        self.name = name
        self.account_amount = 0
        self.withdraw_limit = 0
        self.withdraw_history = []
        self.deposit_history = []

    def deposit(self, *, amount: float):
        self.deposit_history.append(amount)
        self.account_amount += amount

        print(f"Saldo atual: {self.account_amount}")

    def withdraw(self, *, amount: float):
        if self.withdraw_limit == 3:
            print("Limite diário alcançado")
        self.withdraw_limit += 1

        if self.account_amount < amount:
            print("Você não tem este saldo em conta")

        if amount > 500:
            print("O limite atual para a opção SAQUE é: R$500,00")

        self.withdraw_history.append(amount)
        self.account_amount -= amount

        print(f"Saldo atual: {self.account_amount}")

    def statment(self):
        if self.deposit_history.__len__() == 0 and self.withdraw_history.__len__() == 0:
            print("Não foram realizadas movimentações")

        print(
            f"Depósitos realizados: {[f'R${deposit}' for deposit in self.deposit_history]}"
        )
        print(
            f"Saques realizados: {[f'R${withdraw}' for withdraw in self.withdraw_history]}"
        )
        print(f"Saldo atual: R${self.account_amount}")


gerenciador_conta_bancaria = Bank_Manager(name="CodeBank")
rodrigoAccount = gerenciador_conta_bancaria.create_account(name="Rodrigo")

rodrigoAccount.deposit(amount=500)
rodrigoAccount.withdraw(amount=350)
rodrigoAccount.statment()

sergioAccount = gerenciador_conta_bancaria.create_account(name="Sérgio")

gerenciador_conta_bancaria.list_accounts()
