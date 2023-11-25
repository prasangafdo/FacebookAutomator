import com.facebook.function.Login;
import com.facebook.function.Messages;
import com.facebook.function.Wall;
import com.facebook.page.WallPage;
import org.testng.asserts.SoftAssert;

public class FacebookAutomator {
    public static void main(String[] args) {
        SoftAssert softAsset = new SoftAssert();
        Login.loginWithCredentials("prasangafdz@outlook.com","Devil18@#");
        softAsset.assertTrue(Wall.isHomeButtonDisplaying(),"Home button is not displaying");
        Wall.navigateToMessagesByURL();
        Messages.gatherNumberOfTreads();
        softAsset.assertAll();
    }
}
