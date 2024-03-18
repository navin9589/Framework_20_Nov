package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import testbases.WebTestBase;
import util.WebDriverUtil;
import util.WebElementUtil;

public class LoginPage extends WebTestBase {

    @FindBy(id = "username")
    WebElement userNameTextBox;

    @FindBy(id = "password")
    WebElement passwordTextBox;

    @FindBy(name = "login")
    WebElement loginBtn;

    @FindBy(xpath = "//strong[text()='ERROR']")
    WebElement errorMessage;

    public LoginPage() {
        PageFactory.initElements(driver, this);
    }

    public void setLogin(String userName, String password) {
        WebElementUtil.sendKeysOnElement(userNameTextBox, userName);
        WebElementUtil.sendKeysOnElement(passwordTextBox, password);
        WebDriverUtil.waitElementUntilClickable(loginBtn);
    }

    public String getTextOfErrorMessage(){
        return WebElementUtil.getTextOfElement(errorMessage);
    }
}
