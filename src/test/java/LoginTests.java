import Base.BasePage;
import Pages.LoginPage;
import Pages.MainPage;
import Pages.RegisterPage;
import org.junit.Test;

public class LoginTests extends BasePage{

    LoginPage loginPage = new LoginPage();

    @Test
    public void TC0002() throws Exception{
        String user = randomUser();

        loginPage
                .userName(user)
                .password("QWERT123")
                .login()
                .loginControl("Welcome User QA");
    }

    @Test
    public void TC0003() throws Exception{
        String user = randomUser();

        loginPage
                .userName(user)
                .password("123456789")
                .login()
                .loginErrorControl("An internal error has occurred and has been logged.");
    }
}
