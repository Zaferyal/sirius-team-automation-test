@Gianpaulo
Feature: Navigating Chat and Calls Module

  User Story : There should be four sub-modules once the user clicks the Chat and Calls module:
  Message
  Notifications
  Settings
  Active Stream


  Scenario: Verification of Chat and calls
    Given User is on the logged into NextBaseCRM
    When User clicks onto ChatAndCalls Module
    Then User will be able to see all popups

