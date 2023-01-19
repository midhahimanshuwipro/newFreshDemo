import io.qameta.allure.Description;
import org.testng.Assert;
import org.testng.annotations.Test;

public class SliderPageTest extends TestBase {

    @Test
    @Description("Verify whether user is able to move the slider to 100 percent")
    public void VerifySliderToastMessage() {
        try {
            String actual = "Slider moved Successful";
            System.out.println("Actual Toast Message is: " + actual);
            String expected = Pages.SliderPage().slideSeekBarToHundredPercent();
            System.out.println("Expected Toast Message is: " + expected);
            Assert.assertEquals(actual, expected);
        } catch (Exception e) {
            Assert.fail("VerifySliderToastMessage is failed");
        }
    }
}
