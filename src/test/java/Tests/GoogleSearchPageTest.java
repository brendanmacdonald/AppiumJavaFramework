package Tests;

import Framework.App;
import Framework.TestBase;
import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class GoogleSearchPageTest extends TestBase {

    @BeforeMethod
    public void visitGoogleHomePage()   {
        String url = App.GoogleSearchPage().getGoogleURL();
        App.driver.get(url);
    }

    @Test
    public void test001()   {
        Assert.assertTrue(App.GoogleSearchPage().signInButton.isDisplayed());
        App.GoogleSearchPage().signInButton.click();
    }

    @Test
    public void test002()  {
        Assert.assertTrue(App.GoogleSearchPage().signInButton.isDisplayed());
        App.GoogleSearchPage().signInButton.click();
    }
}
