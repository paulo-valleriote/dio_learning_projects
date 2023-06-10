import handleLogin from './handleLogin'

describe('Handle login function', () => {
	it('should return an id', () => {
		const loginData = {
			email: 'john@doe.com',
			password: '1234',
		}

		const loginResponse = handleLogin(loginData)

		expect(loginResponse).toBeGreaterThanOrEqual(1)
	})

	it('should return an Error if password doesnt match', () => {
		const loginData = {
			email: 'john@doe.com',
			password: '4321',
		}

		expect(() => handleLogin(loginData)).toThrow()
	})
	it('should return an Error if account doesnt exist', () => {
		const loginData = {
			email: 'test@example.com',
			password: '1234',
		}

		expect(() => handleLogin(loginData)).toThrow()
	})
})
