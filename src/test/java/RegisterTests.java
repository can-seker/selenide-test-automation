import Base.BasePage;
import Pages.MainPage;
import Pages.RegisterPage;
import org.junit.Test;

public class RegisterTests extends BasePage{

    MainPage mainPage = new MainPage();
    RegisterPage registerPage = new RegisterPage();

    @Test
    public void TC0001() {
        String userName = "userQA" + randomNumber();

        mainPage
                .register();

        registerPage
                .firstName("User")
                .lastName("QA")
                .address("Test User Address")
                .city("Istanbul")
                .state("SISLI")
                .zipCode("34000")
                .phoneNumber("545555555")
                .ssn("123456789")
                .userName(userName)
                .password("QWERT123")
                .passwordConfirm("QWERT123")
                .register()
                .registerControl(userName);
    }
}
