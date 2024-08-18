package com.qa.stepdef;

import com.qa.pages.BasePage;
import com.qa.pages.ChargeCapture.ChargeCapturePage;
import com.qa.pages.Schedule.PatientHubPage;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.junit.Assert;

public class CommonStepDef extends BasePage {

    @When("^Wait for a few seconds$")
    public void waitForSometime(WebElement element) throws InterruptedException {
        waitForVisibility(element);
    }
//    @When("^Taps on \"([^\\\"]*)\" text$")
//    public void tapOnText(WebElement element) {
//        click(element);
//    }

    @When("^Taps on \"([^\\\"]*)\" text$")
    public void tapOnText(String text) {
        clickOnTxt(text);
    }

    @When("^Taps on \"([^\\\"]*)\" button$")
    public void tapOnButton(String buttonName) {
        clickOnButton(buttonName);
    }

    @When("^Taps on \"([^\\\"]*)\" alert button$")
    public void tapOnAlertButton(String buttonName) throws InterruptedException {
        clickOnAlertButton(buttonName);
    }

    @When("^Enter \"([^\\\"]*)\" on text field \"([^\\\"]*)\"$")
    public void enterIntoTextField(String text, String textFieldName) throws InterruptedException {
        enterTextInTextField(text,textFieldName);
    }

    @Then("^List of patients should be visible$")
    public void verifyAppointmentList() throws InterruptedException {
        verifyPatientList();
    }

    @When("^Taps on first patient from the list$")
    public void tapOnPatientNameFromList() throws InterruptedException {
        clickOnFirstAppointmentFromList();
    }

    @Then("^\"([^\\\"]*)\" screen displays$")
    public void screenDisplayAssert(String text) throws InterruptedException {
        Assert.assertEquals(getNavigationBarTxt(),text);
    }

    @When("^Minimize the app instantly$")
    public void minimizaApp() throws InterruptedException {
        minimizeApp();
    }

    @Then("^User should able to view \"([^\\\"]*)\"$")
    public void verifyTextOnScreen(String text) throws InterruptedException {
        Assert.assertTrue(verifyText(text));
    }

    @When("^Taps on back button$")
    public void tapOnBackBtn() throws InterruptedException {
        clickOnBackButton();
    }
}

