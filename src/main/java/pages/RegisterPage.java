package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import testbases.WebTestBase;
import util.WebDriverUtil;
import util.WebElementUtil;

public class RegisterPage extends WebTestBase {

    @FindBy(xpath = "//a[text()='Click here']")

    WebElement registerPageLink;


    @FindBy(id = "reg_email")
    WebElement registerUserNameTextBox;

    @FindBy(xpath = "//input[@id='reg_password']")
    WebElement registerPasswordTextBox;

    @FindBy(xpath = " //input[@value='Register']")
    WebElement registerBtn;

    @FindBy(xpath = "//strong[text()='Error:']")
    WebElement alreadyRegisteredEmailError;

    @FindBy(xpath = "//strong[text()='Error:']")
    WebElement errorText;

    public RegisterPage() {
        {
            PageFactory.initElements(driver, this);
        }

    }

    public void registerPageLinkElement() {
        WebDriverUtil.waitElementUntilClickable(registerPageLink);
    }

    public void registerTextBox(String newUserName, String password) {
        WebElementUtil.sendKeysOnElement(registerUserNameTextBox, newUserName);
        WebElementUtil.sendKeysOnElement(registerPasswordTextBox, password);
        WebDriverUtil.waitElementUntilClickable(registerBtn);
    }


    public String getAlreadyRegisteredUserText() {
        return WebElementUtil.getTextOfElement(alreadyRegisteredEmailError);

    }
    public String errorTextElement() {
        return WebElementUtil.getTextOfElement(errorText);
    }
}