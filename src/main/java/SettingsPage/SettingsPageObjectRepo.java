package SettingsPage;

import Utils.Object_base;
import io.appium.java_client.AppiumDriver;
import io.appium.java_client.MobileElement;
import io.appium.java_client.pagefactory.AndroidFindBy;

public class SettingsPageObjectRepo extends Object_base {

    public AppiumDriver driver;
    public SettingsPageObjectRepo(AppiumDriver driver)
    {
        super(driver);
    }


    @AndroidFindBy(xpath = "//android.widget.TextView[@text='Network & internet']")
    static protected MobileElement networkAndInternetBtn;

    @AndroidFindBy(xpath = "//android.widget.TextView[@text='Connected devices']")
    static protected MobileElement connectedDeviceBtn;

    @AndroidFindBy(xpath = "//android.widget.TextView[@text='Apps & notifications']")
    static protected MobileElement appAndNotificationBtn;

    @AndroidFindBy(xpath = "//android.widget.TextView[@text='Battery']")
    static protected MobileElement batteryBtn;

    @AndroidFindBy(id = "com.android.settings:id/battery_percent")
    static protected MobileElement getBatterPercentage;

    @AndroidFindBy(xpath = "//android.widget.TextView[@text='Display']")
    static protected MobileElement displayBtn;

    @AndroidFindBy(xpath = "//android.widget.TextView[@text='Sound']")
    static protected MobileElement soundBtn;

    @AndroidFindBy(xpath = "//android.widget.TextView[@text='Storage']")
    static protected MobileElement storageBtn;

    @AndroidFindBy(xpath = "//android.widget.TextView[@text='Privacy']")
    static protected MobileElement privacyBtn;









}
