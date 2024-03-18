package testcases;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;
import pages.*;
import testbases.WebTestBase;

public class CafeFinderTest extends WebTestBase {


    CafeFinderPage cafeFinderPage;

    CafeFinderTest() {
        super();
    }

    ;

    @BeforeMethod

    public void preRequisite() {

        initialization();
        cafeFinderPage = new CafeFinderPage();
    }

    @Test(description = "Verify cafe finder function.")
    public void verifyCafeFinderFunction() {
        SoftAssert softAssert = new SoftAssert();
        cafeFinderPage.cafeFinderElements();
        softAssert.assertEquals(cafeFinderPage.getCafeFinderLocationText(), "YOUR LOCATION", "YOUR LOCATION TEXT should be matched");
        softAssert.assertAll();
    }

    @AfterMethod
    public void tearDown() {
        driver.close();
    }
}

