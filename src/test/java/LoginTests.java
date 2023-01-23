import Base.BasePage;
import Pages.LoginPage;
import org.testng.annotations.Test;

public class LoginTests extends BasePage{

    LoginPage loginPage = new LoginPage();

    @Test(description = "Login Test - TC0002")
    public void TC0002() throws Exception{
        String user = randomUser();

        loginPage
                .userName(user)
                .password("QWERT123")
                .login()
                .loginControl("Welcome User QA");
    }

    @Test(description = "Login Test - TC0003")
    public void TC0003() throws Exception{
        String user = randomUser();

        loginPage
                .userName(user)
                .password("123456789")
                .login()
                .loginErrorControl("An internal error has occurred and has been logged.");
    }
}
