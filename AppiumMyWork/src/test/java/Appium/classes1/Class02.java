package Appium.classes1;

import io.appium.java_client.MobileElement;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.remote.MobileCapabilityType;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.testng.annotations.Test;

import java.net.MalformedURLException;
import java.net.URL;

public class Class02 {
    @Test
    public void test() throws MalformedURLException, InterruptedException {
        DesiredCapabilities desiredCapabilities = new DesiredCapabilities();

        desiredCapabilities.setCapability(MobileCapabilityType.AUTOMATION_NAME, "UiAutomator2");
        desiredCapabilities.setCapability(MobileCapabilityType.PLATFORM_NAME, "Android");
        desiredCapabilities.setCapability(MobileCapabilityType.DEVICE_NAME, "Emulator");
        desiredCapabilities.setCapability(MobileCapabilityType.PLATFORM_VERSION, "11.0");
        //eger appActivity ve appPackage kullanacaksaniz app path gerekli degil
        /* desiredCapabilities.setCapability
                (MobileCapabilityType.APP,"C:\\Users\\enesc\\AppiumProjects\\AppiumMyWork\\src\\apps\\apiDemos.apk");*/
        //app acilirken izin istediginde appActivity ve appPackage tanimlayarak bu sorunu gecebilirsiniz.
        // app telefonda acin
        //terminal veya CMD prompt acarak adb shell  yazin
        //sonra dumpsys window | grep -E "mCurrentFocus" komutunu girice appActivity ve appPackage bilgilerini ulasabilirsiniz
        desiredCapabilities.setCapability("appPackage", "com.touchboarder.android.api.demos");
        desiredCapabilities.setCapability("appActivity", "com.touchboarder.androidapidemos.MainActivity");
        //http://localhost:4723/wd/hub
        URL url = new URL("http://127.0.0.1:4723/wd/hub");
        AndroidDriver<MobileElement> driver = new AndroidDriver<MobileElement>(url, desiredCapabilities);

        Thread.sleep(4000);
    }
}
