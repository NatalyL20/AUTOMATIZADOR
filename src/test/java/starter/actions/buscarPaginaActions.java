package starter.actions;

import starter.pages.googlePage;
import net.serenitybdd.screenplay.Performable;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.Clear;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Enter;


public class buscarPaginaActions {
    public static Performable term(String term) {
        return Task.where("{0} intenta ingresar a la página selenium",
                Clear.field(googlePage.campo_texto_navegador),
                Enter.theValue(term).into(googlePage.campo_texto_navegador),
                Click.on(googlePage.boton_buscar_navegador),
                Click.on(googlePage.resultado_seleccionado)
        ).with("term").of(term);
    }


}
