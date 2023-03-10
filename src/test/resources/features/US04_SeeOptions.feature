Feature: See all the options under the user profile
  US04:
  As a user, I should be able to see all the options under the user
  profile

  Background: User already on successfully logged-in



  Scenario: Users see the options under the profile
    When Users click the user profile name
    Then user see the My profile option,Edit Profile Settings,Themes, configure notification and log-out options


