package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import testbases.WebTestBase;
import util.WebElementUtil;

public class LostYourPasswordPage extends WebTestBase {


    @FindBy(xpath = "//p[@class='woocommerce-LostPassword lost_password']")
    WebElement lostYourPasswordLink;

    @FindBy(xpath = "//h2[text()='Lost your']")
    WebElement lostPasswordPageText;

    @FindBy(xpath = "//input[@id='user_login']")
    WebElement passwordResetUserNameTextBox;

    @FindBy(xpath = "//input[@value='Reset password']")

    WebElement resetBtn;

    @FindBy(xpath = "//div[@class='wc-block-components-notice-banner__content']")

    WebElement resetLinKSentPage;

    public LostYourPasswordPage() {

        PageFactory.initElements(driver, this);
    }


    public void lostYourPasswordLinkElement() {

       WebElementUtil.waitElementUntilClickable(lostYourPasswordLink);

    }
    public boolean lostPasswordLinkEnabled(){
      return WebElementUtil.isEnabledElement(lostYourPasswordLink);
    }

    public String lostYourPasswordPage() {
        return WebElementUtil.getTextOfElement(lostPasswordPageText);

    }

    public void passwordResetEmail(String username) {
        WebElementUtil.sendKeysOnElement(passwordResetUserNameTextBox, username);
    }

    public void resetBtnElement() {

        WebElementUtil.waitElementUntilClickable(resetBtn);

    }

    public String restLinkSend(){
     return   WebElementUtil.getTextOfElement(resetLinKSentPage);
    }
}
