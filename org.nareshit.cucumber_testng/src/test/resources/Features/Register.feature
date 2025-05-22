Feature: User Registration

  Scenario: Verify User Registration functionality
    Given User open Registration account page
    When User enter below details
      | firstname    | Allu                |
      | lastname     | Arjun               |
      | emailaddress | alluarjun@gmail.com |
      | telephone    | 123456789					 |
      | password     | Allu@12345          |
      | cnfpassword  | Allu@12345          |
    And Select privacy policy field and click on continue button
    Then Account should get successfully generated
