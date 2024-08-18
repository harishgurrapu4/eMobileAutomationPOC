@test4
Feature:RMID-348220 Validating the saving of Previous Action after Entering the New Action taken from emobile platform for a Telephone Encounter

  @harishg @C4 @RMID-348220 @Priority=P1 @TelephoneEncounter
  Scenario Outline: Validating the saving of Previous Action after Entering the New Action taken from emobile platform for a Telephone Encounter
    Given Provider "Willis, Sam" is logged into eClinicalMobile using valid credentials
    Then Provider should be successfully landed on the "eClinicalMobile" Screen
    When Taps on 'Tel/Web Encounters' on the Dashboard Screen
    Then "Encounters" screen displays when clicked on Tel/Web Encounters button
    Then List of encounters should be visible on the 'Tel Encounters' Screen
    When Taps on "<patientName>" telephone/web encounter on the Encounters Screen
    Then "Encounters" screen displays
    When Taps on New Action textview on the Encounters Screen
    When Enter "Test" on New Action textview on the Encounters Screen
    When Verify "Test" on New Action textview on the Encounters Screen
    When Taps on Save on the Tel Encounters Screen
    Then List of encounters should be visible on the 'Tel Encounters' Screen
    When Taps on "<patientName>" telephone/web encounter on the Encounters Screen
    Then "Encounters" screen displays
    When Taps on New Action textview on the Encounters Screen
    When Enter "Test1" on New Action textview on the Encounters Screen
    When Verify "Test1" on New Action textview on the Encounters Screen
    When Taps on Save on the Tel Encounters Screen
    Then List of encounters should be visible on the 'Tel Encounters' Screen
    When Taps on "<patientName>" telephone/web encounter on the Encounters Screen
    Then "Encounters" screen displays
    When Taps on New Action textview on the Encounters Screen
    When Enter "Test2" on New Action textview on the Encounters Screen
    When Verify "Test2" on New Action textview on the Encounters Screen
    When Taps on Save on the Tel Encounters Screen
    Then List of encounters should be visible on the 'Tel Encounters' Screen
    When Taps on "<patientName>" telephone/web encounter on the Encounters Screen
    Then "Encounters" screen displays
    Then "Test" action taken content displays on Tel/Web Encounters
    Then "Test1" action taken content displays on Tel/Web Encounters
    Then "Test2" action taken content displays on Tel/Web Encounters

    Examples:
      | patientName    |
      | Navarro, Jason |