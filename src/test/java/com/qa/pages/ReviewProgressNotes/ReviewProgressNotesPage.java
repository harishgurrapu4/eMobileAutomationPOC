package com.qa.pages.ReviewProgressNotes;

import com.qa.pages.BasePage;
import io.appium.java_client.pagefactory.AndroidFindBy;
import io.appium.java_client.pagefactory.iOSXCUITFindBy;
import org.openqa.selenium.WebElement;

public class ReviewProgressNotesPage extends BasePage {

    @AndroidFindBy(id = "com.ecw.emobile.dev:id/sherlockTitlemain")
    @iOSXCUITFindBy(xpath = "//XCUIElementTypeStaticText[@name=\"Review Progress Notes\"]")
    private WebElement reviewProgressNoteTxt;
    @AndroidFindBy(id = "com.ecw.emobile.dev:id/reviewPNListView")
    @iOSXCUITFindBy(xpath = "//XCUIElementTypeTable[@name=\"review_pn_list_tbl\"]")
    private WebElement reviewPNTable;

    @AndroidFindBy(xpath = "//android.widget.TextView[@resource-id=\"com.ecw.emobile.dev:id/reviewpnName\" and @text=\"Patel, Anand\"]")
    @iOSXCUITFindBy(xpath = "//XCUIElementTypeTable[@name=\"review_pn_list_tbl\"]//XCUIElementTypeCell[1]//XCUIElementTypeStaticText[1]")
    private WebElement firstReviewPN;

    @AndroidFindBy(xpath = "//android.webkit.WebView[@text=\"Summary View for Patel, Anand\"]")
    @iOSXCUITFindBy(xpath = "//XCUIElementTypeOther[@name=\"hub_enc_view\"]")
    private WebElement reviewPNReadOnly;

    /*
     * @author Harish Gurrapu
     * @since 19 Jan 2024
     * @description get error text
     * @return String
     */
    public String getReviewPNTitle() {
        waitForVisibility(reviewProgressNoteTxt);
        String text = getText(reviewProgressNoteTxt, "Screen Displayed is - ");
        return text;
    }

    /*
     * @author Harish Gurrapu
     * @since 19 Jan 2024
     * @description get error text
     * @return String
     */
    public String getReviewPNTxt() {
        waitForVisibility(reviewProgressNoteTxt);
        String text = getText(reviewProgressNoteTxt, "Screen Displayed is - ");
        return text;
    }

    /*
     * @author Harish Gurrapu
     * @since 19 Jan 2024
     * @description get error text
     * @return String
     */
    public ReviewProgressNotesPage verifyReviewProgressNoteList() {
        waitForVisibility(reviewPNTable);
        return this;
    }

    /*
     * @author Harish Gurrapu
     * @since 19 Jan 2024
     * @description get error text
     * @return String
     */
    public ReviewProgressNotesPage clickOnFirstReviewProgressNote() {
        waitForVisibility(firstReviewPN);
        click(firstReviewPN);
        return this;
    }

    /*
     * @author Harish Gurrapu
     * @since 19 Jan 2024
     * @description get error text
     * @return String
     */
    public ReviewProgressNotesPage verifyReviewProgressNotePageReadOnly() {
        waitForVisibility(reviewPNReadOnly);
        return this;
    }
}
