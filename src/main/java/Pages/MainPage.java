package Pages;

import Base.BasePage;
import com.codeborne.selenide.*;
import org.openqa.selenium.By;
import static com.codeborne.selenide.Selenide.$$;

public class MainPage extends BasePage {

    ElementsCollection loginActionsFields = $$(By.cssSelector("[id='loginPanel'] a"));

    public MainPage register() {
        loginActionsFields.findBy(Condition.text("Register")).click();
        return this;
    }

    public MainPage forgotInfo() {
        loginActionsFields.findBy(Condition.text("Forgot login info?")).click();
        return this;
    }
}
