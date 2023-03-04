package com.agileprocrm.pages;

import com.agileprocrm.utilities.ConfigurationReader;
import com.agileprocrm.utilities.Driver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import java.io.ObjectInputStream;

public class LoginPage {
    public LoginPage() {
        PageFactory.initElements(Driver.getDriver(), this);
    }

    @FindBy(xpath = "//input[@name='USER_LOGIN']")
    public WebElement inputEmail;


    @FindBy(xpath = "//input[@name='USER_PASSWORD']")
    public WebElement inputPassword;

    @FindBy(xpath = "//input[@value='Log In']")
    public WebElement btn_log_in;

    @FindBy(xpath = "//div[@class= 'errortext']")
    public WebElement errorText;

    public void login(String email, String password) {
        this.inputEmail.sendKeys(ConfigurationReader.getProperty("nextbasecrm.email"));
        this.inputPassword.sendKeys(ConfigurationReader.getProperty("nextbasecrm.password"));
        this.btn_log_in.click();

    }

    }






