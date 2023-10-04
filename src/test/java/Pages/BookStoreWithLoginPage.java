package Pages;

import Base.BaseTest;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class BookStoreWithLoginPage extends BaseTest {
    public BookStoreWithLoginPage() {
        PageFactory.initElements(driver, this);
    }

    @FindBy(id = "login")
    public WebElement loginButton;

    //--------------------

    public void clickOnLoginButton() {
        loginButton.click();
    }
}
