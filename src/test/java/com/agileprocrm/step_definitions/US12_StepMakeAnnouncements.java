package com.agileprocrm.step_definitions;

import com.agileprocrm.pages.LoginPage;
import com.agileprocrm.pages.MakeAnnouncementsPage_Semsi;
import com.agileprocrm.utilities.BrowserUtils;
import com.agileprocrm.utilities.ConfigurationReader;
import com.agileprocrm.utilities.Driver;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.checkerframework.checker.units.qual.C;
import org.junit.Assert;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.lang.reflect.Member;
import java.util.Set;

public class US12_StepMakeAnnouncements {

MakeAnnouncementsPage_Semsi makeAnnouncementsPage_semsi = new MakeAnnouncementsPage_Semsi();
    LoginPage loginPage = new LoginPage();
    @Given("user is already logged in to The homepage")
    public void userIsAlreadyLoggedInToTheHomepage() {
        Driver.getDriver().get(ConfigurationReader.getProperty("nextbasecrm.url"));
        loginPage.login("nextbasecrm.email", "nextbasecrm.password");

    }

    @When("Users click the more tab")
    public void usersClickTheMoreTab() {
        makeAnnouncementsPage_semsi.moreLink.click();
    }

    @And("Users select Announcements")
    public void usersSelectAnnouncements() {
        makeAnnouncementsPage_semsi.selectAnnouncement.click();
    }


    @And("Users write announcements message {string}")
    public void usersWriteAnnouncementsMessage(String message)
    {Driver.getDriver().switchTo().frame(0);
     makeAnnouncementsPage_semsi.writeMessage.sendKeys(message);


    }
    @And("Users click the send button")
    public void usersClickTheSendButton() {
        Driver.getDriver().switchTo().parentFrame();
        makeAnnouncementsPage_semsi.sendButton.click();
    }



    @Then("Verify the announcements  are displayed on the feed")
    public void verifyTheAnnouncementsAreDisplayedOnTheFeed() {
        Assert.assertTrue(makeAnnouncementsPage_semsi.announcementMessage.isDisplayed());
    }




    @Then("Verify {string} warning message is displayed on the page")
    public void verifyWarningMessageIsDisplayedOnThePage(String expectedText) {

        Assert.assertEquals(makeAnnouncementsPage_semsi.announcementMessage.getText(),expectedText);
    }
}


 



