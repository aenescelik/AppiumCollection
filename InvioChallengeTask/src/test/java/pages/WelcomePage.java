package pages;

import io.appium.java_client.MobileElement;
import io.appium.java_client.pagefactory.AndroidFindBy;
import io.appium.java_client.pagefactory.AppiumFieldDecorator;
import org.openqa.selenium.support.PageFactory;
import utilities.Driver;

import java.time.Duration;

public class WelcomePage {
    public WelcomePage(){
        PageFactory.initElements(new AppiumFieldDecorator(Driver.getAppiumDriver(),Duration.ofSeconds(30)),this);
    }
    @AndroidFindBy(xpath = "(//android.widget.TextView)[1]")
    public MobileElement welcomeMessage;

    @AndroidFindBy(xpath = "(//android.widget.Button)[1]")
    public MobileElement gotItButton;

    @AndroidFindBy(xpath = "//android.widget.TextView[@text='How navigation data makes Maps better']")
    public MobileElement dataMessage;

    @AndroidFindBy(xpath = "//android.view.View[@text='Dismiss']")
    public MobileElement dismissButton;






}
