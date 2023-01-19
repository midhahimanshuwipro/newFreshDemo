import io.qameta.allure.Description;
import org.testng.Assert;
import org.testng.annotations.Test;

public class ScrollPageTest extends TestBase {
    @Test
    @Description("Verify whether user is able to scroll the contact list and able to see the last contact or not")
    public void VerifyTheScroll(){
        Assert.assertTrue(Pages.ScrollPage().VerifyTheScroll());
    }
}
