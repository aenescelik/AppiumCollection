package pages;

import io.appium.java_client.MobileElement;
import io.appium.java_client.pagefactory.AndroidFindBy;
import io.appium.java_client.pagefactory.AppiumFieldDecorator;
import org.openqa.selenium.support.PageFactory;
import utilities.Driver;

import java.time.Duration;

public class NavigationSelectPage {
     public NavigationSelectPage(){
         PageFactory.initElements(new AppiumFieldDecorator(Driver.getAppiumDriver(),Duration.ofSeconds(30)),this);
    }
    @AndroidFindBy(xpath = "//android.widget.EditText[@text='Choose start location']")
    public MobileElement startLocation;

    @AndroidFindBy(xpath = "//android.widget.TextView[@text='Your location']")
    public MobileElement selectOwnLocation;


    @AndroidFindBy(xpath ="//android.widget.Button[@content-desc=\"Navigate up\"")
    public MobileElement navigateUp;

    @AndroidFindBy(xpath = "//android.widget.EditText[@text='Choose destination']")
    public MobileElement chooseDestination;



}
