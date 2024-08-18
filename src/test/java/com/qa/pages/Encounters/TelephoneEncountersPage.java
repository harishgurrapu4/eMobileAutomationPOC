package com.qa.pages.Encounters;

import com.qa.pages.BasePage;
import com.qa.utils.GlobalParams;
import io.appium.java_client.pagefactory.AndroidFindBy;
import io.appium.java_client.pagefactory.iOSXCUITFindBy;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class TelephoneEncountersPage extends BasePage {


    @AndroidFindBy(id = "com.ecw.emobile.dev:id/sherlockTitlemain")
    @iOSXCUITFindBy(xpath = "//XCUIElementTypeStaticText[@name=\"Encounters\"]")
    private WebElement encountersTxt;
    @AndroidFindBy(id = "com.ecw.emobile.dev:id/encountersLV")
    @iOSXCUITFindBy(xpath = "//XCUIElementTypeTable[@name=\"encouterList_tbl\"]")
    private WebElement telencountersTable;

    @AndroidFindBy(id = "com.ecw.emobile.dev:id/tvPatientName")
    @iOSXCUITFindBy(xpath = "//XCUIElementTypeButton[@name=\"patientName\"]")
    private WebElement firstpatientNameEncountersTxt;

    @AndroidFindBy(id = "com.ecw.emobile.dev:id/encDTime")
    @iOSXCUITFindBy(xpath = "//XCUIElementTypeScrollView/XCUIElementTypeOther[2]//XCUIElementTypeStaticText[1]")
    private WebElement dateTimeEncountersTxt;

    @AndroidFindBy(id = "com.ecw.emobile.dev:id/encDAddressed")
    @iOSXCUITFindBy(xpath = "//XCUIElementTypeButton[@name=\"mark_addressed_btn\"]")
    private WebElement markAsAddressedBtn;

    @AndroidFindBy(id = "com.ecw.emobile.dev:id/encAssignTo")
    @iOSXCUITFindBy(xpath = "//XCUIElementTypeButton[@name=\"reassign_to_btn\"]")
    private WebElement reassignToBtn;

    @AndroidFindBy(id = "com.ecw.emobile.dev:id/tvRightDetailText")
    @iOSXCUITFindBy(xpath = "//XCUIElementTypeButton[@name=\"show_pn_btn\"]")
    private WebElement showPNBtn;

    @AndroidFindBy(xpath = "//android.widget.TextView[@resource-id=\"com.ecw.emobile.dev:id/encountersName\" and @text=\"Addington, Winston\"]")
    @iOSXCUITFindBy(xpath = "//XCUIElementTypeTable[@name=\"encouterList_tbl\"]//XCUIElementTypeCell[1]//XCUIElementTypeStaticText[1]")
    private WebElement firstTelEncounter;

    @AndroidFindBy(id = "com.ecw.emobile.dev:id/encDNewActionAutoComplete")
    @iOSXCUITFindBy(xpath = "//XCUIElementTypeTextView[@name=\"action_suggestion_view\"]")
    private WebElement newactiontextview;

    @AndroidFindBy(id = "com.ecw.emobile.dev:id/sherlockTitlemain")
    @iOSXCUITFindBy(xpath = "//XCUIElementTypeScrollView/XCUIElementTypeOther[3]//XCUIElementTypeStaticText[2]")
    private WebElement actionTakenText;

    @AndroidFindBy(id = "com.ecw.emobile.dev:id/btnEncDetailSave")
    @iOSXCUITFindBy(xpath = "//XCUIElementTypeButton[@name=\"enc_save_btn\"]")
    private WebElement savetelEnc;

    GlobalParams params = new GlobalParams();
    String platformName = params.getPlatformName();

    /*
     * @author Harish Gurrapu
     * @since 19 Jan 2024
     * @description get error text
     * @return String
     */
    public String getEncountersTitle() {
        waitForVisibility(encountersTxt);
        String text = getText(encountersTxt, "Screen Displayed is - ");
        return text;
    }


    /*
     * @author Harish Gurrapu
     * @since 19 Jan 2024
     * @description get error text
     * @return String
     */
    public TelephoneEncountersPage verifyTelEncountersList() {
        waitForVisibility(telencountersTable);
        return this;
    }

    /*
     * @author Harish Gurrapu
     * @since 5 Jun 2024
     * @description get encounter patient Name
     * @return String
     */
    public String getfirstEncountersPatientName() {
        waitForVisibility(firstpatientNameEncountersTxt);
        String text = getText(firstpatientNameEncountersTxt, "text is - ");
        return text;
    }

    /*
     * @author Harish Gurrapu
     * @since 5 Jun 2024
     * @description verify buttons on encounter
     * @return String
     */
    public Boolean verifyButtonsOnEncounter() {
        return markAsAddressedBtn.isDisplayed() &&  reassignToBtn.isDisplayed() && showPNBtn.isDisplayed() && savetelEnc.isDisplayed();
    }

    /*
     * @author Harish Gurrapu
     * @since 5 Jun 2024
     * @description get encounter date time
     * @return String
     */
    public String getEncountersDateTime() {
        waitForVisibility(dateTimeEncountersTxt);
        String text = getText(dateTimeEncountersTxt, "text is - ");
        return text;
    }

    /*
     * @author Harish Gurrapu
     * @since 19 Jan 2024
     * @description click on first encounter
     * @return String
     */
    public TelephoneEncountersPage clickOnFirstTelEncounter() {
        waitForVisibility(firstTelEncounter);
        click(firstTelEncounter);
        return this;
    }

    /*
     * @author Harish Gurrapu
     * @since 19 Jan 2024
     * @description click on first encounter
     * @return String
     */
    public TelephoneEncountersPage clickOnPatientTelWebEncounter(String patientName) throws InterruptedException {
        String platformName = new GlobalParams().getPlatformName();
        if (platformName.equals("Android")) {
            WebElement element = driver.findElement(By.xpath("//android.widget.TextView[@resource-id=\"com.ecw.emobile.dev:id/encountersName\" and @text='" + patientName + "']"));
            waitForVisibility(element);
            click(element, "");
        } else if (platformName.equals("iOS")) {
            WebElement element = driver.findElement(By.xpath("//XCUIElementTypeTable[@name=\"encouterList_tbl\"]//XCUIElementTypeCell//XCUIElementTypeStaticText[@name='" + patientName + "']"));
            click(element, "");
        }
        return this;
    }


    /*
     * @author Harish Gurrapu
     * @since 19 Jan 2024
     * @description get error text
     * @return String
     */
    public TelephoneEncountersPage clickOnNewActionTextView() {
        waitForVisibility(newactiontextview);
        click(newactiontextview);
        return this;
    }

    /*
     * @author Harish Gurrapu
     * @since 19 Jan 2024
     * @description enter username
     */
    public TelephoneEncountersPage enterNewAction(String text) {
        sendKeys(newactiontextview, text);
        hideKeyboard();
        return this;
    }

    /*
     * @author Harish Gurrapu
     * @since 19 Jan 2024
     * @description get error text
     * @return String
     */
    public String getNewActionText() {
        waitForVisibility(newactiontextview);
        String text = newactiontextview.getText();
        return text;
    }

    /*
     * @author Harish Gurrapu
     * @since 19 Jan 2024
     * @description get error text
     * @return String
     */
    public TelephoneEncountersPage clickOnSaveTelEncounter() {
        if(platformName.equals("Android")){
            Scroll("Save");
        }
        else {
            iOSScrollToElementUsingMobileScroll(savetelEnc);
        }
        waitForVisibility(savetelEnc);
        click(savetelEnc);
        return this;
    }

    /*
     * @author Harish Gurrapu
     * @since 19 Jan 2024
     * @description get error text
     * @return String
     */
    public Boolean getActionTakenText(String data) {
        waitForVisibility(actionTakenText);
        String text = getText(actionTakenText, "text is - ");
        return text.contains(data);
    }
}
