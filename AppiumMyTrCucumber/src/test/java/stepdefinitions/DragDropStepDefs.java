package stepdefinitions;

import io.appium.java_client.TouchAction;
import io.appium.java_client.touch.offset.ElementOption;
import io.cucumber.java.en.*;
import org.junit.Assert;
import pages.AllPages;
import utilities.Driver;

public class DragDropStepDefs {
    AllPages elements= new AllPages();
    TouchAction touchAction = new TouchAction(Driver.getAppiumDriver());
    @When("kullanici Views tiklasin")
    public void kullanici_views_tiklasin() {
    elements.apiDemosPage().views.click();
    }


    @When("kullanici drag and drop tiklasin")
    public void kullanici_drag_and_drop_tiklasin() {
        elements.viewsPage().dragDrop.click();
    }
    @Then("kullanici ilk noktayi alip ucuncu noktaya tasiyacak")
    public void kullanici_ilk_noktayi_alip_ucuncu_noktaya_tasiyacak() {
        touchAction.longPress(ElementOption.element(elements.dragDropPage().dot1))
                .moveTo(ElementOption.element(elements.dragDropPage().dot3))
                .release().perform();

    }
    @Then("cikan yaziyi onayliyacak")
    public void cikan_yaziyi_onayliyacak() throws InterruptedException {
    Thread.sleep(2000);
        Assert.assertTrue(elements.dragDropPage().text.isDisplayed());
    }
}
