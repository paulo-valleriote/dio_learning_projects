import { UserController } from './UserController'
import { UserService } from '../services/UserService'
import { Request } from 'express'
import { makeMockResponse } from '../__mocks__/mockResponse.mock'
import { makeMockRequest } from '../__mocks__/mockRequest.mock'

describe('UserController', () => {
	const mockUserService: Partial<UserService> = {
		createUser: jest.fn(),
		deleteUser: jest.fn(),
		getAllUsers: jest.fn(),
	}

	const userController = new UserController(mockUserService as UserService)

	it('Create - Should create a new user', () => {
		const mockRequest = {
			body: {
				name: 'Test',
				email: 'test@example.com',
			},
		} as Request
		const mockResponse = makeMockResponse()
		userController.createUser(mockRequest, mockResponse)
		expect(mockResponse.state.status).toBe(201)
		expect(mockResponse.state.json).toMatchObject({ message: 'Usuário criado' })
	})

	it('Create - Should throw an error if body is incomplete', () => {
		const mockRequest = {
			body: {
				name: '',
				email: 'test@example.com',
			},
		} as Request

		const mockResponse = makeMockResponse()
		userController.createUser(mockRequest, mockResponse)
		expect(mockResponse.state.status).toBe(400)
		expect(mockResponse.state.json).toMatchObject({
			message: 'Todos os campos são obrigatórios',
		})
	})

	it('Get All Users - Should return an list of users', () => {
		const mockRequest = {} as Request
		const mockResponse = makeMockResponse()
		userController.getAllUsers(mockRequest, mockResponse)

		expect(mockResponse.state.status).toBe(200)
	})

	it('Delete - Should remove an specified user from database', () => {
		const mockRequest = { body: { email: 'joana@dio.com' } } as Request
		const mockResponse = makeMockResponse()
		userController.deleteUser(mockRequest, mockResponse)

		expect(mockResponse.state.status).toBe(204)
	})

	it('Delete - Should throw an error if body is invalid', () => {
		const mockRequest = { body: {} } as Request
		const mockResponse = makeMockResponse()
		userController.deleteUser(mockRequest, mockResponse)

		expect(mockResponse.state.status).toBe(404)
		expect(mockResponse.state.json).toMatchObject({
			message: 'Nenhum usuário foi cadastrado com este e-mail',
		})
	})
})
