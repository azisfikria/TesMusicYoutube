package com.tesmusicyoutube.pages;

import com.tesmusicyoutube.drivers.DriverSingleton;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Search {
    private WebDriver driver;

    public Search(){
        this.driver = DriverSingleton.getDriver();
        PageFactory.initElements(driver, this);
    }

    @FindBy(xpath = "//*[@id=\"placeholder\"]")
    WebElement btnSearch;

    @FindBy(xpath = "//input[@id='input']")
    WebElement inputSinger;

    @FindBy(xpath = "//*[@id=\"contents\"]/ytmusic-responsive-list-item-renderer/a")
    WebElement singer;

    @FindBy(xpath = "//*[@id=\"header\"]/ytmusic-immersive-header-renderer/div/div/div/yt-formatted-string")
    WebElement txtSinger;

    public void clickBtnSearch(){
        btnSearch.click();
        delay(1);
    }
    public void searchBar(){
        inputSinger.sendKeys("Greenday", Keys.ENTER);
        delay(1);
    }

    public void clickSinger(){
        singer.click();
    }

    public String getTxtSinger(){
        return txtSinger.getText();
    }
    static void delay(int detik){
        //delay
        try {
            Thread.sleep(1000 * detik);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
    }
}
