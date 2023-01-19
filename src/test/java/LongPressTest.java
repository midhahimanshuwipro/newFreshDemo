import io.qameta.allure.Description;
import org.testng.Assert;
import org.testng.annotations.Test;

public class LongPressTest extends TestBase {




    @Test
  @Description("Verify whether 'Close' text is displayed when user long press the Image")
    public void VerifyTheCloseIconInTheLongPressScreen(){

    try{
        Assert.assertTrue(Pages.LongPressPage().VerifyTheCloseIcon());
    }catch(Exception e){
        Assert.fail("VerifyTheCloseIconInTheLongPressScreen is failed");

    }


}
}
