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

	it('Should return an ID', () => {
		account.password = '1234'

		const id = handleRegister(account)

		expect(id).toBeTruthy()
		expect(id).toBeGreaterThanOrEqual(1)
	})
})
