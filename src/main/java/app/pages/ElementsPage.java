package app.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class ElementsPage  {


    // Selectores
    private By elementslink = By.cssSelector(".show #item-5 > .text");
    private WebDriver driver;


    public ElementsPage(WebDriver driver) {
        this.driver=driver;
    }

    public static void scrollDown(WebDriver driver) {
        JavascriptExecutor js = (JavascriptExecutor) driver;
        js.executeScript("window.scrollBy(0, 300)");
    }


    // Método de navegación
    public LinksPage navigateToLinks() {
        scrollDown(driver);
        driver.findElement(elementslink).click();
        return new LinksPage(driver);
    }
}
