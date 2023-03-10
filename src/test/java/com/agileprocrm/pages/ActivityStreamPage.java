package com.agileprocrm.pages;
import com.agileprocrm.utilities.Driver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class ActivityStreamPage {
    public ActivityStreamPage(){
        PageFactory.initElements(Driver.getDriver(), this);
    }
    @FindBy(xpath = "//a[@title='Chat and Calls']")
    public WebElement ChatAndCallsModule;

    @FindBy(xpath = "//div[@id='bx-desktop-tab-im']")
    public WebElement ChatIcon;

    @FindBy(xpath = "//div[@class='bx-desktop-tab-icon bx-desktop-tab-icon-notify']")
    public WebElement NotifyIcon;

    @FindBy(xpath = "//div[@class='bx-desktop-tab-icon bx-desktop-tab-icon-config']")
    public WebElement SettingIcon;

    @FindBy(xpath = "//div[@class='bx-desktop-tab-icon bx-desktop-tab-icon-im-lf']")
    public WebElement ActivityStreamIcon;
}


