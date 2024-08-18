@test3
Feature:RMID-168416 Validate entering new action in telephone encounter

  @harishg @C4 @EA-64355 @RMID-168416 @Priority=P1 @TelephoneEncounter
  Scenario: Validate entering new action in telephone encounter
    Given Provider "Willis, Sam" is logged into eClinicalMobile using valid credentials
    Then Provider should be successfully landed on the "eClinicalMobile" Screen
    When Taps on 'Tel/Web Encounters' on the Dashboard Screen
    Then "Encounters" screen displays when clicked on Tel/Web Encounters button
    Then List of encounters should be visible on the 'Tel Encounters' Screen
    When Taps on first telephone encounter on the Encounters Screen
    Then "Encounters" screen displays
    When Taps on New Action textview on the Encounters Screen
    When Enter "Test" on New Action textview on the Encounters Screen
    When Verify "Test" on New Action textview on the Encounters Screen
    When Taps on Save on the Tel Encounters Screen
    Then List of encounters should be visible on the 'Tel Encounters' Screen