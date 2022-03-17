package InterviewQuestion;
import java.net.URL;
import java.util.List;
import java.util.function.Function;
import java.net.MalformedURLException;
import io.appium.java_client.MobileBy;
import io.appium.java_client.MobileElement;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.AndroidElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.testng.annotations.Test;

public class IQBrowserStack{
    @Test
    public void test() throws MalformedURLException, InterruptedException {

        DesiredCapabilities caps = new DesiredCapabilities();

        // Set your access credentials
        caps.setCapability("browserstack.user", "abdullaheneselik_ymGS16");
        caps.setCapability("browserstack.key", "jNxb6vGn29ejJaFkptHy");

        // Set URL of the application under test
        caps.setCapability("app", "bs://a115cecb1f8c7af6a71c6c9039bb877ba667f700");

        // Specify device and os_version for testing
        caps.setCapability("device", "Samsung Galaxy Note 20 Ultra");
        caps.setCapability("os_version", "10.0");

        // Set other BrowserStack capabilities
        caps.setCapability("project", "First Java Project");
        caps.setCapability("build", "browserstack-build-1");
        caps.setCapability("name", "intelliJ");

        caps.setCapability("deviceOrientation", "landscape");

        // Initialise the remote Webdriver using BrowserStack remote URL
        // and desired capabilities defined above
        AndroidDriver<MobileElement> driver = new AndroidDriver<MobileElement>(
                new URL("http://hub.browserstack.com/wd/hub"), caps);

        // Write your test case statements here
        MobileElement num1 = driver.findElementById("com.google.android.calculator:id/digit_1");
        MobileElement num2 = driver.findElementById("com.google.android.calculator:id/digit_2");
        MobileElement num3 = driver.findElementById("com.google.android.calculator:id/digit_3");
        MobileElement num5 = driver.findElementById("com.google.android.calculator:id/digit_5");
        MobileElement num8 = driver.findElementById("com.google.android.calculator:id/digit_8");
        MobileElement num9 = driver.findElementById("com.google.android.calculator:id/digit_9");
        MobileElement plus = driver.findElementByAccessibilityId("plus");
        MobileElement equal = driver.findElementByAccessibilityId("equals");
        MobileElement rightParanthesis = driver.findElementByAccessibilityId("right parenthesis");
        MobileElement leftParanthesis = driver.findElementByAccessibilityId("left parenthesis");
        MobileElement squareRoot = driver.findElementByAccessibilityId("square root");
        MobileElement multiply = driver.findElementById("com.google.android.calculator:id/op_mul");
        MobileElement minus = driver.findElementById("com.google.android.calculator:id/op_sub");
//artik mathematik islemini yapiyoruz
        num2.click();
        num3.click();
        plus.click();
        num9.click();
        num5.click();
        equal.click();
//sonucu strin olarak result variable icine aldik.
        String result = driver.findElementById("com.google.android.calculator:id/result_final").getText();
//3rd step
        //sonucu kare kokununalacagiz karakok tikladik
        squareRoot.click();
        //string sonucu hesap makinasinde karakok icine
        // yeniden yazmak icin for loop icinde switch kullandim
        //bu benim yalasimim farkli yollar olabilir
        for (int i = 0; i<result.length(); i++){
            switch (result.charAt(i)){
                case '1':
                    num1.click();
                    break;
                case '8':
                    num8.click();
                    break;
            }
        }
        //esittir tiklayarak son sonucu result icine uopdate ettik ve yazdirdik
        equal.click();
        result =driver.findElementById("com.google.android.calculator:id/result_final").getText();
        System.out.println("karekokten sonra ki son sonuc "+result);
//4th step
        //ekranda sobuc var ve isleme devam ediyoruz (sonuc*(-1))
        multiply.click();
        minus.click();
        num1.click();
        equal.click();
        result = driver.findElementById("com.google.android.calculator:id/result_final").getText();
        System.out.println("-1 ile carptiktan sonraki sonuc "+result);

        // Invoke driver.quit() after the test is done to indicate that the test is completed.
        driver.quit();

    }
}