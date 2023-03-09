package com.agileprocrm.pages;

import com.agileprocrm.utilities.Driver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class EmployeesPage_Semsi {
    public EmployeesPage_Semsi() {


        PageFactory.initElements(Driver.getDriver(), this);

    }
    @FindBy(xpath = "//a[@class='menu-item-link']")
    public WebElement searchEmployee;

    @FindBy(xpath = "//div[@id='top_menu_id_company']")
    public WebElement listMenu;








}
