import Utils.Base;
import Utils.PropertyReader;
import io.appium.java_client.AppiumDriver;
import io.appium.java_client.MobileElement;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;

import java.net.URL;
import java.util.concurrent.TimeUnit;

public class TestBase {
 public static AppiumDriver driver;

    @BeforeClass
    public static void LaunchingTheApp() throws Exception {

        DesiredCapabilities cap = new DesiredCapabilities();
        //cap.setCapability("app",  PropertyReader.getPropValues("config.properties").get("APP"));
        cap.setCapability("appPackage", PropertyReader.getPropValues("config.properties").get("appPackage"));
        cap.setCapability("appActivity", PropertyReader.getPropValues("config.properties").get("appActivity"));
        cap.setCapability("platformVersion", PropertyReader.getPropValues("config.properties").get("platformVersion"));
        cap.setCapability("platformName", PropertyReader.getPropValues("config.properties").get("platformName"));
        cap.setCapability("deviceName", PropertyReader.getPropValues("config.properties").get("deviceName"));
        cap.setCapability("udid", PropertyReader.getPropValues("config.properties").get("Udid"));
        cap.setCapability("automationName", PropertyReader.getPropValues("config.properties").get("automationName"));
        cap.setCapability("headspin:capture", PropertyReader.getPropValues("config.properties").get(true));
        cap.setCapability("autoGrantPermissions",true);
        cap.setCapability("unicodeKeyboard", true);
        cap.setCapability("resetKeyboard",true);




        cap.setCapability("automationName", PropertyReader.getPropValues("config.properties").get("automationName"));

        //URL url = new URL("https://dev-us-mia-0.headspin.io:7018/v0/86b1f5e8842f49bbbf920da797f2ad15/wd/hub");
        URL url = new URL("https://dev-us-mia-0.headspin.io:7018/v0/b39f0dc421404431bf463542d6a0d1aa/wd/hub");

        //URL url = new URL("https://midhahimanshu:344c6d7d-56a5-4bbb-a919-7dae13c3ace4@ondemand.us-west-1.saucelabs.com:443/wd/hub");



        //URL url = new URL("http://127.0.0.1:4723/wd/hub");
        driver = new AppiumDriver<MobileElement>(url, cap);
        driver.manage().timeouts().implicitlyWait(2, TimeUnit.SECONDS);
//        System.out.println(driver.getSessionDetails());
        Base.driver=driver;
    }

//    @AfterTest
//    public void closeTheApp(){
//
//        System.out.println("Quiting the app");
//        driver.quit();
//    }

    @AfterTest
    @AfterClass
    public void teardown()
    {
        try {
            System.out.println("Quiting the app");
            driver.closeApp();
            driver.quit();
        }
        catch(Exception e) {
            System.out.println(e);
//            throw new RuntimeException("Driver was already killed");
        }
    }

}
