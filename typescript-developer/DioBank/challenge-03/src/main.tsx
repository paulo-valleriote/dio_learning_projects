import React from 'react'
import ReactDOM from 'react-dom/client'

import SignIn from './Pages/SignIn'

import './global.css'
import { RouterProvider, createBrowserRouter, redirect } from 'react-router-dom'
import SignUp from './Pages/SignUp'
import { AccountContextProvider } from './contexts/accountContext'
import { getAccountById } from './inMemoryDatabase'
import AuthenticationLayout from './Pages/AuthenticationLayout'
import UserProfile from './Pages/UserProfile'
import RedirectElement from './Pages/AuthenticationLayout/RedirectElement'

interface IAuthenticationLoader {
	id: number
	name: string
	email: string
}

const router = createBrowserRouter([
	{
		path: '/',
		element: <SignIn />,
		loader: () => {
			const id = localStorage.getItem('token')

			if (id) {
				redirect(`/user/${id}`)
			}

			return id
		},
	},
	{
		path: '/cadastro',
		element: <SignUp />,
	},
	{
		path: '/user',
		element: <AuthenticationLayout />,
		loader: (): IAuthenticationLoader | string => {
			const id = localStorage.getItem('token')

			return getAccountById(Number(id))
		},
		errorElement: <RedirectElement />,
		children: [
			{
				path: '/user/:id',
				element: <UserProfile />,
			},
		],
	},
])

ReactDOM.createRoot(document.getElementById('root') as HTMLElement).render(
	<React.StrictMode>
		<AccountContextProvider>
			<RouterProvider router={router} />
		</AccountContextProvider>
	</React.StrictMode>
)
