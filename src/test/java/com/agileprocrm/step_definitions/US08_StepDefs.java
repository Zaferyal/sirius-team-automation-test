package com.agileprocrm.step_definitions;

import com.agileprocrm.pages.ActivityStreamPage;
import com.agileprocrm.pages.LoginPage;
import com.agileprocrm.utilities.ConfigurationReader;
import com.agileprocrm.utilities.Driver;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;



public class US08_StepDefs {


    ActivityStreamPage activityStreamPage = new ActivityStreamPage();
    LoginPage loginPage = new LoginPage();

    @Given("User is on the logged into NextBaseCRM")
    public void userIsOnTheLoggedIntoNextBaseCRM() {
        Driver.getDriver().get("https://qa.agileprocrm.com/auth/?backurl=%2Fstream%2F");
        loginPage.userName.sendKeys(ConfigurationReader.getProperty("username_hr"));
        loginPage.password.sendKeys(ConfigurationReader.getProperty("password"));
        loginPage.submit.click();
    }

    @When("User clicks onto ChatAndCalls Module")
    public void userClicksOntoChatAndCallsModule() {
        activityStreamPage.ChatAndCallsModule.click();
    }

    @Then("User will be able to see all popups")
    public void userWillBeAbleToSeeAllPopups() {
        Assert.assertTrue(activityStreamPage.ChatIcon.isDisplayed());
        Assert.assertTrue(activityStreamPage.NotifyIcon.isDisplayed());
        Assert.assertTrue(activityStreamPage.SettingIcon.isDisplayed());
        Assert.assertTrue(activityStreamPage.ActivityStreamIcon.isDisplayed());
    }
}
