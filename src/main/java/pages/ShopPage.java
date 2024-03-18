package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import testbases.WebTestBase;
import util.DropDownUtil;
import util.WebElementUtil;

public class ShopPage extends WebTestBase {

    @FindBy(xpath = "//a[text()='Shop']")
    WebElement shopBtn;

    @FindBy(xpath = "//img[@alt='Campos Superior Blend']")
    WebElement sampleProduct;

    @FindBy(xpath = "//select[@class='pa_weight']")
    WebElement selectBtn;

    @FindBy(xpath = "//label[@for='wholebeans-true']")
    WebElement selectGrind;

    @FindBy(xpath = "//div[text()='Once off']")
    WebElement selectFrequency;

    @FindBy(xpath = "//a[@class='button add-to-cart__button button--primary']")
    WebElement addToCart;

    @FindBy(xpath = "//a[text()=\"Checkout\"]")
    WebElement checkout;

    @FindBy(xpath = "(//h3[text()=\"Your order\"])[1]")
    WebElement yourOrderText;

    public ShopPage() {
        PageFactory.initElements(driver, this);
    }

    public void shopBtnElement() {
        WebElementUtil.waitElementUntilClickable(shopBtn);
    }

    public void sampleProductSelect() {
        WebElementUtil.waitElementUntilClickable(sampleProduct);
    }

    public void selectWeight() {
        WebElementUtil.waitElementUntilClickable(selectBtn);
        DropDownUtil.selectDropDownByVisibleText(selectBtn, "500g");
    }

    public void shopElements() {
        WebElementUtil.waitElementUntilClickable(selectGrind);
        WebElementUtil.waitElementUntilClickable(selectFrequency);
        WebElementUtil.waitElementUntilClickable(addToCart);
        WebElementUtil.waitElementUntilClickable(checkout);

    }

    public String getYourOrderText() {
       return WebElementUtil.getTextOfElement(yourOrderText);
    }

}
