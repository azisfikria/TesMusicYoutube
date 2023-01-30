package com.tesmusicyoutube.step;

import org.musicyoutube.drivers.DriverSingleton;
import org.musicyoutube.pages.Explore;
import org.musicyoutube.pages.Login;
import org.musicyoutube.pages.Search;
import org.musicyoutube.utils.Constants;
import org.openqa.selenium.WebDriver;
import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class TestExploreSelenium {
    public static WebDriver driver;
    private Login login;
    private Search search;
    private Explore explore;

    @BeforeClass // ini ga perlu kalo lanjut dari tes login
    public void setUp() {
        DriverSingleton.getInstance(Constants.CHROME);
        driver = DriverSingleton.getDriver();
        driver.get(Constants.URL);
    }

    @BeforeMethod
    public void pageObject() {
        login = new Login();
        search = new Search();
        explore = new Explore();
    }

    @AfterClass
    public void closeBrowser() {
        delay(3);
//        driver.quit();
        DriverSingleton.closeObjectInstance();
    }

    @Test
    public void testExplore(){
        delay(Constants.DETIK);
        explore.clickExploreBtn();
        delay(1);
        explore.clickNewReleaseBtn();
        Assert.assertEquals(explore.getTxtNewRelease(), "New releases");
        delay(1);
        driver.navigate().back();
        explore.clickChartsBtn();
        delay(1);
        explore.clickTrendingBtn();
        Assert.assertEquals(explore.getTxtTrending(), "Top 100 Music Videos Indonesia");
        delay(1);
        driver.navigate().back();
        driver.navigate().back();
        explore.clickMoodGenresBtn();
        Assert.assertEquals(explore.getTxtMoodGenre(), "Moods & genres");
    }

    static void delay(int detik) {
        try {
            Thread.sleep(1000*detik);
        } catch (InterruptedException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }
    }
}
