Feature: feature to test Login Functionality

  @Smoke
  Scenario: verify to check Login is successful with valid credentials
    Given user is on Login page
    When user enter valid credentials(username: "Admin",password: "admin123")
    And click on Login button
    Then user is navigated to Home page
