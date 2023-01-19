package SMSPage;

import Utils.Base;
import org.openqa.selenium.interactions.Actions;


  public class SMSApp extends Base {


    public static SMSAppObjectRepo sor;

    public SMSApp(){ sor = new SMSAppObjectRepo(driver);}



    public static boolean clickOKBtn() throws Exception
    {
        try
        {
            waitUntilElementIsVisible(sor.okBtnWelcomeScreen);
            sor.okBtnWelcomeScreen.click();
            Thread.sleep(2000);
            return true;
        }
        catch (Exception e)
        {
            return false;
        }
    }


    public static void  clickElipsesBtn()
    {
        sor.moreOptionElipsesBtnClick.click();

    }


    public static String messageOnWebBtn() throws Exception
    {
        Thread.sleep(2000);
        //moreOptionElipsesBtnClick.click();
        sor.messageOnWebOption.click();


        return sor.messageOnWebOption.getText();

    }


    public static void verifyArchievedBtn()
    {
        sor.archievedOptionBtn.click();
        waitUntilElementIsVisible(sor.archievedScreenDetailView);
    }




    public static String verifyArchievedViewScreen()
    {
        if(sor.archievedScreenDetailView.isDisplayed()| sor.archievedScreenDetailView.isDisplayed())
        {
            String str = sor.archievedScreenDetailView.getText();
            return str;
        }
        else
            System.out.println("unable to getArchieved detail Page");
        return null;
    }


    public static void verifySpamAndBlockedBtn()
    {
        sor.spamAndBlockedBtn.click();
    }

    public static String verifySpamAndBlockedDetailPage()
    {
        try
        {
            if(sor.spamAndBlockedDetailPage.isDisplayed() | sor.spamAndBlockedDetailPage.isEnabled())
            {
                String str = sor.spamAndBlockedDetailPage.getText();
                return str;
            }
        }
        catch (Exception e)
        {
            System.out.println(e.getMessage());
        }
        return null;
    }



    public static boolean verifySettingBtn()
    {
        try
        {
            if(sor.settingBtn.isDisplayed()| sor.settingBtn.isEnabled())
            {
                sor.settingBtn.click();
                return true;
            }
            else

                System.out.println("Unable to click Setting button!!");
            return false;
        }
        catch (Exception e)
        {
            System.out.println(e.getMessage());
        }
        return false;
    }


    public static boolean verifyHelpAndFeedbackBtn()
    {
        try
        {
            if(sor.HelpAndFeedbackbtn.isDisplayed() | sor.HelpAndFeedbackbtn.isEnabled())
            {
                sor.HelpAndFeedbackbtn.click();
                return true;
            }
            else
                System.out.println("Unable to click Help and Seting Button!!");
        }
        catch (Exception e)
        {
            System.out.println(e.getMessage());

        }
        return false;
    }



    public static void clickStartChatButton()
    {
        sor.startChatBtn.click();
    }






    public static void verifyNewConversationScreen()
    {
        if(sor.newConversationScreen.isDisplayed()| sor.newConversationScreen.isEnabled())
        {
            System.out.println("User is in the New Conversation Page");
            System.out.println(sor.newConversationScreen.getText());
        }


        else
        {
            System.out.println(("User is not in New Conversation Page"));
        }
    }



    public static void enterToField() throws Exception {
        //driver.findElement(By.xpath(props.getProperty(“mobile”))).click();
        sor.mobileNoField.click();
        Actions action = new Actions(driver);
        action.sendKeys("12345").perform();
        action.click();
        Thread.sleep(2000);
    }

    public static void enterMessageField() throws Exception
    {
        //mobileNoField.sendKeys("123456");
        Thread.sleep(3000);
        //((AndroidDriver<MobileElement>) driver).pressKey(new KeyEvent(AndroidKey.ENTER));
        sor.textMessageField.sendKeys("test");
        sor.sendBtnClick.click();

    }


    public static boolean verifyMoreOptionBtn()
    {

        try
        {
            sor.moreOptionElipsesBtn.click();
            return true;
        }
        catch (Exception e)
        {
            return false;
        }
    }


    public static boolean verifyMakeAcallBn()
    {
        try
        {
            sor.makeACallBtn.click();
            return true;
        }
        catch (Exception e)
        {
            return false;
        }
    }







}



