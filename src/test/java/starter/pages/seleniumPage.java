package starter.pages;

import org.openqa.selenium.By;

public class seleniumPage {
    public static By titulo_inicio = By.xpath("//h1");

    public static By seccion_documentos = By.xpath("//a[@class='nav-link']//span[text()='Documentation']");

    public static By etiqueta_documentos = By.xpath("//span[@class='td-sidebar-nav-active-item']");

    public static By seccion_buscador = By.xpath("//span[@class='DocSearch-Button-Container']");

    public static By campo_ingreso_texto = By.xpath("//input[@class='DocSearch-Input']");

    public static By etiqueta_texto_buscado = By.xpath("//div[@class='lead']");

    public static By resultado_buscado = By.xpath("//li[@id='docsearch-item-0']");

}
