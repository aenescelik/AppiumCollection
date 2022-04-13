package Appium.classes1;

import io.appium.java_client.MobileElement;
import io.appium.java_client.TouchAction;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.touch.TapOptions;
import io.appium.java_client.touch.offset.ElementOption;
import org.testng.annotations.Test;
import utilities.AppiumBase;

import java.net.MalformedURLException;

import static org.testng.AssertJUnit.assertTrue;

public class HW02_WhatsAppMessage extends AppiumBase {
    @Test
    public void test() throws MalformedURLException, InterruptedException {

        AndroidDriver driver= androidDriver();

        //Whatsapp cihaza kurun(Real/VD)
        //kodunuzu yazarak dilediniz kişiye mesaj
        //gonderin(download whatsapp.apk )
       driver
      .findElementByAndroidUIAutomator
       ("new UiScrollable(new UiSelector()).scrollIntoView(text(\"Puşka\"))")
               .click();
        Thread.sleep(2500);

        driver
                .findElementById("com.whatsapp:id/entry").click();

        driver.hideKeyboard();

        driver.findElementByXPath("//android.widget.EditText[@text='Message']")
                .sendKeys("bu bir otomasyon test mesajıdır");

        TouchAction touchAction = new TouchAction<>(driver);
        MobileElement sendMessage= (MobileElement) driver.findElementByXPath("//android.widget.ImageButton[@content-desc=\"Send\"]");

        touchAction.tap(TapOptions.tapOptions().withElement(ElementOption.element(sendMessage))).perform();
        String message = "bu bir otomasyon test mesajıdır";

        assertTrue(driver.findElementByXPath("//android.widget.TextView[@text='bu bir otomasyon test mesajıdır']")
                .isDisplayed()) ;
        

        driver.quit();


    }

}
