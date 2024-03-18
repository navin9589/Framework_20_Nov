package testcases;

import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;
import pages.HomePage;
import pages.LoginPage;
import pages.MyAccountPage;
import testbases.WebTestBase;

public class AccountDetailsTest extends WebTestBase {


    HomePage homePage;

    LoginPage loginPage;

    MyAccountPage myAccountPage;

    AccountDetailsTest accountDetailsTest;




    AccountDetailsTest() {
        super();
    }

    @BeforeMethod


    public void preRequisite() {
        initialization();
        homePage = new HomePage();
        loginPage = new LoginPage();
        myAccountPage = new MyAccountPage();
        accountDetailsTest = new AccountDetailsTest();
    }

    @Test(description = "Verify lost your password link is clickable")
    public void verifyLostPasswordLinkIsClickable() {
        SoftAssert softAssert = new SoftAssert();
        homePage.closeFirstAd();
        homePage.clickOnLoginAndRegister();
        myAccountPage.getMyAccountElement();
    }



}
