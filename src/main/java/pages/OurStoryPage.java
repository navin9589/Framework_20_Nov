package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import testbases.WebTestBase;
import util.ActionUtil;

public class OurStoryPage extends WebTestBase {

    @FindBy(xpath = "//a[text()=\"Our Story\"]")
    WebElement ourStoryLink;

    @FindBy(xpath = "//a[text()='History']")
    WebElement ourHistoryElement;

    public OurStoryPage() {
        PageFactory.initElements(driver, this);
    }

    public void ourStoryClickable() {
        ActionUtil.moveToElementCommand(ourHistoryElement);
    }
}
