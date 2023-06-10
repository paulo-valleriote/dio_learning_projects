import { useForm } from 'react-hook-form'
import { Link, useNavigate } from 'react-router-dom'

import Button from '../../components/Button'
import PageWrapper from '../../components/PageWrapper'
import handleLogin from '../../services/login/handleLogin'

import style from './styles.module.css'
import { useState } from 'react'

interface IFormFields {
	email: string
	password: string
}

export default function SignIn() {
	const navigate = useNavigate()

	const [submitError, setSubmitError] = useState('')

	const {
		register,
		handleSubmit,
		formState: { errors },
	} = useForm<IFormFields>()

	const authenticateUser = (values: IFormFields) => {
		try {
			const id = handleLogin(values)

			localStorage.setItem('token', `${id}`)

			navigate(`/user/${id}`)
		} catch (err) {
			return err instanceof Error && setSubmitError(err.message)
		}
	}

	return (
		<PageWrapper>
			<form
				onSubmit={handleSubmit(authenticateUser)}
				className={style.formWrapper}
			>
				<div className={style.inputWrapper}>
					<label htmlFor='email'>Email</label>
					<input
						id='email'
						type='text'
						placeholder='Alex'
						className={style.input}
						{...register('email', { required: true })}
					/>
					{errors.email && <span>{errors.email.message}</span>}
				</div>

				<div className={style.inputWrapper}>
					<label htmlFor='password'>Senha</label>
					<input
						id='password'
						type='password'
						placeholder='naoBotei1234'
						className={style.input}
						{...register('password', { required: true })}
					/>
					{errors.password && <span>{errors.password.message}</span>}
				</div>

				{submitError && <span style={{ color: 'red' }}>{submitError}</span>}

				<Button content='Entrar' classes={style.button} />
				<p>
					Não tem uma conta?{' '}
					<Link to='/cadastro' className={style.redirect}>
						Clique aqui
					</Link>
				</p>
			</form>
		</PageWrapper>
	)
}
