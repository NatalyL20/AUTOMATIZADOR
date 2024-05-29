# AUTOMATIZACIÓN WEB - PAG. SELENIUM DEV

## Especificaciones del proyecto
```Gherkin
Lenguaje de Programación: Java.
Framework de Pruebas: Serenity BDD para estructurar las pruebas y generar reportes.
Patrón de Diseño: Screenplay para desarrollar las pruebas.
Cucumber para casos de prueba.
```

## Obtener el proyecto
Para obtener el proyecto debemos clonar desde Github.
Abrir el proyecto y descargar las dependencias y plugins del archivo POM.

## Estructura del proyecto
El proyecto tiene la siguiente estructura:
```Gherkin

+ src
  + test
    + java  
        +starter
          +actions
          +pages
          +stepDefinitions
        +RunTest
    + resources
      + features                  
             PruebasWeb.feature
```

## Los escenarios de pruebas
Se crearon los siguientes escenarios de prueba
```Gherkin
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

```

## Actores
Para el desarrollo de los casos se creó el siguiente actor:
```java
public class pruebaWeb {
    Actor Nat = Actor.named("Nat");
}
```
## Ejecución del proyecto
Ejecutar la clase RunTest la cual se encuentra configurada para ejecutar los 3 casos del feature PruebasWeb.

Se encuentra en la ruta:
```Gherkin

+ src
  + test
    + java
        +RunTest
```
## Reporte
Para generar el reporte debemos ejecutar el siguiente comando
```Gherkin
mvn verify 
```
en la sección "Execute maven goal".

El reporte se generará en la ruta con el nombre index.html:
```Gherkin
+Automatizador
    + target
        + site  
          +serenity
            +index.html
```


