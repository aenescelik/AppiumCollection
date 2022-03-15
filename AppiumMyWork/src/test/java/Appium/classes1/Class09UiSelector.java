package Appium.classes1;

import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.remote.MobileCapabilityType;
import org.junit.Test;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.remote.DesiredCapabilities;

import java.net.MalformedURLException;
import java.net.URL;

public class Class09UiSelector {
    @Test
    public void test01() throws MalformedURLException, InterruptedException {

        DesiredCapabilities desiredCapabilities = new DesiredCapabilities();


        desiredCapabilities.setCapability(MobileCapabilityType.PLATFORM_NAME, "Android");// appiumdan gelir
        desiredCapabilities.setCapability(MobileCapabilityType.DEVICE_NAME, "AndroidEmulator");
        desiredCapabilities.setCapability(MobileCapabilityType.PLATFORM_VERSION, "11.0");
        desiredCapabilities.setCapability(MobileCapabilityType.AUTOMATION_NAME, "UiAutomator2");
        desiredCapabilities.setCapability
                (MobileCapabilityType.APP, "C:\\Users\\enesc\\AppiumProjects\\AppiumMyWork\\src\\apps\\gestureTool.apk");
        desiredCapabilities.setCapability(MobileCapabilityType.NO_RESET, "true");

        AndroidDriver<WebElement> driver = new AndroidDriver<WebElement>
                        (new URL("http://127.0.0.1:4723/wd/hub"), desiredCapabilities);

        Thread.sleep(2000);

        //UiSelector da ' kullanamiyorsunuz " kullanmak gerekiyor   driver.findElementByAndroidUIAutomator("UiSelector().resourceId(\"com.davemac327.gesture.tool:id/addButton\")");
        //resorceId() ile
        // driver.findElementByAndroidUIAutomator("UiSelector().resourceId(\"com.davemac327.gesture.tool:id/addButton\")").click();
        // className
        // driver.findElementByAndroidUIAutomator("UiSelector().className(\"android.widget.Button\")").click();

        //className() text ile beraber
        //  driver.findElementByAndroidUIAutomator("UiSelector().className(\"android.widget.Button\").text(\"Add gesture\")").click();

        //className() index() ile
        //  driver.findElementByAndroidUIAutomator("UiSelector().className(\"android.widget.Button\").index(1)").click();

//        List<MobileElement> buttons = driver.findElementsByAndroidUIAutomator("UiSelector().className(\"android.widget.Button\")");
//        for (MobileElement button : buttons) {
//             if (button.getText().equals("Add gesture")){
//                 button.click();
//                 break;
//             }
//        }

//        driver.findElementByAndroidUIAutomator("UiSelector().className(\"android.widget.Button\").textContains(\"load\")").click();
//
//        Thread.sleep(2000);
//
//        driver.findElementByAndroidUIAutomator("UiSelector().className(\"android.widget.Button\").textStartsWith(\"Te\")").click();

//UiSelector ile kullanivabilecek methodlar

        System.out.println(driver.findElementByAndroidUIAutomator("UiSelector().resourceId(\"com.davemac327.gesture.tool:id/addButton\").checkable(false)").getAttribute("checkable"));

        System.out.println(driver.findElementByAndroidUIAutomator("UiSelector().resourceId(\"com.davemac327.gesture.tool:id/addButton\").clickable(true)").getAttribute("clickable"));



    }
}
