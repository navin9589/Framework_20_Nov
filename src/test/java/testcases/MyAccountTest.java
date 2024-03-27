package testcases;

import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;
import pages.HomePage;
import pages.LoginPage;
import pages.MyAccountPage;
import pages.RegisterPage;
import testbases.WebTestBase;

public class MyAccountTest extends WebTestBase {


    HomePage homePage;
    LoginPage loginPage;
    MyAccountPage myAccountPage;


    MyAccountTest() {super();};

    @BeforeMethod

            public void preRequisite() {

        initialization();
        homePage = new HomePage();
        loginPage = new LoginPage();
        myAccountPage = new MyAccountPage();
    }


    @Test(description = "Verify logout functionality of my account.")
    public void verifyLogoutFunction(){
        SoftAssert softAssert = new SoftAssert();
        homePage.closeFirstAd();
        homePage.clickOnLoginAndRegister();
        loginPage.setLogin(prop.getProperty("validUserName"), prop.getProperty("validPassword"));
        myAccountPage.logoutBtnElement();
    }

    @Test(description = "Verify recent order functionality of my account.")
    public void recentOrderFunction(){
        SoftAssert softAssert = new SoftAssert();
        homePage.closeFirstAd();
        homePage.clickOnLoginAndRegister();
        loginPage.setLogin(prop.getProperty("validUserName"), prop.getProperty("validPassword"));
        myAccountPage.recentOrdersElement();
    }

}
