package com.agileprocrm.step_definitions;

import com.agileprocrm.pages.ProfilePage_Jamilla;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class Us09_StepProfilePage {
        ProfilePage_Jamilla profilePage_jamilla = new ProfilePage_Jamilla();
    @When("users click the user profile")
    public void users_click_the_user_profile() {
    }
    @Then("verify the users see flowing {int} options:")
    public void verify_the_users_see_flowing_options(Integer int1, io.cucumber.datatable.DataTable dataTable) {
        throw new io.cucumber.java.PendingException();
    }
}
