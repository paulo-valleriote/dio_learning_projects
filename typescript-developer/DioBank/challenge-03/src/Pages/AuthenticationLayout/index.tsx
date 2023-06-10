import { useLoaderData } from 'react-router-dom'
import UserProfile from '../UserProfile'
import { useContext } from 'react'
import { AccountContext } from '../../contexts/accountContext'
import PageWrapper from '../../components/PageWrapper'

interface ILoadedData {
	id: number
	name: string
	email: string
}

export default function AuthenticationLayout() {
	const userData = useLoaderData() as ILoadedData

	const { setAccountData } = useContext(AccountContext)

	setAccountData({ accountData: userData })

	return <PageWrapper>{<UserProfile />}</PageWrapper>
}
