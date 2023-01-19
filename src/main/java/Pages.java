
import CalculatorApp.CalculatorApp;
import ContactPage.ContactPage;
import DoubleTapPage.DoubleTapPage;
import DragandDropPage.DragandDropPage;
import LongPressPage.LongPressPage;
import PinchZoomPage.PinchZoomPage;
import SMSPage.SMSApp;
import ScrollPage.ScrollPage;
import SettingsPage.SettingsPage;
import SliderPage.SliderPage;
import SwipeLeftPage.SwipeLeftPage;
import Utils.Base;

public class Pages {
    private static <T extends Base> T getPage(Class<T> pageType)  {
        T page;
        try {
            page = pageType.newInstance();
        } catch (InstantiationException e) { //make sure you use JDK 1.7
            throw new RuntimeException(e);
        } catch (IllegalAccessException e) {
            throw new RuntimeException(e);
        }

        return page;
    }

    public static DoubleTapPage DoubleTapPage(){return getPage(DoubleTapPage.class);}
    public static LongPressPage LongPressPage(){return getPage(LongPressPage.class);}
    public static ScrollPage ScrollPage(){return getPage(ScrollPage.class);}
    public static DragandDropPage DragandDropPage(){return getPage(DragandDropPage.class);}

    public static SliderPage SliderPage(){return getPage(SliderPage.class);}
    public static SwipeLeftPage SwipeLeftPage(){return getPage(SwipeLeftPage.class);}
    public static PinchZoomPage PinchZoomPage(){return getPage(PinchZoomPage.class);}
    public static SMSApp SMSApp(){return getPage(SMSApp.class);}
    public static SettingsPage SettingsPage(){return getPage(SettingsPage.class);}
    public static ContactPage ContactPage(){return getPage(ContactPage.class);}
    public static CalculatorApp CalculatorApp(){return getPage(CalculatorApp.class);}








}
