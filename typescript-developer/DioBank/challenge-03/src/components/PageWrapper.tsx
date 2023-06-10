import { ReactNode } from 'react'
import Header from './Header'

export default function PageWrapper({ children }: { children: ReactNode }) {
	return (
		<div
			style={{
				display: 'grid',
				placeContent: 'center',
				height: '100vh',
				width: '100vw',
				overflow: 'hidden',
			}}
		>
			<Header />

			<main
				style={{
					display: 'flex',
					flexDirection: 'column',
					alignItems: 'center',
					justifyContent: 'center',
				}}
			>
				{children}
			</main>
		</div>
	)
}
