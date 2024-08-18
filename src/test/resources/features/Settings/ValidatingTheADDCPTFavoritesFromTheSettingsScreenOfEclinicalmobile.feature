@test1
Feature: RMID-351721 Validating the ADD ICD favorites from the settings screen of eclinicalmobile

  @harishg @C4 @RMID-351721 @Priority=P1 @Settings
  Scenario Outline: Validating the ADD CPT favorites from the settings screen of eclinicalmobile.
    Given Provider "Willis, Sam" is logged into eClinicalMobile using valid credentials
    Then Provider should be successfully landed on the "eClinicalMobile" Screen
    When Taps on 'Swipe Button' on the Dashboard Screen to land on Settings
    Then "Settings" screen displays
    When Taps on the 'Add CPT Favorites' on 'Settings' Screen
    Then "Add to CPT Favorites" screen displays
    When Enter "<cptCode>" on the search field of 'Add ICD/CPT Favorites' Screen
    When Taps on the "<cptCode>" on 'Add to ICD/CPT Favorites' Screen
    Then Verify the CPT is added as favorite
    When Taps on the 'Save' on 'Add ICD Favorites' Screen

    Examples:
      | cptCode |
      | 93451   |