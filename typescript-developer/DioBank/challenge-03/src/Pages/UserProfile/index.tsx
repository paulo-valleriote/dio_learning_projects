import { useContext } from 'react'
import { AccountContext } from '../../contexts/accountContext'

export default function UserProfile() {
	const { accountData } = useContext(AccountContext)

	const userData = { ...accountData }
	return (
		<div>
			<h2>Olá, {userData.name}</h2>
			<h4>{userData.email}</h4>
		</div>
	)
}
