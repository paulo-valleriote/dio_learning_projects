import { useEffect, useState } from 'react'
import { useNavigate } from 'react-router-dom'

export default function RedirectElement() {
	const navigate = useNavigate()

	const [counter, setCounter] = useState(5)

	useEffect(() => {
		setTimeout(() => {
			navigate('/')
		}, 6000)

		setInterval(() => {
			setCounter(counter - 1)
		}, 1000)
	}, [counter, navigate])

	return (
		<div
			style={{
				display: 'flex',
				width: '100vw',
				flexDirection: 'column',
				justifyContent: 'center',
				alignItems: 'center',
			}}
		>
			<h2>Você não pode acessar essa página</h2>
			<p>Sendo redirecionado em {counter}...</p>
		</div>
	)
}
