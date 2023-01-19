import org.testng.Assert;
import org.testng.annotations.Test;

public class CalculatorAppTest extends TestBase {


    @Test
    public void verifyCalculatorFlow()
    {
        driver.resetApp();
        Pages.CalculatorApp().verifyCalculatorFlow();
        Assert.assertTrue(Pages.CalculatorApp().getCalculatedValue());
        //Integer ss = 7;
        //Assert.assertEquals(Pages.CalculatorApp().verifyCalculatorFlow(),ss);
    }



}
