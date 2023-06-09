import Button from '../../components/Button'
import PageWrapper from '../../components/PageWrapper'

import handleLogin from '../../services/handleLogin'

export default function Home() {
	return (
		<PageWrapper>
			<Button onClick={handleLogin} content='Entrar' />
		</PageWrapper>
	)
}
