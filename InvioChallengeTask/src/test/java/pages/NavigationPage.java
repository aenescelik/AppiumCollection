package pages;

import io.appium.java_client.MobileElement;
import io.appium.java_client.pagefactory.AndroidFindBy;
import io.appium.java_client.pagefactory.AppiumFieldDecorator;
import org.openqa.selenium.support.PageFactory;
import utilities.Driver;

import java.time.Duration;

public class NavigationPage {
    public NavigationPage(){
        PageFactory.initElements(new AppiumFieldDecorator(Driver.getAppiumDriver(), Duration.ofSeconds(30)),this);
    }

    @AndroidFindBy(xpath = "//android.widget.TextView[@text='Your location']")
    public MobileElement yourLocationButton;

    @AndroidFindBy(xpath = "//android.widget.TextView[@text='Choose destination']")
    public MobileElement chooseDestinationButton;

    @AndroidFindBy(xpath = "(//android.widget.ImageView)[1]")
    public MobileElement drivingModeButton;

    @AndroidFindBy(xpath = "(//android.widget.ImageView)[2]")
    public MobileElement publicTransportModeButton;

    @AndroidFindBy(xpath = "(//android.widget.ImageView)[3]")
    public MobileElement walkingModeButton;

    @AndroidFindBy(xpath = "//android.widget.Button[@content-desc=\"Start navigation\"]")
    public MobileElement startNavigationButton;

    @AndroidFindBy(accessibility = "Swap start and destination")
    public MobileElement swapStartAndDestination;













}
