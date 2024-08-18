@test
Feature: EA-80944 RMID-15432 Validating the login functionality for the provider user with the correct set of emobile credentials set from emr

  @harishg @C4 @EA-80944 @RMID-15432 @Priority=P3 @Login @IntegrationTesting
  Scenario: Validating the login functionality for the provider user with the correct set of emobile credentials set from emr
    Given Provider "Willis, Sam" is logged into eClinicalMobile using valid credentials
    Then Provider should be successfully landed on the "eClinicalMobile" Screen
