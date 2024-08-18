package com.qa.stepdef.Encounter;

import com.qa.pages.Encounters.TelephoneEncountersPage;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.testng.Assert;

public class TelephoneEncounterScreenStepDef {

    @Then("^\"([^\\\"]*)\" screen displays when clicked on Tel/Web Encounters button$")
    public void screenDisplayAssert(String text) {
        Assert.assertEquals(new TelephoneEncountersPage().getEncountersTitle(), text);
    }

    @Then("^List of encounters should be visible on the 'Tel Encounters' Screen$")
    public void telencounterListDisplay() throws InterruptedException {
        new TelephoneEncountersPage().verifyTelEncountersList();
    }
    @When("^Taps on first telephone encounter on the Encounters Screen$")
    public void tapOnFirstEncounter() {
        new TelephoneEncountersPage().clickOnFirstTelEncounter();
    }

    @When("^Taps on \"([^\\\"]*)\" telephone/web encounter on the Encounters Screen$")
    public void tapOnPatientEncounter(String text) throws InterruptedException {
        new TelephoneEncountersPage().clickOnPatientTelWebEncounter(text);
    }

    @When("^Taps on New Action textview on the Encounters Screen$")
    public void tapOnNewActionTextView() {
        new TelephoneEncountersPage().clickOnNewActionTextView();
    }

    @When("^Enter \"([^\\\"]*)\" on New Action textview on the Encounters Screen$")
    public void enterNewActionText(String text) {
        new TelephoneEncountersPage().enterNewAction(text);
    }

    @Then("^Verify \"([^\\\"]*)\" on New Action textview on the Encounters Screen$")
    public void verifyNewActionText(String text) {
        Assert.assertEquals(new TelephoneEncountersPage().getNewActionText(), text);
    }

    @When("^Taps on Save on the Tel Encounters Screen$")
    public void tapOnSaveTelEncounter() {
        new TelephoneEncountersPage().clickOnSaveTelEncounter();
    }

    @Then("^\"([^\\\"]*)\" action taken content displays on Tel/Web Encounters")
    public void actionTakenTextDisplayAssert(String text) {
        Assert.assertTrue(new TelephoneEncountersPage().getActionTakenText(text));
    }

    @Then("^\"([^\\\"]*)\" patient should display on Tel/Web Encounters screen")
    public void getPatientNameOnEncounter(String text) {
        Assert.assertTrue(new TelephoneEncountersPage().getfirstEncountersPatientName().contains(text));
    }

    @Then("^\"([^\\\"]*)\" date and time should display on Tel/Web Encounters screen")
    public void getDateTimeOnEncounter(String text) {
        Assert.assertEquals(new TelephoneEncountersPage().getEncountersDateTime(), text);
    }

    @Then("^User should able to view 'Mark as Addresses','Reassign To','Show PN' and 'Save' button should display on Tel/Web Encounters screen")
    public void verifyButtonsOnEncounterScreen() {
        Assert.assertTrue(new TelephoneEncountersPage().verifyButtonsOnEncounter());
    }
}
