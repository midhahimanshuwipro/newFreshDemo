import org.testng.Assert;
import org.testng.annotations.Test;

public class SettingsPageTest extends TestBase {


/**
 * Verify Battery Status
 * Verify Data Network able to turn on/off.
 * Menu Options to turn data on/off
 * Verify the device displays the informations from About Phone.
 * Verify/change Application Manager settings
 * Verify able to show 12/24hr format that is time changes to 03:30 to 15:30
 * Verify devices able to remove all security locks and verify it works properly.
 * verify emergency call can be generated in lock screen and security mode.
 *
 *
 *
 */

/**
 * Calls
 *
 */


    @Test
    public void verifyNetworkAndSettingOption()
    {
        try
        {
            driver.resetApp();
            Pages.SettingsPage().verifynetworkAndnternetOption();
            Assert.assertTrue(Pages.SettingsPage().verifynetworkAndnternetOption());
        }
        catch (Exception e)
        {
            Assert.fail();
        }
    }





    @Test
    public void verifyBatterStatus()
    {
        try
        {
            driver.resetApp();
            Pages.SettingsPage().verifyBatteryBtn();
            String actual = Pages.SettingsPage().verifyBatterPercentage();
            Assert.assertTrue(Boolean.parseBoolean(actual));
        }
        catch (Exception e)
        {
            Assert.fail();
        }
    }


}
