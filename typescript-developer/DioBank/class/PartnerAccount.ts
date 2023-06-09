import { DioAccount } from './DioAccount'

export class PartnerAccount extends DioAccount {
	constructor(name: string, accountNumber: number) {
		super(name, accountNumber)
	}

	partnershipDeposit(depositAmount: number): void {
		this.deposit(depositAmount + 10)
	}
}
