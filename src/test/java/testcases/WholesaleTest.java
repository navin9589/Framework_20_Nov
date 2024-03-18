package testcases;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;
import pages.HomePage;
import pages.OurStoryPage;
import pages.WholesalePage;
import testbases.WebTestBase;

public class WholesaleTest extends WebTestBase {

    HomePage homePage;

    WholesalePage wholesalePage;
    WholesaleTest() {
        super();
    }

    @BeforeMethod

    public void preRequisite() {

        initialization();
        homePage = new HomePage();
         wholesalePage = new WholesalePage();
    }

    @Test(description = "Verify the wholesale option.")
    public void verifyWholesalePage() {
        SoftAssert softAssert = new SoftAssert();
        homePage.closeFirstAd();
        wholesalePage.wholesaleElements();
        softAssert.assertEquals(wholesalePage.getWholesaleText(), "WHY CAMPOS?", "TEXT should be matched");
        softAssert.assertAll();
    }
    @AfterMethod
    public void tearDown() {
        driver.close();
    }
}