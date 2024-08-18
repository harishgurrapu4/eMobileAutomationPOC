package com.qa.stepdef.LabsImaging;

import com.qa.pages.Encounters.TelephoneEncountersPage;
import com.qa.pages.LabsImaging.LabsImagingPage;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.testng.Assert;

public class LabsImagingStepDef {

    @Then("^\"([^\\\"]*)\" screen displays when clicked on Labs/Imaging button$")
    public void screenDisplayAssert(String text) {
        Assert.assertEquals(new LabsImagingPage().getLabsImagingTitle(), text);
    }

    @Then("^List of labs/imaging should be visible on the 'Labs/Imaging' Screen$")
    public void telencounterListDisplay() throws InterruptedException {
        new LabsImagingPage().verifyLabsImagingList();
    }
    @When("^Taps on first labs/imaging on the Labs/Imaging Screen$")
    public void tapOnFirstEncounter() {
        new LabsImagingPage().clickOnFirstLabsImaging();
    }

    @When("^Taps on notes textview on the Labs/Imaging Screen$")
    public void tapOnNewActionTextView() {
        new LabsImagingPage().clickOnNotesOnLabsImaging();
    }

    @When("^Enter \"([^\\\"]*)\" on notes textview on the Labs/Imaging Screen$")
    public void enterNewActionText(String text) {
        new LabsImagingPage().enterNotesOnLabsImaging(text);
    }

    @Then("^Verify \"([^\\\"]*)\" on notes textview on the Labs/Imaging Screen$")
    public void verifyNewActionText(String text) {
        Assert.assertEquals(new LabsImagingPage().getNotesOnLabsImaging(), text);
    }

    @When("^Taps on Save on the Labs/Imaging Screen$")
    public void tapOnSaveTelEncounter() {
        new LabsImagingPage().clickOnSaveLabsImaging();
    }
}
