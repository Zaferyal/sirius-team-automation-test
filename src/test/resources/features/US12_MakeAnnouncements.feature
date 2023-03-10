Feature: Next Base Login feature

  User Story:
  As a user, I should be able to Make Announcements using the Announcements tab.

  Scenario:Users should be able to write messages in and send
  announcements by clicking the send button

    Given user is already logged in to The homepage
    When Users click the more tab
    And Users select Announcements
    And Users write announcements message "Hi Team Sirius"
    And Users click the send button
    Then Verify the announcements  are displayed on the feed

  Scenario: When users attempt to make announcements without a
  message, the user should be able to see the “The message title is
  not specified” message

    Given user is already logged in to The homepage
    When Users click the more tab
    And Users click the send button
    Then Verify "The message title is not specified" warning message is displayed on the page


