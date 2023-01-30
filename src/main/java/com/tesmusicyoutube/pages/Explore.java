package com.tesmusicyoutube.pages;

import com.tesmusicyoutube.drivers.DriverSingleton;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Explore {
    private WebDriver driver;

    public Explore() {
        this.driver = DriverSingleton.getDriver();
        PageFactory.initElements(driver, this);
    }
    @FindBy(xpath = "//*[@id=\"layout\"]/ytmusic-nav-bar/div[2]/ytmusic-pivot-bar-renderer/ytmusic-pivot-bar-item-renderer[2]/yt-formatted-string")
    WebElement btnExplore;

    @FindBy(xpath = "//*[@id=\"items\"]/ytmusic-navigation-button-renderer[1]/button/yt-formatted-string")
    WebElement btnNewRelease;

    @FindBy(xpath = "//*[@id=\"items\"]/ytmusic-navigation-button-renderer[2]/button/yt-formatted-string")
    WebElement btnCharts;

    @FindBy(xpath = "//*[@id=\"items\"]/ytmusic-navigation-button-renderer[3]/button/yt-formatted-string")
    WebElement btnMoodGenres;

    @FindBy(xpath = "//*[@id=\"header\"]/ytmusic-header-renderer/h2/yt-formatted-string")
    WebElement txtNewRelease;

    @FindBy(xpath = "//*[@id=\"details\"]/yt-formatted-string/a")
    WebElement trendingBtn;

    @FindBy(xpath = "//*[@id=\"header\"]/ytmusic-detail-header-renderer/div/div[2]/h2/yt-formatted-string")
    WebElement txtTrending;

    @FindBy(xpath = "//*[@id=\"header\"]/ytmusic-header-renderer/h2/yt-formatted-string")
    WebElement txtMoodGenre;


    public void clickExploreBtn(){
        btnExplore.click();
    }
    public void clickNewReleaseBtn(){
        btnNewRelease.click();
    }
    public void clickChartsBtn(){
        btnCharts.click();
    }
    public void clickMoodGenresBtn(){
        btnMoodGenres.click();
    }

    public void clickTrendingBtn(){
        trendingBtn.click();
    }
    public String getTxtNewRelease(){
        return txtNewRelease.getText();
    }
    public String getTxtTrending(){
        return txtTrending.getText();
    }
    public String getTxtMoodGenre(){
        return txtMoodGenre.getText();
    }

}
