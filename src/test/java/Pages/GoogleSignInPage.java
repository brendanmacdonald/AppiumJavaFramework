package Pages;

import Framework.AppControl;
import org.openqa.selenium.By;

/**
 * Google 'Image' page
 */
public class GoogleSignInPage {

    public GoogleSignInPage() {
        /* Empty constructor */
    }

    // URL
    public String googleSignInURL = "https://accounts.google.com/signin";

    // Page elements.
    public AppControl emailOrPhoneEdit = new AppControl(By.id("identifierId"));
    public AppControl nextBtn = new AppControl(By.id("identifierNext"));
}
