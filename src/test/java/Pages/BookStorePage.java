package Pages;

import Base.BaseTest;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class BookStorePage extends BaseTest {

    public BookStorePage() {
        PageFactory.initElements(driver, this);
    }

    @FindBy(id = "submit")
    public WebElement logOutButton;

    @FindBy(id = "userName-label")
    public WebElement usernameLabel;

    @FindBy(id = "userName-value")
    public WebElement username;

    //-----------

    public void clickOnLogOutButton() {
        logOutButton.click();
    }

    public String usernameValue() {
        return username.getText();
    }
}
