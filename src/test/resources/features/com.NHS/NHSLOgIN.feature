Feature: NHS Login Functionality

@finalTest
  Scenario: Validation of Login Credentials
    Given the user navigates to "http://www.techtorialacademy.link/"
    When the user provides "username" and "password"
    Then user validates he is on the same page



