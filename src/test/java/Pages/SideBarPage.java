package Pages;

import Base.BaseTest;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import java.util.List;

public class SideBarPage extends BaseTest {
    public SideBarPage() {
        PageFactory.initElements(driver, this);
    }

    @FindBy(className = "group-header")
    public List<WebElement> cards;

}
