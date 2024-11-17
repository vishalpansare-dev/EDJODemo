Feature: User Logout

  Scenario: User can log out after successful login
    Given the user has successfully logged in
    When the user clicks the "Logout" button
    Then the user should be redirected to the login page
    And a "Logged out successfully" message should be displayed

  Scenario: User can log out after successful login
    Given the user has successfully logged in
    When the user clicks the "Logout" button
    Then the user should be redirected to the login page
    And a "Logged out successfully" message should be displayed