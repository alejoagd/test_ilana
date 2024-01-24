package app.pages;

import org.openqa.selenium.*;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

public class PracticeFormPage  {
    // Selectores
    private By Name = By.id("firstName");
    private By LastName = By.id("lastName");
    private By Email = By.id("userEmail");
    private By Gender = By.cssSelector(".custom-radio:nth-child(2) > .custom-control-label");
    private By User_Number = By.id("userNumber");
    private By Birthday_select = By.id("dateOfBirthInput");
    private By Birthday = By.cssSelector(".react-datepicker__day--006:nth-child(3)");
    private By Submit = By.id("submit");
    private By Submitting_close = By.id("closeLargeModal");
    private By Current_Adress = By.id("currentAddress");
    private WebDriver driver ;


    public PracticeFormPage(WebDriver driver) {
        this.driver=driver;

    }
     // Utilidades
    public static void scrollDown(WebDriver driver) {
        JavascriptExecutor js = (JavascriptExecutor) driver;
        js.executeScript("window.scrollBy(0, 500)");
    }

    public static void zoomOut(WebDriver driver) {
        JavascriptExecutor js = (JavascriptExecutor) driver;
        js.executeScript("document.body.style.zoom='50%'");
    }

    // Método para aumentar el zoom (aumentar el tamaño de la página)
    public static void zoomIn(WebDriver driver) {
        JavascriptExecutor js = (JavascriptExecutor) driver;
        js.executeScript("document.body.style.zoom='120%'");
    }



    // Método para llenar el formulario
    public void fillRegistrationForm(String name, String lastName, String email, String gender, String phoneNumber, String dob) {
        driver.findElement(Name).sendKeys(name);
        driver.findElement(LastName).sendKeys(lastName);
        driver.findElement(Email).sendKeys(email);
        driver.findElement(Gender).click();
        this.scrollDown(driver);
        driver.findElement(User_Number).sendKeys(phoneNumber);
        driver.findElement(Birthday_select).click();
        driver.findElement(Birthday).click();
        driver.findElement(Current_Adress).click();
        this.zoomOut(driver);
        this.scrollDown(driver);

    }

    // Método para enviar el formulario
    public void submitForm() {
        Actions actions = new Actions(driver);
        actions.sendKeys(Keys.TAB);
        actions.sendKeys(Keys.TAB);
        actions.sendKeys(Keys.RETURN);
        actions.perform();
    }

    // Método para verificar el mensaje de éxito
    public void verifySuccessMessage() {
        Actions actions = new Actions(driver);
        actions.sendKeys(Keys.ESCAPE);
        System.out.println("Datos enviados correctamente");
    }
}
