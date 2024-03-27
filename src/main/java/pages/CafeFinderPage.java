package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import testbases.WebTestBase;
import util.WebElementUtil;

public class CafeFinderPage extends WebTestBase {


    @FindBy(xpath = "//li[@id='menu-item-150']")
    WebElement cafeFinderElement;

    @FindBy(id = "locationSearchButton")
    WebElement cafeLocationBtn;

    @FindBy(xpath = "//h2[@class='map-inner-header-result ng-scope']")
    WebElement locationPageText;

    public CafeFinderPage() {
        PageFactory.initElements(driver, this);
    }

    public void cafeFinderElements(){
        WebElementUtil.waitElementUntilClickable(cafeFinderElement);
        WebElementUtil.waitElementUntilClickable(cafeLocationBtn);
    }
    public String getCafeFinderLocationText(){
       return WebElementUtil.getTextOfElement(locationPageText);
    }

}