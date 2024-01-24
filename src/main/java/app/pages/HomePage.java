package app.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;


public class HomePage extends BasePage {
    public HomePage() {
    }


    // Selectores
    private By elements = By.cssSelector(".card:nth-child(1) h5");
    private By forms = By.cssSelector(".card:nth-child(2) svg");
    private By widgets = By.cssSelector(".card:nth-child(4) .card-body");
    private By sliderLink = By.cssSelector(".show #item-3 > .text");

    public static void scrollDown(WebDriver driver) {
        JavascriptExecutor js = (JavascriptExecutor) driver;
        js.executeScript("window.scrollBy(0, 300)");
    }


    public HomePage(WebDriver driver) {
       super(driver);
    }

    public static void main(String[] args) {
        try {
            Thread.sleep(10000);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    // Métodos de navegación

    public ElementsPage navigateToElements() {
        driver.findElement(elements).click();
        return new ElementsPage(driver);
    }

    public FormsPage navigateToForms() {
        driver.findElement(forms).click();
        return new FormsPage(driver);
    }

    public SliderPage navigateToSlider()  {
        driver.findElement(widgets).click();
        scrollDown(driver);
        driver.findElement(sliderLink).click();
        return new SliderPage(driver);
    }
}

