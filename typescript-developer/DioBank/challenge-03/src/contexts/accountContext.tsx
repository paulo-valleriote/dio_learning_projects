import React, { ReactNode, createContext, useState } from 'react'

interface ProviderProps {
	children: ReactNode
}

interface IAccountData {
	accountData: { id: number; name?: string; email?: string }
}

interface IAccountContext extends IAccountData {
	setAccountData: React.Dispatch<React.SetStateAction<IAccountData>>
}

export const AccountContext = createContext<IAccountContext>({
	accountData: { id: 0 },
	// eslint-disable-next-line @typescript-eslint/no-unused-vars
	setAccountData: (_value: React.SetStateAction<IAccountData>) => {
		return
	},
})

export const AccountContextProvider = ({ children }: ProviderProps) => {
	const [accountData, setAccountData] = useState<IAccountData>({
		accountData: { id: 0 },
	})

	return (
		<AccountContext.Provider value={{ ...accountData, setAccountData }}>
			{children}
		</AccountContext.Provider>
	)
}
