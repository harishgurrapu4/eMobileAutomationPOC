package com.qa.pages.LabsImaging;

import com.qa.pages.BasePage;
import com.qa.utils.GlobalParams;
import io.appium.java_client.pagefactory.AndroidFindBy;
import io.appium.java_client.pagefactory.iOSXCUITFindBy;
import org.openqa.selenium.WebElement;

public class LabsImagingPage extends BasePage {

    @AndroidFindBy(id = "com.ecw.emobile.dev:id/sherlockTitlemain")
    @iOSXCUITFindBy(xpath = "//XCUIElementTypeStaticText[@name=\"Labs / Imaging\"]")
    private WebElement labsImagingTxt;
    @AndroidFindBy(id = "com.ecw.emobile.dev:id/labsLV")
    @iOSXCUITFindBy(xpath = "//XCUIElementTypeTable[@name=\"tbl_labs\"]")
    private WebElement labsImagingTable;

    @AndroidFindBy(xpath = "(//android.widget.TextView[@resource-id=\"com.ecw.emobile.dev:id/labsName\"])[1]")
    @iOSXCUITFindBy(xpath = "//XCUIElementTypeTable[@name=\"tbl_labs\"]//XCUIElementTypeCell[1]//XCUIElementTypeStaticText[1]")
    private WebElement firstLabsImaging;

    @AndroidFindBy(id = "com.ecw.emobile.dev:id/labDetailAddNotes")
    @iOSXCUITFindBy(xpath = "(//XCUIElementTypeTextView[@name=\"action_suggestion_view\"])[1]")
    private WebElement notestextview;

    @AndroidFindBy(id = "com.ecw.emobile.dev:id/btnLabDetailSave")
    @iOSXCUITFindBy(xpath = "//XCUIElementTypeButton[@name=\"btn_save\"]")
    private WebElement saveBtnLabsImaging;
    GlobalParams params = new GlobalParams();
    String platformName = params.getPlatformName();

    /*
     * @author Harish Gurrapu
     * @since 19 Jan 2024
     * @description get error text
     * @return String
     */
    public String getLabsImagingTitle() {
        waitForVisibility(labsImagingTxt);
        String text = getText(labsImagingTxt, "Screen Displayed is - ");
        return text;
    }


    /*
     * @author Harish Gurrapu
     * @since 19 Jan 2024
     * @description get error text
     * @return String
     */
    public LabsImagingPage verifyLabsImagingList() {
        waitForVisibility(labsImagingTable);
        return this;
    }

    /*
     * @author Harish Gurrapu
     * @since 19 Jan 2024
     * @description get error text
     * @return String
     */
    public LabsImagingPage clickOnFirstLabsImaging() {
        waitForVisibility(firstLabsImaging);
        click(firstLabsImaging);
        return this;
    }

    /*
     * @author Harish Gurrapu
     * @since 19 Jan 2024
     * @description get error text
     * @return String
     */
    public LabsImagingPage clickOnNotesOnLabsImaging() {
        waitForVisibility(notestextview);
        click(notestextview);
        return this;
    }

    /*
     * @author Harish Gurrapu
     * @since 19 Jan 2024
     * @description enter username
     */
    public LabsImagingPage enterNotesOnLabsImaging(String text) {
        sendKeys(notestextview, text);
        hideKeyboard();
        return this;
    }

    /*
     * @author Harish Gurrapu
     * @since 19 Jan 2024
     * @description get error text
     * @return String
     */
    public String getNotesOnLabsImaging() {
        waitForVisibility(notestextview);
        String text = notestextview.getText();
        return text;
    }

    /*
     * @author Harish Gurrapu
     * @since 19 Jan 2024
     * @description get error text
     * @return String
     */
    public LabsImagingPage clickOnSaveLabsImaging() {
        if(platformName.equals("Android")){
            Scroll("Save");
        }
        else {
            iOSScrollToElementUsingMobileScroll(saveBtnLabsImaging);
        }
        waitForVisibility(saveBtnLabsImaging);
        click(saveBtnLabsImaging);
        return this;
    }
}
