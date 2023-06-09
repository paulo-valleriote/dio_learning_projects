import { DioAccount } from './DioAccount'

export class CompanyAccount extends DioAccount {
	constructor(name: string, accountNumber: number) {
		super(name, accountNumber)
	}

	getLoan = (loanAmount: number): string | void => {
		if (this.validateStatus()) {
			this.deposit(loanAmount)
			return
		}

		return 'Você não tem permissão para realizar essa operação'
	}
}
