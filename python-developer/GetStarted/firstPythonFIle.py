
class mySelf:
    name = 'Paulo'
    loveOfMyLife = ''
    def setLoveOfMyLife():
      mySelf.loveOfMyLife = input('Escreva o nome do amor da sua vida: ')
    def getLoveOfMyLife():
      print(f'Meu nome é {mySelf.name} e o amor da minha vida é a {mySelf.loveOfMyLife}')
    
mySelf.setLoveOfMyLife()
mySelf.getLoveOfMyLife()