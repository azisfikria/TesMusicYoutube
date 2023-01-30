package com.tesmusicyoutube.step;

import com.relevantcodes.extentreports.ExtentTest;
import com.relevantcodes.extentreports.LogStatus;
import com.tesmusicyoutube.pages.Explore;
import com.tesmusicyoutube.pages.Login;
import com.tesmusicyoutube.pages.Search;
import com.tesmusicyoutube.utils.Constants;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.openqa.selenium.WebDriver;
import org.testng.Assert;

public class TestExplore {
    WebDriver driver;
    private static ExtentTest extentTest;

    private Login login = new Login();
    private Search search = new Search();
    private Explore explore = new Explore();

    public TestExplore(){
        driver = Hooks.driver;
        extentTest = Hooks.extentTest;
    }

    @When("User on dashboard page")
    public void user_on_dashboard_page(){
        driver.get((Constants.URL));
        extentTest.log(LogStatus.PASS, "User on dashboard page");
    }
    @And("User click explore menu")
    public void user_click_explore_menu(){
        explore.clickExploreBtn();
        extentTest.log(LogStatus.PASS, "User click explore menu");
    }
    @And("User click new release button")
    public void user_click_newRelease_menu(){
        explore.clickNewReleaseBtn();
        extentTest.log(LogStatus.PASS, "User click new release menu");
    }
    @Then("User can see new release song")
    public void user_see_newRelease_song(){
        Assert.assertEquals(explore.getTxtMoodGenre(), "New releases");
        extentTest.log(LogStatus.PASS, "User can see new release song");
    }

    @When("User on dashboard page")
    public void user_on_dashboard_page_charts(){
        explore.clickExploreBtn();
        extentTest.log(LogStatus.PASS, "User on dashboard page");
    }
    @And("User click explore menu")
    public void user_click_menu_explore_charts(){
        explore.clickExploreBtn();
        extentTest.log(LogStatus.PASS, "User click explore menu");
    }
    @And("User click charts menu")
    public void user_click_charts(){
        explore.clickChartsBtn();
        explore.clickTrendingBtn();
        extentTest.log(LogStatus.PASS, "User click explore menu");
    }
    @Then("User see top 100 music video")
    public void user_see_top_music(){
        Assert.assertEquals(explore.getTxtTrending(), "Top 100 Music Videos Indonesia");
        extentTest.log(LogStatus.PASS, "User see top 100 music video");
    }

    @When("User on dashboard page")
    public void user_on_dashboard_page_genre(){
        explore.clickExploreBtn();
        extentTest.log(LogStatus.PASS, "User on dashboard page");
    }
    @And("User click explore menu")
    public void user_click_menu_explore_genre(){
        explore.clickExploreBtn();
        extentTest.log(LogStatus.PASS, "User click explore menu");
    }
    @And("User click mood and genre")
    public void user_click_menu_moodGenre(){
        explore.clickMoodGenresBtn();
        extentTest.log(LogStatus.PASS, "User click mood and genre");
    }
    @Then("User see list of mood and genre song")
    public void user_see_list_genre(){
        Assert.assertEquals(explore.getTxtMoodGenre(), "Moods & genres");
        extentTest.log(LogStatus.PASS, "User see list of mood and genre song");
    }
}
