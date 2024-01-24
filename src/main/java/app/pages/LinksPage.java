package app.pages;

import org.openqa.selenium.*;

import java.util.List;

public class LinksPage  {
    // Selectores
    private By allLinks = By.xpath("//a");
    private WebDriver driver;
    //constructor
    public LinksPage(WebDriver driver) {
        this.driver=driver;
    }

    // Método para verificar cada enlace
    public void verifyAllLinks() {
        List<WebElement> links = (List<WebElement>) ((JavascriptExecutor) driver)
                .executeScript("return document.getElementsByTagName('a');");

        System.out.println("Número de enlaces: " + links.size());

        // Iterando sobre la lista de enlaces
        for (WebElement link : links) {
            try {
                link.click();
            } catch (StaleElementReferenceException e) {
                System.out.println("Excepción StaleElementReferenceException: " + e.getMessage());
            } finally {
                driver.navigate().back();
            }
        }
    }


    // Método para hacer clic en el primer enlace en orden alfabético
    public void clickFirstLinkInAlphabeticalOrder() {
        List<WebElement> links = driver.findElements(allLinks);
        links.stream()
                .map(WebElement::getText)
                .sorted()
                .findFirst();
    }
}
