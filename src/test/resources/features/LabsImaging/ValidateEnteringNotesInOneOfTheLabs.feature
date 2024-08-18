@test
Feature: Validate entering notes in one of the labs or imaging

  @harishg @C4 @EA-64351 @RMID-168412 @Priority=P1 @Labs/Imaging
  Scenario: Validate entering notes in one of the labs or imaging
    Given Provider "Willis, Sam" is logged into eClinicalMobile using valid credentials
    Then Provider should be successfully landed on the "eClinicalMobile" Screen
    When Taps on 'Labs/Imaging' on the Dashboard Screen
    Then List of labs/imaging should be visible on the 'Labs/Imaging' Screen
    When Taps on first labs/imaging on the Labs/Imaging Screen
    When Taps on notes textview on the Labs/Imaging Screen
    When Enter "Test" on notes textview on the Labs/Imaging Screen
    When Verify "Test" on notes textview on the Labs/Imaging Screen
    When Taps on Save on the Labs/Imaging Screen
    Then List of labs/imaging should be visible on the 'Labs/Imaging' Screen