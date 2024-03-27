package testcases;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;
import pages.*;
import testbases.WebTestBase;

public class OurStoryTest extends WebTestBase {



    HomePage homePage;

  OurStoryPage ourStoryPage;


    OurStoryTest() {
        super();
    }


    @BeforeMethod

    public void preRequisite() {

        initialization();
       ourStoryPage = new OurStoryPage();
    }

    @Test(description = "Verify the our story option.")
    public void verifyLoginWithValidUserNameAndPassword() {
        SoftAssert softAssert = new SoftAssert();
        homePage.closeFirstAd();
        ourStoryPage.ourStoryClickable();
       //softAssert.assertEquals(myAccountPage.getMyAccountElement(), "MY ACCOUNT", "MY ACCOUNT TEXT should be matched");
        softAssert.assertAll();
    }
    @AfterMethod
    public void tearDown() {
        driver.close();
    }
}