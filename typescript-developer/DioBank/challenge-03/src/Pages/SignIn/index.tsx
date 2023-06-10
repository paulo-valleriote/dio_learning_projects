import Button from '../../components/Button'
import PageWrapper from '../../components/PageWrapper'

import handleLogin from '../../services/login/handleLogin'

export default function SignIn() {
	return (
		<PageWrapper>
			<form>
				<div>
					<label htmlFor='email'>Email</label>
					<input id='email' type='text' placeholder='Alex' />
				</div>

				<div>
					<label htmlFor='password'>Senha</label>
					<input id='password' type='password' placeholder='********' />
				</div>

				<Button onClick={handleLogin} content='Entrar' />
			</form>
		</PageWrapper>
	)
}
