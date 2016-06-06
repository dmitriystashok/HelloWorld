import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

/**
 * Created by Dmytro_Stashok on 6/6/2016.
 */
public class BrowserStart {
    static WebDriver driver;

    public static WebDriver startBrowser(String url){
        driver = new FirefoxDriver();
        driver.get(url);

        return driver;
    }
}
