package app.pages;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;

public class BasePage {
    protected WebDriver driver;

    // Constructor que recibe el driver
    public BasePage(WebDriver driver) {

        this.driver = driver;
        this.driver.get("https://demoqa.com");
        this.driver.manage().window().maximize();
        JavascriptExecutor js =(JavascriptExecutor) driver;
        js.executeScript("window.scrollBy(0,350)","");
    }


    public BasePage() {
    }
}
