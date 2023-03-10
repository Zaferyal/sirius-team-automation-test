package com.agileprocrm.step_definitions;


import com.agileprocrm.pages.LoginPage;
import com.agileprocrm.pages.US13_ConfigureMenu_PO;
import com.agileprocrm.utilities.BrowserUtils;
import com.agileprocrm.utilities.ConfigurationReader;
import com.agileprocrm.utilities.Driver;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import org.junit.Assert;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;

import java.util.List;

public class US13_Steps {

    US13_ConfigureMenu_PO us13_configureMenu_PO = new US13_ConfigureMenu_PO();
    LoginPage loginPage = new LoginPage();

    @Given("Users are on the homepage")
    public void users_are_on_the_homepage() {
        Driver.getDriver().get(ConfigurationReader.getProperty("url"));
        loginPage.login(ConfigurationReader.getProperty("username_hr"),
        ConfigurationReader.getProperty("password"));
    }
    @Then("users click the CONFIGURE MENU option")
    public void users_click_the_configure_menu_option() {
        BrowserUtils.sleep(2);
        us13_configureMenu_PO.configureMenu.click();
    }
    Actions actions = new Actions(Driver.getDriver());
    @Then("verify the users see flowing six options:")
    public void verify_the_users_see_flowing_six_options(List<String> expMenuOptions) {
        actions.moveToElement(us13_configureMenu_PO.configureMenu).click().perform();
        List<WebElement> menuItems = us13_configureMenu_PO.menuItems;
        for (WebElement each : menuItems) {
            Assert.assertTrue(each.equals(expMenuOptions));
        }

    }


}
