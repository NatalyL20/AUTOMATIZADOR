package starter.actions;

import net.serenitybdd.screenplay.Performable;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.Open;
import starter.pages.webPage;

public class irwebActions {

    public static Performable alaPaginaWeb() {
        return Task.where("{0} abre la página de google",
                Open.browserOn().the(webPage.class)
        );
    }
}
