package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import testbases.WebTestBase;
import util.DropDownUtil;
import util.WebElementUtil;

public class NewsPage extends WebTestBase {

    @FindBy(xpath = "//a[text()='News']")
    WebElement newsBtn;

    @FindBy(xpath = "//div[@class='filter_item']")
    WebElement filterElement;

    @FindBy(xpath = "//button[text()='Find']")
    WebElement findBtn;


    @FindBy(xpath =  " //span[text()='Home Compostable Takeaway Cups']")
    WebElement titleText;
    public NewsPage() {

        PageFactory.initElements(driver, this);
        }

        public  void newsElement(){
            WebElementUtil.waitElementUntilClickable(newsBtn);
            WebElementUtil.waitElementUntilClickable(filterElement);
          //DropDownUtil.selectDropDownByVisibleText(filterElement,"");
            WebElementUtil.waitElementUntilClickable(findBtn);

    }

    public String getNewsElementText(){
      return  WebElementUtil.getTextOfElement(titleText);
    }

        }

