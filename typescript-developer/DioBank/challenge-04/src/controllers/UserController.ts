import { Request, Response } from 'express'
import { User, UserService } from '../services/UserService'

export class UserController {
	userService: UserService

	constructor(userService = new UserService()) {
		this.userService = userService
	}

	createUser = (request: Request, response: Response): Response => {
		const user = request.body

		if (Object.values(user).some((value) => !value)) {
			return response
				.status(400)
				.json({ message: 'Todos os campos são obrigatórios' })
		}

		this.userService.createUser(user.name, user.email)
		return response.status(201).json({ message: 'Usuário criado' })
	}

	getAllUsers = (request: Request, response: Response) => {
		const users: User[] = this.userService.getAllUsers()
		return response.status(200).json(users)
	}

	deleteUser = (request: Request, response: Response) => {
		const { email } = request.body

		if (!email) {
			return response
				.status(404)
				.json({ message: 'Nenhum usuário foi cadastrado com este e-mail' })
		}

		this.userService.deleteUser(email)
		return response.status(204)
	}
}
