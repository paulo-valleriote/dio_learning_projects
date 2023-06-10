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
			<div
				style={{
					display: 'flex',
					flexDirection: 'column',
					justifyContent: 'center',
					alignItems: 'center',
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
		</div>
	)
}
