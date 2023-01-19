package ContactPage;


import Utils.RandomData;
import com.github.javafaker.Faker;
import io.appium.java_client.TouchAction;
import org.apache.commons.lang3.RandomStringUtils;

import Utils.Base;

import static ContactPage.ContactPageObjectRepo.emaiIDField;

public class ContactPage extends Base {



    static RandomData rd = new RandomData();

    public static ContactPageObjectRepo cp;


    public  ContactPage()
    {
        cp= new ContactPageObjectRepo(driver);
    }


    //driver.hideKeyboard();


    public static void verifyIsContactPageDisplayed()
    {
        waitUntilElementIsVisible(cp.addToFavBtn);
    }


    public static boolean clickAddTofavBtn()
    {
        if(cp.addToFavBtn.isEnabled() | cp.addToFavBtn.isDisplayed())
        {
            cp.addToFavBtn.click();
            return true;
        }
        else
            System.out.println("unable to find add to Favourite Btn");
        return false;
    }


    public static boolean clickcreateNewContactBtn() {
        try {
            if (cp.createNewContactBtn.isDisplayed() | cp.createNewContactBtn.isEnabled()) {
                ContactPageObjectRepo.createNewContactBtn.click();
                Thread.sleep(2000);

            } else
                cp.createNewContactBtn1.click();
            return true;
        }
        catch (Exception e)
        {
            cp.createNewContactBtn1.click();
        }
        return true;
    }


    public static void createNewContacttxt() throws Exception
    {
        Faker faker = new Faker();
        String firstName = faker.name().firstName(); // Emory
        cp.firstNameTxtbox.sendKeys(firstName);
        String mobileNumber = generateRandomNumber();
        //Thread.sleep(2000);
        cp.mobileNoField.sendKeys(mobileNumber);
    }

    private static String generateRandomNumber() {
        return RandomStringUtils.randomNumeric(10);
    }

    public static void enterEmailID()
    {
        emaiIDField.sendKeys(getEmailID());
    }

    private static CharSequence getEmailID() {
        String str= RandomStringUtils.randomAlphanumeric(10);
        String ssFinal = str.concat("@gmail.com");
        return ssFinal;
        //return RandomStringUtils.randomAlphanumeric(10);
    }

    public static boolean clickSaveBtn()
    {
        cp.saveBtnClick.click();
        return true;
    }



    public static boolean clickDialerTab()
    {
        try
        {
            cp.dialerNumberbtn.click();
            cp.dialerCallBtn.click();
            cp.dialerCallBtn.click();
            return true;
        }
        catch (Exception e)
        {
            return false;
        }
    }

    public static boolean clickEndCallBtn()
    {
        cp.endCallBtnClick.click();
        return true;
    }

    /**
     *
     * for verifying created contact visible or not!!!
     */


    public static void clickContactTab()
    {
        try
        {
            cp.contactTabClick.click();
        }
        catch (Exception e)
        {
            e.getMessage();
        }

    }

    public static String getFirstName()
    {
        try
        {

           String firstName = rd.getFirstName();
           return firstName;
        }
        catch (Exception e)
        {
            System.out.println(e.getMessage());
            return null;
        }
    }


    public static boolean verifyCreatedContactIsVisibleOnContactList() throws Exception
    {
        try
        {
            cp.firstNameTxtbox.sendKeys(getFirstName());
            cp.saveBtnClick.click();
            return true;
        }
        catch (Exception e)
        {
            e.getMessage();
            return false;
        }


    }





}
