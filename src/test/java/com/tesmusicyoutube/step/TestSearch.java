package com.tesmusicyoutube.step;

import com.relevantcodes.extentreports.ExtentTest;
import com.relevantcodes.extentreports.LogStatus;
import com.tesmusicyoutube.pages.Login;
import com.tesmusicyoutube.pages.Search;
import com.tesmusicyoutube.utils.Constants;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.openqa.selenium.WebDriver;
import org.testng.Assert;

public class TestSearch {
    WebDriver driver;
    private static ExtentTest extentTest;

    private Login login = new Login();
    private Search search = new Search();

    public TestSearch(){
        driver = Hooks.driver;
        extentTest = Hooks.extentTest;
    }

    @When("User on dashboard page")
    public void user_on_dashboard_page(){
        driver.get(Constants.URL);
        extentTest.log(LogStatus.PASS, "User on dashboard page");
    }

    @And("User click button search")
    public void user_click_button_search(){
        search.clickBtnSearch();
        extentTest.log(LogStatus.PASS, "User click button search");
    }

    @And("User input singer")
    public void user_input_singer(){
        search.searchBar();
        extentTest.log(LogStatus.PASS, "User input singer");
    }

    @And("User click singer")
    public void user_click_singer(){
        search.clickSinger();
        extentTest.log(LogStatus.PASS, "User click singer");
    }

    @Then("User on singer page")
    public void user_see_the_singer_or_song(){
        System.out.println(search.getTxtSinger());
        Assert.assertTrue(search.getTxtSinger().contains("Green Day"));
        extentTest.log(LogStatus.PASS, "User on singer page");
    }
}
