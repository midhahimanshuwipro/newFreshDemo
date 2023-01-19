package ContactPage;

import Utils.Object_base;
import io.appium.java_client.AppiumDriver;
import io.appium.java_client.MobileElement;
import io.appium.java_client.pagefactory.AndroidFindBy;

public class ContactPageObjectRepo extends Object_base {

    public AppiumDriver driver;
    public ContactPageObjectRepo(AppiumDriver driver)
    {
        super(driver);
    }



    @AndroidFindBy(id = "com.android.dialer:id/empty_list_view_action")
    static protected MobileElement addToFavBtn;

    @AndroidFindBy(xpath = "//android.widget.TextView[@text='CREATE NEW CONTACT']")
    static protected MobileElement createNewContactBtn;

    @AndroidFindBy(xpath = "//android.widget.TextView[@text='Create new contact']")
    static protected MobileElement createNewContactBtn1;

    @AndroidFindBy(xpath = "//android.widget.EditText[@text='First name']")
    static protected MobileElement firstNameTxtbox;

    @AndroidFindBy(xpath = "//android.widget.EditText[@text='Phone']")
    static protected MobileElement mobileNoField;


    @AndroidFindBy(xpath = "//android.widget.EditText[@text='Email']")
    static protected MobileElement emaiIDField;

    @AndroidFindBy(xpath = "//android.widget.Button[@text='SAVE']")
    static protected MobileElement saveBtnClick;


    @AndroidFindBy(xpath = "//android.widget.TextView[@text='Contacts']")
    static protected MobileElement contactTabClick;

    @AndroidFindBy(xpath = "//android.widget.ImageButton[@content-desc='key pad']")
    static protected MobileElement dialerNumberbtn;

    @AndroidFindBy(xpath = "//android.widget.ImageButton[@content-desc=\"dial\"]")
    static protected MobileElement dialerCallBtn;

    @AndroidFindBy(xpath = "android.widget.ImageButton[@content-desc='End call']")
    static protected MobileElement endCallBtnClick;


    /**
     * add photos and delete contacts
     */




}
