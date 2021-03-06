package pages.android;

import io.appium.java_client.MobileElement;
import io.appium.java_client.pagefactory.AppiumFieldDecorator;
import org.openqa.selenium.support.PageFactory;
import utilities.Driver;
import io.appium.java_client.pagefactory.AndroidFindBy;
import utilities.ReusableMethods;

import java.rmi.MarshalledObject;
import java.time.Duration;

public class SpinnerPage {
    public SpinnerPage(){
        PageFactory.initElements(ReusableMethods.appiumFieldDecorator(),this);

    }

    @AndroidFindBy(xpath = "(//android.widget.Spinner)[1]")
    public MobileElement colorDropDown;
    @AndroidFindBy(xpath = "(//android.widget.Spinner)[2]")
    public MobileElement planetDropDown;

    @AndroidFindBy(xpath = "//android.widget.CheckedTextView[@text='blue']")
    public MobileElement blue;

    @AndroidFindBy(xpath = "//android.widget.CheckedTextView[@text='Saturn']")
    public MobileElement saturn;

    @AndroidFindBy(xpath = "//android.widget.TextView[@text='blue']")
    public MobileElement selectedBlue;

    @AndroidFindBy(xpath = "//android.widget.TextView[@text='Saturn']")
    public MobileElement selectedSaturn;

    //tüm toast messagelerini ayni sekilde locate ediyoruz. birden fazla varsa sayiyla yapabiliriz.
    @AndroidFindBy(xpath = "//andorid.widget.Toast")
    public MobileElement toastMesaage;
}

