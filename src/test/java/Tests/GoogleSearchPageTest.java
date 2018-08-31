package Tests;

import Framework.App;
import Framework.TestBase;
import org.openqa.selenium.Keys;
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
    public void test001()  {
        Assert.assertTrue(App.GoogleSearchPage().searchText.isDisplayed());
        App.GoogleSearchPage().searchText.sendKeys("Cheddar cheese");
        App.GoogleSearchPage().searchText.sendKeys(Keys.ENTER);
        App.GoogleSearchPage().imageLink.click();
    }
}
