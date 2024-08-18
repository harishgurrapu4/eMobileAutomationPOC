package com.qa.pages.Encounters;

import com.qa.pages.BasePage;
import io.appium.java_client.pagefactory.AndroidFindBy;
import io.appium.java_client.pagefactory.iOSXCUITFindBy;
import org.openqa.selenium.WebElement;

public class EncountersPage extends BasePage {

    @AndroidFindBy(id = "com.ecw.emobile.dev:id/sherlockTitleDetail")
    @iOSXCUITFindBy(xpath = "(//XCUIElementTypeStaticText[@name=\"Encounters\"])[1]")
    private WebElement encountersTxt;
    @AndroidFindBy(id = "com.ecw.emobile.dev:id/lvEncList")
    @iOSXCUITFindBy(xpath = "//XCUIElementTypeTable[@name=\"hub_encounters_tbl\"]")
    private WebElement encountersTable;

    @AndroidFindBy(xpath = "(//android.widget.TextView[@resource-id=\"com.ecw.emobile.dev:id/labReportResult\"])[1]")
    @iOSXCUITFindBy(xpath = "//XCUIElementTypeTable[@name=\"hub_encounters_tbl\"]//XCUIElementTypeCell[1]//XCUIElementTypeStaticText[2]")
    private WebElement firstEncounterVisitType;

    @AndroidFindBy(xpath = "(//android.widget.LinearLayout[@resource-id=\"com.ecw.emobile.dev:id/llLabReportDetails\"])[1]//android.widget.TextView[2]")
    @iOSXCUITFindBy(xpath = "//XCUIElementTypeTable[@name=\"hub_encounters_tbl\"]//XCUIElementTypeCell[1]//XCUIElementTypeStaticText[3]")
    private WebElement firstEncounterDate;

    @AndroidFindBy(id = "android:id/content")
    @iOSXCUITFindBy(id = "progressnotes_refresh_btn")
    private WebElement refreshPNBtn;

    @AndroidFindBy(id = "com.ecw.emobile.dev:id/rightSaveIcon")
    @iOSXCUITFindBy(xpath = "//XCUIElementTypeOther[@name=\"hub_encounter_mainview\"]")
    private WebElement encounterReadOnly;

    /*
     * @author Harish Gurrapu
     * @since 19 Jan 2024
     * @description get encounter title
     * @return String
     */
    public String getEncountersTxt() {
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
    public EncountersPage verifyEncountersList() {
        waitForVisibility(encountersTable);
        return this;
    }

    /*
     * @author Harish Gurrapu
     * @since 19 Jan 2024
     * @description get encounter visit type
     * @return String
     */
    public String verifyFirstEncounterVisitType() {
        waitForVisibility(firstEncounterVisitType);
        String text = getText(firstEncounterVisitType, "text is - ");
        return text;
    }

    /*
     * @author Harish Gurrapu
     * @since 19 Jan 2024
     * @description get encounter visit type
     * @return String
     */
    public String verifyFirstEncounterDate() {
        waitForVisibility(firstEncounterDate);
        String text = getText(firstEncounterDate, "text is - ");
        return text;
    }

    /*
     * @author Harish Gurrapu
     * @since 19 Jan 2024
     * @description clcick on first encounter
     */
    public EncountersPage clickOnFirstEncounter() {
        waitForVisibility(firstEncounterVisitType);
        click(firstEncounterVisitType);
        return this;
    }

    /*
     * @author Harish Gurrapu
     * @since 01 Jun 2024
     * @description click on refresh button
     */
    public EncountersPage clickOnRefreshBtnEncounter() {
        waitForVisibility(refreshPNBtn);
        click(refreshPNBtn);
        return this;
    }

    /*
     * @author Harish Gurrapu
     * @since 19 Jan 2024
     * @description get error text
     * @return String
     */
    public EncountersPage verifyEncounterPageReadOnly() {
        waitForVisibility(encounterReadOnly);
        return this;
    }
}
