package SettingsPage;

import Utils.Base;

  public class SettingsPage extends Base {

    public static SettingsPageObjectRepo spr;
    public SettingsPage()
    {
        spr=new SettingsPageObjectRepo(driver);
    }

    /**
     *
     */

    public boolean verifynetworkAndnternetOption()
    {
        try
        {
            if(spr.networkAndInternetBtn.isDisplayed()| spr.networkAndInternetBtn.isEnabled())
            {
                spr.networkAndInternetBtn.click();
                return true;
            }
        }
        catch (Exception e)
        {
            System.out.println(e.getMessage());
            return false;
        }
        return false;
    }





    public boolean verifyConnectedDeviceBtn()
    {
        try
        {
            if(spr.connectedDeviceBtn.isDisplayed()| spr.connectedDeviceBtn.isEnabled())
            {
                spr.connectedDeviceBtn.click();
                return true;
            }
        }
        catch (Exception e)
        {
            System.out.println(e.getMessage());
            return false;
        }
        return false;
    }



    public boolean verifyAppsAndNotificationBtn()
    {
        try
        {
            if(spr.appAndNotificationBtn.isDisplayed()| spr.appAndNotificationBtn.isEnabled())
            {
                spr.appAndNotificationBtn.click();
                return true;
            }
        }
        catch (Exception e)
        {
            System.out.println(e.getMessage());
            return false;
        }
        return false;
    }



    public boolean verifyBatteryBtn()
    {
        try
        {
            if(spr.batteryBtn.isDisplayed()| spr.batteryBtn.isEnabled())
            {
                spr.batteryBtn.click();
                return true;
            }
        }
        catch (Exception e)
        {
            System.out.println(e.getMessage());
            return false;
        }
        return false;
    }



    public static String verifyBatterPercentage()
    {
       String str = spr.getBatterPercentage.getText();
       return str;
    }



    public boolean verifyDisplayBtn()
    {
        try
        {
            if(spr.displayBtn.isDisplayed()| spr.displayBtn.isEnabled())
            {
                spr.displayBtn.click();
                return true;
            }
        }
        catch (Exception e)
        {
            System.out.println(e.getMessage());
            return false;
        }
        return false;
    }


    public boolean verifySoundBtn()
    {
        try
        {
            if(spr.soundBtn.isDisplayed()| spr.soundBtn.isEnabled())
            {
                spr.soundBtn.click();
                return true;
            }
        }
        catch (Exception e)
        {
            System.out.println(e.getMessage());
            return false;
        }
        return false;
    }


    public boolean verifyStorageBtn()
    {
        try
        {
            if(spr.storageBtn.isDisplayed()| spr.storageBtn.isEnabled())
            {
                spr.storageBtn.click();
                return true;
            }
        }
        catch (Exception e)
        {
            System.out.println(e.getMessage());
            return false;
        }
        return false;
    }


    public boolean verifyPrivacyBtn()
    {
        try
        {
            if(spr.privacyBtn.isDisplayed()| spr.privacyBtn.isEnabled())
            {
                spr.privacyBtn.click();
                return true;
            }
        }
        catch (Exception e)
        {
            System.out.println(e.getMessage());
            return false;
        }
        return false;
    }









}
