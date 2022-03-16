package stepdefinitions;

import io.cucumber.java.en.And;
import pages.AllPages;
import utilities.ReusableMethods;

import static org.junit.Assert.assertTrue;

public class SpinnerStepDefs {
    AllPages elements = new AllPages();


    @And("kullanici color menusunden {string} secmeli")
    public void kullaniciColorMenusundenSecmeli(String arg0) {
    elements.spinnerPage().colorDropDown.click();
    elements.spinnerPage().blue.click();

    ReusableMethods.waitFor(2);
    assertTrue(elements.spinnerPage().selectedBlue.isDisplayed());
    }

    @And("kullanici planet menusunden {string} secmeli")
    public void kullaniciPlanetMenusundenSecmeli(String arg0) {
    elements.spinnerPage().planetDropDown.click();
    elements.spinnerPage().saturn.click();

    ReusableMethods.waitFor(2);
    assertTrue(elements.spinnerPage().selectedSaturn.isDisplayed());
    }

}
