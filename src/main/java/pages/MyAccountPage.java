package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import testbases.WebTestBase;
import util.WebElementUtil;

public class MyAccountPage extends WebTestBase {
    @FindBy(xpath = "//h2[text()='My Account']")
    WebElement myAccountElement;

    @FindBy(xpath = "//a[text()='Logout']")
    WebElement logoutBtn;

    @FindBy(xpath = "//a[text()='Confirm and log out']")
    WebElement confirmLogoutBtn;

    @FindBy(xpath = "//a[text()='recent orders']")
    WebElement recentOrderBtn;

    public MyAccountPage() {
        PageFactory.initElements(driver, this);
    }

    public String getMyAccountElement() {
        return WebElementUtil.getTextOfElement(myAccountElement);
    }
public void logoutBtnElement(){
        WebElementUtil.waitElementUntilClickable(logoutBtn);
        WebElementUtil.waitElementUntilClickable(confirmLogoutBtn);
    }
    public void recentOrdersElement(){
        WebElementUtil.waitElementUntilClickable(recentOrderBtn);
      //return WebElementUtil.isEnabledElement(recentOrderBtn);
    }
}
