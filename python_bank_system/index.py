class Account:
    def __init__(self, name: str, account_amount: float):
        self.name = name
        self.account_amount = account_amount
        self.withdraw_limit = 0
        self.withdraw_history = []
        self.deposit_history = []

    def deposit(self, amount: float):
        self.deposit_history.append(amount)
        self.account_amount += amount

    def withdraw(self, amount: float):
        if self.withdraw_limit == 3:
            return "Limite diário alcançado"
        self.withdraw_limit += 1

        if self.account_amount < amount:
            return "Você não tem este saldo em conta"

        if amount > 500:
            return "O limite atual para a opção SAQUE é: R$500,00"

        self.withdraw_history.append(amount)
        self.account_amount -= amount

    def statment(self):
        if self.deposit_history.__len__() == 0 and self.withdraw_history.__len__() == 0:
            return "Não foram realizadas movimentações"

        return f"""
        Depósitos realizados: {[f'R${deposit}' for deposit in self.deposit_history]}
        Saques realizados: {[f'R${withdraw}' for withdraw in self.withdraw_history]}
        Saldo atual: R${self.account_amount}
        """


arnoldo = Account("Arnoldo", 0.0)

print(arnoldo.statment())
arnoldo.deposit(200.0)
arnoldo.deposit(45.0)
arnoldo.withdraw(140.0)
arnoldo.deposit(15.0)
arnoldo.withdraw(25.0)
arnoldo.deposit(340.0)
print(arnoldo.statment())
