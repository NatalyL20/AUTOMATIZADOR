package starter.actions;

import net.serenitybdd.screenplay.Performable;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.Clear;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Enter;
import starter.pages.googlePage;
import starter.pages.seleniumPage;

public class buscarPalabraActions {

    public static Performable term(String term) {
        return Task.where("{0} intenta buscar la palabra Grid",
                Click.on(seleniumPage.seccion_buscador),
                Clear.field(seleniumPage.campo_ingreso_texto),
                Enter.theValue(term).into(seleniumPage.campo_ingreso_texto),
                Click.on(seleniumPage.resultado_buscado)
        ).with("term").of(term);

    }
}

