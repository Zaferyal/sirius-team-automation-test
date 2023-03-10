package com.agileprocrm.step_definitions;

import com.agileprocrm.pages.US03_Logout_PO;
import com.agileprocrm.utilities.BrowserUtils;
import com.agileprocrm.utilities.ConfigurationReader;
import com.agileprocrm.utilities.Driver;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.openqa.selenium.interactions.Actions;

public class US03_Steps {


    US03_Logout_PO us03_logout_po = new US03_Logout_PO();

    @When("Users click on the user profile name")
    public void users_click_on_the_user_profile_name() {
        us03_logout_po.userProfile.click();
    }

    Actions actions = new Actions(Driver.getDriver());
    @When("Users select the Log Out option")
    public void users_select_the_log_out_option() {
        actions.moveToElement(us03_logout_po.logoutBtn).click().perform();
    }

    @Then("Users back to the login page")
    public void users_back_to_the_login_page() {
        String expectedUrl  = ConfigurationReader.getProperty("url");
        BrowserUtils.verifyURLContains(expectedUrl);

    }
}
