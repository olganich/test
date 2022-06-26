import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.time.Duration;


public class LoginPageTest {


    public static void main(String[] args) throws InterruptedException {

        System.setProperty("webdriver.chrome.driver", "C:\\1\\1\\chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
        Login lg = new Login(driver);
        driver.get(lg.getLoginPage());
        LoginPage lp = new LoginPage(driver);
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
        lp.clickElementsBtn();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
        lp.clickCheckbox();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
        lp.clickHomebox();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
        lp.clickRadioBtn();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
        lp.clickEmpresBtn();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
        lp.clickYesBtn();
    }
}





