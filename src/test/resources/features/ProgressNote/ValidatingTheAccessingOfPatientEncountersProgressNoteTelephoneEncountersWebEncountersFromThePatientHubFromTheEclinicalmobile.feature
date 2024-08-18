@test4
Feature: RMID-344738 Validating the accessing of patient encounters[Progress note, Telephone encounters, Web encounters] from the patient hub from the eclinicalmobile

  @harishg @C4 @RMID-344738 @Priority=P1 @Encounter
  Scenario Outline: Validating the accessing of patient encounters [Progress note, Telephone encounters, Web encounters] from the patient hub from the eclinicalmobile
    Given Provider "Willis, Sam" is logged into eClinicalMobile using valid credentials
    Then Provider should be successfully landed on the "eClinicalMobile" Screen
    When Taps on 'Schedule' on the Dashboard Screen
    Then "Schedule" screen displays when clicked on Schedule button
    Then List of appointments should be visible on the 'Schedule' Screen
    When Taps on first appointment on the Schedule Screen
    Then "Patient Hub" screen displays
    When Taps on 'Encounters' on the Patient Hub Screen
    Then "Encounters" screen displays
    Then "<visitType>" visit type should display on Encounter screen
    Then 'Current Date' as date of encounter in format 'DD MMM YYYY' should display on Encounter screen
    When Taps on first encounter on the Encounters Screen
    Then The encounter should open up in read-only format
    When Taps on refresh button on the Encounters Screen
    When Taps on back button
    Then "Encounters" screen displays

    Examples:
      | visitType |
      | NP        |
