Feature: Agregar libros al carro de compras

  Scenario: El usuario inicia sesion en aplicativo de manera exitosa y luego agrega libros al carro de compra
    Given Que he ingresado a la pagina "http://sahitest.com/demo/training/login.htm"
    And he Ingresado nombre de usuario y Password
      | usuario | password |
      | test    | secret   |
    When de click en el boton login
    And seleccione la cantidad de libros
      | libro  | cantidad |
      | java   |        3 |
      | ruby   |        2 | 
      | python |        1 |
    And los agregue al carro de compras
    Then deberia ver un gran total de "1650"
