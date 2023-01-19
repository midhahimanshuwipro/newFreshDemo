package SwipeLeftPage;

import Utils.Base;

public class SwipeLeftPage extends Base {
    public SwipeLeftObjectRepo deleteChat;

    public SwipeLeftPage(){ deleteChat= new SwipeLeftObjectRepo(driver);}

    public boolean getToastMessageAfterDeletingChat() throws InterruptedException {
        SwipeLeftObjectRepo.swipe.click();
        Thread.sleep(2000);
        //swipeLeft(deleteChat.firstMsg);
        swipe_Left(deleteChat.firstMsg,1000);

        //SwipeLeftAgain(deleteChat.firstMsg);
       //String toastMsg = deleteChat.toast.getAttribute("content-desc");

       return deleteChat.toast.isDisplayed();
       //return toastMsg;
    }
}
