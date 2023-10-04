package Tests;

import Base.BaseTest;
import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class LoginTest extends BaseTest {

    String validUsername = "marijamrv";
    String validPassword = "Impressija23*";

    @BeforeMethod
    public void pageSetUp() {
        driver.navigate().to("https://demoqa.com/");
    }

    @Test
    public void verifyThatUserCanLogIn() {
        homePage.clickOnCard("Book Store Application");
        bookStoreWithLoginPage.clickOnLoginButton();
        loginPage.logIn(validUsername, validPassword);

        Assert.assertTrue(bookStorePage.logOutButton.isDisplayed());
        Assert.assertTrue(bookStorePage.usernameLabel.isDisplayed());
        Assert.assertEquals(bookStorePage.usernameValue(), validUsername);
    }

    @Test
    public void verifyThatUserCanLogOut() {
        homePage.clickOnCard("Book Store Application");
        bookStoreWithLoginPage.clickOnLoginButton();
        loginPage.logIn(validUsername, validPassword);
        bookStorePage.clickOnLogOutButton();

        Assert.assertEquals(driver.getCurrentUrl(), loginPage.loginPageUrl());
        Assert.assertTrue(loginPage.loginButton.isDisplayed());
        Assert.assertEquals(loginPage.usernameField.getText(), "");
        Assert.assertEquals(loginPage.passwordField.getText(), "");
    }

}
