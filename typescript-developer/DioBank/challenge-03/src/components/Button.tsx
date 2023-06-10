import { CSSProperties } from 'react'

interface IButtonProps {
	classes?: string
	styles?: CSSProperties
	onClick?: () => void
	content: string
}

export default function Button({
	classes,
	onClick,
	styles,
	content,
}: IButtonProps) {
	return (
		<button className={`${classes}`} onClick={onClick} style={styles}>
			{content}
		</button>
	)
}
