import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Login {

    public WebDriver driver;

    public Login(WebDriver driver) {
        PageFactory.initElements(driver, this);
        this.driver = driver;
    }

    /**
     * определение локатора поля ввода логина
     */
    //private String loginPage =(ConfProperties.getProperty("loginpage"));
   // @FindBy(xpath = "//*[@id=\"UserName\"]")
   // private WebElement loginField;
    /**
     * определение локатора кнопки входа в аккаунт
     */
   // @FindBy(xpath = "//*[@id=\"LoginBtn\"]")
  //  private WebElement loginBtn;
    /**
     * определение локатора поля ввода пароля
     */
   // @FindBy(xpath = "//*[@id=\"Password\"]")
   // private WebElement passwordField;


  // public void login(String login, String password) {
       // loginField.sendKeys(ConfProperties.getProperty("login"));
     //  passwordField.sendKeys(ConfProperties.getProperty("password"));
      //loginBtn.click();
   // }


    public String getLoginPage() {
        return ConfProperties.getProperty("loginpage");
    }

    }
//}

