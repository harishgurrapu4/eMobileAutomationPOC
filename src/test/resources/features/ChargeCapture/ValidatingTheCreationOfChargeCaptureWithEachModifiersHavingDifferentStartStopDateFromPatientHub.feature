@test4
Feature: RMID-352205 Validating the creation of charge capture with each modifiers having different start or stop date from patient hub

  @harishg @C4 @RMID-352205 @Priority=P1 @ChargeCapture
  Scenario Outline: Validating the creation of charge capture with each modifiers having different start or stop date from patient hub
    Given Provider "Willis, Sam" is logged into eClinicalMobile using valid credentials
    Then Provider should be successfully landed on the "eClinicalMobile" Screen
    When Taps on 'Schedule' on the Dashboard Screen
    Then "Schedule" screen displays when clicked on Schedule button
    Then List of appointments should be visible on the 'Schedule' Screen
    When Taps on first appointment on the Schedule Screen
    Then "Patient Hub" screen displays
    When Taps on 'New Charge Capture' on the Patient Hub Screen
    Then "Charge Capture" screen displays when clicked on Charge Capture button
    When Taps on 'Edit' on the Charge Capture Screen
    When Enter "<roomNo>" on text field 'Room Number'
    When Taps on 'Discharge Date' on the Charge Capture Screen
    When Taps on "Done" alert button
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
    When Click on Link button to link added ICD
    When Click on first cpt 'i' icon on Charge Capture
    Then User should able to view Pop up on 'Charge Capture' Screen
    When Taps on M1 on info popup
    When Enter "1" on M1 on info popup
    When Enter "1" on M2 on info popup
    When Enter "1" on M3 on info popup
    When Taps on Start Date on info popup
    When Taps on "Done" alert button
    When Taps on End Date on info popup
    When Taps on "Done" alert button
    Then User should able to view 'Cancel' and 'Done' button on info popup
    When Taps on Done button on info popup
    When Click on second cpt 'i' icon on Charge Capture
    Then User should able to view Pop up on 'Charge Capture' Screen
    When Enter "1" on M1 on info popup
    When Enter "1" on M2 on info popup
    When Enter "1" on M3 on info popup
    When Taps on Start Date on info popup
    When Taps on "Done" alert button
    When Taps on End Date on info popup
    When Taps on "Done" alert button
    Then User should able to view 'Cancel' and 'Done' button on info popup
    When Taps on Done button on info popup
    When Click on third cpt 'i' icon on Charge Capture
    Then User should able to view Pop up on 'Charge Capture' Screen
    When Enter "1" on M1 on info popup
    When Enter "1" on M2 on info popup
    When Enter "1" on M3 on info popup
    When Taps on Start Date on info popup
    When Taps on "Done" alert button
    When Taps on End Date on info popup
    When Taps on "Done" alert button
    Then User should able to view 'Cancel' and 'Done' button on info popup
    When Taps on Done button on info popup
    When Taps on Billing Notes on 'Charge Capture' Screen
    When Enter "test" on Billing Notes on 'Charge Capture' Screen
    When Taps on "Save & Done" text
    #Then User should able to view "<alertMsg>"
    When Taps on "OK" alert button
    Then "Patient Hub" screen displays

    Examples:
      | icdDesc1       | icdDesc2 | icdDesc3 | count | cptCode1 | cptCode2 | cptCode3 | roomNo | alertMsg                                       |
      | Allergic cough | Cough    | Hiccough | 3     | 94013    | M1209    | S3831    | 502    | Charge capture information saved successfully. |
