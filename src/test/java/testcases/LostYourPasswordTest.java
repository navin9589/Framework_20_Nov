package testcases;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;
import pages.HomePage;
import pages.LoginPage;
import pages.LostYourPasswordPage;
import pages.MyAccountPage;
import testbases.WebTestBase;

public class LostYourPasswordTest extends WebTestBase {

    HomePage homePage;

    LoginPage loginPage;

    MyAccountPage myAccountPage;

    LostYourPasswordPage lostYourPasswordPage;


    LostYourPasswordTest() {
        super();
    }

    @BeforeMethod

    public void preRequisite() {

        initialization();
        homePage = new HomePage();
        loginPage = new LoginPage();
        myAccountPage = new MyAccountPage();
        lostYourPasswordPage = new LostYourPasswordPage();
    }

    @Test(description = "Verify lost your password link is clickable")
    public void verifyLostPasswordLinkIsClickable() {
        SoftAssert softAssert = new SoftAssert();
        homePage.closeFirstAd();
        homePage.clickOnLoginAndRegister();
        softAssert.assertEquals(lostYourPasswordPage.lostYourPasswordPage(),"LOST YOUR","LOST YOUR TEXT should be matched");
        softAssert.assertAll();
    }



    @Test(description = "Verify password reset with valid email")
    public void verifyPasswordResetWithValidEmail() {
        SoftAssert softAssert = new SoftAssert();
        homePage.closeFirstAd();
        homePage.clickOnLoginAndRegister();
        lostYourPasswordPage.lostYourPasswordLinkElement();
        lostYourPasswordPage.passwordResetEmail(prop.getProperty("validUserName"));
        lostYourPasswordPage.resetBtnElement();
        lostYourPasswordPage.restLinkSend();
        softAssert.assertEquals(lostYourPasswordPage.restLinkSend(),"Password reset email has been sent." , "Password reset email has been sent. TEXT should match");
        softAssert.assertAll();
    }


    @AfterMethod
    public void tearDown() {
        driver.close();
    }


}
