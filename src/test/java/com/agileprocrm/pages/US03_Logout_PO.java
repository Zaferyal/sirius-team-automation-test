package com.agileprocrm.pages;

import com.agileprocrm.utilities.Driver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class US03_Logout_PO {
    public US03_Logout_PO(){
        PageFactory.initElements(Driver.getDriver(), this);
    }

    @FindBy(xpath = "//*[@id=\"user-block\"]")
    public WebElement userProfile;

    @FindBy(linkText = "Log out")
    public WebElement logoutBtn;



}
