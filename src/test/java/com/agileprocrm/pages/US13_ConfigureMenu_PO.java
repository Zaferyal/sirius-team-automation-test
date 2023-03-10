package com.agileprocrm.pages;


import com.agileprocrm.utilities.Driver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import java.util.List;

public class US13_ConfigureMenu_PO extends LoginPage {

    public US13_ConfigureMenu_PO() {
        PageFactory.initElements(Driver.getDriver(), this);
    }

   @FindBy(xpath= "//*[@id=\"left-menu-settings\"]")
    public WebElement configureMenu;

    @FindBy(xpath= "//*[@class=\"menu-popup\"]//div")
    public List<WebElement> menuItems;
}
