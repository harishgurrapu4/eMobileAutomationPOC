package com.qa.pages.Schedule;

import com.qa.pages.BasePage;
import com.qa.utils.GlobalParams;
import io.appium.java_client.pagefactory.AndroidFindBy;
import io.appium.java_client.pagefactory.iOSXCUITFindBy;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class PatientHubPage extends BasePage {

    GlobalParams params = new GlobalParams();
    @AndroidFindBy(id = "com.ecw.emobile.dev:id/sherlockTitlemain")
    @iOSXCUITFindBy(xpath = "(//XCUIElementTypeStaticText[@name=\"Schedule\"])[1]")
    private WebElement schedule;

    @AndroidFindBy(id = "com.ecw.emobile.dev:id/scheduleListView")
    @iOSXCUITFindBy(xpath = "//XCUIElementTypeTable[@name=\"tbllistview\"]")
    private WebElement appointmentTable;

    @AndroidFindBy(id = "com.ecw.emobile.dev:id/scheduleListName")
    @iOSXCUITFindBy(xpath = "(//XCUIElementTypeButton[@name=\"btn_patientname\"])[1]")
    private WebElement firstAppointment;

    @AndroidFindBy(id = "com.ecw.emobile.dev:id/scheduleListName")
    @iOSXCUITFindBy(xpath = "(//XCUIElementTypeButton[@name=\"btn_patientname\"])[1]/child::XCUIElementTypeStaticText")
    private WebElement firstAppointmentText;

    @AndroidFindBy(id = "com.ecw.emobile.dev:id/sherlockTitleDetail")
    @iOSXCUITFindBy(xpath = "//XCUIElementTypeStaticText[@name=\"Patient Hub\"]")
    private WebElement patientHubTxt;

    @AndroidFindBy(xpath = "//android.view.ViewGroup[@content-desc=\"test-Error message\"]/android.widget.TextView")
    @iOSXCUITFindBy(xpath = "//XCUIElementTypeNavigationBar/child::XCUIElementTypeStaticText")
    private WebElement navigationBarTxt;

    @AndroidFindBy(xpath = "com.ecw.emobile.dev:id/tvPatientName")
    @iOSXCUITFindBy(id = "patientName")
 //   @iOSXCUITFindBy(xpath = "//XCUIElementTypeButton[@name=\"patientName\"]")
    private WebElement patientNameTxt;

    @AndroidFindBy(xpath = "//android.widget.TextView[@resource-id=\"com.ecw.emobile.dev:id/featureTitle\" and @text=\"Encounters\"]")
    @iOSXCUITFindBy(xpath = "//XCUIElementTypeButton[@name=\"left_btn\" and @label=\"Hub tel web encounter\"]")
    private WebElement encounter;

    @AndroidFindBy(xpath = "//android.widget.TextView[@resource-id=\"com.ecw.emobile.dev:id/featureTitle\" and @text=\"New Charge Capture\"]")
    @iOSXCUITFindBy(xpath = "//XCUIElementTypeButton[@name=\"center_btn\" and @label=\"Hub charges\"]")
    private WebElement newChargeCapture;

    /*
     * @author Harish Gurrapu
     * @since 19 Jan 2024
     * @description get error text
     * @return String
     */
    public String getSchedule() {
        waitForVisibility(schedule);
        String text = getText(schedule, "Screen Displayed is - ");
        return text;
    }

    /*
     * @author Harish Gurrapu
     * @since 19 Jan 2024
     * @description get error text
     * @return String
     */
    public PatientHubPage verifyAppointmentList() {
        waitForVisibility(appointmentTable);
        return this;
    }

    /*
     * @author Harish Gurrapu
     * @since 19 Jan 2024
     * @description get error text
     * @return String
     */
    public PatientHubPage clickOnFirstAppointment() {
        waitForVisibility(firstAppointment);
        click(firstAppointment);
        return this;
    }

    /*
     * @author Harish Gurrapu
     * @since 19 Jan 2024
     * @description get error text
     * @return String
     */
    public String getPatientHubTxt() {
        waitForVisibility(patientHubTxt);
        String text = getText(patientHubTxt, "text is - ");
        return text;
    }

    /*
     * @author Harish Gurrapu
     * @since 19 Jan 2024
     * @description get error text
     * @return String
     */
    public PatientHubPage clickOnEncounter() {
        waitForVisibility(encounter);
        click(encounter);
        return this;
    }

    /*
     * @author Harish Gurrapu
     * @since 19 Jan 2024
     * @description get error text
     * @return String
     */
    public PatientHubPage clickOnNewChargeCapture() throws Exception {
        String platformName = params.getPlatformName();
        if(platformName.equals("Android")){
            Scroll("New Charge Capture");
        }
        else {
            scrollToElement(newChargeCapture,"up");
        }
        waitForVisibility(newChargeCapture);
        click(newChargeCapture);
        return this;
    }
}
