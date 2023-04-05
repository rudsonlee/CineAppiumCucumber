#language: pt

Funcionalidade: Login de Usuario Melhoria de cenário bonito

@test

Cenário: Login com sucesso
  Quando eu espero 3 segundos
  Quando eu clicar em cadastrar
  Dado que eu escreva as informações do usuário
  Então vou clicar em entrar

