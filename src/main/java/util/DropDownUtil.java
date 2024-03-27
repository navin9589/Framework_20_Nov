package util;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

public class DropDownUtil {

    public static void selectDropDownByVisibleText(WebElement webElement, String ValueToBeSelected){
        Select dropDown=new Select(webElement);
        dropDown.selectByVisibleText(ValueToBeSelected);


    }
    public static void selectDropDownByIndex(WebElement webElement,int ValueToBeSelected){
        Select dropDown=new Select(webElement);
        dropDown.selectByIndex(ValueToBeSelected);
    }
}
