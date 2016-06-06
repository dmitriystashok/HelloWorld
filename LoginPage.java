import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

/**
 * Created by Dmytro_Stashok on 6/6/2016.
 */
public class LoginPage {
    WebDriver driver;

    public LoginPage(WebDriver driver){
        this.driver = driver;
    }

    @FindBy(name = "Login")
    WebElement login;

    @FindBy(how=How.NAME, using="Password")
    WebElement password;

    @FindBy(how=How.XPATH, using = "//button[@type='submit']")
    WebElement submit_button;

    @FindBy(how=How.CLASS_NAME, using = "error-text")
    WebElement error_message;

    public void loginProceeded(String log, String pas){
        login.sendKeys(log);
        password.sendKeys(pas);
        submit_button.click();

    }

}
