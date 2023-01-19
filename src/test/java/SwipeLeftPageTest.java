import io.qameta.allure.Description;
import org.testng.Assert;
import org.testng.annotations.Test;

public class SwipeLeftPageTest extends TestBase{

    @Test
    @Description("Verify whether the 'Chat deleted Successful' toast message is displayed when user deletes any chat by left swiping any contact")
    public void VerifyToastMsgAfterDeletingChat(){

        try{
//            String actual = "Chat deleted Successful";
//            System.out.println("Actual Toast Message is: " + actual);
//            String expected = Pages.SwipeLeftPage().getToastMessageAfterDeletingChat();
//            System.out.println("Expected Toast Message is: " + expected);
//            Assert.assertEquals(actual, expected);

            Assert.assertTrue(Pages.SwipeLeftPage().getToastMessageAfterDeletingChat());

        }catch (Exception e){
            Assert.fail("VerifyToastMsgAfterDeletingChat is Failed");
        }
    }
}
