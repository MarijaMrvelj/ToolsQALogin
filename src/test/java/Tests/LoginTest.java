package Tests;

import Base.BaseTest;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class LoginTest extends BaseTest {

    @BeforeMethod
    public void pageSetUp() {
        driver.navigate().to("https://demoqa.com/");
    }

    @Test
    public void verifyThatUserCanLogIn() {
        homePage.clickOnCard("Book Store Application");
        bookStorePage.clickOnLoginButton();
        loginPage.logIn("marijamrv", "Impressija23*");
    }
}
