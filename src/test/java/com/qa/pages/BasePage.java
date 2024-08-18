package com.qa.pages;

import com.qa.utils.DriverManager;
import com.qa.utils.GlobalParams;
import com.qa.utils.TestUtils;
import io.appium.java_client.*;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.nativekey.AndroidKey;
import io.appium.java_client.android.nativekey.KeyEvent;
import io.appium.java_client.android.nativekey.KeyEventFlag;
import io.appium.java_client.pagefactory.AndroidFindBy;
import io.appium.java_client.pagefactory.AppiumFieldDecorator;
import io.appium.java_client.pagefactory.iOSXCUITFindBy;
import io.appium.java_client.touch.LongPressOptions;
import io.appium.java_client.touch.offset.PointOption;
import org.openqa.selenium.*;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.remote.RemoteWebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.time.Duration;
import java.util.Date;
import java.util.HashMap;
import java.util.List;

import static io.appium.java_client.touch.WaitOptions.waitOptions;
import static io.appium.java_client.touch.offset.PointOption.point;
import static java.time.Duration.ofMillis;

public class BasePage {
    public AppiumDriver driver;
    WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(TestUtils.WAIT));
    TestUtils utils = new TestUtils();

    public BasePage(){
        this.driver = new DriverManager().getDriver();
        PageFactory.initElements(new AppiumFieldDecorator(this.driver), this);
    }

//    @AndroidFindBy(id = "com.ecw.emobile.dev:id/sherlockTitlemain")
    @AndroidFindBy(id = "com.ecw.emobile.dev:id/sherlockTitleDetail")
    @iOSXCUITFindBy(xpath = "//XCUIElementTypeNavigationBar/child::XCUIElementTypeStaticText")
    private WebElement navigationBarTxt;

    @AndroidFindBy(id = "com.ecw.emobile.dev:id/sherlockTitlemain")
    @iOSXCUITFindBy(xpath = "//XCUIElementTypeNavigationBar/child::XCUIElementTypeStaticText")
    private WebElement navigationBarTxt2;

    @AndroidFindBy(id = "com.ecw.emobile.dev:id/sherlockTitleDetail")
    @iOSXCUITFindBy(xpath = "//XCUIElementTypeButton[@name=\"Done\"]")
    private WebElement hideKeyboard;

    @AndroidFindBy(id = "com.ecw.emobile.dev:id/sherlockTitleDetail")
    @iOSXCUITFindBy(xpath = "//XCUIElementTypeButton[@name=\"Search\"]")
    private WebElement searchKeyboard;

    @AndroidFindBy(id = "com.ecw.emobile.dev:id/search_resultLV")
    @iOSXCUITFindBy(xpath = "//XCUIElementTypeTable[@name=\"tbllistview\"]")
    private WebElement patientTable;

    @AndroidFindBy(xpath = "//android.widget.ListView//android.widget.TextView[1]")
    ////android.widget.ListView[@resource-id="com.ecw.emobile.dev:id/search_resultLV"]
    @iOSXCUITFindBy(xpath = "//XCUIElementTypeTable[@name=\"tbllistview\"]/XCUIElementTypeCell[1]")
    private WebElement firstPatient;

    @AndroidFindBy(id = "com.ecw.emobile.dev:id/layoutBackButton")
    @iOSXCUITFindBy(id = "backbutton")
    private WebElement backButton;

    public void waitForVisibility(WebElement e) {
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(TestUtils.WAIT));
        wait.until(ExpectedConditions.visibilityOf(e));
    }

    public void waitForVisibility(By e) {
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(TestUtils.WAIT));
        wait.until(ExpectedConditions.visibilityOfElementLocated(e));
    }

    public void clear(WebElement e) {
        waitForVisibility(e);
        e.clear();
    }

    public void click(WebElement e) {
        waitForVisibility(e);
        e.click();
    }

    public void click(WebElement e, String msg) {
        waitForVisibility(e);
        utils.log().info(msg);
        e.click();
    }

    public void click(By e, String msg) {
        waitForVisibility(e);
        utils.log().info(msg);
        driver.findElement(e).click();
    }

    public void sendKeys(WebElement e, String txt) {
        waitForVisibility(e);
        e.sendKeys(txt);
    }

    public void sendKeys(WebElement e, String txt, String msg) {
        waitForVisibility(e);
        utils.log().info(msg);
        e.sendKeys(txt);
    }


    public void pressEnter() {
        Actions action = new Actions(driver);
        action.sendKeys(Keys.ENTER).perform();
    }

    public void pressTab() {
        ((AndroidDriver) driver).pressKey(new KeyEvent(AndroidKey.TAB));
        ((AndroidDriver) driver).pressKey(new KeyEvent(AndroidKey.ENTER)
                .withFlag(KeyEventFlag.SOFT_KEYBOARD)
                .withFlag(KeyEventFlag.KEEP_TOUCH_MODE)
                .withFlag(KeyEventFlag.EDITOR_ACTION));
    }


    public String getAttribute(WebElement e, String attribute) {
        waitForVisibility(e);
        return e.getAttribute(attribute);
    }

    public String getAttribute(By e, String attribute) {
        waitForVisibility(e);
        return driver.findElement(e).getAttribute(attribute);
    }

    public String getText(WebElement e, String msg) {
        String txt;
        String platformName = new GlobalParams().getPlatformName();
        if (platformName.equals("Android")) {
            txt = getAttribute(e, "text");
        } else if (platformName.equals("iOS")) {
            txt = getAttribute(e, "label");
        } else {
            throw new IllegalStateException("Unexpected value: " + new GlobalParams().getPlatformName());
        }
        utils.log().info(msg + txt);
        return txt;
    }

    public String getValue(WebElement e, String msg) {
        String txt;
        String platformName = new GlobalParams().getPlatformName();
        if (platformName.equals("Android")) {
            txt = getAttribute(e, "text");
        } else if (platformName.equals("iOS")) {
            txt = getAttribute(e, "value");
        } else {
            throw new IllegalStateException("Unexpected value: " + new GlobalParams().getPlatformName());
        }
        utils.log().info(msg + txt);
        return txt;
    }

    public String getText(By e, String msg) {
        String txt;
        String platformName = new GlobalParams().getPlatformName();
        if (platformName.equals("Android")) {
            txt = getAttribute(e, "text");
        } else if (platformName.equals("iOS")) {
            txt = getAttribute(e, "label");
        } else {
            throw new IllegalStateException("Unexpected value: " + new GlobalParams().getPlatformName());
        }
        utils.log().info(msg + txt);
        return txt;
    }

    /*
     * @author Harish Gurrapu
     * @since 19 Jan 2024
     * @description get screen name
     * @return String
     */
    public String getNavigationBarTxt() throws InterruptedException {
        String platformName = new GlobalParams().getPlatformName();
        String text = null;
        if (platformName.equals("Android")) {
            Thread.sleep(5000);
            try {
                if (navigationBarTxt.isDisplayed()) {
                    text = getText(navigationBarTxt, "Screen displayed is - ");
                    return text;
                }
            }
                catch (NoSuchElementException e) {
                    System.out.println(e);
                    text = getText(navigationBarTxt2, "Screen displayed is - ");
                    return text;
                }
        }
        else if (platformName.equals("iOS")) {
            waitForVisibility(navigationBarTxt);
            text = getText(navigationBarTxt, "Screen displayed is - ");
            return text;
        }
        return text;
    }

    /*
     * @author Harish Gurrapu
     * @since 19 Jan 2024
     * @description get error text
     * @return String
     */
    public void verifyPatientList() {
        waitForVisibility(patientTable);
    }

    /*
     * @author Harish Gurrapu
     * @since 19 Jan 2024
     * @description click On Text
     */
    public void clickOnTxt(String text) {
        String platformName = new GlobalParams().getPlatformName();
        if (platformName.equals("Android")) {
            WebElement element = driver.findElement(By.xpath("//android.widget.TextView[@text='"+text+"']"));
            click(element,"");
        }
        else if (platformName.equals("iOS")) {
            WebElement element = driver.findElement(By.xpath("//XCUIElementTypeStaticText[@name='"+text+"']"));
            click(element,"");
        }
    }

    /*
     * @author Harish Gurrapu
     * @since 19 Jan 2024
     * @description verify Text
     */
    public Boolean verifyText(String text) {
        String platformName = new GlobalParams().getPlatformName();
        if (platformName.equals("Android")) {
            ////android.widget.TextView[@resource-id="com.ecw.emobile.dev:id/codeNoCPT" and @text="94013"]
            WebElement element = driver.findElement(By.xpath("//android.widget.TextView[@text='"+text+"']"));
            return element.isDisplayed();
        }
        else if (platformName.equals("iOS")) {
            WebElement element = driver.findElement(By.xpath("//XCUIElementTypeStaticText[@name='"+text+"']"));
            return element.isDisplayed();
        }
        return true;
    }

    /*
     * @author Harish Gurrapu
     * @since 19 Jan 2024
     * @description click On Text
     */
    public void clickOnTextByValue(String text) {
        String platformName = new GlobalParams().getPlatformName();
        if (platformName.equals("Android")) {
            WebElement element = driver.findElement(By.xpath("//android.widget.TextView[@text='"+text+"']"));
            click(element,"");
        }
        else if (platformName.equals("iOS")) {
            WebElement element = driver.findElement(By.xpath("//XCUIElementTypeStaticText[@value='"+text+"']"));
            click(element,"");
        }
    }

    /*
     * @author Harish Gurrapu
     * @since 19 Jan 2024
     * @description click On Text
     */
    public void clickOnButton(String buttonName) {
        String platformName = new GlobalParams().getPlatformName();
        if (platformName.equals("Android")) {
            WebElement element = driver.findElement(By.xpath("//android.widget.TextView[@text='"+buttonName+"']"));
            click(element,"");
        }
        else if (platformName.equals("iOS")) {
            WebElement element = driver.findElement(By.xpath("//XCUIElementTypeButton[@name='"+buttonName+"']"));
            click(element,"");
        }
    }

    /*
     * @author Harish Gurrapu
     * @since 19 Jan 2024
     * @description click On Text
     */
    public void clickOnAlertButton(String buttonName) throws InterruptedException {
        String platformName = new GlobalParams().getPlatformName();
        if (platformName.equals("Android")) {
            Thread.sleep(5000);
            try {
            WebElement element = driver.findElement(By.xpath("//android.widget.Button[@resource-id=\"android:id/button1\"]"));
                if (element.isDisplayed()) {
                    click(element);
                }
            }
            catch (NoSuchElementException e) {
                System.out.println(e);
            }
        }
        else if (platformName.equals("iOS")) {
            WebElement element = driver.findElement(By.xpath("//XCUIElementTypeButton[@name='"+buttonName+"']"));
            click(element);
        }
    }

    /*
     * @author Harish Gurrapu
     * @since 19 Jan 2024
     * @description enter username
     */
    public void enterTextInTextField(String text, String textFieldName) throws InterruptedException {
        String platformName = new GlobalParams().getPlatformName();
        if (platformName.equals("Android")) {
            WebElement element = driver.findElement(By.xpath("//android.widget.EditText[@text='"+textFieldName+"']"));
            //android.widget.EditText[@resource-id="com.ecw.emobile.dev:id/loginPassword"]
            //android.widget.EditText[@resource-id="com.ecw.emobile.dev:id/editTextSearchName"]
            clear(element);
            sendKeys(element, text, "entered text is" + text);
        }
        else if (platformName.equals("iOS")) {
            WebElement element = driver.findElement(By.xpath("//XCUIElementTypeTextField[@name='"+textFieldName+"']"));
            clear(element);
            sendKeys(element, text, "entered text is" + text);
        }
    }

    /*
     * @author Harish Gurrapu
     * @since 19 Jan 2024
     * @description click on first appt from list
     */
    public void clickOnFirstAppointmentFromList() {
        waitForVisibility(firstPatient);
        click(firstPatient);
    }

    /*
     * @author Harish Gurrapu
     * @since 19 Jan 2024
     * @description click on first appt from list
     */
    public void clickOnBackButton() {
        waitForVisibility(backButton);
        click(backButton);
    }

    public String getCurrentDate(String format){
        DateFormat dateFormat = new SimpleDateFormat(format);
        Date date = new Date();
        return dateFormat.format(date);
    }

    public void closeApp() {
        String platformName = new GlobalParams().getPlatformName();
        if (platformName.equals("Android")) {
            ((InteractsWithApps) driver).terminateApp(driver.getCapabilities().
                    getCapability("appPackage").toString());
        } else if (platformName.equals("iOS")) {
            ((InteractsWithApps) driver).terminateApp(driver.getCapabilities().
                    getCapability("bundleId").toString());
        }
    }

    public void launchApp() {
        String platformName = new GlobalParams().getPlatformName();
        if (platformName.equals("Android")) {
            ((InteractsWithApps) driver).activateApp(driver.getCapabilities().
                    getCapability("appPackage").toString());
        } else if (platformName.equals("iOS")) {
            ((InteractsWithApps) driver).activateApp(driver.getCapabilities().
                    getCapability("bundleId").toString());
        }
    }

    /*
     * @author Harish Gurrapu
     * @since 19 Jan 2024
     * @description minimize app
     * @return String
     */
    public void minimizeApp() {
        String platformName = new GlobalParams().getPlatformName();
        if (platformName.equals("Android")) {
            ((InteractsWithApps) driver).runAppInBackground(Duration.ofDays(10));
            ((InteractsWithApps) driver).activateApp(driver.getCapabilities().
                    getCapability("appPackage").toString());
        } else if (platformName.equals("iOS")) {
            ((InteractsWithApps) driver).runAppInBackground(Duration.ofDays(10));
            ((InteractsWithApps) driver).activateApp(driver.getCapabilities().
                    getCapability("bundleId").toString());
        }
    }

    public WebElement andScrollToElementUsingUiScrollable(String childLocAttr, String childLocValue) {
        return driver.findElement(AppiumBy.androidUIAutomator(
                "new UiScrollable(new UiSelector()" + ".scrollable(true)).scrollIntoView("
                        + "new UiSelector()."+ childLocAttr +"(\"" + childLocValue + "\"));"));
    }

    public void Scroll(String Text) {
        driver.findElement(AppiumBy.androidUIAutomator(
                "new UiScrollable(new UiSelector().scrollable(true))" +
                        ".scrollIntoView(new UiSelector().text(\"" + Text + "\"))"));
    }

    public WebElement iOSScrollToElementUsingMobileScroll(WebElement e) {
        RemoteWebElement element = ((RemoteWebElement) e);
        String elementID = element.getId();
        HashMap<String, String> scrollObject = new HashMap<String, String>();
        scrollObject.put("element", elementID);
        //scrollObject.put("direction", "up");
        scrollObject.put("toVisible", "sdfnjksdnfkld");
        driver.executeScript("mobile:scroll", scrollObject);
        return e;
    }

    public By iOSScrollToElementUsingMobileScrollParent(WebElement parentE, String predicateString) {
        RemoteWebElement parent = (RemoteWebElement)parentE;
        String parentID = parent.getId();
        HashMap<String, String> scrollObject = new HashMap<String, String>();
        scrollObject.put("element", parentID);
//	  scrollObject.put("direction", "down");
        scrollObject.put("predicateString", predicateString);
//	  scrollObject.put("name", "test-ADD TO CART");
//        scrollObject.put("toVisible", "sdfnjksdnfkld");
        driver.executeScript("mobile:scroll", scrollObject);
        By m = AppiumBy.iOSNsPredicateString(predicateString);
        System.out.println("Mobilelement is " + m);
        return m;
    }

    public void hideKeyboard() {
        String platformName = new GlobalParams().getPlatformName();
        if (platformName.equals("Android")) {
            System.out.println("No Keyboard Displayed");
        }
        else{
            click(hideKeyboard);
        }
    }

    public void searchButtonOnKeyboard() {
        click(searchKeyboard);
    }

//    public MobileElement scrollToElement(MobileElement element, String direction) throws Exception {
//        Dimension size = driver.manage().window().getSize();
//        int startX = (int) (size.width * 0.5);
//        int endX = (int) (size.width * 0.5);
//        int startY = 0;
//        int endY = 0;
//        boolean isFound = false;
//
//        switch (direction) {
//            case "up":
//                endY = (int) (size.height * 0.4);
//                startY = (int) (size.height * 0.6);
//                break;
//
//            case "down":
//                endY = (int) (size.height * 0.6);
//                startY = (int) (size.height * 0.4);
//                break;
//        }
//
//        for (int i = 0; i < 3; i++) {
//            if (find(element, 1)) {
//                isFound = true;
//                break;
//            } else {
//                swipe(startX, startY, endX, endY, 1000);
//            }
//        }
//        if(!isFound){
//            throw new Exception("Element not found");
//        }
//        return element;
//    }

    public WebElement scrollToElement(WebElement element, String direction) throws Exception {
        Dimension size = driver.manage().window().getSize();
        int startX = (int) (size.width * 0.5);
        int endX = (int) (size.width * 0.5);
        int startY = 0;
        int endY = 0;
        boolean isFound = false;

        switch (direction) {
            case "up":
                endY = (int) (size.height * 0.4);
                startY = (int) (size.height * 0.6);
                break;

            case "down":
                endY = (int) (size.height * 0.6);
                startY = (int) (size.height * 0.4);
                break;
        }

        for (int i = 0; i < 3; i++) {
            if (find(element, 1)) {
                isFound = true;
                break;
            } else {
                swipe(startX, startY, endX, endY, 1000);
            }
        }
        if(!isFound){
            throw new Exception("Element not found");
        }
        return element;
    }

        public boolean find(final WebElement element, int timeout) {
            try {
                WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(timeout));
                return wait.until(new ExpectedCondition<Boolean>() {
                    @Override
                    public Boolean apply(WebDriver driver) {
                        if (element.isDisplayed()) {
                            return true;
                        }
                        return false;
                    }
                });
            } catch (Exception e) {
                return false;
            }
        }

//        public boolean find(final By element, int timeout) {
//            try {
//                WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(timeout));
//                return wait.until(new ExpectedCondition<Boolean>() {
//                    @Override
//                    public Boolean apply(WebDriver driver) {
//                        if (driver.findElement(element).isDisplayed()) {
//                            return true;
//                        }
//                        return false;
//                    }
//                });
//            } catch (Exception e) {
//                return false;
//            }
//        }

   public void swipe(int startX, int startY, int endX, int endY, int millis)
            throws InterruptedException {
        TouchAction t = new TouchAction((PerformsTouchActions) driver);
        t.press(point(startX, startY)).waitAction(waitOptions(ofMillis(millis))).moveTo(point(endX, endY)).release()
                .perform();
    }

    //Below methods can be used with appium gesture plugin
/*
    public void swipeLeft(String Id) {
        RemoteWebElement element = (RemoteWebElement) wait.until(presenceOfElementLocated(AppiumBy.accessibilityId(Id)));
        driver.executeScript("gesture: swipe", Map.of("elementId", element.getId(), "percentage", 50, "direction", "left"));
    }

    public void swipeRight(String Id) {
        RemoteWebElement element = (RemoteWebElement) wait.until(presenceOfElementLocated(AppiumBy.accessibilityId(Id)));
        driver.executeScript("gesture: swipe", Map.of("elementId", element.getId(), "percentage", 50, "direction", "right"));
    }

    public void swipeUp(String Id) {
        RemoteWebElement scrollView = (RemoteWebElement) wait.until(presenceOfElementLocated(AppiumBy.accessibilityId(Id)));
        driver.executeScript("gesture: swipe", Map.of("elementId", scrollView.getId(),
                "percentage", 50,
                "direction", "up"));
    }

    public void swipeDown(String Id) {
        RemoteWebElement scrollView = (RemoteWebElement) wait.until(presenceOfElementLocated(AppiumBy.accessibilityId(Id)));
        driver.executeScript("gesture: swipe", Map.of("elementId", scrollView.getId(),
                "percentage", 50,
                "direction", "down"));
    }
 */
}
