package CalculatorApp;

import Utils.Base;

import static CalculatorApp.CalculatorAppObjectRepo.*;

public class CalculatorApp extends Base{

    public CalculatorAppObjectRepo car;

    public CalculatorApp()
    {
        car= new CalculatorAppObjectRepo(driver);
    }


    public static void verifyCalculatorFlow()
    {
        try
        {
            btn2Click.click();
            btnAddClick.click();
            btn5Click.click();
            equalBtnClick.click();
            Thread.sleep(2000);
            //equalBtnClick.click();

        }
        catch (Exception e)
        {
            e.getMessage();

        }
    }

    public static boolean getCalculatedValue()
    {
        System.out.println(resultValue.getText());
        return getCalculatedValue();
    }






}
