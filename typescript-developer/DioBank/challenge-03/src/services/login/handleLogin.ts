import { getAccountByEmail } from '../../inMemoryDatabase'

interface ILoginProps {
	email: string
	password: string
}

export default function handleLogin(loginData: ILoginProps): number {
	const findedAccount = getAccountByEmail(loginData.email)

	if (findedAccount instanceof Error) {
		throw new Error(findedAccount.message)
	}

	if (findedAccount.password !== loginData.password) {
		throw new Error('Email ou senha estão incorretos')
	}

	return findedAccount.id
}
