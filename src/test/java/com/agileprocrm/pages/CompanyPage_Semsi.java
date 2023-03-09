package com.agileprocrm.pages;

import com.agileprocrm.utilities.Driver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class CompanyPage_Semsi {
    public CompanyPage_Semsi() {
        PageFactory.initElements(Driver.getDriver(), this);
}


    @FindBy(xpath = "//span[@class='menu-item-link']")
    public WebElement searchCompany;


    @FindBy(xpath = "//input[@value='Visa']")
    public WebElement companyMenu;

}
