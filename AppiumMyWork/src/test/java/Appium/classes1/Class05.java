package Appium.classes1;

import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.AndroidElement;
import io.appium.java_client.remote.MobileCapabilityType;
import org.junit.Assert;
import org.junit.Test;
import org.openqa.selenium.remote.DesiredCapabilities;

import java.net.MalformedURLException;
import java.net.URL;

public class Class05 {
    @Test
    public void test01() throws MalformedURLException, InterruptedException {

        DesiredCapabilities desiredCapabilities = new DesiredCapabilities();

        // desiredCapabilities.setCapability(CapabilityType.PLATFORM_NAME,"Android");// seleniumdan gelir
        // desiredCapabilities.setCapability("platforName","Android");// klasik key & value
        desiredCapabilities.setCapability(MobileCapabilityType.PLATFORM_NAME, "Android");// appiumdan gelir
        desiredCapabilities.setCapability(MobileCapabilityType.DEVICE_NAME, "TCL 10L");
        desiredCapabilities.setCapability(MobileCapabilityType.PLATFORM_VERSION, "11.0");
        desiredCapabilities.setCapability(MobileCapabilityType.AUTOMATION_NAME, "UiAutomator2");
        desiredCapabilities.setCapability
                (MobileCapabilityType.APP, "C:\\Users\\enesc\\AppiumProjects\\AppiumMyWork\\src\\apps\\Calculator.apk");
        desiredCapabilities.setCapability(MobileCapabilityType.NO_RESET, "true");// applicationun bir kez kuruldugunu
        // ve bir daha ayni izinlerin alinmamasini saglar.
        AndroidDriver<AndroidElement> driver = new AndroidDriver<AndroidElement>
                (new URL("http://127.0.0.1:4723/wd/hub"), desiredCapabilities);
        Thread.sleep(2000);
         /*
          install app
          do any mathematical operation
          and verify pre result and final result
           */
        AndroidElement num0 = driver.findElementById("com.google.android.calculator:id/digit_0");
        AndroidElement num1 = driver.findElementById("com.google.android.calculator:id/digit_1");
        AndroidElement num2 = driver.findElementById("com.google.android.calculator:id/digit_2");
        AndroidElement num3 = driver.findElementById("com.google.android.calculator:id/digit_3");
        AndroidElement num4 = driver.findElementById("com.google.android.calculator:id/digit_4");
        AndroidElement num5 = driver.findElementById("com.google.android.calculator:id/digit_5");
        AndroidElement num6 = driver.findElementById("com.google.android.calculator:id/digit_6");
        AndroidElement num7 = driver.findElementById("com.google.android.calculator:id/digit_7");
        AndroidElement num8 = driver.findElementById("com.google.android.calculator:id/digit_8");
        AndroidElement num9 = driver.findElementById("com.google.android.calculator:id/digit_9");

        AndroidElement carpma = driver.findElementByAccessibilityId("multiply");
        AndroidElement esit = driver.findElementByAccessibilityId("equals");

        num1.click();
        num5.click();
        carpma.click();
        num3.click();
        Thread.sleep(2000);
        String previewResult = driver.findElementById("com.google.android.calculator:id/result_preview").getText();
        Assert.assertEquals("45",previewResult);

        Thread.sleep(2000);

        esit.click();

        String finalResult = driver.findElementById("com.google.android.calculator:id/result_final").getText();
        Thread.sleep(4000);
        Assert.assertEquals(finalResult,previewResult);
        System.out.println("Ex " +previewResult);
        System.out.println("Ac " + finalResult);

        driver.quit();
    }
}
