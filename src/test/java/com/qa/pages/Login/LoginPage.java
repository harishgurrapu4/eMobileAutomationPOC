package com.qa.pages.Login;
import com.qa.pages.BasePage;
import com.qa.utils.TestUtils;
import io.appium.java_client.pagefactory.AndroidFindBy;
import io.appium.java_client.pagefactory.iOSXCUITFindBy;
import org.openqa.selenium.WebElement;
public class LoginPage extends BasePage {
    TestUtils utils = new TestUtils();

    @AndroidFindBy (id = "com.ecw.emobile.dev:id/loginUsername")
    @iOSXCUITFindBy (id = "UserName")
    private WebElement usernameTxtFld;

    @AndroidFindBy (id = "com.ecw.emobile.dev:id/loginPassword")
    @iOSXCUITFindBy (id = "Password")
    private WebElement passwordTxtFld;

    @AndroidFindBy (id = "com.ecw.emobile.dev:id/loginButton")
    @iOSXCUITFindBy (id = "Loginbutton")
    private WebElement loginBtn;

    @AndroidFindBy (id = "com.ecw.emobile.dev:id/secuirityAnswer")
    @iOSXCUITFindBy (id = "Security Answer")
    private WebElement securityTxtFld;

    @AndroidFindBy (id = "com.ecw.emobile.dev:id/continueBtn")
    @iOSXCUITFindBy (xpath = "//XCUIElementTypeButton[@name=\"Continue\"]")
    private WebElement continueBtn;

    @AndroidFindBy (id = "com.ecw.emobile.dev:id/pinSignOut")
    @iOSXCUITFindBy (xpath = "//XCUIElementTypeButton[@name=\"Sign Out\"]")
    private WebElement signOutBtn;

    @AndroidFindBy (xpath = "settingOptionBtn")
    @iOSXCUITFindBy (xpath = "//XCUIElementTypeButton[@name=\"Sign Out\"]")
    private WebElement settingsBtn;

    @AndroidFindBy (xpath = "//android.view.ViewGroup[@content-desc=\"test-Error message\"]/android.widget.TextView")
    @iOSXCUITFindBy (xpath = "//XCUIElementTypeOther[@name=\"test-Error message\"]/child::XCUIElementTypeStaticText")
    private WebElement errTxt;

    public LoginPage(){
    }

    /*
     * @author Harish Gurrapu
     * @since 19 Jan 2024
     * @description enter username
     */
    public LoginPage enterUserName(String username) throws InterruptedException {
        waitForVisibility(usernameTxtFld);
        clear(usernameTxtFld);
        sendKeys(usernameTxtFld, username, "login with " + username);
        return this;
    }

    /*
     * @author Harish Gurrapu
     * @since 19 Jan 2024
     * @description enter password
     */
    public LoginPage enterPassword(String password) {
        clear(passwordTxtFld);
        sendKeys(passwordTxtFld, password, "password is " + password);
        return this;
    }

    /*
     * @author Harish Gurrapu
     * @since 19 Jan 2024
     * @description click On Login
     */
    public LoginPage clickOnLogin() {
        click(loginBtn);
        return this;
    }

    /*
     * @author Harish Gurrapu
     * @since 19 Jan 2024
     * @description enter security question
     */
    public LoginPage enterSecurityQuestion(String answer) throws InterruptedException {
        waitForVisibility(securityTxtFld);
        if(securityTxtFld.isDisplayed() ) {
            sendKeys(securityTxtFld, answer, "answer is " + answer);
        }
        return this;
    }

    /*
     * @author Harish Gurrapu
     * @since 19 Jan 2024
     * @description click On Login
     */
    public LoginPage clickOnContinue() {
        click(continueBtn);
        return this;
    }

    /*
     * @author Harish Gurrapu
     * @since 19 Jan 2024
     * @description click On Login
     */
    public Boolean signOutExist() {
        return signOutBtn.isDisplayed();
    }

    /*
     * @author Harish Gurrapu
     * @since 19 Jan 2024
     * @description click On Login
     */
    public LoginPage clickOnSignOut() {
        click(signOutBtn);
        return this;
    }

    /*
     * @author Harish Gurrapu
     * @since 19 Jan 2024
     * @description get error text
     * @return String
     */
    public String getErrTxt() {
        String err = getText(errTxt, "error text is - ");
        return err;
    }
}
