package SMSPage;

import Utils.Object_base;
import io.appium.java_client.AppiumDriver;
import io.appium.java_client.MobileElement;
import io.appium.java_client.pagefactory.AndroidFindBy;

public class SMSAppObjectRepo extends Object_base {
    public static AppiumDriver driver;

    public  SMSAppObjectRepo(AppiumDriver driver) {
        super(driver);
    }

 /**
  * Welcome Screen test cases
  */
   @AndroidFindBy(xpath = "//android.widget.Button[@text='OK']")
    static protected MobileElement okBtnWelcomeScreen;


   @AndroidFindBy(xpath = "//android.widget.ImageView[@content-desc=\"More options\"]")
   static protected MobileElement moreOptionElipsesBtnClick;

   @AndroidFindBy(xpath = "//android.widget.TextView[@text=\"Messages for web\"]")
   static protected MobileElement messageOnWebOption;


   @AndroidFindBy(xpath = "//android.widget.TextView[@text=\"Archived\"]")
   static protected MobileElement archievedOptionBtn;

   @AndroidFindBy(xpath = "//android.widget.TextView[@text=\"Archived conversations appear here\"]")
   static protected MobileElement archievedScreenDetailView;

    @AndroidFindBy(xpath = "//android.widget.TextView[@text=\"Spam & blocked\"]")
    static protected MobileElement spamAndBlockedBtn;

    @AndroidFindBy(xpath = "//android.widget.TextView[@content-desc=\"Spam & blocked conversations will appear here\"]")
    static protected MobileElement spamAndBlockedDetailPage;


    @AndroidFindBy(xpath = "//android.widget.TextView[@text=\"Settings\"]")
    static protected MobileElement settingBtn;


    @AndroidFindBy(xpath = "//android.widget.TextView[@text=\"Help & feedback\n\"]")
    static protected MobileElement HelpAndFeedbackbtn;
    ;



    @AndroidFindBy(xpath = "//android.widget.TextView[@text='Messages']")
    static protected MobileElement messageApplaunchScreentxt;

    @AndroidFindBy(xpath = "//android.widget.TextView[@content-desc='Search messages']")
    static protected MobileElement searchIconSMSScreen;


 /**
  * Welcome Screen test cases......
  */


 /**
  * New SMS Screen TC..
  */



 @AndroidFindBy(xpath = "//android.widget.Button[@index=3]")
    static protected MobileElement startChatBtn;

    @AndroidFindBy(xpath = "//android.widget.TextView[@text='New conversation']")
    static protected MobileElement newConversationScreen;

    @AndroidFindBy(id = "com.google.android.apps.messaging:id/recipient_text_view")
    static protected MobileElement mobileNoField;
    //driver.pressKeyCode(66);
    //((AndroidDriver)driver).pressKeyCode(66);

    @AndroidFindBy(id = "com.google.android.apps.messaging:id/compose_message_text")
    static protected MobileElement textMessageField;

    @AndroidFindBy(id = "com.google.android.apps.messaging:id/send_message_button_icon")
    static protected MobileElement sendBtnClick;

    @AndroidFindBy(xpath = "//android.widget.ImageView[@content-desc=\"More options\"]")
    static protected MobileElement moreOptionElipsesBtn;



    @AndroidFindBy(id = "com.google.android.apps.messaging:id/action_call")
    static protected MobileElement makeACallBtn;


    @AndroidFindBy(xpath = "//android.widget.TextView[@content-desc=\"Search\"]")
    static protected MobileElement searchbtnClick;

    @AndroidFindBy(id = "com.google.android.apps.messaging:id/zero_state_search_box_auto_complete")
    static protected MobileElement searchScreendetailedPage;

    @AndroidFindBy(id = "com.google.android.apps.messaging:id/zero_state_search_box_back_button")
    static protected MobileElement backBtnFromSearchScreen;

    @AndroidFindBy(id = "com.google.android.apps.messaging:id/camera_gallery_button")
    static protected MobileElement cameraGalleryBtn;

    @AndroidFindBy(xpath = "com.google.android.apps.messaging:id/shutter_button")
    static protected MobileElement cameraShutterBtn;

    @AndroidFindBy(id = "com.google.android.apps.messaging:id/send_message_button_icon")
    static protected MobileElement sendMMSBtn;

    @AndroidFindBy(xpath = "//android.widget.LinearLayout[@content-desc=\"Explore more in Gallery\"]")
    static protected MobileElement galleryIconBtn;

    @AndroidFindBy(xpath = "//android.widget.ImageButton[@content-desc=\"Navigate up\"]")
    static protected MobileElement backBtnfromMesageViewPage;




}
