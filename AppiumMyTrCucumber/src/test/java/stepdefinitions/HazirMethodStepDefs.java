package stepdefinitions;

import io.cucumber.java.en.*;
import pages.AllPages;
import utilities.ReusableMethods;

public class HazirMethodStepDefs {
    AllPages elements=new AllPages();

    @When("kullanici {string} tiklasin")
    public void kullanici_tiklasin(String pageName) throws InterruptedException {
        ReusableMethods.clickOnPage(pageName);
    }

    @And("kullanici {int} saniye bekler")
    public void kullaniciSaniyeBekler(int saniye) {
        ReusableMethods.waitFor(saniye);
    }

}
