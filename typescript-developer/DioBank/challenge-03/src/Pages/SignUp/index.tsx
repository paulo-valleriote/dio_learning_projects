import { useForm } from 'react-hook-form'
import Button from '../../components/Button'
import PageWrapper from '../../components/PageWrapper'

import handleRegister from '../../services/register/handleRegister'

import style from './styles.module.css'
import { Link, useNavigate } from 'react-router-dom'
import { useState } from 'react'

interface IFormFields {
	name: string
	email: string
	password: string
}

export default function SignUp() {
	const navigate = useNavigate()

	const [submitError, setSubmitError] = useState('')

	const {
		register,
		handleSubmit,
		formState: { errors },
	} = useForm<IFormFields>()

	const registerUser = (values: IFormFields) => {
		try {
			handleRegister(values)
		} catch (err) {
			return err instanceof Error && setSubmitError(err.message)
		}

		navigate('/')
	}

	return (
		<PageWrapper>
			<form onSubmit={handleSubmit(registerUser)} className={style.formWrapper}>
				<div className={style.inputWrapper}>
					<label htmlFor='name'>Nome</label>
					<input
						id='name'
						type='text'
						placeholder='Alex'
						className={style.input}
						{...register('name', { required: true })}
					/>
					{errors.name && (
						<span style={{ color: 'red' }}>{errors.name.message}</span>
					)}
				</div>

				<div className={style.inputWrapper}>
					<label htmlFor='email'>E-mail</label>
					<input
						id='email'
						type='text'
						placeholder='alex@dominio.com'
						className={style.input}
						{...register('email', { required: true })}
					/>
					{errors.email && (
						<span style={{ color: 'red' }}>{errors.email.message}</span>
					)}
				</div>

				<div className={style.inputWrapper}>
					<label htmlFor='password'>Senha</label>
					<input
						id='password'
						type='password'
						placeholder='naoUse1234'
						className={style.input}
						{...register('password', { required: true })}
					/>
					{errors.password && (
						<span style={{ color: 'red' }}>{errors.password.message}</span>
					)}
				</div>

				{submitError && <span style={{ color: 'red' }}>{submitError}</span>}

				<Button content='Registrar' classes={style.button} />
				<p>
					Já tem uma conta?{' '}
					<Link className={style.redirect} to='/'>
						Clique aqui
					</Link>
				</p>
			</form>
		</PageWrapper>
	)
}
