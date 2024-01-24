package app.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;

public class SliderPage  {
    // Selector específico del slider
    private By slider = By.cssSelector(".range-slider");
    private WebDriver driver;


    public SliderPage(WebDriver driver) {
        this.driver=driver;
    }

    // Método para arrastrar el control deslizante a una posición específica
    public void dragSliderToPosition(int position) {
        WebElement sliderElement = driver.findElement(slider);
        int sliderWidth = sliderElement.getSize().getWidth();

        // Calculando la posición en píxeles basada en la cantidad de pasos y el ancho del control deslizante
        int xOffset = (int) ((position / 10.0) * sliderWidth);
        System.out.println("La posicion del slide es de = " + xOffset);

        // Utilizar Actions para arrastrar el control deslizante
        Actions actions = new Actions(driver);
        actions.dragAndDropBy(sliderElement, xOffset, 0).perform();
    }

    // Método para verificar el valor mostrado en el control deslizante
    public void verifySliderValue(String expectedValue) {
        WebElement sliderElement = driver.findElement(slider);
        String actualValue = sliderElement.getText().trim();
        System.out.println("el valor del slider es =" + actualValue);

    }
}
