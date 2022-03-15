package Appium.classes1;

import io.appium.java_client.MobileElement;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.remote.MobileCapabilityType;
import org.junit.Test;
import org.openqa.selenium.remote.DesiredCapabilities;

import java.net.MalformedURLException;
import java.net.URL;

public class Class05WithAppActivityPackage {
    @Test
    public void test01() throws MalformedURLException, InterruptedException {

        DesiredCapabilities desiredCapabilities = new DesiredCapabilities();

        // desiredCapabilities.setCapability(CapabilityType.PLATFORM_NAME,"Android");// seleniumdan gelir
        // desiredCapabilities.setCapability("platforName","Android");// klasik key & value
        desiredCapabilities.setCapability(MobileCapabilityType.PLATFORM_NAME, "Android");// appiumdan gelir
        desiredCapabilities.setCapability(MobileCapabilityType.DEVICE_NAME, "AndroidEmulator");
        desiredCapabilities.setCapability(MobileCapabilityType.PLATFORM_VERSION, "11.0");
        desiredCapabilities.setCapability(MobileCapabilityType.AUTOMATION_NAME, "UiAutomator2");
        Thread.sleep(2000);
        /*
        desiredCapabilities.setCapability("appPackage", "com.androidsample.generalstore");
        desiredCapabilities.setCapability("appActivity", "com.androidsample.generalstore.AllProductsActivity");
        */
        desiredCapabilities.setCapability
                (MobileCapabilityType.APP, "C:/Users/enesc/AppiumProjects/AppiumMyWork/src/apps/General-Store.apk");
        desiredCapabilities.setCapability(MobileCapabilityType.NO_RESET, "true");// applicationun bir kez kuruldugunu
        // ve bir daha ayni izinlerin alinmamasini saglar.
        URL url = new URL("http://127.0.0.1:4723/wd/hub");
        AndroidDriver<MobileElement> driver = new AndroidDriver<MobileElement>(url, desiredCapabilities);
        Thread.sleep(2000);

        driver.quit();
    }
}
