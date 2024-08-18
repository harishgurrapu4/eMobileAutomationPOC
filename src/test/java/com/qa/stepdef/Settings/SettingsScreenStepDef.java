package com.qa.stepdef.Settings;

import com.qa.pages.Settings.SettingsPage;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;

public class SettingsScreenStepDef {

    @When("^Taps on the 'Add ICD Favorites' on 'Settings' Screen$")
    public void tapOnAddICDFavorites() throws InterruptedException {
        new SettingsPage().clickOnAddICDFavorites();
    }

    @When("^Taps on the 'Add CPT Favorites' on 'Settings' Screen$")
    public void tapOnAddCPTFavorites() throws InterruptedException {
        new SettingsPage().clickOnAddCPTFavorites();
    }

    @When("^Taps on the \"([^\\\"]*)\" on 'Add to ICD/CPT Favorites' Screen$")
    public void tapOnCPTOnAddCPTFavorites(String text) throws InterruptedException {
        new SettingsPage().clickOnFavoritesBtn(text);
    }

    @When("^Enter \"([^\\\"]*)\" on the search field of 'Add ICD/CPT Favorites' Screen$")
    public void enterOnAddICDFavoritesSearchField(String text) throws InterruptedException {
        new SettingsPage().enterICDOnSearchField(text);
    }

    @Then("^Verify the CPT is added as favorite$")
    public void verifyCPTAddedAsFavorite() throws InterruptedException {
        Assert.assertEquals(new SettingsPage().getIsFavoriteCPTValue(),"1");
    }

    @Then("^Verify the ICD is added as favorite$")
    public void verifyICDAddedAsFavorite() throws InterruptedException {
        Assert.assertEquals(new SettingsPage().getIsFavoriteICDValue(),"1");
    }

    @When("^Taps on the 'Save' on 'Add ICD Favorites' Screen$")
    public void tapOnSaveOnAddICDFavorites() throws InterruptedException {
        new SettingsPage().clickOnSaveOnAddICDFavorites();
    }
}
