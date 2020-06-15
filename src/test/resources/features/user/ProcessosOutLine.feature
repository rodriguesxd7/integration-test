Feature: CRUD user Processos

  Scenario Outline: User save a register
    Given user would like to save a register outline
    And user post inform1 <fields> with value equal "<value>"
    And user post inform2 <fields1> with value equal "<value1>"
    And user post inform3 <fields2> with value equal "<value2>"
    And user post inform4 <fields3> with value equal "<value3>"
    And user post inform5 <fields4> with value equal "<value4>"
    And user post inform6 <fields5> with value equal "<value5>"
    And user post inform7 <fields6> with value equal "<value6>"
    And user post inform8 <fields7> with value equal "<value7>"
    And user post inform9 <fields8> with value equal "<value8>"
    And user post inform10 <fields9> with value equal "<value9>"
    And user post inform11 <fields10> with value equal "<value10>"
    And user post inform12 <fields11> with value equal "<value11>"
    When user click on the save button post process outline
    Then user should see status code post <statusCode>
    And user would like get the response
    Examples:
      | fields | value | fields1         | value1 | fields2  | value2              | fields3 | value3           | fields4 | value4 | fields5      | value5 | fields6           | value6 | fields7      | value7     | fields8    | value8     | fields9          | value9     | fields10 | value10   | fields11   | value11             | statusCode |
      | vara   | 258   | numero_processo | 852    | natureza | Pagamento de divida | partes  | Fulano x Ciclano | urgente | N      | arbitramento | S      | assistente_social | Bruno  | data_entrada | 20/05/2019 | data_saida | 20/06/2019 | data_agendamento | 20/07/2019 | status   | Andamento | observacao | Testando observação | 201        |