package com.qa.pages.Settings;

import com.qa.pages.BasePage;
import com.qa.utils.GlobalParams;
import io.appium.java_client.pagefactory.AndroidFindBy;
import io.appium.java_client.pagefactory.iOSXCUITFindBy;
import org.openqa.selenium.WebElement;

public class SettingsPage extends BasePage {

    GlobalParams params = new GlobalParams();
    String platformName = params.getPlatformName();

    @AndroidFindBy(id = "com.ecw.emobile.dev:id/settingAddICDFev")
    @iOSXCUITFindBy(xpath = "//XCUIElementTypeStaticText[@name=\"Add ICD Favorites\"]")
    private WebElement addICDFavorites;

    @AndroidFindBy(id = "com.ecw.emobile.dev:id/settingAddCPTFev")
    @iOSXCUITFindBy(xpath = "//XCUIElementTypeStaticText[@name=\"Add CPT Favorites\"]")
    private WebElement addCPTFavorites;

    @AndroidFindBy(id = "com.ecw.emobile.dev:id/searchFavoriteCode")
    @iOSXCUITFindBy(xpath = "//XCUIElementTypeTextField[@name=\"add_to_favorite_search_tf\"]")
    private WebElement addICDFavoritesSearchField;

    @AndroidFindBy(id = "com.ecw.emobile.dev:id/chkFavCodeSelect")
    @iOSXCUITFindBy(xpath = "//XCUIElementTypeTextField[@name=\"add_to_favorite_search_tf\"]")
    private WebElement favoriteBTN;

    @AndroidFindBy(id = "com.ecw.emobile.dev:id/chkFavCodeSelect")
    @iOSXCUITFindBy(xpath = "//XCUIElementTypeButton[@name=\"cell_cpt_favorite_toggle_button\" and @value=\"1\"]")
    private WebElement favoriteCPT;

    @AndroidFindBy(id = "com.ecw.emobile.dev:id/chkFavCodeSelect")
    @iOSXCUITFindBy(xpath = "//XCUIElementTypeButton[@name=\"cell_icd_favorite_toggle_button\" and @value=\"1\"]")
    private WebElement favoriteICD;

    @AndroidFindBy(id = "com.ecw.emobile.dev:id/rightIconText")
    @iOSXCUITFindBy(xpath = "//XCUIElementTypeButton[@name=\"addfavorite_save_button\"]")
    private WebElement saveOnAddICDFavorites;

    /*
     * @author Harish Gurrapu
     * @since 19 Jan 2024
     * @description get error text
     * @return String
     */
    public SettingsPage clickOnAddICDFavorites() {
        if(platformName.equals("Android")){
            Scroll("Add ICD Favorites");
        }
        else {
            iOSScrollToElementUsingMobileScroll(addICDFavorites);
        }
        waitForVisibility(addICDFavorites);
        click(addICDFavorites);
        return this;
    }

    /*
     * @author Harish Gurrapu
     * @since 19 Jan 2024
     * @description get error text
     * @return String
     */
    public SettingsPage clickOnAddCPTFavorites() {
        if(platformName.equals("Android")){
            Scroll("Add CPT Favorites");
        }
        else {
            iOSScrollToElementUsingMobileScroll(addCPTFavorites);
        }
        waitForVisibility(addCPTFavorites);
        click(addCPTFavorites);
        return this;
    }

    /*
     * @author Harish Gurrapu
     * @since 19 Jan 2024
     * @description enter password
     */
    public SettingsPage enterICDOnSearchField(String text) throws InterruptedException {
        String platformName = new GlobalParams().getPlatformName();
        if (platformName.equals("Android")) {
            sendKeys(addICDFavoritesSearchField, text);
            pressTab();
        }
        else if (platformName.equals("iOS")) {
            sendKeys(addICDFavoritesSearchField, text);
        }
        Thread.sleep(3000);
        return this;
    }

    /*
     * @author Harish Gurrapu
     * @since 19 Jan 2024
     * @description get error text
     * @return String
     */
    public SettingsPage clickOnFavoritesBtn(String text) {
        if(platformName.equals("Android")){
            click(favoriteBTN);
        }
        else {
            clickOnTextByValue(text);
        }
        return this;
    }

    /*
     * @author Harish Gurrapu
     * @since 19 Jan 2024
     * @description verify is favorite
     * @return String
     */
    public String getIsFavoriteICDValue() {
        String text = null;
        if (platformName.equals("Android")) {
            waitForVisibility(favoriteICD);
            return "1";
        } else {
            waitForVisibility(favoriteICD);
            text = getValue(favoriteICD, "Is Checked - ");
            return text;
        }
    }

    /*
     * @author Harish Gurrapu
     * @since 19 Jan 2024
     * @description verify is favorite
     * @return String
     */
    public String getIsFavoriteCPTValue() {
        String text = null;
        if (platformName.equals("Android")) {
            waitForVisibility(favoriteCPT);
            return "1";
        } else {
            waitForVisibility(favoriteCPT);
            text = getValue(favoriteCPT, "Is Checked - ");
            return text;
        }
    }

    /*
     * @author Harish Gurrapu
     * @since 19 Jan 2024
     * @description get error text
     * @return String
     */
    public SettingsPage clickOnSaveOnAddICDFavorites() {
        waitForVisibility(saveOnAddICDFavorites);
        click(saveOnAddICDFavorites);
        return this;
    }
}
