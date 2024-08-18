package com.qa.stepdef.ChargeCapture;

import com.qa.pages.ChargeCapture.ChargeCapturePage;
import com.qa.pages.Schedule.PatientHubPage;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;

public class ChargeCaptureScreenStepDef {

    @When("^Taps on 'Charge Capture' on the Dashboard Screen$")
    public void clickOnChargeCapture() {
        new ChargeCapturePage().clickOnChargeCapture();
    }

    @Then("^\"([^\\\"]*)\" screen displays when clicked on Charge Capture button$")
    public void screenDisplayAssert(String text) {
        org.testng.Assert.assertEquals(new ChargeCapturePage().getChargeCapture(), text);
    }

    @When("^Enter \"([^\\\"]*)\" on text field 'First Name'$")
    public void enterIntoTextFieldFirstName(String text) throws InterruptedException {
        new ChargeCapturePage().enterTextInFirstName(text);
    }

    @When("^Enter \"([^\\\"]*)\" on text field 'Last Name'$")
    public void enterIntoTextFieldLastName(String text) throws InterruptedException {
        new ChargeCapturePage().enterTextInLastName(text);
    }

    @When("^Click on Add Patient button on 'Rounding List' Screen$")
    public void tapOnAddPatient() throws InterruptedException {
        new ChargeCapturePage().clickOnAddPatient();
    }

    @When("^Click on Add Charge button on 'Rounding List' Screen$")
    public void tapOnAddCharge() throws InterruptedException {
        new ChargeCapturePage().clickOnAddCharge();
    }

    @When("^Click on Male button on 'Patient Lookup' Screen$")
    public void tapOnMaleButton() throws InterruptedException {
        new ChargeCapturePage().clickOnMaleGender();
    }

    @When("^Click on Search button on 'Patient Lookup' Screen$")
    public void tapOnSearchButton() throws InterruptedException {
        new ChargeCapturePage().clickOnSearchPatientLookup();
    }

    @When("^Click on Save to add patient on 'Rounding List'$")
    public void tapOnSaveToAddRoundingList() throws InterruptedException {
        new ChargeCapturePage().clickOnSaveBtnAddRoundingList();
    }

    @Then("^\"([^\\\"]*)\" patient should display on 'Rounding List' Screen$")
    public void patientDisplayRoundingListAssert(String patientName) {
        Assert.assertTrue(new ChargeCapturePage().verifyPatientNameRoundingList(patientName));
    }

    @When("^Click on Add button inline to ICD on 'Charge Capture' Screen$")
    public void tapOnAddIcdChargeCapture() throws InterruptedException {
        new ChargeCapturePage().clickOnAddICD();
    }

    @When("^Click on Add button inline to CPT on 'Charge Capture' Screen$")
    public void tapOnAddCptChargeCapture() throws InterruptedException {
        new ChargeCapturePage().clickOnAddCPT();
    }

    @When("^Click on Contains on 'ADD ICD/CPT' Screen$")
    public void tapOnContainsOnADDICD() throws InterruptedException {
        new ChargeCapturePage().clickOnContainsOnADDICD();
    }

    @When("^Click on search bar through name on 'ADD ICD/CPT' Screen$")
    public void tapOnSearchBarNameOnADDICD() throws InterruptedException {
        new ChargeCapturePage().clickOnSearchBarNameAssessment();
    }

    @When("^Click on search bar through code on 'ADD ICD/CPT' Screen$")
    public void tapOnSearchBarCodeOnADDICD() throws InterruptedException {
        new ChargeCapturePage().clickOnSearchBarCodeAssessment();
    }

    @When("^Enter \"([^\\\"]*)\" on search bar on 'ADD ICD/CPT' Screen$")
    public void enterOnSearchBarOnADDICD(String text) {
        new ChargeCapturePage().enterTextOnSearchBarAssessment(text);
    }

    @Then("^List of of ICD codes based on the entered search criteria should be visible on the 'ADD ICD' Screen$")
    public void verifyICDCodesList() throws InterruptedException {
        new ChargeCapturePage().verifyICDCodesList();
    }

    @When("^Taps on \"([^\\\"]*)\" on 'ADD ICD' Screen$")
    public void tapOnICDCodeToSelect() throws InterruptedException {
        new ChargeCapturePage().clickOnSearchBarNameAssessment();
    }

    @Then("^\"([^\\\"]*)\" count should display$")
    public void getICDCount(String text) throws InterruptedException {
        Assert.assertEquals(new ChargeCapturePage().getICDCount(),text);
    }

    @When("^Taps on 'Edit' on the Charge Capture Screen$")
    public void tapOnEditOnChargeCapture() throws InterruptedException {
        new ChargeCapturePage().clickOnEditBtn();
    }

    @When("^Enter \"([^\\\"]*)\" on text field 'Room Number'$")
    public void enterIntoTextFieldRoomNumber(String text) throws InterruptedException {
        new ChargeCapturePage().enterTextInRoomNo(text);
    }

    @When("^Taps on 'Discharge Date' on the Charge Capture Screen$")
    public void tapOnDischargeDateOnChargeCapture() throws InterruptedException {
        new ChargeCapturePage().clickOnDischargeDate();
    }

    @When("^Taps on Add to Rounding List radio button on 'Charge Capture' Screen$")
    public void tapOnAddToRoundingList() throws Exception {
        new ChargeCapturePage().clickOnAddToRoundingListRadioButton();
    }

    @When("^Taps on Billing Notes on 'Charge Capture' Screen$")
    public void tapOnBillingNotes() throws Exception {
        new ChargeCapturePage().clickOnBillingNotesTextView();
    }

    @When("^Enter \"([^\\\"]*)\" on Billing Notes on 'Charge Capture' Screen$")
    public void enterOnBillingNotes(String text) {
        new ChargeCapturePage().enterTextOnBillingNotesTextview(text);
    }

    @When("^Click on Apply button on 'ADD ICD' Screen$")
    public void tapOnApplyBtnOnADDICD() throws InterruptedException {
        new ChargeCapturePage().clickOnApplyBtn();
    }

    @When("^Click on Link button to link added ICD$")
    public void tapOnLinkBtnToADDICD() throws InterruptedException {
        new ChargeCapturePage().clickOnLinkBtn();
    }

    @When("^Click on first cpt 'i' icon on Charge Capture$")
    public void tapOnFirstInfoBtnOnCPT() throws InterruptedException {
        new ChargeCapturePage().clickOnFirstInfoBtnCPT();
    }

    @When("^Click on second cpt 'i' icon on Charge Capture$")
    public void tapOnSecondInfoBtnOnCPT() throws Exception {
        new ChargeCapturePage().clickOnSecondInfoBtnCPT();
    }

    @When("^Click on third cpt 'i' icon on Charge Capture$")
    public void tapOnThirdInfoBtnOnCPT() throws Exception {
        new ChargeCapturePage().clickOnThirdInfoBtnCPT();
    }

    @Then("^User should able to view Pop up on 'Charge Capture' Screen$")
    public void verifyInfoPopUp() throws InterruptedException {
        new ChargeCapturePage().verifyInfoPopUp();
    }

    @When("^Taps on M1 on info popup$")
    public void tapOnM1() throws InterruptedException {
        new ChargeCapturePage().clickOnM1TextField();
    }

    @When("^Enter \"([^\\\"]*)\" on M1 on info popup$")
    public void enterOnM1(String text) {
        new ChargeCapturePage().enterTextOnM1TextField(text);
    }

    @When("^Enter \"([^\\\"]*)\" on M2 on info popup$")
    public void enterOnM2(String text) {
        new ChargeCapturePage().enterTextOnM2TextField(text);
    }

    @When("^Enter \"([^\\\"]*)\" on M3 on info popup$")
    public void enterOnM3(String text) {
        new ChargeCapturePage().enterTextOnM3TextField(text);
    }

    @When("^Taps on Start Date on info popup$")
    public void tapOnStartDate() throws InterruptedException {
        new ChargeCapturePage().clickOnStartDateTextField();
    }

    @When("^Taps on End Date on info popup$")
    public void tapOnStopDate() throws InterruptedException {
        new ChargeCapturePage().clickOnEndDateTextField();
    }

    @When("^Taps on Done button on info popup$")
    public void tapOnDoneBtn() throws InterruptedException {
        new ChargeCapturePage().clickOnDoneBtn();
    }

    @Then("^User should able to view 'Cancel' and 'Done' button on info popup$")
    public void verifyCanceDoneBtnOnInfoPopup(){
        new ChargeCapturePage().verifyCancelDoneBtnOnInfoPopup();
    }

    @Then("^User should able to view added \"([^\\\"]*)\" on 'Charge Capture' Screen$")
    public void verifyAddedICD(String text) throws InterruptedException {
        Assert.assertTrue(new ChargeCapturePage().verifyText(text));
    }
}
