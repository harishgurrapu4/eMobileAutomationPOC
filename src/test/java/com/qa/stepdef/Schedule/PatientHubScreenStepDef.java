package com.qa.stepdef.Schedule;

import com.qa.pages.Schedule.PatientHubPage;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.testng.Assert;

public class PatientHubScreenStepDef {

    @Then("^List of appointments should be visible on the 'Schedule' Screen$")
    public void verifyAppointmentList() throws InterruptedException {
        new PatientHubPage().verifyAppointmentList();
    }

    @Then("^\"([^\\\"]*)\" screen displays when clicked on Schedule button$")
    public void screenDisplayAssert(String text) {
        Assert.assertEquals(new PatientHubPage().getSchedule(), text);
    }

    @When("^Taps on first appointment on the Schedule Screen$")
    public void tapOnFirstAppt() {
        new PatientHubPage().clickOnFirstAppointment();
    }

//    @Then("^\"([^\\\"]*)\" screen displays when clicked on appointment$")
//    public void patientHubScreenDisplayAssert(String text) {
//        Assert.assertEquals(new PatientHubPage().getPatientHubTxt(), text);
//    }

    @When("^Taps on 'Encounters' on the Patient Hub Screen$")
    public void tapOnEncounter() throws InterruptedException {
        new PatientHubPage().clickOnEncounter();
    }

    @When("^Taps on 'New Charge Capture' on the Patient Hub Screen$")
    public void tapOnNewChargeCapture() throws Exception {
        new PatientHubPage().clickOnNewChargeCapture();
    }
}
