package com.agileprocrm.pages;

import com.agileprocrm.utilities.Driver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class ConfigureMenuPage_Semsi {
    public ConfigureMenuPage_Semsi() {
        PageFactory.initElements(Driver.getDriver(), this);

    }

    @FindBy(xpath = "//span[@id='left-menu-settings']")
    public WebElement searchConfButton;
    @FindBy(xpath = "//input[@value='Visa']")
    public WebElement confMenu;
}
