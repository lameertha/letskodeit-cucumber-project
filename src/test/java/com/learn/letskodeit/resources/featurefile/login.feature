Feature: SignUp Profile functionality
  As a user I want to SignUp Profile successfully in letskodit
  Scenario: User should Edit Profile successfully
    Given I am on login page
    When I click on sing Up Page
    And I  enter the below credentials
    |  Lameertha Thevarajah| lameethev7@yahoo.co.uk|Lamee@1988 |Lamee@1988|
    And I click on set teams button
    Then I click on signUp Button
