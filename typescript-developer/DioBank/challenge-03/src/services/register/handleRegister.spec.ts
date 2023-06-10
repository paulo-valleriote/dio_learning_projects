import { getAccountList } from '../../inMemoryDatabase'
import handleRegister from './handleRegister'

describe('Handle Register', () => {
	const accountList = () => getAccountList()
	const account = {
		name: 'John Doe',
		email: 'email@test.com',
		password: '',
	}

	it('Should insert a new account in inMemoryDatabase', () => {
		account.password = '1234'

		handleRegister(account)
		const list = accountList()

		if (typeof list === 'string') {
			throw new Error('404 - Not founded')
		}

		expect(list.length).toBeGreaterThanOrEqual(1)
	})

	it('Should throw an Error if email already in use', () => {
		account.email = 'test@email.com'
		account.password = '1234'

		const anotherAccount = {
			name: 'Doe John',
			email: 'test@email.com',
			password: '4321',
		}

		handleRegister(account)

		expect(() => handleRegister(anotherAccount)).toThrow()
	})
})
