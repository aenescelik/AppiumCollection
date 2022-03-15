package stepdefinitions;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

import pages.AllPages;
import pages.android.APIDemosPage;
import pages.android.MainPage;
import pages.android.PreferenceDependenciesPage;
import pages.android.PreferencePage;
import utilities.Driver;

public class FirstClass {
    AllPages element = new AllPages();

    @Given("App telefonda acilsin")
    public void app_telefonda_acilsin() {
        Driver.getAppiumDriver();
    }

    @When("kullanici API demos tiklasin")
    public void kullanici_api_demos_tiklasin() {
    element.mainPage().apiDemos.click();
    }

    @When("kullanici Preference tiklasin")
    public void kullanici_preference_tiklasin() {
    element.apiDemosPage().preference.click();
    }

    @When("kullanici Preference Dependencies tiklasin")
    public void kullanici_preference_dependencies_tiklasin() {
    element.preferencePage().preferenceDependencies.click();
    }

    @When("kullanici checkbox tik atsin")
    public void kullanici_checkbox_tik_atsin() {
    if (element.preferenceDependenciesPage().checkBox.getAttribute("checked").equals("false")){
        element.preferenceDependenciesPage().checkBox.click();
    }
    }

    @When("kullanici WiFi settings tiklasin")
    public void kullanici_wi_fi_settings_tiklasin() {
    element.preferenceDependenciesPage().wifiSettings.click();
    }

    @When("kullanici kutiya yazi gondersin {string}")
    public void kullanici_kutiya_yazi_gondersin(String string) {
    element.preferenceDependenciesPage().textBox.sendKeys("Appium Demo");
    }

    @Then("kullanici OK tiklasin")
    public void kullanici_ok_tiklasin() {
    element.preferenceDependenciesPage().okButton.click();
    }

    @And("kullanici sayfayi kapatir")
    public void kullaniciSayfayiKapatir() {
        Driver.quitAppiumDriver();
    }
}
