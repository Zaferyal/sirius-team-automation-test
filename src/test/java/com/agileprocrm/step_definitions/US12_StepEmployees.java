package com.agileprocrm.step_definitions;

import com.agileprocrm.pages.LoginPage;
import com.agileprocrm.pages.EmployeesPage_Semsi;
import com.agileprocrm.utilities.BrowserUtils;
import com.agileprocrm.utilities.ConfigurationReader;
import com.agileprocrm.utilities.Driver;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;

import java.util.List;

public class US12_StepEmployees {


    LoginPage loginPage = new LoginPage();
    @Given("user is already logged in to The homepage")
    public void userIsAlreadyLoggedInToTheHomepage() {
        Driver.getDriver().get(ConfigurationReader.getProperty("nextbasecrm.url"));
        loginPage.login("nextbasecrm.email", "nextbasecrm.password");

    }

EmployeesPage_Semsi employeesPage_semsi = new EmployeesPage_Semsi();
    @When("users click the Employees module")
    public void usersClickTheEmployeesModule() {
        employeesPage_semsi.searchEmployee.click();


    }

    @Then("verify the users see flowing options:")
    public void verifyTheUsersSeeFlowingOptions(List<String> expectedOptions) {

        List<String> actualOptions = BrowserUtils.dropdownOptions_as_STRING(employeesPage_semsi.listMenu);
        Assert.assertEquals(actualOptions,expectedOptions);
    }


}


 



