package Tests;

import Framework.App;
import Framework.TestBase;
import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class GoogleSignInPageTest extends TestBase {


    @BeforeMethod
    public void visitGoogleHomePage() {
        String url = App.GoogleSearchPage().getGoogleURL();
        App.driver.get(url);
    }

    @Test
    @Parameters({"username", "password"})
    public void test003(String username, String password) {
        Assert.assertTrue(App.GoogleSearchPage().signInButton.isDisplayed());
        App.GoogleSearchPage().signInButton.click();

        // Assert URL is correct.
        String currentURL = App.driver.getCurrentUrl();
        Assert.assertTrue(currentURL.contains(App.GoogleSignInPage().googleSignInURL));

        // Assert Email or Phone field is displayed.
        Assert.assertTrue(App.GoogleSignInPage().emailOrPhoneEdit.isDisplayed());

        // Fill in Email or Phone field and press NEXT.
        App.GoogleSignInPage().emailOrPhoneEdit.sendKeys(username);
        App.GoogleSignInPage().nextBtn.click();
    }
}
