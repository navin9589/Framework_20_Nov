package util;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

public class WebElementUtil extends WebDriverUtil{


    public static void clickOnElement(WebElement element){
        element.click();
    }

    public static void sendKeysOnElement(WebElement element, String text){
        element.sendKeys(text);
    }

    public static String getTextOfElement(WebElement webElement){
        return webElement.getText();
    }

    public static boolean isEnabledElement(WebElement webElement){
        return webElement.isEnabled();
    }

}


