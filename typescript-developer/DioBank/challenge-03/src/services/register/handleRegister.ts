import { createAccount } from '../../inMemoryDatabase'

interface IRegisterProps {
	name: string
	email: string
	password: string
}

export default function handleRegister(newAccount: IRegisterProps) {
	return createAccount(newAccount)
}
