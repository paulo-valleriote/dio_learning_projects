interface Account {
	id: number
	name: string
	email: string
	password: string
}

interface NewAccount {
	name: string
	email: string
	password: string
}

const account: Account[] = [
	{
		id: 1,
		name: 'John Doe',
		email: 'john@doe.com',
		password: '1234',
	},
]

export const getAccountList = (): Account[] => {
	if (account.length < 1) {
		throw new Error('Nenhuma conta foi encontrada')
	}

	return account
}

export const getAccountById = (id: number): Account => {
	const accountIndex = account.findIndex((account) => account.id === id)

	if (!accountIndex) {
		throw new Error('Nenhuma conta foi encontrada')
	}

	const findedAccount = account[accountIndex]

	return findedAccount
}

export const getAccountByEmail = (email: string): Account | Error => {
	const accountIndex = account.findIndex((account) => account.email === email)

	if (accountIndex < 0) {
		return new Error('Email ou senha estão incorretos')
	}

	const findedAccount = account[accountIndex]

	return findedAccount
}

export const createAccount = (newAccountProps: NewAccount): number => {
	const accountId = account[Math.abs(account.length - 1)].id + 1 || 1

	account.push({ id: accountId, ...newAccountProps })

	return accountId
}
