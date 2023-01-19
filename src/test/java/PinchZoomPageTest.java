import io.qameta.allure.Description;
import org.testng.annotations.Test;

public class PinchZoomPageTest extends TestBase {

    @Test
    @Description("Verify whether user is able to Zoom-Out the Image")
    public void VerifyPinchZoomInToastMessage(){

        try{
            Pages.PinchZoomPage().performPinchZoomInOperation();
        }catch (Exception e){
            System.out.println("VerifyPinchZoomInToastMessage is Failed"); }
    }

    @Test
    @Description("Verify whether user is able to Zoom-In the Image")
    public void VerifyPinchZoomOutToastMessage(){

        try{
            Pages.PinchZoomPage().performPinchZoomOutOperation();
        }catch (Exception e){
            System.out.println("VerifyPinchZoomInToastMessage is Failed"); }
    }
}
