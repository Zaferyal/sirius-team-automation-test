package com.agileprocrm.step_definitions;

import com.agileprocrm.pages.LoginPage;
import com.agileprocrm.utilities.ConfigurationReader;
import com.agileprocrm.utilities.Driver;
import io.cucumber.java.en.*;
import org.checkerframework.checker.units.qual.C;
import org.junit.Assert;

public class US01_StepLogin {

    @Given("users go to the login page")
    public void usersGoToTheLoginPage() {
        Driver.getDriver().get(ConfigurationReader.getProperty("nextbasecrm.url"));
    }


    LoginPage loginPage = new LoginPage();
    @Given("user use username {string} and passcode {string}")
    public void userUseUsernameAndPasscode(String email, String password) {
        loginPage.inputEmail.sendKeys(email);
        loginPage.inputPassword.sendKeys(password);
    }
    @When("user click the login button")
    public void userClickTheLoginButton() {
        loginPage.btn_log_in.click();
    }
    @Then("verify the user should be at the home page")
    public void theUsersLogInSuccesfullyAndLaunchTheHomepage() {
        Assert.assertTrue(Driver.getDriver().getTitle().contains("Portal"));
    }



    @Given("Users enter invalid emails or passwords")
    public void usersEnterInvalidEmailsOrPasswords() {
        loginPage.inputEmail.sendKeys("hrr5@cydeo.com");
    }
    @When("Clicks the Log In button")
    public void clicksTheLogInButton() {
        loginPage.btn_log_in.click();
    }
    @Then("the users see {string} on the loginPage")
    public void theUsersSeeOnTheLoginPage(String expectedText) {
       String actualText = loginPage.errorText.getText();
        Assert.assertEquals(actualText, expectedText);
    }





}

