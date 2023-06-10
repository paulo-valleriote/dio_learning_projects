import Button from '../../components/Button'
import PageWrapper from '../../components/PageWrapper'

import handleRegister from '../../services/register/handleRegister'

export default function SignUp() {
	return (
		<PageWrapper>
			<form>
				<div>
					<label htmlFor='name'>Nome</label>
					<input id='name' type='text' placeholder='Alex' />
				</div>

				<div>
					<label htmlFor='email'>E-mail</label>
					<input id='email' type='text' placeholder='alex@dominio.com' />
				</div>

				<div>
					<label htmlFor='password'>Senha</label>
					<input id='password' type='password' placeholder='********' />
				</div>

				<Button onClick={handleRegister} content='Registrar' />
			</form>
		</PageWrapper>
	)
}
