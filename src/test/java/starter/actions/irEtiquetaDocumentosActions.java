package starter.actions;

import net.serenitybdd.screenplay.Performable;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.Click;
import starter.pages.seleniumPage;

public class irEtiquetaDocumentosActions {
    public static Performable irEtiquetaDocumentos() {
        return Task.where("{0} ingresa a la sección de documentos",
                Click.on(seleniumPage.seccion_documentos)
        );
    }
}
