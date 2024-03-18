package testcases;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;
import pages.HomePage;
import pages.LoginPage;
import pages.MyAccountPage;
import pages.RegisterPage;
import testbases.WebTestBase;

public class RegisterTest extends WebTestBase {

    HomePage homePage;

    LoginPage loginPage;

    MyAccountPage myAccountPage;

     RegisterPage registerPage;


    RegisterTest() {
        super();
    }


    @BeforeMethod

    public void preRequisite() {

        initialization();
        homePage = new HomePage();
        loginPage = new LoginPage();
        myAccountPage = new MyAccountPage();
        registerPage = new RegisterPage();
    }

    @Test(description = "Verify new user register with valid user name and valid password.")
    public void verifyNewUserRegister() {
        SoftAssert softAssert = new SoftAssert();
        homePage.closeFirstAd();
        homePage.clickOnLoginAndRegister();
        registerPage.registerPageLinkElement();
        registerPage.registerTextBox(prop.getProperty("newUser"), prop.getProperty("newPassword"));
        softAssert.assertEquals(registerPage.getAlreadyRegisteredUserText(),"Error:", "Error TEXT should be match");
        softAssert.assertAll();
    }



    @Test(description = "Verify new user register with already registered valid user name and password.")
    public void verifyNewUserRegisterWithAlreadyRegisteredUser() {
        SoftAssert softAssert = new SoftAssert();
        homePage.closeFirstAd();
        homePage.clickOnLoginAndRegister();
        registerPage.registerPageLinkElement();
        registerPage.registerTextBox(prop.getProperty("newUser"), prop.getProperty("newPassword"));
        softAssert.assertEquals(registerPage.getAlreadyRegisteredUserText(), "Error:", " TEXT should be matched");
        softAssert.assertAll();
    }

    @Test(description = "Verify new user register with invalid   user name and password.")
    public void verifyNewUserRegisterWithInvalidUser() {
        SoftAssert softAssert = new SoftAssert();
        homePage.closeFirstAd();
        homePage.clickOnLoginAndRegister();
        registerPage.registerPageLinkElement();
        registerPage.registerTextBox(prop.getProperty("invalidUser"), prop.getProperty("newPassword"));
        softAssert.assertEquals(registerPage.errorTextElement(), "Error:", " TEXT should be matched");
        softAssert.assertAll();
    }
    @AfterMethod
    public void tearDown(){
        driver.close();
    }
}
