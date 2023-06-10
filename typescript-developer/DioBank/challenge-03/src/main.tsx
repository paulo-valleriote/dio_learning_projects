import React from 'react'
import ReactDOM from 'react-dom/client'

import SignIn from './Pages/SignIn'

import './global.css'
import { RouterProvider, createBrowserRouter } from 'react-router-dom'
import SignUp from './Pages/SignUp'

const router = createBrowserRouter([
	{
		path: '/',
		element: <SignIn />,
	},
	{
		path: '/cadastro',
		element: <SignUp />,
	},
])

ReactDOM.createRoot(document.getElementById('root') as HTMLElement).render(
	<React.StrictMode>
		<RouterProvider router={router} />
	</React.StrictMode>
)
