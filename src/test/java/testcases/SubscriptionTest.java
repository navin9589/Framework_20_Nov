package testcases;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;
import pages.HomePage;
import pages.LoginPage;
import pages.MyAccountPage;
import pages.SubscriptionPage;
import testbases.WebTestBase;

public class SubscriptionTest extends WebTestBase {
    HomePage homePage;

    LoginPage loginPage;
    SubscriptionPage subscriptionPage;

    SubscriptionTest() {
        super();
    }


    @BeforeMethod

    public void preRequisite() {

        initialization();
        homePage = new HomePage();
        loginPage = new LoginPage();
        subscriptionPage = new SubscriptionPage();
    }

    @Test(description = "Verify subscription page.")
    public void verifySubscriptionPage() {
        SoftAssert softAssert = new SoftAssert();
        homePage.closeFirstAd();
        homePage.clickOnLoginAndRegister();
        loginPage.setLogin(prop.getProperty("validUserName"), prop.getProperty("validPassword"));
        subscriptionPage.subscriptionPageElements();
        homePage.closeFirstAd();
        softAssert.assertEquals(subscriptionPage.sortFilterElement(), "SHOWING 2 OF 2 RESULTS", "TEXT should be matched");
        softAssert.assertAll();
    }

    @AfterMethod
    public void tearDown() {
        driver.close();
    }

}
