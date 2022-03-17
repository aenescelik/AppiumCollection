package Appium.classes2;

import java.net.URL;
import java.net.MalformedURLException;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.support.ui.ExpectedConditions;
import io.appium.java_client.MobileBy;
import io.appium.java_client.ios.IOSDriver;
import io.appium.java_client.ios.IOSElement;
import org.testng.Assert;
import org.testng.annotations.Test;

public class Appium16BrowserStackIOS {
    @Test
    public void iosTest1() throws MalformedURLException, InterruptedException {
        DesiredCapabilities caps = new DesiredCapabilities();

        // Set your access credentials
        caps.setCapability("browserstack.user", "abdullaheneselik_ymGS16");
        caps.setCapability("browserstack.key", "jNxb6vGn29ejJaFkptHy");

        // Set URL of the application under test
        caps.setCapability("app", "bs://444bd0308813ae0dc236f8cd461c02d3afa7901d");

        // Specify device and os_version for testing
        caps.setCapability("device", "iPhone XS");
        caps.setCapability("os_version", "12");


        // Set other BrowserStack capabilities
        caps.setCapability("project", "First Java Project");
        caps.setCapability("build", "browserstack-build-1");
        caps.setCapability("name", "first_test");


        // Initialise the remote Webdriver using BrowserStack remote URL
        // and desired capabilities defined above
        IOSDriver<IOSElement> driver = new IOSDriver<IOSElement>(
                new URL("http://hub-cloud.browserstack.com/wd/hub"), caps);

        // Test case for the BrowserStack sample iOS app.
        // If you have uploaded your app, update the test case here.

        String expectedText = "IOS testing";

        driver.findElementByAccessibilityId("Text Button").click();

        driver.findElementByAccessibilityId("Text Input").sendKeys(expectedText);

        driver.findElementByAccessibilityId("Return").click();

        String actualText = driver.findElementByAccessibilityId("Text Output").getText();

        Assert.assertEquals(actualText,expectedText);

        driver.findElementByXPath
                ("(//XCUIElementTypeButton[@name=\"UI Elements\"])[1]").click();

        Assert.assertEquals
                (driver.findElementByXPath("//XCUIElementTypeOther[@name='UI Elements']").getText(),
                        "UI Elements");

        // Invoke driver.quit() after the test is done to indicate that the test is completed.
        driver.quit();
    }
    @Test
    public void iosTest2() throws MalformedURLException, InterruptedException {
        DesiredCapabilities caps = new DesiredCapabilities();

        // Set your access credentials
        caps.setCapability("browserstack.user", "abdullaheneselik_ymGS16");
        caps.setCapability("browserstack.key", "jNxb6vGn29ejJaFkptHy");

        // Set URL of the application under test
        caps.setCapability("app", "bs://444bd0308813ae0dc236f8cd461c02d3afa7901d");

        // Specify device and os_version for testing
        caps.setCapability("device", "iPhone XS");
        caps.setCapability("os_version", "12");


        // Set other BrowserStack capabilities
        caps.setCapability("project", "First Java Project");
        caps.setCapability("build", "browserstack-build-1");
        caps.setCapability("name", "first_test");


        // Initialise the remote Webdriver using BrowserStack remote URL
        // and desired capabilities defined above
        IOSDriver<IOSElement> driver = new IOSDriver<IOSElement>(
                new URL("http://hub-cloud.browserstack.com/wd/hub"), caps);

        // Test case for the BrowserStack sample iOS app.
        // If you have uploaded your app, update the test case here.
        Thread.sleep(2000);
        driver.findElementByAccessibilityId("Alert Button").click();
        String actualText=driver.findElementByAccessibilityId("This is a native alert.").getText();
        String expectedText ="This is a native alert.";

        Assert.assertEquals(actualText,expectedText);
        Thread.sleep(2000);

        driver.findElementByAccessibilityId("OK").click();

    }
}
