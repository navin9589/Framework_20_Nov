package util;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import testbases.WebTestBase;

import java.time.Duration;
import java.util.List;

public class ActionUtil extends WebTestBase {


    public static void moveToElementCommand(WebElement element) {
        Actions moveEle = new Actions(driver);
        moveEle.moveToElement(element)
                .pause(Duration.ofSeconds(7))
                .perform();

    }
}
