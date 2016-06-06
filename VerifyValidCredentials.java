import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;
import org.testng.annotations.Test;

import java.util.concurrent.TimeUnit;

/**
 * Created by Dmytro_Stashok on 6/6/2016.
 */
public class VerifyValidCredentials {
    @Test
    public void vallidData() {

        String error = "Не вірний логін або пароль. Спробуйте знову.";
        WebDriver driver = BrowserStart.startBrowser("https://www.ukr.net/");
        driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
        LoginPage logPage = PageFactory.initElements(driver, LoginPage.class);


        logPage.loginProceeded("Dima", "admin");
       Assert.assertTrue(logPage.error_message.getText().contains("Не вірний логін або пароль."));
        driver.close();
    }


}
