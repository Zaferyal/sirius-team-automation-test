package com.agileprocrm.step_definitions;

import com.agileprocrm.pages.ConfigureMenuPage_Semsi;
import com.agileprocrm.utilities.BrowserUtils;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;

import java.util.List;

public class US13_StepConfigureMenu {
ConfigureMenuPage_Semsi configureMenuPage = new ConfigureMenuPage_Semsi();

    @When("users click the CONFIGURE MENU option")
    public void users_click_the_configure_menu_option() {
        configureMenuPage.searchConfButton.click();

    }




    @Then("Verify the users see flowing options:")
    public void verifyTheUsersSeeFlowingOptions(List<String> expectedOptions) {
        List<String> actualOptions = BrowserUtils.dropdownOptions_as_STRING(configureMenuPage.confMenu);

        Assert.assertEquals(actualOptions, expectedOptions);
    }
}
