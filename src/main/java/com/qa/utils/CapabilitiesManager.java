package com.qa.utils;

import org.openqa.selenium.remote.DesiredCapabilities;

import java.io.File;
import java.util.Properties;

public class CapabilitiesManager {
    TestUtils utils = new TestUtils();

    public DesiredCapabilities getCaps() throws Exception {
        GlobalParams params = new GlobalParams();
        Properties props = new PropertyManager().getProps();

        try{
            utils.log().info("getting capabilities");
            DesiredCapabilities caps = new DesiredCapabilities();
            caps.setCapability("platformName", params.getPlatformName());
            caps.setCapability("udid", params.getUDID());
            caps.setCapability("unicodeKeyboard", true);
            caps.setCapability("resetKeyboard", true);
            //caps.setCapability("deviceName", params.getDeviceName());

            String platformName = params.getPlatformName();
            if (platformName.equals("Android")) {
                caps.setCapability("automationName", props.getProperty("androidAutomationName"));
                caps.setCapability("appPackage", props.getProperty("androidAppPackage"));
                caps.setCapability("appActivity", props.getProperty("androidAppActivity"));
                caps.setCapability("noReset", props.getProperty("noreset"));
                caps.setCapability("systemPort", params.getSystemPort());
                caps.setCapability("chromeDriverPort", params.getChromeDriverPort());
 //               String androidAppUrl = getClass().getResource(props.getProperty("androidAppLocation")).getFile();
//                String androidAppUrl = System.getProperty("user.dir") + File.separator + "src" + File.separator + "test"
//                        + File.separator + "resources" + File.separator + "apps" + File.separator + "eClinicalMobile_dev_7.0.9.apk";
//                utils.log().info("appUrl is" + androidAppUrl);
//                caps.setCapability("app", androidAppUrl);
            } else if (platformName.equals("iOS")) {
//                caps.setCapability("deviceName", props.getProperty("iOSDeviceName"));
                caps.setCapability("automationName", props.getProperty("iOSAutomationName"));
                //String iOSAppUrl = getClass().getResource(props.getProperty("iOSAppLocation")).getFile();
//                String iOSAppUrl = System.getProperty("user.dir") + File.separator + "src" + File.separator + "test"
//                        + File.separator + "resources" + File.separator + "apps" + File.separator + "SwagLabsMobileApp.app";
//                utils.log().info("appUrl is" + iOSAppUrl);
                params.setDeviceName(props.getProperty("platformVersion", "17.0"));
                caps.setCapability("bundleId", props.getProperty("iOSBundleId"));
                caps.setCapability("wdaLocalPort", params.getWdaLocalPort());
                caps.setCapability("webkitDebugProxyPort", params.getWebkitDebugProxyPort());
//                caps.setCapability("app", iOSAppUrl);
            }
            return caps;
        } catch(Exception e){
            e.printStackTrace();
            utils.log().fatal("Failed to load capabilities. ABORT!!" + e.toString());
            throw e;
        }
    }
}
