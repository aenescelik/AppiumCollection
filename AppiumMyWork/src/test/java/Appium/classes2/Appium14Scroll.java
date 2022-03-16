package Appium.classes2;
import io.appium.java_client.TouchAction;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.touch.WaitOptions;
import io.appium.java_client.touch.offset.PointOption;
import org.openqa.selenium.Dimension;
import org.testng.annotations.Test;
import utilities.ApiDemosBase;

import java.net.MalformedURLException;
import java.sql.DriverManager;
import java.time.Duration;

import static utilities.ApiDemosBase.androidDriver;

public class Appium14Scroll extends ApiDemosBase {
    TouchAction touchAction;
    @Test
    public void test() throws MalformedURLException, InterruptedException {
        AndroidDriver driver = androidDriver();

        driver.findElementByAndroidUIAutomator("UiSelector().className(\"android.widget.TextView\").text(\"API Demos\")").click();

        driver.findElementByXPath("//android.widget.TextView[@text='Views']").click();
//bu ile cihazin olcusunu(inch) almis olduk.
        //scroll up
        Dimension dimension = driver.manage().window().getSize();

        int start_x = (int) (dimension.width * 0.5);
        int start_y = (int) (dimension.height * 0.8);

        int end_x = (int) (dimension.width * 0.5);
        int end_y = (int) (dimension.height * 0.2);

        touchAction=new TouchAction<>(driver);

        touchAction.press(PointOption.point(start_x,start_y))
                .waitAction(WaitOptions.waitOptions(Duration.ofSeconds(1)))
                .moveTo(PointOption.point(end_x,end_y))
                .release()
                .perform();

        //scroll down
        int start_x1 = (int) (dimension.width * 0.5);
        int start_y1 = (int) (dimension.height * 0.2);

        int end_x1 = (int) (dimension.width * 0.5);
        int end_y1 = (int) (dimension.height * 0.8);

        touchAction.press(PointOption.point(start_x1,start_y1))
                .waitAction(WaitOptions.waitOptions(Duration.ofSeconds(1)))
                .moveTo(PointOption.point(end_x1,end_y1))
                .release().perform();



    }
}
