package com.qa.stepdef.Encounter;

import com.qa.pages.BasePage;
import com.qa.pages.Encounters.EncountersPage;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.testng.Assert;

public class EncounterScreenStepDef {

//    @Then("^\"([^\\\"]*)\" screen displays when clicked on encounter")
//    public void patientHubScreenDisplayAssert(String text) {
//        Assert.assertEquals(new EncountersPage().getEncountersTxt(), text);
//    }

    @Then("^List of encounters should be visible on the 'Encounters' Screen$")
    public void encounterListDisplay() throws InterruptedException {
        new EncountersPage().verifyEncountersList();
    }

    @Then("^\"([^\\\"]*)\" visit type should display on Encounter screen")
    public void verifyEncounterDisplayAssert(String text) {
        Assert.assertEquals(new EncountersPage().verifyFirstEncounterVisitType(), text);
    }

    @Then("^'Current Date' as date of encounter in format 'DD MMM YYYY' should display on Encounter screen")
    public void verifyEncounterDateDisplayAssert() {
        Assert.assertEquals(new EncountersPage().verifyFirstEncounterDate(), new BasePage().getCurrentDate("dd MMM yyyy"));
    }

    @When("^Taps on first encounter on the Encounters Screen$")
    public void tapOnFirstEncounter() {
        new EncountersPage().clickOnFirstEncounter();
    }

    @Then("^The encounter should open up in read-only format$")
    public void verifyEncounterPageText() {
        new EncountersPage().verifyEncounterPageReadOnly();
    }

    @When("^Taps on refresh button on the Encounters Screen$")
    public void tapOnRefreshBtnEncounter() {
        new EncountersPage().clickOnRefreshBtnEncounter();
    }
}
