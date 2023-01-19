import Utils.PropertyReader;
import io.qameta.allure.Description;
import org.testng.Assert;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

public class DoubleTapPageTest extends TestBase {

    @Test
    @Description("Verify whether on double tapping the 'Double Tap Me' button a 'DoubleTap Successful' toast message is displayed or not")
    public void  VerifyTheDoubleTapSuccessMessage(){
        try {
//            String Actual = "DoubleTap Successful";
//            System.out.println("Actual is: " + Actual);
//            String Expected = Pages.DoubleTapPage().VerifyDoubleTapSuccessMessage();
//            System.out.println("Expected is: " + Expected);
//            Assert.assertEquals(Actual, Expected);

            Assert.assertTrue(Pages.DoubleTapPage().VerifyDoubleTapSuccessMessage());
        } catch (Exception e) {

            Assert.fail("VerifyTheDoubleTapSuccessMessage is Failed");
        }

    }

}
