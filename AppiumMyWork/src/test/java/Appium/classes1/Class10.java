package Appium.classes1;

import io.appium.java_client.MobileElement;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.remote.MobileCapabilityType;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.testng.annotations.Test;

import java.net.MalformedURLException;
import java.net.URL;

public class Class10 {
    @Test
    public void test() throws MalformedURLException, InterruptedException {
        DesiredCapabilities desiredCapabilities = new DesiredCapabilities();

        desiredCapabilities.setCapability(MobileCapabilityType.AUTOMATION_NAME, "UiAutomator2");
        desiredCapabilities.setCapability(MobileCapabilityType.PLATFORM_NAME, "Android");
        desiredCapabilities.setCapability(MobileCapabilityType.DEVICE_NAME, "Emulator");
        desiredCapabilities.setCapability(MobileCapabilityType.PLATFORM_VERSION, "11.0");
        //app acilirken izin istediginde appActivity ve appPackage tanimlayarak bu sorunu gecebilirsiniz.
        // app telefonda acin
        //terminal veya CMD prompt acarak adb shell  yazin
        //sonra dumpsys window | grep -E "mCurrentFocus" komutunu girice appActivity ve appPackage bilgilerini ulasabilirsiniz
        desiredCapabilities.setCapability("appPackage", "com.touchboarder.android.api.demos");
        desiredCapabilities.setCapability("appActivity", "com.touchboarder.androidapidemos.MainActivity");
        desiredCapabilities.setCapability(MobileCapabilityType.NO_RESET, "true");

        //http://localhost:4723/wd/hub
        URL url = new URL("http://127.0.0.1:4723/wd/hub");
        AndroidDriver<MobileElement> driver = new AndroidDriver<MobileElement>(url, desiredCapabilities);

        Thread.sleep(2000);

        //driver.findElementByXPath("//android.widget.TextView[@text='API Demos']").click();
        driver.findElementByAndroidUIAutomator("UiSelector().className(\"android.widget.TextView\").text(\"API Demos\")").click();

        driver.findElementByXPath("//android.widget.TextView[@text='Preference']").click();
        Thread.sleep(2000);
        driver.findElementByXPath("//android.widget.TextView[@text='3. Preference dependencies']").click();

        driver.findElementById("android:id/checkbox").click();
        Thread.sleep(2000);
        driver.findElementByXPath("//android.widget.TextView[@text='WiFi settings']").click();
        Thread.sleep(2000);
        driver.findElementById("android:id/edit").sendKeys("test");
        Thread.sleep(2000);
        driver.findElementById("android:id/button1").click();

    }
}
