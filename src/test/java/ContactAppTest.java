import org.testng.Assert;
import org.testng.annotations.Test;

public class ContactAppTest extends TestBase{


    @Test
    public void verifyCreateNewContact()
    {
        try
        {
            driver.resetApp();
            Pages.ContactPage().verifyIsContactPageDisplayed();
            Pages.ContactPage().clickAddTofavBtn();
            Pages.ContactPage().clickcreateNewContactBtn();
            Pages.ContactPage().createNewContacttxt();
            Pages.ContactPage().enterEmailID();
            Thread.sleep(2000);
            Assert.assertTrue(Pages.ContactPage().clickSaveBtn());


        }
        catch (Exception e)
        {
            Assert.fail();
        }
    }



    @Test
    public void verifyCallFlow()
    {
        try
        {
            driver.resetApp();
            //Pages.ContactPage().clickContactTab();
            Pages.ContactPage().verifyIsContactPageDisplayed();
            Pages.ContactPage().clickDialerTab();
            Assert.assertTrue(Pages.ContactPage().clickEndCallBtn());
        }
        catch (Exception e)
        {
            Assert.fail();
            System.out.println("Unable to verify");
        }
    }


    @Test
    public void verifyCreatedContactIsDisplayed() throws Exception
    {

            driver.resetApp();
            Pages.ContactPage().clickContactTab();
            Pages.ContactPage().clickcreateNewContactBtn();
            boolean data = Pages.ContactPage().verifyCreatedContactIsVisibleOnContactList();
            Assert.assertTrue(data);

    }





}
