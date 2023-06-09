export abstract class DioAccount {
	private readonly name: string
	private readonly accountNumber: number
	private balance: number = 0
	private status: boolean = true

	constructor(name: string, accountNumber: number) {
		this.name = name
		this.accountNumber = accountNumber
	}

	getName = (): string => {
		return this.name
	}

	deposit = (transactionAmount: number): void | string => {
		if (this.validateAccount(transactionAmount)) {
			this.balance += transactionAmount
			return
		}

		return 'O depósito não pode ser concluído, consulte o status e/ou saldo da conta'
	}

	withdraw = (): void => {
		console.log('Voce sacou')
	}

	getBalance = (): void => {
		console.log(this.balance)
	}

	protected validateStatus = (): boolean => (this.status ? true : false)

	private validateAccount = (transactionAmount: number): boolean => {
		if (this.status && this.balance >= transactionAmount) {
			return true
		}

		return false
	}
}
