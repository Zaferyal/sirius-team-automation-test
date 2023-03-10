package com.agileprocrm.step_definitions;

import com.agileprocrm.pages.Step_SeeOptions_Page;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class US06_Step_SeeOptions {


        Step_SeeOptions_Page step_seeOptions_page;

        @When("Users click the user profile name")
        public void users_click_the_user_profile_name() {
            step_seeOptions_page = new Step_SeeOptions_Page();
            step_seeOptions_page.userName.click();
        }


        @Then("user see the My profile option,Edit Profile Settings,Themes, configure notification and log-out options")
        public void user_see_the_my_profile_option_edit_profile_settings_themes_configure_notification_and_log_out_options() {
            step_seeOptions_page.MyProfileOption.isDisplayed();
            step_seeOptions_page.editProfileSettingOption.isDisplayed();
            step_seeOptions_page.themesOption.isDisplayed();
            step_seeOptions_page.configurationOption.isDisplayed();
            step_seeOptions_page.logOutOption.isDisplayed();
        }
    }
