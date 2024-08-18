package com.qa.stepdef.Login;

import com.qa.pages.Login.LoginPage;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.openqa.selenium.NoSuchElementException;

public class LoginScreenStepDef {

    @Given("^(?:Provider|Staff)? \"([^\\\"]*)\" is logged into eClinicalMobile using valid credentials$")
    public void userLogin(String user) throws InterruptedException {
        switch (user){

            case "Willis, Sam" :
                try {
                    if(new LoginPage().signOutExist()) {
                        new LoginPage().clickOnSignOut();
                    }
                }
                catch (NoSuchElementException e) {
                    System.out.println(e);
                }
                new LoginPage().enterUserName("sam");
                new LoginPage().enterPassword("Password$1");
                new LoginPage().clickOnLogin();
//                new LoginPage().enterSecurityQuestion("boston");
//                new LoginPage().clickOnContinue();
                break;
            case "Hartman, Philip" :
                try {
                    if(new LoginPage().signOutExist()) {
                        new LoginPage().clickOnSignOut();
                    }
                }
                catch (NoSuchElementException e) {
                    throw new RuntimeException("SignOut button is not present");
                }
                new LoginPage().enterUserName("phillipt");
                new LoginPage().enterPassword("Atlantis@135");
                new LoginPage().clickOnLogin();
                new LoginPage().enterSecurityQuestion("boston");
                new LoginPage().clickOnContinue();
        }

    }
    @When("^Taps on Log In Button on Login Screen$")
    public void tapOnLogin() {
        new LoginPage().clickOnLogin();
    }

    @Then("^Enters the UserName as \"([^\\\"]*)\" in the username field$")
    public void iEnterUserNameAs(String username) throws InterruptedException {
        new LoginPage().enterUserName(username);
    }

    @When("^Enters the Password as \"([^\\\"]*)\" in the password field$")
    public void iEnterPasswordAs(String password) throws InterruptedException {
        new LoginPage().enterPassword(password);
    }
}
