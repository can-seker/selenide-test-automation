package Pages;

import Base.BasePage;
import com.codeborne.selenide.*;
import org.openqa.selenium.By;
import static com.codeborne.selenide.Selenide.$;

public class LoginPage extends BasePage {

    SelenideElement userNameField = $(By.name("username"));
    SelenideElement passwordField = $(By.name("password"));
    SelenideElement loginButton = $(By.cssSelector("[class='login'] input[type='submit']"));
    SelenideElement loginControlField = $(By.cssSelector("[id='leftPanel'] p"));
    SelenideElement loginErrorField = $(By.cssSelector("[id='rightPanel'] p[class='error']"));

    public LoginPage login(String email, String password) {
        userNameField.setValue(email);
        passwordField.setValue(password);
        loginButton.click();
        return this;
    }

    public LoginPage userName(String userName) {
        userNameField.setValue(userName);
        return this;
    }

    public LoginPage password(String password) {
        passwordField.setValue(password);
        return this;
    }

    public LoginPage login() {
        loginButton.click();
        return this;
    }

    public LoginPage loginControl(String user) {
        loginControlField.shouldHave(Condition.text(user));
        return this;
    }

    public LoginPage loginErrorControl(String user) {
        loginErrorField.shouldHave(Condition.text(user));
        return this;
    }
}
