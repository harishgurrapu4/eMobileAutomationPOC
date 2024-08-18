@test
Feature: Validating the viewing of the review progress note in read only

  @harishg @C4 @EA-64357 @RMID-168417 @Priority=P1 @ReviewProgressNote
  Scenario: Validating the viewing of the review progress note in read only
    Given Provider "Willis, Sam" is logged into eClinicalMobile using valid credentials
    Then Provider should be successfully landed on the "eClinicalMobile" Screen
    When Taps on 'Review Progress Notes' on the Dashboard Screen
    Then "Review Progress Notes" screen displays when clicked on Review Progress Notes button
    Then List of Patients should be visible on the 'Review Progress Notes' Screen
    When Taps on first patient on the Review Progress Notes Screen
    Then The Review Progress Notes should open up in read-only format
