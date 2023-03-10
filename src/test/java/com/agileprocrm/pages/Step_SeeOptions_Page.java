package com.agileprocrm.pages;

import com.agileprocrm.utilities.Driver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;


    public class Step_SeeOptions_Page {

        public Step_SeeOptions_Page() {
            PageFactory.initElements(Driver.getDriver(), this);
        }


        @FindBy(xpath = "//span[@class='user-name']")
        public WebElement userName;

        @FindBy(xpath = "//span[text()='My Profile']")
        public WebElement MyProfileOption;

        @FindBy(xpath = "//span[text()='Edit Profile Settings']")
        public WebElement editProfileSettingOption;

        @FindBy(xpath = "//span[text()='Themes']")
        public WebElement themesOption;

        @FindBy(xpath = "//span[text()='Configure notifications']")
        public WebElement configurationOption;

        @FindBy(xpath = "//span[text()='Log out']")
        public WebElement logOutOption;

    }



