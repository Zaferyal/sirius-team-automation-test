package com.agileprocrm.step_definitions;

import com.agileprocrm.pages.LoginPage;
import com.agileprocrm.utilities.ConfigurationReader;
import com.agileprocrm.utilities.Driver;
import io.cucumber.java.en.*;
import org.junit.Assert;

public class US01_StepLogin {

    @Given("User is on the login page of the NextBaseCRM")
    public void user_is_on_the_login_page_of_the_next_base_crm() {
        Driver.getDriver().get(ConfigurationReader.getProperty("nextbasecrm.url"));
    }
    LoginPage loginPage = new LoginPage();

    @When("Users enter valid emails {string} and passwords {string}")
    public void usersEnterValidEmailsAndPasswords(String email, String password) {
        loginPage.inputEmail.sendKeys(email);
        loginPage.inputPassword.sendKeys(password);
    }
    @When("Clicks the Log In button")
    public void clicks_the_log_in_button() {
        loginPage.btn_log_in.click();

    }

        @Then("the users log in successfully and launch the homepage")
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



}

