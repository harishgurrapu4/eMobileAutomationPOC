package com.qa.pages.Home;

import com.qa.pages.BasePage;
import com.qa.pages.Settings.SettingsPage;
import com.qa.utils.GlobalParams;
import io.appium.java_client.pagefactory.AndroidFindBy;
import io.appium.java_client.pagefactory.iOSXCUITFindBy;
import org.openqa.selenium.WebElement;

public class HomePage extends BasePage {

    @AndroidFindBy(id = "com.ecw.emobile.dev:id/sherlockTitlemain")
    @iOSXCUITFindBy(xpath = "//XCUIElementTypeStaticText[@name=\"eClinicalMobile\"]")
    private WebElement eclinicalMobile;

    @AndroidFindBy(id = "com.ecw.emobile.dev:id/schedule")
    @iOSXCUITFindBy(xpath = "//XCUIElementTypeStaticText[@name=\"celltitle\" and @label=\"Schedule\"]")
    private WebElement schedule;

    @AndroidFindBy(id = "com.ecw.emobile.dev:id/encounter")
    @iOSXCUITFindBy(xpath = "//XCUIElementTypeStaticText[@name=\"celltitle\" and @label=\"Tel/Web Encounters\"]")
    private WebElement telwebencounters;

    @AndroidFindBy(id = "com.ecw.emobile.dev:id/labs")
    @iOSXCUITFindBy(xpath = "//XCUIElementTypeStaticText[@name=\"celltitle\" and @label=\"Labs/Imaging\"]")
    private WebElement labsimaging;

    @AndroidFindBy(id = "com.ecw.emobile.dev:id/reviewPN")
    @iOSXCUITFindBy(xpath = "//XCUIElementTypeStaticText[@name=\"celltitle\" and @label=\"Review Progress Notes\"]")
    private WebElement reviewProgressNotes;

    @AndroidFindBy(id = "com.ecw.emobile.dev:id/settingOptionBtn")
    @iOSXCUITFindBy(xpath = "//XCUIElementTypeButton[@name=\"dashboard_settings_btn\"]")
    private WebElement dashboardSettingsBTN;

    @AndroidFindBy(id = "com.ecw.emobile.dev:id/settingBtn")
    @iOSXCUITFindBy(xpath = "//XCUIElementTypeButton[@name=\"dashboard_settings_btn\"]")
    private WebElement androiddashboardSettingsBTN;

    GlobalParams params = new GlobalParams();
    String platformName = params.getPlatformName();

    /*
     * @author Harish Gurrapu
     * @since 19 Jan 2024
     * @description get error text
     * @return String
     */
    public String geteclinicalMobile() {
        waitForVisibility(eclinicalMobile);
        String text = getText(eclinicalMobile, "text is - ");
        return text;
    }

    /*
     * @author Harish Gurrapu
     * @since 19 Jan 2024
     * @description get error text
     * @return String
     */
    public HomePage clickOnSchedule() {
        click(schedule);
        return this;
    }

    /*
     * @author Harish Gurrapu
     * @since 19 Jan 2024
     * @description get error text
     * @return String
     */
    public HomePage clickOnTelWebEncounters() {
        click(telwebencounters);
        return this;
    }

    /*
     * @author Harish Gurrapu
     * @since 19 Jan 2024
     * @description get error text
     * @return String
     */
    public HomePage clickOnLabsImaging() {
        click(labsimaging);
        return this;
    }

    /*
     * @author Harish Gurrapu
     * @since 19 Jan 2024
     * @description get error text
     * @return String
     */
    public HomePage clickOnReviewProgressNotes() {
        click(reviewProgressNotes);
        return this;
    }

    /*
     * @author Harish Gurrapu
     * @since 19 Jan 2024
     * @description get error text
     * @return String
     */
    public HomePage clickOnSwipeButtonToSettings() {
        if(platformName.equals("Android")){
            click(dashboardSettingsBTN);
            click(androiddashboardSettingsBTN);
        }
        else {
            waitForVisibility(dashboardSettingsBTN);
            click(dashboardSettingsBTN);
        }
        return this;
    }
}
