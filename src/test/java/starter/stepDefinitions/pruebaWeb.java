package starter.stepDefinitions;

import io.cucumber.java.Before;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import net.serenitybdd.annotations.Managed;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.abilities.BrowseTheWeb;
import org.openqa.selenium.WebDriver;
import starter.actions.irEtiquetaDocumentosActions;
import starter.actions.irwebActions;
import starter.actions.buscarPaginaActions;
import starter.actions.obtenerFraseActions;
import starter.actions.buscarPalabraActions;

import static net.serenitybdd.screenplay.GivenWhenThen.seeThat;
import static org.hamcrest.Matchers.equalTo;

public class pruebaWeb {

    @Managed
    WebDriver driver;
    Actor Nat = Actor.named("Nat");

    @Before
    public void setupActor() {
        Nat.can(BrowseTheWeb.with(driver));
    }

    @Given("Nat ingresa a google")
    public void Nat_ingresa_a_google() {
        Nat.attemptsTo(irwebActions.alaPaginaWeb());
    }

    @When("Nat busca la pagina {string}")
    public void Nat_busca_la_pagina(String string) {
        BrowseTheWeb.as(Nat).waitFor(2).seconds();
        Nat.attemptsTo(buscarPaginaActions.term(string));
    }

    @When("hace click sobre la etiqueta de documentación")
    public void hace_click_sobre_la_etiqueta_de_documentación() {
        Nat.attemptsTo(irEtiquetaDocumentosActions.irEtiquetaDocumentos());
    }

    @When("busca la palabra {string}")
    public void busca_la_palabra(String string) {
        Nat.attemptsTo(buscarPalabraActions.term(string));
    }

    @Then("Nat debe observar el siguiente enunciado de bienvenida {string}")
    public void nat_debe_observar_el_siguiente_enunciado_de_bienvenida(String string) {
        BrowseTheWeb.as(Nat).waitFor(10).seconds();
        Nat.should(seeThat(obtenerFraseActions.obtenerFraseInicio(), equalTo(string)));
    }

    @Then("Nat debe observar la sección {string}")
    public void Nat_debe_observar_la_sección(String string) {
        BrowseTheWeb.as(Nat).waitFor(10).seconds();
        Nat.should(seeThat(obtenerFraseActions.obtenerFraseDocumento(), equalTo(string)));
    }

    @Then("Nat debe observar la frase {string}")
    public void Nat_debe_observar_la_frase(String string) {
        BrowseTheWeb.as(Nat).waitFor(10).seconds();
        Nat.should(seeThat(obtenerFraseActions.obtenerFrasebuscada(), equalTo(string)));
    }
}
