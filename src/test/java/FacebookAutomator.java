import com.facebook.function.Login;
import com.facebook.function.Messages;
import com.facebook.function.Wall;
import org.testng.asserts.SoftAssert;

public class FacebookAutomator {
    public static void main(String[] args) throws InterruptedException {
        SoftAssert softAsset = new SoftAssert();
        Login.loginWithCredentials(".com","#");
        softAsset.assertTrue(Wall.isHomeButtonDisplaying(),"Home button is not displaying");
        Wall.navigateToMessagesByURL();
        Messages.gatherNumberOfTreads();
        Messages.deleteChats();
//        Login.endSession();
        softAsset.assertAll();

    }
}//div[@class='x1n2onr6']/div
