package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import testbases.WebTestBase;
import util.WebDriverUtil;
import util.WebElementUtil;

import static testbases.WebTestBase.driver;

public class WholesalePage extends WebTestBase {
    @FindBy(xpath = "(//a[text()='Wholesale'])[1]")
    WebElement ourStoryPage;
    @FindBy(xpath = "//h6[text()='WHY CAMPOS?']")
    WebElement wholesalePageVerify;

    public WholesalePage(){
        PageFactory.initElements(driver, this);
    }
    public void wholesaleElements() {
        WebDriverUtil.waitElementUntilClickable(ourStoryPage);
    }

    public String getWholesaleText(){
      return  WebElementUtil.getTextOfElement(wholesalePageVerify);
    }
}
