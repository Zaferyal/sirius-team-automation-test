Feature: Configure Menu
  Agile Story: As a user, I should be able to configure the menu

  @ConfigureMenu
  Scenario: users can access to six options under the CONFIGURE MENU
    Given Users are on the homepage
    Then users click the CONFIGURE MENU option
    Then verify the users see flowing six options:

      | Configure menu items               |
      | Collapse menu                      |
      | Remove current page from left menu |
      | Add custom menu item               |
      | Change primary tool                |
      | Reset menu                         |


