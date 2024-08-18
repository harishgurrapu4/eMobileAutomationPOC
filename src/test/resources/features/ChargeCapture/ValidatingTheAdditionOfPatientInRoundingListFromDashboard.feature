@test1
Feature: RMID-352451 Validating the addition of patient in rounding list from dashboard

  @harishg @C4 @RMID-352451 @Priority=P1 @ChargeCapture
  Scenario Outline: Validating the addition of patient in rounding list from dashboard
    Given Provider "Willis, Sam" is logged into eClinicalMobile using valid credentials
    Then Provider should be successfully landed on the "eClinicalMobile" Screen
    When Taps on 'Charge Capture' on the Dashboard Screen
    Then "Rounding List" screen displays
    When Click on Add Patient button on 'Rounding List' Screen
    Then "Patient Lookup" screen displays
    When Click on Male button on 'Patient Lookup' Screen
    When Enter "<lastName>" on text field 'Last Name'
    When Enter "<firstName>" on text field 'First Name'
    When Click on Search button on 'Patient Lookup' Screen
    Then "Patient Lookup" screen displays
    Then List of patients should be visible
    When Taps on first patient from the list
    When Click on Save to add patient on 'Rounding List'
    When Taps on "OK" alert button
    Then "Rounding List" screen displays
    Then "<lastName>, <firstName>" patient should display on 'Rounding List' Screen

    Examples:
      | lastName | firstName |
      | Test     | Test      |