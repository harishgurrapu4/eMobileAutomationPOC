@test1
Feature: RMID-352176 Validating the behavior by selecting Multiple ICDs from the charge capture screen

  @harishg @C4 @RMID-352176 @Priority=P1 @ChargeCapture
  Scenario Outline: Validating the behavior by selecting Multiple ICDs from the charge capture screen
    Given Provider "Willis, Sam" is logged into eClinicalMobile using valid credentials
    Then Provider should be successfully landed on the "eClinicalMobile" Screen
    When Taps on 'Schedule' on the Dashboard Screen
    Then "Schedule" screen displays when clicked on Schedule button
    Then List of appointments should be visible on the 'Schedule' Screen
    When Taps on first appointment on the Schedule Screen
    Then "Patient Hub" screen displays
    When Taps on 'New Charge Capture' on the Patient Hub Screen
    Then "Charge Capture" screen displays when clicked on Charge Capture button
    When Click on Add button inline to ICD on 'Charge Capture' Screen
    #Then "ADD ICD" screen displays
    When Click on Contains on 'ADD ICD/CPT' Screen
    When Click on search bar through name on 'ADD ICD/CPT' Screen
    When Enter "Cough" on search bar on 'ADD ICD/CPT' Screen
    Then List of of ICD codes based on the entered search criteria should be visible on the 'ADD ICD' Screen
    When Taps on "<icdDesc1>" text
    When Taps on "<icdDesc2>" text
    When Taps on "<icdDesc3>" text
    Then "<count>" count should display
    When Click on Apply button on 'ADD ICD' Screen
    Then "Charge Capture" screen displays when clicked on Charge Capture button
    Then User should able to view added "<icdDesc1>" on 'Charge Capture' Screen
    Then User should able to view added "<icdDesc2>" on 'Charge Capture' Screen
    Then User should able to view added "<icdDesc3>" on 'Charge Capture' Screen

    Examples:
      | icdDesc1       | icdDesc2 | icdDesc3 | count |
      | Allergic cough | Cough    | Hiccough | 3     |

