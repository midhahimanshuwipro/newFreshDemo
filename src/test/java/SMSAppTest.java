import io.appium.java_client.MobileElement;
import io.appium.java_client.pagefactory.AndroidFindBy;
import org.testng.Assert;
import org.testng.annotations.Test;

public class SMSAppTest extends TestBase{











    @Test
    public void verifyWelcomeScreenPopUP() throws Exception
    {
        driver.resetApp();
        Pages.SMSApp().clickOKBtn();
        Assert.assertTrue(Pages.SMSApp().clickOKBtn());
    }


    @Test
    public void verifyMoreOption1stValue() throws Exception
    {
        driver.resetApp();
        Pages.SMSApp().clickOKBtn();
        Pages.SMSApp().clickElipsesBtn();
        Assert.assertEquals(Pages.SMSApp().messageOnWebBtn(),"Messages for web");
    }


    //@Test
    public void verifyArchievedButton() throws Exception
    {
        //driver.resetApp();
        Pages.SMSApp().clickOKBtn();
        Pages.SMSApp().clickElipsesBtn();
        Pages.SMSApp().verifyArchievedBtn();
        String expected = "Archived conversations appear here";
        String actual = Pages.SMSApp().verifyArchievedViewScreen();
        Assert.assertEquals(expected, actual);
    }


    @Test
    public void verifySpamAndBlockedButton() throws Exception
    {
        driver.resetApp();
        Pages.SMSApp().clickOKBtn();
        Pages.SMSApp().clickElipsesBtn();
        Pages.SMSApp().verifySpamAndBlockedBtn();
        String expected = "Spam & blocked conversations will appear here";
        String actual = Pages.SMSApp().verifySpamAndBlockedDetailPage();
        Assert.assertEquals(expected, actual);

    }

//..
    @Test
    public void verifySettingButton() throws Exception
    {
        try
        {
            driver.resetApp();
            Pages.SMSApp().clickOKBtn();
            Pages.SMSApp().clickElipsesBtn();
            Assert.assertTrue(Pages.SMSApp().verifySettingBtn());


        }
        catch (Exception e)
        {
            Assert.fail();
            System.out.println("unable to click Setting Button");
        }
    }



    @Test
    public void verifyHelpAndFeedbackButton() throws Exception
    {
        try
        {
            driver.resetApp();
            Pages.SMSApp().clickOKBtn();
            Pages.SMSApp().clickElipsesBtn();
            //Assert.assertTrue(Pages.SMSApp().verifyHelpAndFeedbackBtn());
            //Assert.assertTrue(driver.getPageSource().contains("Support"));

        }
        catch (Exception e)
        {
            Assert.fail();
        }
    }





    @Test
    public void verifyMessageFlow() throws Exception {
        driver.resetApp();
        Pages.SMSApp().clickStartChatButton();
        Pages.SMSApp().verifyNewConversationScreen();
        Pages.SMSApp().enterToField();
        Pages.SMSApp().enterMessageField();
        Pages.SMSApp().clickStartChatButton();
    }




    /**
     * Precondition: there should be any sms in the app.
     */
    @Test
    public void verifyElipsesMakeACallBtn()
    {
        driver.resetApp();
        Pages.SMSApp().clickStartChatButton();
        Pages.SMSApp().verifyNewConversationScreen();
        Pages.SMSApp().verifyMoreOptionBtn();
        Assert.assertTrue(Pages.SMSApp().verifyMakeAcallBn());
    }



}
