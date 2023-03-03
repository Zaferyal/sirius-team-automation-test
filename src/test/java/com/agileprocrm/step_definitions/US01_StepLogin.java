package com.agileprocrm.step_definitions;

import com.agileprocrm.pages.LoginPage;
import com.agileprocrm.utilities.ConfigurationReader;
import com.agileprocrm.utilities.Driver;
import io.cucumber.java.en.*;
import org.checkerframework.checker.units.qual.C;
import org.junit.Assert;

public class US01_StepLogin {

    @Given("User is on the login page")
    public void user_is_on_the_login_page_of_the_next_base_crm() {
        Driver.getDriver().get(ConfigurationReader.getProperty("nextbasecrm.url"));
    }
    LoginPage loginPage = new LoginPage();


    @When("user use username {string} and passcode {string}")
    public void userUseUsernameAndPasscode(String email, String password) {
        loginPage.inputEmail.sendKeys(email);
        loginPage.inputPassword.sendKeys(password);
    }
    @And("user click the login button")
    public void userClickTheLoginButton() {
        loginPage.btn_log_in.click();
    }


        @Then("verify the user should be at the home page")
    public void theUsersLogInSuccesfullyAndLaunchTheHomepage() {
        Assert.assertTrue(Driver.getDriver().getTitle().contains("Portal"));
    }

    @When("Users enter invalid emails or passwords")
    public void usersEnterInvalidEmailsOrPasswords() {
        loginPage.inputEmail.sendKeys("hrr5@cydeo.com");
    }
    @Then("the users see {string} on the loginPage")
    public void theUsersSeeOnTheLoginPage(String expectedText) {
       String actualText = loginPage.errorText.getText();
        Assert.assertEquals(actualText, expectedText);
    }


    @And("Clicks the Log In button")
    public void clicksTheLogInButton() {
        loginPage.btn_log_in.click();
    }
}

