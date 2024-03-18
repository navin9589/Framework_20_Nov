package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import testbases.WebTestBase;
import util.DropDownUtil;
import util.WebElementUtil;

public class SubscriptionPage extends WebTestBase {

    @FindBy(xpath = "(//a[text()='Subscriptions'])[2]")
    WebElement subscriptionPageClick;

    @FindBy(id = "sort")
    WebElement sortDropDown;

    @FindBy(xpath = "//div[@class='filter-bar__inner__section__results']")
    WebElement sortFilter;

    public SubscriptionPage() {
        PageFactory.initElements(driver, this);
    }

    public void subscriptionPageElements() {
        WebElementUtil.waitElementUntilClickable(subscriptionPageClick);
        WebElementUtil.waitElementUntilClickable(sortDropDown);
        DropDownUtil.selectDropDownByIndex(sortDropDown, 2);

    }

    public String sortFilterElement() {
        return WebElementUtil.getTextOfElement(sortFilter);
    }

}
