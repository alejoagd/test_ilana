package app.tests;
import app.pages.FormsPage;
import app.pages.HomePage;
import app.pages.PracticeFormPage;
import org.testng.annotations.Test;

public class RegistrationTest extends BaseTest{

        @Test
        public void registrationFormTest() {
            HomePage homePage = new HomePage(driver);
            FormsPage formsPage = homePage.navigateToForms();
            PracticeFormPage practiceFormPage = formsPage.navigateToPracticeForm();

            // Datos para el formulario
            practiceFormPage.fillRegistrationForm("Alejandro", "Gaviria Diaz", "alejoagd@gmail.com",
                    "Male", "3105293225", "16/06/1992");

            // Enviando el form y mensaje de exito
            practiceFormPage.submitForm();
            practiceFormPage.verifySuccessMessage();
        }
}


