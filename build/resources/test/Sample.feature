Feature: Google
  Scenario: Go to Google
    Given I redirect to google page
    When I enter "facebook"
    And I click "facebook"
    Then I login button should be displayed