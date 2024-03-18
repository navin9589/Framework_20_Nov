package testcases;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;
import pages.HomePage;
import pages.NewsPage;
import testbases.WebTestBase;

public class HomeTest extends WebTestBase {

    HomePage homePage;

    NewsPage newsPage;


    HomeTest() {
        super();
    }


    @BeforeMethod

    public void preRequisite() {

        initialization();
        homePage = new HomePage();

    }

    @Test(description = "Verify news page filter button.")
    public void verifyNewsPageFilterBtn() {
        SoftAssert softAssert = new SoftAssert();
        homePage.closeFirstAd();
        newsPage.newsElement();
        softAssert.assertEquals(newsPage.getNewsElementText(), "HOME COMPOSTABLE TAKEAWAY CUPS", " TEXT should be matched");
        softAssert.assertAll();
    }


    @Test(description = "Verify discover page clickable.")
    public void verifyDiscoverPageClickable(){
        SoftAssert softAssert = new SoftAssert();
        homePage.closeFirstAd();
        homePage.discoverElement();
        softAssert.assertEquals(homePage.getDiscoverElementText(), "\"Cup Of Excellence® Month At Campos\"", " TEXT should be matched");
        softAssert.assertAll();
    }
    @AfterMethod
    public void tearDown(){
        driver.close();
    }
}

