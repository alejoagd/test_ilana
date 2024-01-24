package app.tests;

import app.pages.HomePage;
import app.pages.SliderPage;
import org.testng.annotations.Test;

public class SliderTest extends BaseTest {

    @Test
    public void sliderFunctionalityTest() {
        HomePage homePage = new HomePage(driver);
        SliderPage sliderPage = homePage.navigateToSlider();

        // Soltando el slider en posicion 3
        sliderPage.dragSliderToPosition(3);

        // Verificar el valor esperado
        sliderPage.verifySliderValue("3");
    }
}

