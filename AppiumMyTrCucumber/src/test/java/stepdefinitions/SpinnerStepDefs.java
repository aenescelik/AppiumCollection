package stepdefinitions;

import io.cucumber.java.en.And;
import pages.AllPages;
import utilities.Driver;
import utilities.ReusableMethods;

import static org.junit.Assert.assertEquals;
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
    String toast = Driver.getAppiumDriver().
            findElementByXPath("//android.widget.Toast").getAttribute("name");
    assertEquals("Spinner2: position=5 id=5",toast);
    System.out.println(toast);
    ReusableMethods.waitFor(2);
    assertTrue(elements.spinnerPage().selectedSaturn.isDisplayed());

    }

}
