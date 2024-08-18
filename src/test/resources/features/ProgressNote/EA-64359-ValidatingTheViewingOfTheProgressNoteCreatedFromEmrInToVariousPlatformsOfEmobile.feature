@test
Feature: EA-64359 RMID-168419 Validating the viewing of the progress note created from emr in to various platforms of emobile

  @harishg @C4 @EA-64359 @RMID-168419 @Priority=P1 @ProgressNote
  Scenario: Validating the viewing of the progress note created from emr in to various platforms of emobile
    Given Provider "Willis, Sam" is logged into eClinicalMobile using valid credentials
    Then Provider should be successfully landed on the "eClinicalMobile" Screen
    When Taps on 'Schedule' on the Dashboard Screen
    Then "Schedule" screen displays when clicked on Schedule button
    Then List of appointments should be visible on the 'Schedule' Screen
    When Taps on first appointment on the Schedule Screen
    Then "Patient Hub" screen displays
    When Taps on 'Encounters' on the Patient Hub Screen
    Then "Encounters" screen displays
    When Taps on first encounter on the Encounters Screen
    Then The encounter should open up in read-only format
