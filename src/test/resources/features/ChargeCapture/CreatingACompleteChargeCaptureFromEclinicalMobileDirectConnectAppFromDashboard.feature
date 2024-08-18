@test4
Feature: RMID-352517 Creating a complete charge capture from eclinical Mobile Direct Connect app from dashboard

  @harishg @C4 @RMID-352517 @Priority=P1 @ChargeCapture
  Scenario Outline: Creating a complete charge capture from eclinical Mobile Direct Connect app from dashboard
    Given Provider "Willis, Sam" is logged into eClinicalMobile using valid credentials
    Then Provider should be successfully landed on the "eClinicalMobile" Screen
    When Taps on 'Charge Capture' on the Dashboard Screen
    Then "Rounding List" screen displays
    When Click on Add Charge button on 'Rounding List' Screen
    Then "Patient Lookup" screen displays
    When Click on Male button on 'Patient Lookup' Screen
    When Enter "<lastName>" on text field 'Last Name'
    When Enter "<firstName>" on text field 'First Name'
    When Click on Search button on 'Patient Lookup' Screen
    Then "Patient Lookup" screen displays
    Then List of patients should be visible
    When Taps on first patient from the list
    Then "Charge Capture" screen displays when clicked on Charge Capture button
    When Click on Add button inline to ICD on 'Charge Capture' Screen
    #Then "ADD ICD" screen displays
    When Click on Contains on 'ADD ICD/CPT' Screen
    When Click on search bar through name on 'ADD ICD/CPT' Screen
    When Enter "Cough" on search bar on 'ADD ICD/CPT' Screen
    Then List of of ICD codes based on the entered search criteria should be visible on the 'ADD ICD' Screen
    When Taps on "<icdDesc>" text
    Then "<count>" count should display
    When Click on Apply button on 'ADD ICD' Screen
    Then "Charge Capture" screen displays when clicked on Charge Capture button
    Then User should able to view added "<icdDesc>" on 'Charge Capture' Screen
    When Click on Add button inline to CPT on 'Charge Capture' Screen
    #Then "ADD CPT" screen displays
    When Click on Contains on 'ADD ICD/CPT' Screen
    When Click on search bar through name on 'ADD ICD/CPT' Screen
    When Enter "G" on search bar on 'ADD ICD/CPT' Screen
    Then List of of ICD codes based on the entered search criteria should be visible on the 'ADD ICD' Screen
    When Taps on "<cptCode>" text
    Then "<count>" count should display
    When Click on Apply button on 'ADD ICD' Screen
    Then "Charge Capture" screen displays when clicked on Charge Capture button
    Then User should able to view added "<cptCode>" on 'Charge Capture' Screen
    When Taps on Billing Notes on 'Charge Capture' Screen
    When Enter "test" on Billing Notes on 'Charge Capture' Screen
    When Taps on "Save & Done" text
    #Then User should able to view "<alertMsg>"
    When Taps on "OK" alert button
    Then "Rounding List" screen displays

    Examples:
      | icdDesc        | cptCode | count | alertMsg                                       | lastName | firstName |
      | Allergic cough | 94013   | 1     | Charge capture information saved successfully. | Navarro  | Jason     |
