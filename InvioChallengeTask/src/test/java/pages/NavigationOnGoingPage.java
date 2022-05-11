package pages;

import io.appium.java_client.MobileElement;
import io.appium.java_client.pagefactory.AndroidFindBy;
import io.appium.java_client.pagefactory.AppiumFieldDecorator;
import org.openqa.selenium.DeviceRotation;
import org.openqa.selenium.support.PageFactory;
import utilities.Driver;

import java.time.Duration;
import java.util.List;

public class NavigationOnGoingPage {
    public NavigationOnGoingPage(){
        PageFactory.initElements(new AppiumFieldDecorator(Driver.getAppiumDriver(), Duration.ofSeconds(30)),this);
    }
    @AndroidFindBy(xpath = "//android.widget.RelativeLayout[@content-desc=\"Activate to open step list\"]")
    public MobileElement openSteps;

    @AndroidFindBy(xpath = "//android.widget.ImageView[@content-desc=\"Close navigation\"]")
    public MobileElement closeNavigation;

    @AndroidFindBy(xpath = "//android.widget.TextView[@text='Directions']")
    public MobileElement navigationDirections;

    @AndroidFindBy(id = "com.google.android.apps.maps:id/navigation_time_remaining_label")
    public MobileElement timeRemain;

    @AndroidFindBy(xpath = "(//android.widget.TextView)[3]")
    public MobileElement distanceAndArrival;

}
