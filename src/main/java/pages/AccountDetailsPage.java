package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import testbases.WebTestBase;
import util.WebDriverUtil;

public class AccountDetailsPage extends WebTestBase {

    @FindBy(xpath = "//a[text()='Account details']")
    WebElement accountButton;

    public AccountDetailsPage() {

        PageFactory.initElements(driver, this);
    }

    public void accountDetailsElement(){
        WebDriverUtil.waitElementUntilClickable(accountButton);
    }



}
