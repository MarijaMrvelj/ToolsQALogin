package Base;

import Pages.BookStorePage;
import Pages.HomePage;
import Pages.LoginPage;
import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;

import java.time.Duration;

public class BaseTest {

    public static WebDriver driver;
    public WebDriverWait wait;
    public HomePage homePage;
    public BookStorePage bookStorePage;
    public LoginPage loginPage;

    @BeforeClass
    public void setUp() {
        WebDriverManager.chromedriver().setup();
        driver = new ChromeDriver();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
        driver.manage().window().maximize();
        wait = new WebDriverWait(driver, Duration.ofSeconds(15));
        homePage = new HomePage();
        bookStorePage = new BookStorePage();
        loginPage = new LoginPage();
    }

    @AfterClass
    public void tearDown() {
        //driver.quit();
    }
}
