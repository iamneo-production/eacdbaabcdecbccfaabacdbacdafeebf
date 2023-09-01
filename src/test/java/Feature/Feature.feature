Feature: Verification of Feedback Functionality

  Scenario: User submits feedback message
    Given the user navigates to JavaTpoint.com
    When the user clicks on Feedback
    And the Feedback page opens
    And the user submits feedback message
    Then feedback should be received on the admin page
    And admin can reply to the user
