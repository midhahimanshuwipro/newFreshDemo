package CalculatorApp;

import Utils.Object_base;
import io.appium.java_client.AppiumDriver;
import io.appium.java_client.MobileElement;
import io.appium.java_client.pagefactory.AndroidFindBy;

public class CalculatorAppObjectRepo extends Object_base {

    public CalculatorAppObjectRepo(AppiumDriver driver)

    {
        super(driver);
    }


    @AndroidFindBy(id = "com.android.calculator2:id/digit_2")
    static protected MobileElement btn2Click;

    @AndroidFindBy(id = "com.android.calculator2:id/digit_5")
    static protected MobileElement btn5Click;

    @AndroidFindBy(id = "com.android.calculator2:id/op_add")
    static protected MobileElement btnAddClick;

    @AndroidFindBy(id = "com.android.calculator2:id/eq")
    static protected MobileElement equalBtnClick;

    @AndroidFindBy(id = "com.android.calculator2:id/formula")
    static protected MobileElement resultValue;




}
