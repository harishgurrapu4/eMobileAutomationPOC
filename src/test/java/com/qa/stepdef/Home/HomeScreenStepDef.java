package com.qa.stepdef.Home;

import com.qa.pages.Home.HomePage;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;

public class HomeScreenStepDef {

    @Then("^Provider should be successfully landed on the \"([^\\\"]*)\" Screen$")
    public void verifyDashboardText(String text) throws InterruptedException {
        Assert.assertEquals(new HomePage().geteclinicalMobile(), text);
    }

    @When("^Taps on 'Schedule' on the Dashboard Screen$")
    public void clickOnSchedule() {
        new HomePage().clickOnSchedule();
    }
    @When("^Taps on 'Tel/Web Encounters' on the Dashboard Screen$")
    public void clickOnTelWebEncounters() {
        new HomePage().clickOnTelWebEncounters();
    }

    @When("^Taps on 'Labs/Imaging' on the Dashboard Screen$")
    public void tapsOnLabsImaging() {
        new HomePage().clickOnLabsImaging();
    }

    @When("^Taps on 'Review Progress Notes' on the Dashboard Screen$")
    public void tapsOnReviewProgressNotes() {
        new HomePage().clickOnReviewProgressNotes();
    }

    @When("^Taps on 'Swipe Button' on the Dashboard Screen to land on Settings$")
    public void clickOnSwipeButton() {
        new HomePage().clickOnSwipeButtonToSettings();
    }
}
