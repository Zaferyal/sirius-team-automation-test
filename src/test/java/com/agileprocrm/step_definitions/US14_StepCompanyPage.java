package com.agileprocrm.step_definitions;

import com.agileprocrm.pages.CompanyPage_Semsi;
import com.agileprocrm.pages.ConfigureMenuPage_Semsi;
import com.agileprocrm.utilities.BrowserUtils;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;

import java.util.List;

public class US14_StepCompanyPage {


   CompanyPage_Semsi companyPage_semsi = new CompanyPage_Semsi();
    @When("users click the Company module")
    public void users_click_the_company_module() {
        companyPage_semsi.searchCompany.click();


    }
    @Then("verify the users see flowing options:")
    public void verify_the_users_see_flowing_options(List<String> expectedOptions) {
        List<String> actualOptions = BrowserUtils.dropdownOptions_as_STRING(companyPage_semsi.companyMenu);

        Assert.assertEquals(actualOptions, expectedOptions);

    }

}
