import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
public class LoginPage {
    public WebDriver driver;

    public LoginPage(WebDriver driver) {
        PageFactory.initElements(driver, this);
        this.driver = driver;
    }

    @FindBy(xpath = "//*[@id=\"app\"]/div/div/div[2]/div/div[1]")
    private WebElement ElementsBtn;

    @FindBy(xpath = "//*[@id=\"item-1\"]/span")
    private WebElement Checkbox;


    @FindBy(xpath = "//*[@id=\"tree-node\"]/ol/li/span/label/span[3]")
    private WebElement Homebox;

    @FindBy(xpath = "//*[@id=\"item-2\"]")
    private WebElement RadioBtn;

    @FindBy(xpath = "//*[@id=\"app\"]/div/div/div[2]/div[2]/div[2]/div[3]/label")
    private WebElement EmpresBtn;

    @FindBy(xpath = "//*[@id=\"app\"]/div/div/div[2]/div[2]/div[2]/div[2]/label")
    private WebElement YesBtn;

    public void clickElementsBtn() {
        ElementsBtn.click();
    }

    public void clickCheckbox() {
        Checkbox.click();
    }

    public void clickHomebox() {
        Homebox.click();
    }

    public void clickRadioBtn() {
        RadioBtn.click();
    }

    public void clickEmpresBtn(){
        EmpresBtn.click();
    }
    public void clickYesBtn(){
        YesBtn.click();
    }

}