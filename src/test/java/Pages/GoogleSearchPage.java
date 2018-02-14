package Pages;

import org.openqa.selenium.By;
import Framework.AppControl;

/**
 * A login page
 */
public class GoogleSearchPage {

    public GoogleSearchPage() {
        /* Empty constructor */
    }

    // URL
    private String googleURL = "http://www.google.co.uk";

    // Page elements.
    public AppControl signInButton = new AppControl(By.linkText("Sign in"));
    public AppControl imageLink = new AppControl(By.linkText("IMAGES"));


    public String getGoogleURL() {
        return googleURL;
    }
}
