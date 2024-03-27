package testcases;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;
import pages.*;
import testbases.WebTestBase;

public class NewsTest extends WebTestBase {

    HomePage homePage;

    NewsPage newsPage;


    NewsTest() {
        super();
    }


    @BeforeMethod

    public void preRequisite() {

        initialization();
        homePage = new HomePage();
       newsPage = new NewsPage();
    }

    @Test(description = "Verify news page filter button.")
    public void verifyNewsPageFilterBtn() {
        SoftAssert softAssert = new SoftAssert();
        homePage.closeFirstAd();
        newsPage.newsElement();
      softAssert.assertEquals(newsPage.getNewsElementText(), "HOME COMPOSTABLE TAKEAWAY CUPS", " TEXT should be matched");
        softAssert.assertAll();
    }
    @AfterMethod
    public void tearDown(){
        driver.close();
    }
}