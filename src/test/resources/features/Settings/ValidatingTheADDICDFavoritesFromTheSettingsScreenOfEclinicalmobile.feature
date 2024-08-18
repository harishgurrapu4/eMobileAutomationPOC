@test1
Feature: RMID-347467 Validating the ADD ICD favorites from the settings screen of eclinicalmobile

  @harishg @C4 @RMID-347467 @Priority=P1 @Settings
  Scenario Outline: Validating the ADD ICD favorites from the settings screen of eclinicalmobile.
    Given Provider "Willis, Sam" is logged into eClinicalMobile using valid credentials
    Then Provider should be successfully landed on the "eClinicalMobile" Screen
    When Taps on 'Swipe Button' on the Dashboard Screen to land on Settings
    Then "Settings" screen displays
    When Taps on the 'Add ICD Favorites' on 'Settings' Screen
    Then "Add to ICD Favorites" screen displays
    When Enter "<icdCode>" on the search field of 'Add ICD/CPT Favorites' Screen
    When Taps on the "<icdCode>" on 'Add to ICD/CPT Favorites' Screen
    Then Verify the ICD is added as favorite
    When Taps on the 'Save' on 'Add ICD Favorites' Screen

    Examples:
      | icdCode |
      | 786.2   |