package com.qa.utils;

import java.io.IOException;

public class GlobalParams {
    private static ThreadLocal<String> platformName = new ThreadLocal<String>();
    private static ThreadLocal<String> udid = new ThreadLocal<String>();
    private static ThreadLocal<String> deviceName = new ThreadLocal<String>();
    private static ThreadLocal<String> systemPort = new ThreadLocal<String>();
    private static ThreadLocal<String> chromeDriverPort = new ThreadLocal<String>();
    private static ThreadLocal<String> wdaLocalPort = new ThreadLocal<String>();
    private static ThreadLocal<String> webkitDebugProxyPort = new ThreadLocal<String>();

    PropertyManager props = new PropertyManager();

    public void setPlatformName(String platformName1){
        platformName.set(platformName1);
    }

    public String getPlatformName(){
        return platformName.get();
    }

    public String getUDID() {
        return udid.get();
    }

    public void setUDID(String udid2) {
        udid.set(udid2);
    }

    public String getDeviceName() {
        return deviceName.get();
    }

    public void setDeviceName(String deviceName2) {
        deviceName.set(deviceName2);
    }

    public String getSystemPort() {
        return systemPort.get();
    }

    public void setSystemPort(String systemPort2) {
        systemPort.set(systemPort2);
    }

    public String getChromeDriverPort() {
        return chromeDriverPort.get();
    }

    public void setChromeDriverPort(String chromeDriverPort2) {
        chromeDriverPort.set(chromeDriverPort2);
    }

    public String getWdaLocalPort() {
        return wdaLocalPort.get();
    }

    public void setWdaLocalPort(String wdaLocalPort2) {
        wdaLocalPort.set(wdaLocalPort2);
    }

    public String getWebkitDebugProxyPort() {
        return webkitDebugProxyPort.get();
    }

    public void setWebkitDebugProxyPort(String webkitDebugProxyPort2) {
        webkitDebugProxyPort.set(webkitDebugProxyPort2);
    }

    public void initializeGlobalParams() throws IOException {
        GlobalParams params = new GlobalParams();
        params.setPlatformName(props.getProps().getProperty("platformName","Android"));
 //       params.setUDID(props.getProps().getProperty("udid", "<enter_device_udid_here>>"));

        String name = params.getPlatformName();
        if (name.equals("Android")) {
            params.setDeviceName(props.getProps().getProperty("androidDeviceName", "OnePlus"));
            params.setUDID(props.getProps().getProperty("androidudid", "emulator-5554"));
            params.setSystemPort(System.getProperty("systemPort", "10000"));
            params.setChromeDriverPort(System.getProperty("chromeDriverPort", "11000"));
        } else if (name.equals("iOS")) {
            params.setDeviceName(props.getProps().getProperty("iOSDeviceName", "iPhone 15 Pro"));
            params.setUDID(props.getProps().getProperty("iosudid", "325F6C7C-D96A-4F93-A3C8-0E168096A339"));
            params.setWdaLocalPort(System.getProperty("wdaLocalPort", "10001"));
            params.setWebkitDebugProxyPort(System.getProperty("webkitDebugProxyPort", "11001"));
        } else {
            throw new IllegalStateException("Invalid Platform Name!");
        }
    }
}
