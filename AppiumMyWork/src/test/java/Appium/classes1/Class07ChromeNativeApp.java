package Appium.classes1;

import io.appium.java_client.MobileElement;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.remote.MobileCapabilityType;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.testng.Assert;
import org.testng.annotations.Test;

import java.net.MalformedURLException;
import java.net.URL;
import java.util.Set;

public class Class07ChromeNativeApp {
    @Test
    public void test() throws MalformedURLException, InterruptedException {
        DesiredCapabilities desiredCapabilities = new DesiredCapabilities();

        desiredCapabilities.setCapability(MobileCapabilityType.AUTOMATION_NAME, "UiAutomator2");
        desiredCapabilities.setCapability(MobileCapabilityType.PLATFORM_NAME, "Android");
        desiredCapabilities.setCapability(MobileCapabilityType.DEVICE_NAME, "Emulator");
        desiredCapabilities.setCapability(MobileCapabilityType.PLATFORM_VERSION, "11.0");
        //eger appActivity ve appPackage kullanacaksaniz app path gerekli degil
        //terminal veya CMD prompt acarak adb shell  yazin
        //sonra dumpsys window | grep -E "mCurrentFocus" komutunu girice appActivity ve appPackage bilgilerini ulasabilirsiniz
        desiredCapabilities.setCapability("appPackage", "com.android.chrome");
        desiredCapabilities.setCapability("appActivity", "com.google.android.apps.chrome.Main");
        //http://localhost:4723/wd/hub
        URL url = new URL("http://127.0.0.1:4723/wd/hub");
        AndroidDriver<MobileElement> driver = new AndroidDriver<MobileElement>(url, desiredCapabilities);

        Thread.sleep(2000);

        /*
         Calisma:
         “https://amazon.com" git
         sign in tikla
         Verify “Welcome” text from sign in page
          */
        Thread.sleep(2000);
        driver.get("https://www.amazon.com/");
        System.out.println("1 "+driver.getContext());//NATIVE_APP

        //getContextHandles() mevcut olab app turlerini Set konteynira ekliyoruz
        Set<String> contextNames = driver.getContextHandles();
        //burda mevcut app tururnu(context) bir bir yazdiriyoruz
        for (String each : contextNames) {
            System.out.println(each);//NATIVE_APP   WEBVIEW_chrome
            Thread.sleep(2000);
                // if (contextName.toString().contains("WEBVIEW")){
                //     //alttaki kodda hangi app turunde calisacaksak onu set ediyoruz
                //     driver.context((String) contextName);//WEBAPP DEVAM EDECEGIM
                //     Thread.sleep(10000);
                // }
        }
        //artik set ettigimiz context ile test devam ediyiruz.
        System.out.println("2 "+driver.getContext());//NATIVE_APP
        driver.findElementByXPath("//android.view.View[@content-desc='Sign In ›']").click();
        Thread.sleep(2000);
        Assert.assertTrue(driver.findElementByXPath("(//*[@class='android.widget.TextView'])[1]").isDisplayed());

        System.out.println("3 "+driver.getContext());//NATIVE_APP
        driver.quit();

    }
}

