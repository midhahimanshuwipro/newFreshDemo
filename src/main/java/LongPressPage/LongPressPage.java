package LongPressPage;

import Utils.Base;

public class LongPressPage extends Base {
    public LongPressPageObjectRepo lp;
    public LongPressPage(){
        lp=new LongPressPageObjectRepo(driver);
    }
    public boolean VerifyTheCloseIcon() throws InterruptedException {
        waitUntilElementIsVisible(lp.longpress);
        System.out.println("Gesture:"+ lp.longpress);
        lp.longpress.click();

        LongPress(lp.img);


        //System.out.println("Close icon should be displayed");
        return lp.close.isDisplayed();
   }


    public static void test()
    {
        sleep(1000);
    }

}
