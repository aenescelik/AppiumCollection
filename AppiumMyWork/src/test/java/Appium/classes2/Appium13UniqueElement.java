package Appium.classes2;

import utilities.ApiDemosBase;
import io.appium.java_client.MobileElement;
import io.appium.java_client.android.AndroidDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

import java.net.MalformedURLException;
import java.util.List;

public class Appium13UniqueElement extends ApiDemosBase {
    @Test
    public void test() throws MalformedURLException, InterruptedException {
        AndroidDriver driver = androidDriver();

        driver.findElementByXPath("//android.widget.TextView[@text='API Demos']").click();
        Thread.sleep(3000);
        driver.findElementByXPath("//android.widget.TextView[@text='Preference']").click();
        Thread.sleep(3000);
        driver.findElementByXPath("//android.widget.TextView[@text='5. Preferences from code']").click();
        Thread.sleep(3000);

        //aciklama
//        driver.findElementByAndroidUIAutomator("UiSelector().resourceId(\"android:id/checkbox\").index(0).checked(false)").click();
//        Thread.sleep(5000);
//        driver.findElementByAndroidUIAutomator("UiSelector().resourceId(\"android:id/checkbox\").index(1).checked(false)").click();
//        Thread.sleep(5000);
//        driver.findElementByAndroidUIAutomator("UiSelector().resourceId(\"android:id/checkbox\").index(0).checked(false)").click();


        List <MobileElement> checkBox = driver.findElementsByXPath("(//android.widget.CheckBox)[1]");
        System.out.println(checkBox.size());

        String isChecked =checkBox.get(0).getAttribute("checked");

        if (isChecked.equals("false")){//cek değilse click et
            checkBox.get(0).click();
        }else{
            Assert.assertEquals(checkBox.get(0).getAttribute("checked"),"true");
            // eger check ise bunu verify et
        }

        driver.findElementByXPath("//android.widget.TextView[@text='Edit text preference']").click();
        Thread.sleep(2000);


        // eger yazi varsa sil
        driver.findElementById("android:id/edit").clear();
        Thread.sleep(3000);

        // yazi yaz
        driver.findElementById("android:id/edit").sendKeys("sample text");
        Thread.sleep(3000);

        // OK tikla
        driver.findElementById("android:id/button1").click();

        //session kapat
        driver.quit();





    }
}
