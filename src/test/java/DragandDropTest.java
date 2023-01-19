import io.qameta.allure.Description;
import org.testng.Assert;
import org.testng.annotations.Test;

public class DragandDropTest extends TestBase {

    @Test
    @Description("Verify whether user is able to drag and drop the items like Java, Php, React etc")
    public  void VerifyTheDragAnDrop(){
        try {
            Assert.assertTrue(Pages.DragandDropPage().dragAndDropIcons());
        }catch (Exception e){
            Assert.fail("DragAndDropTest Failed");
        }
    }
}
