package Appium.classes1;

import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.remote.MobileCapabilityType;
import org.junit.Assert;
import org.junit.Test;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.remote.DesiredCapabilities;

import java.net.MalformedURLException;
import java.net.URL;

public class Class04 {
    @Test
    public void test01() throws MalformedURLException, InterruptedException {

        DesiredCapabilities desiredCapabilities = new DesiredCapabilities();

        // desiredCapabilities.setCapability(CapabilityType.PLATFORM_NAME,"Android");// seleniumdan gelir
        // desiredCapabilities.setCapability("platforName","Android");// klasik key & value
        desiredCapabilities.setCapability(MobileCapabilityType.PLATFORM_NAME,"Android");// appiumdan gelir
        desiredCapabilities.setCapability(MobileCapabilityType.DEVICE_NAME,"AndroidEmulator");
        desiredCapabilities.setCapability(MobileCapabilityType.PLATFORM_VERSION,"11.0");
        desiredCapabilities.setCapability(MobileCapabilityType.AUTOMATION_NAME,"UiAutomator2");
        desiredCapabilities.setCapability
                (MobileCapabilityType.APP,"C:\\Users\\enesc\\AppiumProjects\\AppiumMyWork\\src\\apps\\gestureTool.apk");
        desiredCapabilities.setCapability(MobileCapabilityType.NO_RESET,"true");// applicationun bir kez kuruldugunu
        // ve bir daha ayni izinlerin alinmamasini saglar.
        AndroidDriver<WebElement> driver = new AndroidDriver<WebElement>
                /* burası AndroidElement*/         (new URL("http://127.0.0.1:4723/wd/hub"),desiredCapabilities);
        // MobileElement olabilir.
        Thread.sleep(2000);
 /*
//    lunch GestureTool app
//    click addGesture button
//    send text to name box "testing"
//    click done
//    verify testing gesture is created
     */
        Thread.sleep(3000);

        driver.findElementById("com.davemac327.gesture.tool:id/addButton").click();
        Thread.sleep(2000);
        driver.findElementById("com.davemac327.gesture.tool:id/gesture_name").sendKeys("test");

        driver.findElementById("com.davemac327.gesture.tool:id/gestures_overlay").click();
        Thread.sleep(2000);

        driver.findElementById("com.davemac327.gesture.tool:id/done").click();
        Thread.sleep(2000);
        String expectedText = "test";
        String actualText = driver.findElementByXPath("//android.widget.TextView[@text='test']").getText();
        Assert.assertEquals(actualText,expectedText);





    }
}
