# language: pt

    Funcionalidade: Criando um novo usuário

      Esquema do Cenário: Criando um simples usuário
        Dado que o usuário esteja no site do Agapito
        E que preencha o campo "login" com o valor "luna"
        E que o preencha o campo "full_name" com o valor "bug luna Agapito Correa"
        E que preencha o campo "email" com o valor "bugluna@gmail.com"
        E que preencha o campo "age" com o valor "13"
        Quando eu clicar no botao "Salvar usuário"
        Então usuário deveria ver a mensagem de "salvo com sucesso
        Exemplos: