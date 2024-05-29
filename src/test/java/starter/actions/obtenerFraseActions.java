package starter.actions;

import net.serenitybdd.screenplay.Question;
import net.serenitybdd.screenplay.questions.Text;
import starter.pages.seleniumPage;

public class obtenerFraseActions {
    public static Question<String> obtenerFraseInicio() {

        Question<String> string;

        string = Text.of(seleniumPage.titulo_inicio).asString();
        return string;

    }

    public static Question<String> obtenerFraseDocumento() {

        Question<String> string;

        string = Text.of(seleniumPage.etiqueta_documentos).asString();
        return string;

    }

    public static Question<String> obtenerFrasebuscada() {

        Question<String> string;

        string = Text.of(seleniumPage.etiqueta_texto_buscado).asString();
        return string;

    }
}
