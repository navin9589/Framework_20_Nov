package testcases;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;
import pages.HomePage;
import pages.LoginPage;
import pages.MyAccountPage;
import pages.ShopPage;
import testbases.WebTestBase;
import util.WebElementUtil;

public class ShopTest extends WebTestBase {

    HomePage homePage;

    ShopPage shopPage;

    LoginPage loginPage;

    MyAccountPage myAccountPage;


    ShopTest() {
        super();
    }

    ;

    @BeforeMethod

    public void preRequisite() {

        initialization();
        homePage = new HomePage();
        loginPage = new LoginPage();
        myAccountPage = new MyAccountPage();
        shopPage = new ShopPage();
    }

    @Test(description = "Verify shop functionality of my account.")
    public void verifyShopFunction() {
        SoftAssert softAssert = new SoftAssert();
        homePage.closeFirstAd();
        homePage.clickOnLoginAndRegister();
        loginPage.setLogin(prop.getProperty("validUserName"), prop.getProperty("validPassword"));
        shopPage.shopBtnElement();
        homePage.closeFirstAd();
        shopPage.sampleProductSelect();
        shopPage.selectWeight();
        shopPage.shopElements();
        softAssert.assertEquals(shopPage.getYourOrderText(), "YOUR ORDER", "YOUR ORDER TEXT should be matched");
        softAssert.assertAll();
    }

    @AfterMethod
    public void tearDown() {
        driver.close();
    }
}
