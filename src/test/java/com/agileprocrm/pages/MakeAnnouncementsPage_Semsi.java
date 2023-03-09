package com.agileprocrm.pages;

import com.agileprocrm.utilities.ConfigurationReader;
import com.agileprocrm.utilities.Driver;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class MakeAnnouncementsPage_Semsi {
    public MakeAnnouncementsPage_Semsi() {


        PageFactory.initElements(Driver.getDriver(), this);

    }
    @FindBy(xpath = "//span[@id='feed-add-post-form-link-text']")
            public WebElement moreLink;

    @FindBy(xpath = "//span[text()='Announcement']")
    public WebElement selectAnnouncement;

    @FindBy(xpath = "//body[@contenteditable='true']")
    public WebElement writeMessage;

    @FindBy(xpath = "//button[@id='blog-submit-button-save']")
    public WebElement sendButton;


    @FindBy(xpath = " //*[contains(@class,'feed-post-text-block-inner-inner')]")
    public WebElement announcementMessage;




}
