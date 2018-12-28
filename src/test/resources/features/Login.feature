Feature: Inicio de sesion Exitosa

Como usuario del aplicativo quiero acceder a mi vista predeterminda al ingresar 

usuario y contraseña correctas



Scenario: El usuario inicia sesion en aplicativo de manera exitosa

	Given Que he ingresado a la pagina "http://sahitest.com/demo/training/login.htm"

	And he Ingresado nombre de usuario y Password

	| user | password |

	| test | secret |

	When de click en el boton login

	Then deberia acceder al aplicativo