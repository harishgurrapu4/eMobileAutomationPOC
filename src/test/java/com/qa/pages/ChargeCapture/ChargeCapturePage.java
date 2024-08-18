package com.qa.pages.ChargeCapture;

import com.qa.pages.BasePage;
import com.qa.utils.GlobalParams;
import io.appium.java_client.pagefactory.AndroidFindBy;
import io.appium.java_client.pagefactory.iOSXCUITFindBy;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class ChargeCapturePage extends BasePage {

    GlobalParams params = new GlobalParams();
    @AndroidFindBy(id = "com.ecw.emobile.dev:id/charge")
    @iOSXCUITFindBy(xpath = "//XCUIElementTypeStaticText[@name=\"celltitle\" and @label=\"Charge Capture\"]")
    private WebElement chargeCapture;

    @AndroidFindBy(id = "com.ecw.emobile.dev:id/sherlockTitle")
    @iOSXCUITFindBy(xpath = "(//XCUIElementTypeStaticText[@name=\"Charge Capture\"])[1]")
    private WebElement chargeCaptureText;

    @AndroidFindBy(id = "com.ecw.emobile.dev:id/etFirstNamePL")
    @iOSXCUITFindBy(xpath = "//XCUIElementTypeTextField[@name=\"First Name\"]")
    private WebElement firstNameTextField;

    @AndroidFindBy(id = "com.ecw.emobile.dev:id/etLastNamePL")
    @iOSXCUITFindBy(xpath = "//XCUIElementTypeTextField[@name=\"Last Name\"]")
    private WebElement lastNameTextField;

    @AndroidFindBy(id = "com.ecw.emobile.dev:id/llAddPatientCCList")
    @iOSXCUITFindBy(xpath = "//XCUIElementTypeButton[@name=\"btn_add_patient\"]")
    private WebElement addPatient;

    @AndroidFindBy(xpath = "//android.widget.TextView[@text=\"Add Charge\"]")
    @iOSXCUITFindBy(xpath = "//XCUIElementTypeButton[@name=\"btn_add_charge\"]")
    private WebElement addCharge;

    @AndroidFindBy (id = "com.ecw.emobile.dev:id/maleButton")
    @iOSXCUITFindBy (xpath = "//XCUIElementTypeButton[@name=\"Male\"]")
    private WebElement maleButton;

    @AndroidFindBy (id = "com.ecw.emobile.dev:id/searchPatientLookup")
    @iOSXCUITFindBy (xpath = "//XCUIElementTypeStaticText[@name=\"Search\"]")
    private WebElement searchButton;

    @AndroidFindBy(id = "com.ecw.emobile.dev:id/rightIconText")
    @iOSXCUITFindBy(xpath = "//XCUIElementTypeButton[@name=\"savebutton\"]")
    private WebElement saveRoundingList;

    @AndroidFindBy(id = "com.ecw.emobile.dev:id/sherlockTitleDetail")
    @iOSXCUITFindBy(xpath = "//XCUIElementTypeNavigationBar/child::XCUIElementTypeStaticText[2]")
    private WebElement patientNameRoundingList;

    @AndroidFindBy(id = "com.ecw.emobile.dev:id/icdAddBtn")
    @iOSXCUITFindBy(xpath = "(//XCUIElementTypeButton[@name=\"addICD\"])[2]")
    private WebElement addICD;

    @AndroidFindBy(id = "com.ecw.emobile.dev:id/cptAddBtn")
    @iOSXCUITFindBy(xpath = "(//XCUIElementTypeButton[@name=\"addCPT\"])[2]")
    private WebElement addCPT;

    @AndroidFindBy(id = "com.ecw.emobile.dev:id/radio_contains")
    @iOSXCUITFindBy(id = "contains_button")
    private WebElement containsBtn;

    @AndroidFindBy(id = "com.ecw.emobile.dev:id/editTextSearchName")
    @iOSXCUITFindBy(id = "tf_assessment_name")
    private WebElement searchBarNameAssessment;

    @AndroidFindBy(id = "com.ecw.emobile.dev:id/editTextSearchCode")
    @iOSXCUITFindBy(id = "tf_assessment_name")
    private WebElement searchBarCodeAssessment;

    @AndroidFindBy(id = "com.ecw.emobile.dev:id/listViewCPTICD")
    @iOSXCUITFindBy(id = "tbl_codes")
    private WebElement icdCodesTable;

    @AndroidFindBy(id = "com.ecw.emobile.dev:id/tvSelectedCodeBadge")
    @iOSXCUITFindBy(xpath = "//XCUIElementTypeButton[@name=\"selectedcodebadge_button\"]/child::XCUIElementTypeStaticText[1]")
    private WebElement getCountICD;

    @AndroidFindBy(id = "com.ecw.emobile.dev:id/roomNo")
    @iOSXCUITFindBy(xpath = "//XCUIElementTypeTextField[@value=\"room number\"]")
    private WebElement roomNoTextField;

    @AndroidFindBy(id = "com.ecw.emobile.dev:id/editProviderDetail")
    @iOSXCUITFindBy(id = "charge_edit_btn")
    private WebElement editBtn;

    @AndroidFindBy(id = "com.ecw.emobile.dev:id/ccDesDateValue")
    @iOSXCUITFindBy(id = "tf_dischargeDate")
    private WebElement dischargeDate;

    @AndroidFindBy(id = "com.ecw.emobile.dev:id/chBoxAddToRoundingList")
    @iOSXCUITFindBy(xpath = "//XCUIElementTypeButton[@name=\"addToRL\"]")
    private WebElement addToRoundingListRadioBtn;

    @AndroidFindBy(id = "com.ecw.emobile.dev:id/ccBillingNote")
    @iOSXCUITFindBy(id = "notes")
    private WebElement billingNotesTextView;

    @AndroidFindBy(id = "com.ecw.emobile.dev:id/chargeCaptureListPatientNameTV")
    @iOSXCUITFindBy(xpath = "//XCUIElementTypeStaticText[@name=\"charge patient name\"]")
    private WebElement getPatientNameRoundingList;

    @AndroidFindBy(id = "com.ecw.emobile.dev:id/rightIconText")
    @iOSXCUITFindBy(id = "applybutton")
    private WebElement applyBtn;

    @AndroidFindBy(id = "com.ecw.emobile.dev:id/ccLinkIcon")
    @iOSXCUITFindBy(xpath = "(//XCUIElementTypeButton[@name=\"linkbutton\"])[1]")
    private WebElement linkBtn;

    @AndroidFindBy(xpath = "(//android.widget.ImageView[@resource-id=\"com.ecw.emobile.dev:id/infoIconCPT\"])[1]")
    @iOSXCUITFindBy(xpath = "(//XCUIElementTypeButton[@name=\"infobutton\"])[1]")
    private WebElement infoFirstBtn;

    @AndroidFindBy(xpath = "(//android.widget.ImageView[@resource-id=\"com.ecw.emobile.dev:id/infoIconCPT\"])[2]")
    @iOSXCUITFindBy(xpath = "(//XCUIElementTypeButton[@name=\"infobutton\"])[2]")
    private WebElement infoSecondBtn;

    @AndroidFindBy(xpath = "(//android.widget.ImageView[@resource-id=\"com.ecw.emobile.dev:id/infoIconCPT\"])[3]")
    @iOSXCUITFindBy(xpath = "(//XCUIElementTypeButton[@name=\"infobutton\"])[3]")
    private WebElement infoThirdBtn;

    @AndroidFindBy(id = "android:id/content")
    @iOSXCUITFindBy(xpath = "//XCUIElementTypeOther[@name=\"container\"]")
    private WebElement infoPopUp;

    @AndroidFindBy(id = "com.ecw.emobile.dev:id/m1")
    @iOSXCUITFindBy(xpath = "//XCUIElementTypeTextField[@name=\"mode1\"]")
    private WebElement m1TextField;

    @AndroidFindBy(id = "com.ecw.emobile.dev:id/m2")
    @iOSXCUITFindBy(xpath = "//XCUIElementTypeTextField[@name=\"mode2\"]")
    private WebElement m2TextField;

    @AndroidFindBy(id = "com.ecw.emobile.dev:id/m3")
    @iOSXCUITFindBy(xpath = "//XCUIElementTypeTextField[@name=\"mode3\"]")
    private WebElement m3TextField;

    @AndroidFindBy(id = "com.ecw.emobile.dev:id/startDt")
    @iOSXCUITFindBy(xpath = "//XCUIElementTypeTextField[@name=\"startdate\"]")
    private WebElement startDateTextField;

    @AndroidFindBy(id = "com.ecw.emobile.dev:id/endDt")
    @iOSXCUITFindBy(xpath = "//XCUIElementTypeTextField[@name=\"enddate\"]")
    private WebElement endDateTextField;

    @AndroidFindBy(id = "com.ecw.emobile.dev:id/cancelBtn")
    @iOSXCUITFindBy(xpath = "//XCUIElementTypeButton[@name=\"cancelbutton\"]")
    private WebElement cancelBtn;

    @AndroidFindBy(id = "com.ecw.emobile.dev:id/doneBtn")
    @iOSXCUITFindBy(xpath = "//XCUIElementTypeButton[@name=\"donebutton\" and @label=\"Done\"]")
    private WebElement doneBtn;


    /*
     * @author Harish Gurrapu
     * @since 19 Jan 2024
     * @description get error text
     * @return String
     */
    public ChargeCapturePage clickOnChargeCapture() {
        click(chargeCapture);
        return this;
    }

    /*
     * @author Harish Gurrapu
     * @since 19 Jan 2024
     * @description get error text
     * @return String
     */
    public String getChargeCapture() {
        waitForVisibility(chargeCaptureText);
        String text = getText(chargeCaptureText, "Screen Displayed is - ");
        return text;
    }

    /*
     * @author Harish Gurrapu
     * @since 19 Jan 2024
     * @description enter firstname
     */
    public void enterTextInFirstName(String text) throws InterruptedException {
            clear(firstNameTextField);
            sendKeys(firstNameTextField, text, "entered text is" + text);
    }

    /*
     * @author Harish Gurrapu
     * @since 19 Jan 2024
     * @description enter lastname
     */
    public void enterTextInLastName(String text) throws InterruptedException {
        clear(lastNameTextField);
        sendKeys(lastNameTextField, text, "entered text is" + text);
    }

    /*
     * @author Harish Gurrapu
     * @since 10 Apr 2024
     * @description click on Add Patient Button
     */
    public ChargeCapturePage clickOnAddPatient() {
        waitForVisibility(addPatient);
        click(addPatient);
        return this;
    }

    /*
     * @author Harish Gurrapu
     * @since 1 June 2024
     * @description click on Add Charge
     */
    public ChargeCapturePage clickOnAddCharge() {
        waitForVisibility(addCharge);
        click(addCharge);
        return this;
    }

    /*
     * @author Harish Gurrapu
     * @since 10 Apr 2024
     * @description click on Add Button inline to ICD
     */
    public ChargeCapturePage clickOnMaleGender() {
        waitForVisibility(maleButton);
        click(maleButton);
        return this;
    }

    /*
     * @author Harish Gurrapu
     * @since 10 Apr 2024
     * @description click on Add Button inline to ICD
     */
    public ChargeCapturePage clickOnSearchPatientLookup() {
        waitForVisibility(searchButton);
        click(searchButton);
        return this;
    }

    /*
     * @author Harish Gurrapu
     * @since 19 Jan 2024
     * @description verify patient name in rounding list
     * @return String
     */
    public Boolean verifyPatientNameRoundingList(String patientName) {
        waitForVisibility(getPatientNameRoundingList);
        String text = getText(getPatientNameRoundingList, "Patient Name is - ");
        return text.contains(patientName);
    }

    /*
     * @author Harish Gurrapu
     * @since 10 Apr 2024
     * @description click on Add Button inline to ICD
     */
    public ChargeCapturePage clickOnAddICD() {
        waitForVisibility(addICD);
        click(addICD);
        return this;
    }

    /*
     * @author Harish Gurrapu
     * @since 10 Apr 2024
     * @description click on Add Button inline to ICD
     */
    public ChargeCapturePage clickOnAddCPT() {
        waitForVisibility(addCPT);
        click(addCPT);
        return this;
    }

    /*
     * @author Harish Gurrapu
     * @since 10 Apr 2024
     * @description click on contains on ADD ICD
     */
    public ChargeCapturePage clickOnContainsOnADDICD() {
        waitForVisibility(containsBtn);
        click(containsBtn);
        return this;
    }

    /*
     * @author Harish Gurrapu
     * @since 10 Apr 2024
     * @description click on search bar assessment
     */
    public ChargeCapturePage clickOnSearchBarNameAssessment() {
        waitForVisibility(searchBarNameAssessment);
        click(searchBarNameAssessment);
        return this;
    }

    /*
     * @author Harish Gurrapu
     * @since 10 Apr 2024
     * @description click on search bar assessment
     */
    public ChargeCapturePage clickOnSearchBarCodeAssessment() {
        waitForVisibility(searchBarCodeAssessment);
        click(searchBarCodeAssessment);
        return this;
    }

    /*
     * @author Harish Gurrapu
     * @since 10 Apr 2024
     * @description enter on search bar assessment
     */
    public ChargeCapturePage enterTextOnSearchBarAssessment(String text) {
        String platformName = new GlobalParams().getPlatformName();
        if (platformName.equals("Android")) {
            sendKeys(searchBarNameAssessment, text);
            pressEnter();
        }
        else if (platformName.equals("iOS")) {
            sendKeys(searchBarNameAssessment, text);
            searchButtonOnKeyboard();
        }
        return this;
    }

    /*
     * @author Harish Gurrapu
     * @since 19 Jan 2024
     * @description verify icd codes list
     * @return String
     */
    public ChargeCapturePage verifyICDCodesList() {
        waitForVisibility(icdCodesTable);
        return this;
    }

    /*
     * @author Harish Gurrapu
     * @since 19 Jan 2024
     * @description get screen name
     * @return String
     */
    public String getICDCount() throws InterruptedException {
        waitForVisibility(getCountICD);
        Thread.sleep(2000);
        String text = getText(getCountICD, "Count is - ");
        return text;
    }

    /*
     * @author Harish Gurrapu
     * @since 19 Jan 2024
     * @description enter room number
     */
    public void enterTextInRoomNo(String text) throws InterruptedException {
        clear(roomNoTextField);
        sendKeys(roomNoTextField, text, "entered text is" + text);
    }

    /*
     * @author Harish Gurrapu
     * @since 10 Apr 2024
     * @description click on search bar assessment
     */
    public ChargeCapturePage clickOnEditBtn() {
        waitForVisibility(editBtn);
        click(editBtn);
        return this;
    }

    /*
     * @author Harish Gurrapu
     * @since 10 Apr 2024
     * @description click on search bar assessment
     */
    public ChargeCapturePage clickOnDischargeDate() {
        waitForVisibility(dischargeDate);
        click(dischargeDate);
        return this;
    }

    /*
     * @author Harish Gurrapu
     * @since 1 June 2024
     * @description click on add to rounding list radio button
     */
    public ChargeCapturePage clickOnAddToRoundingListRadioButton() throws Exception {
        waitForVisibility(addToRoundingListRadioBtn);
        click(addToRoundingListRadioBtn);
        return this;
    }

    /*
     * @author Harish Gurrapu
     * @since 10 Apr 2024
     * @description click on search bar assessment
     */
    public ChargeCapturePage clickOnBillingNotesTextView() throws Exception {
        String platformName = params.getPlatformName();
        if(platformName.equals("Android")){
            Scroll("Add To Rounding List");
        }
        else {
            scrollToElement(billingNotesTextView,"up");
        }
        waitForVisibility(billingNotesTextView);
        click(billingNotesTextView);
        return this;
    }

    /*
     * @author Harish Gurrapu
     * @since 10 Apr 2024
     * @description enter on search bar assessment
     */
    public ChargeCapturePage enterTextOnBillingNotesTextview(String text) {
        sendKeys(billingNotesTextView, text);
        hideKeyboard();
        return this;
    }

    /*
     * @author Harish Gurrapu
     * @since 10 Apr 2024
     * @description click on apply button
     */
    public ChargeCapturePage clickOnApplyBtn() {
        waitForVisibility(applyBtn);
        click(applyBtn);
        return this;
    }

    /*
     * @author Harish Gurrapu
     * @since 10 Apr 2024
     * @description click on link button
     */
    public ChargeCapturePage clickOnLinkBtn() {
        waitForVisibility(linkBtn);
        click(linkBtn);
        return this;
    }

    /*
     * @author Harish Gurrapu
     * @since 10 Apr 2024
     * @description click on link button
     */
    public ChargeCapturePage clickOnFirstInfoBtnCPT() {
        waitForVisibility(infoFirstBtn);
        click(infoFirstBtn);
        return this;
    }

    /*
     * @author Harish Gurrapu
     * @since 10 Apr 2024
     * @description click on link button
     */
    public ChargeCapturePage clickOnSecondInfoBtnCPT() throws Exception {
        String platformName = params.getPlatformName();
        if(platformName.equals("Android")){
            //Scroll("New Charge Capture");
        }
        else {
            scrollToElement(infoSecondBtn,"up");
        }
        waitForVisibility(infoSecondBtn);
        click(infoSecondBtn);
        return this;
    }

    /*
     * @author Harish Gurrapu
     * @since 10 Apr 2024
     * @description click on link button
     */
    public ChargeCapturePage clickOnThirdInfoBtnCPT() throws Exception {
        String platformName = params.getPlatformName();
        if(platformName.equals("Android")){
            //Scroll("New Charge Capture");
        }
        else {
            scrollToElement(infoThirdBtn,"up");
        }
        waitForVisibility(infoThirdBtn);
        click(infoThirdBtn);
        return this;
    }

    /*
     * @author Harish Gurrapu
     * @since 10 Apr 2024
     * @description click on link button
     */
    public ChargeCapturePage verifyInfoPopUp() throws InterruptedException {
        Thread.sleep(2000);
        waitForVisibility(infoPopUp);
        return this;
    }

    /*
     * @author Harish Gurrapu
     * @since 10 Apr 2024
     * @description click on m1
     */
    public ChargeCapturePage clickOnM1TextField() {
        waitForVisibility(m1TextField);
        click(m1TextField);
        return this;
    }

    /*
     * @author Harish Gurrapu
     * @since 10 Apr 2024
     * @description enter on m1
     */
    public ChargeCapturePage enterTextOnM1TextField(String text) {
        sendKeys(m1TextField, text);
        return this;
    }

    /*
     * @author Harish Gurrapu
     * @since 10 Apr 2024
     * @description enter on m2
     */
    public ChargeCapturePage enterTextOnM2TextField(String text) {
        sendKeys(m2TextField, text);
        return this;
    }

    /*
     * @author Harish Gurrapu
     * @since 10 Apr 2024
     * @description enter on m3
     */
    public ChargeCapturePage enterTextOnM3TextField(String text) {
        sendKeys(m3TextField, text);
        return this;
    }

    /*
     * @author Harish Gurrapu
     * @since 10 Apr 2024
     * @description click on start date
     */
    public ChargeCapturePage clickOnStartDateTextField() {
        waitForVisibility(startDateTextField);
        click(startDateTextField);
        return this;
    }

    /*
     * @author Harish Gurrapu
     * @since 10 Apr 2024
     * @description click on stop date
     */
    public ChargeCapturePage clickOnEndDateTextField() {
        waitForVisibility(endDateTextField);
        click(endDateTextField);
        return this;
    }

    /*
     * @author Harish Gurrapu
     * @since 10 Apr 2024
     * @description click on done btn
     */
    public ChargeCapturePage clickOnDoneBtn() {
        waitForVisibility(doneBtn);
        click(doneBtn);
        return this;
    }

    /*
     * @author Harish Gurrapu
     * @since 10 Apr 2024
     * @description click on done btn
     */
    public ChargeCapturePage verifyCancelDoneBtnOnInfoPopup() {
        waitForVisibility(cancelBtn);
        waitForVisibility(doneBtn);
        return this;
    }

    /*
     * @author Harish Gurrapu
     * @since 10 Apr 2024
     * @description click on search bar assessment
     */
    public ChargeCapturePage clickOnSaveBtnAddRoundingList() {
        waitForVisibility(saveRoundingList);
        click(saveRoundingList);
        return this;
    }
}
