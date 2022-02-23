package Appium;

import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.remote.MobileCapabilityType;
import org.junit.Assert;
import org.junit.Test;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.remote.DesiredCapabilities;

import java.net.MalformedURLException;
import java.net.URL;

public class Class03 {
    @Test
    public void test01() throws MalformedURLException, InterruptedException {

        DesiredCapabilities desiredCapabilities = new DesiredCapabilities();

        desiredCapabilities.setCapability(MobileCapabilityType.PLATFORM_NAME,"Android");// appiumdan gelir
        desiredCapabilities.setCapability(MobileCapabilityType.DEVICE_NAME,"TCL 10L");
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
        // id ile bulma
        // driver.findElement(By.id("com.davemac327.gesture.tool:id/addButton")); selenium'a gore
        driver.findElementById("com.davemac327.gesture.tool:id/addButton");

        // xpath text ile
        driver.findElementByXPath("//*[@text='Add gesture']");

        // xpath attribute
        driver.findElementByXPath("(//*[@class='android.widget.Button'])[1]").click();
        driver.navigate().back();

        /*
        lunch GestureTool app
        click test button
        verify title "Test a gesture"
        close app
         */
        driver.findElementById("com.davemac327.gesture.tool:id/testButton").click();
        String expectedTitle= "Test a gesture";
        String actualTitle = driver.findElementById("android:id/title").getText();

        Assert.assertEquals(actualTitle,expectedTitle,"titleler esit degil");

        driver.quit();
    }
}
