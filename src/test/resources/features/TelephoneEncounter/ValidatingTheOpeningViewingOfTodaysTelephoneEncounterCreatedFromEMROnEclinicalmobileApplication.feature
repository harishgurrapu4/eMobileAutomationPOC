@test4
Feature:RMID-348172 Validating the Opening Viewing of today's telephone encounter created from EMR on eclinicalmobile application

  @harishg @C4 @RMID-348172 @Priority=P1 @TelephoneEncounter
  Scenario Outline: Validate entering new action in telephone encounter
    Given Provider "Willis, Sam" is logged into eClinicalMobile using valid credentials
    Then Provider should be successfully landed on the "eClinicalMobile" Screen
    When Taps on 'Tel/Web Encounters' on the Dashboard Screen
    Then "Encounters" screen displays when clicked on Tel/Web Encounters button
    Then List of encounters should be visible on the 'Tel Encounters' Screen
    When Taps on "Riley, Anne" telephone/web encounter on the Encounters Screen
    Then "Encounters" screen displays
    Then "<patientName>" patient should display on Tel/Web Encounters screen
    Then "<dateTime>" date and time should display on Tel/Web Encounters screen
    Then User should able to view 'Mark as Addresses','Reassign To','Show PN' and 'Save' button should display on Tel/Web Encounters screen

    Examples:
      | patientName | dateTime              |
      | RILEY, Anne | 30 Apr 2060, 03:17 AM |
