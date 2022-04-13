package pages;

import io.appium.java_client.MobileElement;
import io.appium.java_client.pagefactory.AndroidFindBy;
import io.appium.java_client.pagefactory.AppiumFieldDecorator;
import org.openqa.selenium.support.PageFactory;
import utilities.Driver;

import java.time.Duration;

public class SearchPage {
    public SearchPage(){
        PageFactory.initElements(new AppiumFieldDecorator(Driver.getAppiumDriver(),Duration.ofSeconds(30)),this);
    }
    @AndroidFindBy(id = "com.google.android.apps.maps:id/search_omnibox_edit_text")
    public MobileElement searchPageSearchTextBox;

    @AndroidFindBy(xpath ="//android.widget.Button[@content-desc=\"Navigate up\"]")
    public MobileElement searchPageNavigateBack;
}
