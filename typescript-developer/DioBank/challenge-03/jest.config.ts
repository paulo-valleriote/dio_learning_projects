export default {
	testEnvironment: 'jsdom',
	transform: {
		'^.+\\.tsx?$': 'ts-jest',
	},
	moduleNameMapper: {
		//'\\.(gif|tff|eot|svg|png)$': './test/__mocks__/fileMock.js',
		'\\.(css|less|sass|scss)$': 'identity-obj-proxy',
	},
	setupFilesAfterEnv: ['./jest.setup.ts'],
}
