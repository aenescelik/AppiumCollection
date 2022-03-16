package stepdefinitions;

import io.appium.java_client.TouchAction;
import io.appium.java_client.touch.offset.ElementOption;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;
import pages.AllPages;
import utilities.Driver;
import utilities.ReusableMethods;

import static org.junit.Assert.assertTrue;

public class ExpandableListStepDefs {
AllPages elements = new AllPages();
    @When("kullanici Chuck basili tuttugunda")
    public void kullaniciArnoldBasiliTuttugunda() {
        TouchAction touchAction =new TouchAction<>(Driver.getAppiumDriver());
        touchAction.longPress(ElementOption.element(elements.expandableListsPage().chuck)).release().perform();
    }

    @Then("popup ciktigini onayla")
    public void popupCiktiginiOnayla() {
        assertTrue(elements.expandableListsPage().sampleMenu.isDisplayed());
    }


}
