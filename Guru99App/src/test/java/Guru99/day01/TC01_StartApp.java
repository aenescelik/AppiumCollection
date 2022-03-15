package Guru99.day01;

import io.appium.java_client.MobileElement;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.remote.MobileCapabilityType;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

import java.net.MalformedURLException;
import java.net.URL;
import java.time.Duration;
import java.util.concurrent.TimeUnit;

public class TC01_StartApp {
    SoftAssert softAssert;
    @Test
    public void startApp() throws MalformedURLException, InterruptedException {
        DesiredCapabilities desiredCapabilities = new DesiredCapabilities();

        desiredCapabilities.setCapability(MobileCapabilityType.PLATFORM_NAME,"Android");
        desiredCapabilities.setCapability(MobileCapabilityType.AUTOMATION_NAME,"UiAutomator2");
        desiredCapabilities.setCapability(MobileCapabilityType.PLATFORM_VERSION,"11.0");
        desiredCapabilities.setCapability(MobileCapabilityType.DEVICE_NAME,"TCL 10L");

        desiredCapabilities.setCapability(MobileCapabilityType.APP,
                "C:\\Users\\enesc\\AppiumProjects\\Guru99App\\src\\apps\\Guru99App.apk");
        desiredCapabilities.setCapability(MobileCapabilityType.NO_RESET,"true");
        URL url = new URL("http://127.0.0.1:4723/wd/hub");
        AndroidDriver<MobileElement> driver = new AndroidDriver<MobileElement>(url, desiredCapabilities);
        //driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
        Thread.sleep(1500);
        softAssert = new SoftAssert();

        MobileElement appname= driver.findElementByXPath("(//*[@class='android.widget.TextView'])[1]");
        softAssert.assertTrue(appname.isDisplayed());

        driver.quit();
    }
}
