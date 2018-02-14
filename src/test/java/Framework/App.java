package Framework;

import Pages.*;
import io.appium.java_client.android.AndroidDriver;

/* Driver wrapper */
public class App {

    public static AndroidDriver driver;

    public static GoogleSearchPage GoogleSearchPage() {
        return new GoogleSearchPage();
    }
    public static GoogleSignInPage GoogleSignInPage() {
        return new GoogleSignInPage();
    }


}
