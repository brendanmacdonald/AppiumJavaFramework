package Framework;

import io.appium.java_client.MobileElement;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.remote.MobileCapabilityType;
import org.openqa.selenium.remote.CapabilityType;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.testng.annotations.*;

import java.net.MalformedURLException;
import java.net.URL;
import java.util.concurrent.TimeUnit;

public class TestBase {

    @BeforeMethod
    @Parameters({"appiumServerURL", "appiumServerPort", "deviceName", "platform"})
    public void setUpAppium(String appiumServerURL, String appiumServerPort, String deviceName, String platform) throws MalformedURLException {

        // Define the URL for the Appium server.
        final String URL_STRING = appiumServerURL + ":" + appiumServerPort + "/wd/hub";
        URL url = new URL(URL_STRING);

        DesiredCapabilities capabilities = new DesiredCapabilities();
        capabilities.setCapability(CapabilityType.PLATFORM, platform);
        capabilities.setCapability(MobileCapabilityType.DEVICE_NAME, deviceName);
        capabilities.setCapability(MobileCapabilityType.BROWSER_NAME, "Chrome");
        capabilities.setCapability("appPackage", "com.android.chrome");
        capabilities.setCapability(MobileCapabilityType.NEW_COMMAND_TIMEOUT, "5000");
        capabilities.setCapability("avd", deviceName);

        // Initialize the driver.
        App.driver = new AndroidDriver<MobileElement>(url, capabilities);

        // Implicit timeout.
        App.driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
    }


    @AfterSuite
    public void tearDownAppium() {
        App.driver.quit();
    }

    @AfterTest
    public void restartApp() {
         //App.driver.resetApp();
    }
}
