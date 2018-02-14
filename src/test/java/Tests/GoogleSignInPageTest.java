package Tests;

import Framework.App;
import Framework.TestBase;
import org.testng.Assert;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class GoogleSignInPageTest extends TestBase {


    @BeforeTest
    public void visitGoogleHomePage() throws InterruptedException {
        String url = App.GoogleSearchPage().getGoogleURL();
        App.driver.get(url);
    }

    @Test
    public void test002() {
        Assert.assertTrue(App.GoogleSearchPage().signInButton.isDisplayed());
        App.GoogleSearchPage().signInButton.click();

        // Assert URL is correct.
        String currentURL = App.driver.getCurrentUrl();
        Assert.assertTrue(currentURL.contains(App.GoogleSignInPage().googleSignInURL));

        // Assert Email or Phone field is displayed.
        Assert.assertTrue(App.GoogleSignInPage().emailOrPhoneEdit.isDisplayed());

        // Fill in Email or Phone field and press NEXT.
        App.GoogleSignInPage().emailOrPhoneEdit.sendKeys("someone@gmail.com");
        App.GoogleSignInPage().nextBtn.click();
    }

    @Test
    @Parameters({"username", "password"})
    public void test003(String username, String password) {
        System.out.println(username);
        System.out.println(password);
    }
}
