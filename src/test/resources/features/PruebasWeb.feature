Feature: Pruebas web

  @test-01
  Scenario: validar la carga de la página de inicio de selenium
    Given Nat ingresa a google
    When Nat busca la pagina "www.selenium.dev"
    Then Nat debe observar el siguiente enunciado de bienvenida "Selenium automates browsers. That's it!"


  @test-02
  Scenario: Validar la navegación al apartado de documentación
    Given Nat ingresa a google
    When Nat busca la pagina "www.selenium.dev"
    And  hace click sobre la etiqueta de documentación
    Then Nat debe observar la sección "Documentation"


  @test-03
  Scenario: Validar el flujo de búsqueda en el sitio
    Given Nat ingresa a google
    When Nat busca la pagina "www.selenium.dev"
    And  hace click sobre la etiqueta de documentación
    And  busca la palabra "Grid"
    Then Nat debe observar la frase "Want to run tests in parallel across multiple machines? Then, Grid is for you."
