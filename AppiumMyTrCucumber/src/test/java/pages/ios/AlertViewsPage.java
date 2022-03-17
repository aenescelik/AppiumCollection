package pages.ios;

import io.appium.java_client.MobileElement;
import io.appium.java_client.pagefactory.iOSXCUITFindBy;
import io.appium.java_client.pagefactory.AppiumFieldDecorator;
import org.openqa.selenium.support.PageFactory;
import utilities.Driver;

import java.time.Duration;

public class AlertViewsPage {
     public AlertViewsPage(){
         PageFactory.initElements(new AppiumFieldDecorator(Driver.getAppiumDriver(), Duration.ofSeconds(15)),this);
     }

     @iOSXCUITFindBy(accessibility = "OK")
     public MobileElement okButton;
          // iosta androiddeki gibi görünen değil tamamı gösteriliyor
          // type valuesi referans degeri cok fazla görünse dahi ekranda aktif olan element tek ise onun icin unique deger alabiliriz.
     @iOSXCUITFindBy(className = "XCUIElementTypeOther")
     public MobileElement textBox;

}
