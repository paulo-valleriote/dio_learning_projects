import handleLogin from './handleLogin'

describe('Handle login function', () => {
	const alertMock = jest.fn()
	window.alert = alertMock
	it('should show up a message on screen', () => {
		handleLogin()
		expect(alertMock).toBeCalled()
	})
})
