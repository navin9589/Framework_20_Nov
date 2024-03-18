package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import testbases.WebTestBase;
import util.WebDriverUtil;
import util.WebElementUtil;

public class HomePage extends WebTestBase {

    @FindBy(xpath = "//a[@class='newsletter__close newsletter__trigger']")
    WebElement closeAd;


    @FindBy(xpath = "//a[@class='user-controls__ul__li__a']")
    WebElement loginAndRegister;

    @FindBy(xpath = "(//a[text()='DISCOVER MORE'])[2]")
    WebElement discoverBtn;

    @FindBy(xpath = "//div[@class='article_nav_bar-page_title']")
    WebElement discoverText;


    public HomePage() {
        PageFactory.initElements(driver, this);
    }

    public void closeFirstAd() {
        WebDriverUtil.waitElementUntilClickable(closeAd);
    }

    public void clickOnLoginAndRegister() {
        WebDriverUtil.waitElementUntilClickable(loginAndRegister);}

    public void discoverElement(){
        WebDriverUtil.waitElementUntilClickable(discoverBtn);
    }

    public String getDiscoverElementText(){
      return  WebElementUtil.getTextOfElement(discoverText);
    }
}
