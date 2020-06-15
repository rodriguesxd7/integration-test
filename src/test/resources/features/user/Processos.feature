Feature: CRUD user Processos

  Scenario: User save a register
    Given user would like to save a register
    And user inform1 vara with value equal "258"
    And user inform2 numero_processo with value equal "852"
    And user inform3 natureza with value equal "Pagamento de divida"
    And user inform4 partes with value equal "Fulano x Ciclano"
    And user inform5 urgente with value equal "N"
    And user inform6 arbitramento with value equal "S"
    And user inform7 assistente_social with value equal "Bruno"
    And user inform8 data_entrada with value equal "20/05/2019"
    And user inform9 data_saida with value equal "20/06/2019"
    And user inform10 data_agendamento with value equal "20/07/2019"
    And user inform11 status with value equal "Andamento"
    And user inform12 observacao with value equal "Testando observação"
    When user click on the save button process
    Then user should see status code 201


  Scenario: User consultation process
    Given user would like to consult a process
    When user click on the button
    Then user will see the process

  Scenario: User would like to change all the data of the process
    Given user would like to change all the data of the process
    And User inform1 vara with value equal "345"
    And User inform2 numero_processo with value equal "000"
    And User inform3 natureza with value equal "Pensão atrasada"
    And User inform4 partes with value equal "Lider1 x Lider2"
    And User inform5 urgente with value equal "S"
    And User inform6 arbitramento with value equal "S"
    And User inform7 assistente_social with value equal "Carlos Retfield"
    And User inform8 data_entrada with value equal "20/05/2020"
    And User inform9 data_saida with value equal "20/06/2020"
    And User inform10 data_agendamento with value equal "20/07/2020"
    And User inform11 status with value equal "Concluído"
    And User inform12 observacao with value equal "Processo concluído com sucesso"
    When User click on the save button process
    Then User should see status code 200

  Scenario: User would like to change just one data of the process
    Given user would like to change just one data of the process
    And user inform4 partes with new value equal "PS4 x XBOX"
    When user click on the save button put
    Then user should see status code of put 200

  Scenario: User would like to delete a process
    Given user would like to delete a process
    When user click on the button to delete
    Then user should see a status code of delete 204