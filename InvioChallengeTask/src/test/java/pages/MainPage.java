package pages;

import io.appium.java_client.MobileElement;
import io.appium.java_client.pagefactory.AndroidFindBy;
import io.appium.java_client.pagefactory.AppiumFieldDecorator;
import org.openqa.selenium.support.PageFactory;
import utilities.Driver;

import java.time.Duration;

public class MainPage {
    public MainPage(){
        PageFactory.initElements(new AppiumFieldDecorator(Driver.getAppiumDriver(), Duration.ofSeconds(30)),this);
    }
    @AndroidFindBy(id = "com.google.android.apps.maps:id/mainmap_container")
    public MobileElement ownLocation;

    @AndroidFindBy(xpath = "//android.widget.EditText[@content-desc=\"Try petrol stations, cash machines\"]")
    public MobileElement searchTextBox;

    @AndroidFindBy(accessibility = "Voice search")
    public MobileElement voiceSearchButton;

    @AndroidFindBy(id ="com.google.android.apps.maps:id/og_apd_ring_view")
    public MobileElement profileButton;

    @AndroidFindBy(xpath = "//android.widget.FrameLayout[@content-desc=\"Layers\"]")
    public MobileElement layersButton;

    @AndroidFindBy(id = "com.google.android.apps.maps:id/explore_tab_home_bottom_sheet")
    public MobileElement tapPageButton;

    @AndroidFindBy(xpath = "//android.widget.FrameLayout[@content-desc=\"Enter compass mode\"]")
    public MobileElement enterCompassMode;

    @AndroidFindBy(xpath = "//android.widget.FrameLayout[@content-desc=\"Exit compass mode\"]")
    public MobileElement exitCompassMode;

    @AndroidFindBy(xpath = "//android.widget.ImageButton[@content-desc=\"Directions\"]")
    public MobileElement directionsButton;

    @AndroidFindBy(xpath = "//android.widget.FrameLayout[@content-desc=\"Explore\"]")
    public MobileElement exploreButton;

    @AndroidFindBy(xpath = "//android.widget.FrameLayout[@content-desc=\"Go\"]")
    public MobileElement goButton;

    @AndroidFindBy(xpath = "//android.widget.FrameLayout[@content-desc=\"Saved\"]")
    public MobileElement savedButton;

    @AndroidFindBy(xpath = "//android.widget.FrameLayout[@content-desc=\"Contribute\"]")
    public MobileElement contributeButton;

    @AndroidFindBy(xpath = "//android.widget.FrameLayout[@content-desc=\"Updates\"]")
    public MobileElement updatesButton;

    @AndroidFindBy(xpath = "//android.widget.Button[@content-desc=\"Search for Restaurants\"]")
    public MobileElement restaurantsButton;

    @AndroidFindBy(xpath = "//android.widget.Button[@content-desc=\"Search for Hotels\"]")
    public MobileElement hotelsButton;

    @AndroidFindBy(xpath = "//android.widget.Button[@content-desc=\"Search for Coffee\"]")
    public MobileElement coffeeButton;


}
