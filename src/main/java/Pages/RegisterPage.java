package Pages;

import Base.BasePage;
import com.codeborne.selenide.*;
import org.openqa.selenium.By;
import static com.codeborne.selenide.Selenide.$;

public class RegisterPage extends BasePage {
    SelenideElement firstNameField = $(By.id("customer.firstName"));
    SelenideElement lastNameField = $(By.id("customer.lastName"));
    SelenideElement addressField = $(By.id("customer.address.street"));
    SelenideElement cityField = $(By.id("customer.address.city"));
    SelenideElement stateField = $(By.id("customer.address.state"));
    SelenideElement zipCodeField = $(By.id("customer.address.zipCode"));
    SelenideElement phoneNumberField = $(By.id("customer.phoneNumber"));
    SelenideElement ssnField = $(By.id("customer.ssn"));
    SelenideElement userNameField = $(By.id("customer.username"));
    SelenideElement passwordField = $(By.id("customer.password"));
    SelenideElement passwordConfirmField = $(By.id("repeatedPassword"));
    SelenideElement registerField = $(By.cssSelector("[value='Register']"));
    SelenideElement registerControlField = $(By.cssSelector("[id='rightPanel'] h1"));

    public RegisterPage firstName(String firstName) {
        firstNameField.setValue(firstName);
        return this;
    }

    public RegisterPage lastName(String lastName) {
        lastNameField.setValue(lastName);
        return this;
    }

    public RegisterPage address(String address) {
        addressField.setValue(address);
        return this;
    }

    public RegisterPage city(String city) {
        cityField.setValue(city);
        return this;
    }

    public RegisterPage state(String state) {
        stateField.setValue(state);
        return this;
    }

    public RegisterPage zipCode(String zipCode) {
        zipCodeField.setValue(zipCode);
        return this;
    }

    public RegisterPage phoneNumber(String phoneNumber) {
        phoneNumberField.setValue(phoneNumber);
        return this;
    }

    public RegisterPage ssn(String ssn) {
        ssnField.setValue(ssn);
        return this;
    }

    public RegisterPage userName(String userName) {
        userNameField.setValue(userName);
        return this;
    }

    public RegisterPage password(String password) {
        passwordField.setValue(password);
        return this;
    }

    public RegisterPage passwordConfirm(String passwordConfirm) {
        passwordConfirmField.setValue(passwordConfirm);
        return this;
    }

    public RegisterPage register() {
        registerField.click();
        return this;
    }

    public RegisterPage registerControl(String username) {
        registerControlField.shouldHave(Condition.text("Welcome " + username));
        writeNewUser(username);
        return this;
    }

}
