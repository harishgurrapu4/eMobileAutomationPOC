@test1
Feature: RMID-352214 Validating the behavior by selecting Multiple CPTs from the charge capture screen

  @harishg @C4 @RMID-352214 @Priority=P1 @ChargeCapture
  Scenario Outline: Validating the behavior by selecting Multiple CPTs from the charge capture screen
    Given Provider "Willis, Sam" is logged into eClinicalMobile using valid credentials
    Then Provider should be successfully landed on the "eClinicalMobile" Screen
    When Taps on 'Schedule' on the Dashboard Screen
    Then "Schedule" screen displays when clicked on Schedule button
    Then List of appointments should be visible on the 'Schedule' Screen
    When Taps on first appointment on the Schedule Screen
    Then "Patient Hub" screen displays
    When Taps on 'New Charge Capture' on the Patient Hub Screen
    Then "Charge Capture" screen displays when clicked on Charge Capture button
    When Click on Add button inline to CPT on 'Charge Capture' Screen
    #Then "ADD CPT" screen displays
    When Click on Contains on 'ADD ICD/CPT' Screen
    When Click on search bar through name on 'ADD ICD/CPT' Screen
    When Enter "G" on search bar on 'ADD ICD/CPT' Screen
    Then List of of ICD codes based on the entered search criteria should be visible on the 'ADD ICD' Screen
    When Taps on "<cptCode1>" text
    When Taps on "<cptCode2>" text
    When Taps on "<cptCode3>" text
    Then "<count>" count should display
    When Click on Apply button on 'ADD ICD' Screen
    Then "Charge Capture" screen displays when clicked on Charge Capture button
    Then User should able to view added "<cptCode1>" on 'Charge Capture' Screen
    Then User should able to view added "<cptCode2>" on 'Charge Capture' Screen
    Then User should able to view added "<cptCode3>" on 'Charge Capture' Screen

    Examples:
      | cptCode1 | cptCode2 | cptCode3 | count |
      | 94013    | M1209    | S3831    | 3     |
