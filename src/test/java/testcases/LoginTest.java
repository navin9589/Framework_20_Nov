package testcases;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;
import pages.HomePage;
import pages.LoginPage;
import pages.MyAccountPage;
import testbases.WebTestBase;

public class LoginTest extends WebTestBase {


    HomePage homePage;

    LoginPage loginPage;

    MyAccountPage myAccountPage;


    LoginTest() {
        super();
    }


    @BeforeMethod

    public void preRequisite() {

        initialization();
        homePage = new HomePage();
        loginPage = new LoginPage();
        myAccountPage = new MyAccountPage();
    }

    @Test(description = "Verify login with valid username and valid password.")
    public void verifyLoginWithValidUserNameAndPassword() {
        SoftAssert softAssert = new SoftAssert();
        homePage.closeFirstAd();
        homePage.clickOnLoginAndRegister();
        loginPage.setLogin(prop.getProperty("validUserName"), prop.getProperty("validPassword"));
        softAssert.assertEquals(myAccountPage.getMyAccountElement(), "MY ACCOUNT", "MY ACCOUNT TEXT should be matched");
        softAssert.assertAll();
    }

    @Test(description = "Verify login with invalid username and valid password.")
    public void verifyLoginWithInvalidUserNameAndValidPassword() {
        SoftAssert softAssert = new SoftAssert();
        homePage.closeFirstAd();
        homePage.clickOnLoginAndRegister();
        loginPage.setLogin(prop.getProperty("invalidUserName"), prop.getProperty("validPassword"));
        softAssert.assertEquals(loginPage.getTextOfErrorMessage(), "ERROR", "ERROR TEXT should be matched");
        softAssert.assertAll();
    }


    @Test(description = "Verify login with invalid username and invalid password.")
    public void verifyLoginWithInvalidUserNameAndInvalidPassword() {
        SoftAssert softAssert = new SoftAssert();
        homePage.closeFirstAd();
        homePage.clickOnLoginAndRegister();
        loginPage.setLogin(prop.getProperty("invalidUserName"), prop.getProperty("invalidPassword"));
        softAssert.assertEquals(loginPage.getTextOfErrorMessage(), "ERROR", "ERROR TEXT should be matched");
        softAssert.assertAll();
    }

    @Test(description = "Verify login with valid username and invalid password.")
    public void verifyLoginWithValidUserNameAndInvalidPassword() {
        SoftAssert softAssert = new SoftAssert();
        homePage.closeFirstAd();
        homePage.clickOnLoginAndRegister();
        loginPage.setLogin(prop.getProperty("validUserName"), prop.getProperty("invalidPassword"));
        softAssert.assertEquals(loginPage.getTextOfErrorMessage(), "ERROR", "ERROR TEXT should be matched");
        softAssert.assertAll();
    }

    @AfterMethod
    public void tearDown() {
        driver.close();
    }
}