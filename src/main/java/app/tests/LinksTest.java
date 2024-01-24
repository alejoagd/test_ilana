package app.tests;

import app.pages.ElementsPage;
import app.pages.HomePage;
import app.pages.LinksPage;
import org.testng.annotations.Test;

import java.util.List;

public class LinksTest extends BaseTest {

    @Test
    public void verifyLinksTest() {
        HomePage homePage = new HomePage(driver);
        ElementsPage elementsPage = homePage.navigateToElements();
        LinksPage linksPage = elementsPage.navigateToLinks();

        // Verificar cada link
        linksPage.verifyAllLinks();

        // Click en el orden alfabetico
        linksPage.clickFirstLinkInAlphabeticalOrder();
    }
}

