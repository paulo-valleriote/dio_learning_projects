import { createAccount, getAccountByEmail } from '../../inMemoryDatabase'

interface IRegisterProps {
	name: string
	email: string
	password: string
}

export default function handleRegister(newAccount: IRegisterProps) {
	const accountExists = getAccountByEmail(newAccount.email)

	if (accountExists instanceof Error) {
		return createAccount(newAccount)
	}

	throw new Error('Este e-mail já está sendo utilizado')
}
