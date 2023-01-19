package Utils;

import io.appium.java_client.AppiumDriver;
import io.appium.java_client.MobileElement;
import io.appium.java_client.MultiTouchAction;
import io.appium.java_client.TouchAction;
import io.appium.java_client.touch.TapOptions;
import io.appium.java_client.touch.WaitOptions;
import io.appium.java_client.touch.offset.ElementOption;
import io.appium.java_client.touch.offset.PointOption;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;


public class Base {

    public static long wait = 90;
    public static AppiumDriver driver;


    public void tapGesture(WebElement element) {
        TouchAction t = new TouchAction(driver);
        t.tap(TapOptions.tapOptions().withPosition(PointOption.point(element.getLocation().x + element.getSize().width / 2, element.getLocation().y))
                .withTapsCount(2)).perform();

    }

    public void doubleTap(WebElement element) {
        TouchAction t = new TouchAction(driver);
        t.tap(TapOptions.tapOptions()
                .withElement(ElementOption.element(element))
                .withTapsCount(2))
                .perform();
    }

    public void LongPress(MobileElement img) {
        new TouchAction(driver).longPress(PointOption.point(img.getCenter())).release().perform();

    }

    public static boolean isElementVisible(WebElement element) {
        try {
            return element.isDisplayed();
        } catch (NoSuchElementException e) {
            System.out.println("exception occured");
            return false;
        }

    }

    public static void sleep(int timeout) {
        try {
            Thread.sleep(timeout);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }




//    public static void creareFakdata()
//    {
//        Faker faker = new Faker();
//
//        String name = faker.name().fullName(); // Miss Samanta Schmidt
//        String firstName = faker.name().firstName(); // Emory
//        String lastName = faker.name().lastName(); // Barton
//
//        String streetAddress = faker.address().streetAddress();
//    }

    public static void waitUntilElementIsVisible(WebElement element) {
        try {
            WebDriverWait wwait = new WebDriverWait(driver, wait);
            wwait.until(ExpectedConditions.visibilityOf(element));
        } catch (Exception e) {
            System.out.println("exception occured");
        }
    }

    public static void scrollUp(int stepSize) {
        Dimension size = driver.manage().window().getSize();
        int startx = (int) (size.width * 0.5);
        int starty = (int) (size.height * 0.90);
        int endy = (int) (size.height * (0.40));
        TouchAction ta = new TouchAction(driver);
        ta.press(PointOption.point(startx, starty))
                .waitAction(WaitOptions.waitOptions(Duration.ofMillis(stepSize)))
                .moveTo(PointOption.point(startx, endy))
                .release()
                .perform();
    }

    public static void draganddrop(WebElement element1, WebElement element2) {
        TouchAction ta = new TouchAction(driver);
        ta.longPress(ElementOption.element(element1))
                .moveTo(ElementOption.element(element2))
                .release()
                .perform();
    }





    public static void swipeLeft(WebElement element) {

        int y = element.getSize().getHeight();
        int startX = (int) (element.getSize().getWidth() * 0.9);
        int endX = (int) (element.getSize().getWidth() * 0.1);

        new TouchAction(driver)
                .press(PointOption.point(startX, y))
                .waitAction(WaitOptions.waitOptions(Duration.ofMillis(1000)))
                .moveTo(PointOption.point(endX, y))
                .release().perform();


    }


    public static void dragAndDrop(WebElement element1, WebElement element2) {
        TouchAction action = new TouchAction(driver);
        action.longPress(ElementOption.element(element1))
                .moveTo(ElementOption.element(element2))
                .release()
                .perform();
    }

    public static boolean checkVisibilityOfElement(WebElement element) {
        try {
            if (element.isDisplayed())
                return false;
            return true;
        } catch (Exception e) {
            System.out.println("Element is not visible and Test case passed");
            return true;
        }


    }

    public void Slider(WebElement seekBar) {
        System.out.println("Inside slider method");

        TouchAction action = new TouchAction(driver);

        action.tap(PointOption.point(seekBar.getSize().width, seekBar.getLocation().y + seekBar.getSize().height / 2)).perform();

        action.press(PointOption.point((int) (seekBar.getLocation().x + 30), (seekBar.getLocation().y + seekBar.getSize().height / 2)))
                .waitAction(WaitOptions.waitOptions(Duration.ofMillis(1000)))
                .moveTo(PointOption.point(seekBar.getSize().width / 2, (seekBar.getLocation().y + seekBar.getSize().height / 2)))
                .release()
                .perform();


    }


    public void PinchZoomIn(MobileElement element) {

        TouchAction action1 = new TouchAction(driver);
        TouchAction action2 = new TouchAction(driver);

        action1.press(PointOption.point(element.getCenter().x + 10, element.getCenter().y))
                .waitAction(WaitOptions.waitOptions(Duration.ofMillis(2000)))
                .moveTo(PointOption.point(element.getCenter().x + 10, element.getCenter().y + 100)).release();

        action2.press(PointOption.point(element.getCenter().x - 10, element.getCenter().y))
                .waitAction(WaitOptions.waitOptions(Duration.ofMillis(2000)))
                .moveTo(PointOption.point(element.getCenter().x - 10, element.getCenter().y - 100)).release();

        MultiTouchAction multi = new MultiTouchAction(driver);

        multi.add(action1).add(action2).perform();


    }

    public void PinchZoomOut(MobileElement element) {

        TouchAction action1 = new TouchAction(driver);
        TouchAction action2 = new TouchAction(driver);

        action1.press(PointOption.point(element.getCenter().x + 10, element.getCenter().y + 100))
                .waitAction(WaitOptions.waitOptions(Duration.ofMillis(2000)))
                .moveTo(PointOption.point(element.getCenter().x + 10, element.getCenter().y)).release();

        action2.press(PointOption.point(element.getCenter().x - 10, element.getCenter().y - 100))
                .waitAction(WaitOptions.waitOptions(Duration.ofMillis(2000)))
                .moveTo(PointOption.point(element.getCenter().x - 10, element.getCenter().y)).release();

        MultiTouchAction multi = new MultiTouchAction(driver);

        multi.add(action1).add(action2).perform();


    }

    public void swipe_Left(MobileElement element, int time) {

        TouchAction t = new TouchAction(driver);
        Dimension frame = driver.manage().window().getSize();

        int startx = (int) ((element.getSize().width) * 0.90);
        int starty = element.getCenter().y;

        int endx = (int) ((element.getSize().width) * 0.20);
        int endy = element.getCenter().y;

        //swipeLeft
        t.press(PointOption.point(startx, starty))
                .waitAction(WaitOptions.waitOptions(Duration.ofMillis(time)))
                .moveTo(PointOption.point(endx, endy)).release().perform();


//        t.press(PointOption.point(endx,endy))
//                .waitAction(WaitOptions.waitOptions(Duration.ofMillis(200)))
//                .moveTo(PointOption.point(startx,starty)).release().perform();

        System.out.println("Swipe Left was successfull");
    }


    public static void scrollUp() {
        scrollVerticallWithCords(0, -250);
        sleep(20000);
    }

    public static void scrollVerticallWithCords(int startValue, int endValue) {
        try {
            ((JavascriptExecutor) driver).executeScript("scroll(" + startValue + "," + endValue + " );");
            Thread.sleep(2000);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
    public static void tap(WebElement locator, int timeout) {
        try {
      //new WebDriverWait(driver, timeout).until(ExpectedConditions.visibilityOf(locator));
            new TouchAction(driver).tap(PointOption.point(locator.getLocation())).perform();
            System.out.println(" click success");
        } catch (Exception e) {
            System.out.println(locator + " element was not clickable");
        }
    }



}