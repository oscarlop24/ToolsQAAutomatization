Feature: Yo como QA requiero llenar el fomulario de practica de ToolsQA client:

  @LlenarFormulario
  Scenario Outline:Completar el practice form
    Given se ingrese a la pagina donde se encuentra el formulario
    When se llenen todos los campos del formulario <nombre>, <apellido>, <correo>, <telefono>, <fecha>, <materia>, <materia2>, <direccion>
    Then se verifica que la automatizacion haya funcionado

    Examples:
      | nombre | apellido |correo|telefono|fecha|materia|materia2|direccion|
      | Oscar  | Lopez    |oscar@gmail.com|1234567890|20 feb 1995|co|p|calle 23 G bis B 96 H - 35|
