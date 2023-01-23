package Base;

import com.codeborne.selenide.*;
import org.testng.annotations.BeforeTest;

import static com.codeborne.selenide.WebDriverRunner.getWebDriver;

public class BasePage extends BaseLib{

    public static String URL = "https://parabank.parasoft.com/";

    @BeforeTest
    public static void openBrowser() {
        Configuration.browser = "chrome";
        Selenide.open(URL);
        getWebDriver().manage().window().maximize();
    }
}
