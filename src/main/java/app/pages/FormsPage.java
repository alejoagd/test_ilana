package app.pages;

import org.openqa.selenium.By;

import org.openqa.selenium.SearchContext;
import org.openqa.selenium.WebDriver;

public class FormsPage extends HomePage {
    public FormsPage() {
    }
    // Selectores
    private By formsLink;
    private WebDriver driver;

    public FormsPage(WebDriver driver) {
        this.formsLink = By.cssSelector(".show .text");
        this.driver= driver;
    }


    // Método de navegación
    public PracticeFormPage navigateToPracticeForm() {
        this.driver.findElement(this.formsLink).click();
        return new PracticeFormPage(driver);
    }
}
