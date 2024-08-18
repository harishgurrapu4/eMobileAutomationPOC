package com.qa.stepdef.ReviewProgressNotes;

import com.qa.pages.Encounters.EncountersPage;
import com.qa.pages.LabsImaging.LabsImagingPage;
import com.qa.pages.ReviewProgressNotes.ReviewProgressNotesPage;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.testng.Assert;

public class ReviewProgressNotesStepDef {

    @Then("^\"([^\\\"]*)\" screen displays when clicked on Review Progress Notes button$")
    public void screenDisplayAssert(String text) {
        Assert.assertEquals(new ReviewProgressNotesPage().getReviewPNTitle(), text);
    }

    @Then("^List of Patients should be visible on the 'Review Progress Notes' Screen$")
    public void encounterListDisplay() throws InterruptedException {
        new ReviewProgressNotesPage().verifyReviewProgressNoteList();
    }

    @When("^Taps on first patient on the Review Progress Notes Screen$")
    public void tapOnFirstEncounter() {
        new ReviewProgressNotesPage().clickOnFirstReviewProgressNote();
    }

    @Then("^The Review Progress Notes should open up in read-only format$")
    public void verifyEncounterPageText() {
        new ReviewProgressNotesPage().verifyReviewProgressNotePageReadOnly();
    }
}
