import com.facebook.function.Login;
import com.facebook.function.Messages;
import com.facebook.function.Wall;
import com.facebook.page.WallPage;
import org.testng.asserts.SoftAssert;

public class FacebookAutomator {
    public static void main(String[] args) throws InterruptedException {
        SoftAssert softAsset = new SoftAssert();
        Login.loginWithCredentials("","");
        softAsset.assertTrue(Wall.isHomeButtonDisplaying(),"Home button is not displaying");
        Wall.navigateToMessagesByURL();
        Messages.gatherNumberOfTreads();
        Messages.deleteChats();
        softAsset.assertAll();
    }
}//div[@class='x1n2onr6']/div
