package stepdefinitions;

import io.appium.java_client.TouchAction;
import io.appium.java_client.touch.TapOptions;
import io.appium.java_client.touch.offset.ElementOption;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;
import pages.android.PreferencePage;
import pages.android.SwitchPage;
import utilities.Driver;

public class SwitchStepDefinition {
    PreferencePage preferencePage= new PreferencePage();
    SwitchPage switchPage =new SwitchPage();
    TouchAction touchAction = new TouchAction<>(Driver.getAppiumDriver());
    @When("kullanici Switch tiklasin")
    public void kullanici_switch_tiklasin() {
    preferencePage.switchButton.click();
    }

    @When("ilk switch butonu acik olmali")
    public void ilk_switch_butonu_acik_olmali() {

        if (switchPage.firstSwitchButton.getAttribute("checked").equals("false")){
            touchAction.
                    tap(TapOptions.tapOptions().withElement(ElementOption.element(switchPage.firstSwitchButton))).
                    perform();
        }

    }
    @Then("ilk switch butonunun acik oldugunu onayla")
    public void ilk_switch_butonunun_acik_oldugunu_onayla() {
        Assert.assertEquals("true",switchPage.firstSwitchButton.getAttribute("checked"));
    }

    @And("ilk switch butonu kapali olmali")
    public void ilkSwitchButonuKapaliOlmali() {
        if (switchPage.firstSwitchButton.getText().equals("ON")){
            touchAction.tap(TapOptions.tapOptions().withElement(ElementOption.element(switchPage.firstSwitchButton))).perform();
        }
    }

    @And("ilk switch butonu kapali oldugunu onayla")
    public void ilkSwitchButonuKapaliOldugunuOnayla() {
        Assert.assertEquals("true",switchPage.firstSwitchButton.getAttribute("checked"));
    }

    @And("ikinci switch butonu kapali olmali")
    public void ikinciSwitchButonuKapaliOlmali() {
        if (switchPage.secondSwitchButton.getAttribute("checked").equals("false")){
            touchAction.tap(TapOptions.tapOptions().withElement(ElementOption.element(switchPage.secondSwitchButton))).perform();
        }
    }

    @And("ikinci switch butonu kapali oldugunu onayla")
    public void ikinciSwitchButonuKapaliOldugunuOnayla() {
        Assert.assertEquals("true",switchPage.secondSwitchButton.getAttribute("checked"));
    }


}
