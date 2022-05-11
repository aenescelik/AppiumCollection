package tests;

import io.appium.java_client.MobileElement;
import io.appium.java_client.MultiTouchAction;
import io.appium.java_client.TouchAction;
import io.appium.java_client.touch.WaitOptions;
import io.appium.java_client.touch.offset.PointOption;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;
import pages.AllPages;
import utilities.Driver;
import utilities.ReusableMethods;
import utilities.TestBaseRapor;
import java.time.Duration;

import static org.testng.Assert.*;

public class InvioMaps extends TestBaseRapor {
    AllPages elements;
    SoftAssert softAssert;
    @Test
    public void taskTest() throws InterruptedException {
        elements = new AllPages();
        softAssert = new SoftAssert();

        extentTest=extentReports.createTest("invio maps testi","istenen testler yapildi");
        Driver.getAppiumDriver();
        extentTest.info("uygulama baslatildi");

        elements.getMainPage().searchTextBox.click();
        ReusableMethods.waitFor(3);
        String actualText =elements.getSearchPage().searchPageSearchTextBox.getText();
        assertEquals(actualText,"Search here");
        elements.getSearchPage().searchPageNavigateBack.click();
        assertEquals(elements.getMainPage().restaurantsButton.getText(),"Restaurants");
        extentTest.pass("actual textlerin expected textlere esit oldugu test edildi");
        ReusableMethods.waitFor(3);


        extentTest.info("alan kontrolu");
        MobileElement maps = elements.getMainPage().ownLocation;
        int x1 = maps.getLocation().getX();
        int y1 = maps.getLocation().getY();
        System.out.println("x ekseni: "+x1+","+"y ekseni: "+y1);


        int x=maps.getSize().getWidth()/2;
        int y=maps.getSize().getHeight()/2;
        System.out.println("x olcusu: "+x+ ", y olcusu:"+y);
        extentTest.info("alan kontrolu icin olculer alindi");

        extentTest.info("zoom basladi");
        TouchAction parmak1 = new TouchAction<>(Driver.getAppiumDriver());
        parmak1.press(PointOption.point(x,y-10))
                .waitAction(WaitOptions.waitOptions(Duration.ofSeconds(1)))
                .moveTo(PointOption.point(x,y-100));
        TouchAction parmak2= new TouchAction(Driver.getAppiumDriver());
        parmak2.press(PointOption.point(x, y+10))
                .waitAction(WaitOptions.waitOptions(Duration.ofSeconds(1)))
                .moveTo(PointOption.point(x, y+100));

        MultiTouchAction action= new MultiTouchAction(Driver.getAppiumDriver());
        action.add(parmak1).add(parmak2).perform();
        extentTest.info("zoom tamamlandi");
        ReusableMethods.waitFor(3);


        extentTest.info("pinch basladi");
        TouchAction parmak3 = new TouchAction<>(Driver.getAppiumDriver());
        parmak3.press(PointOption.point(x,y-100))
                .waitAction(WaitOptions.waitOptions(Duration.ofSeconds(1)))
                .moveTo(PointOption.point(x,y-10));
        TouchAction parmak4= new TouchAction(Driver.getAppiumDriver());
        parmak4.press(PointOption.point(x, y+100))
                .waitAction(WaitOptions.waitOptions(Duration.ofSeconds(1)))
                .moveTo(PointOption.point(x, y+10));

        MultiTouchAction action2= new MultiTouchAction(Driver.getAppiumDriver());
        action2.add(parmak3).add(parmak4).perform();
        extentTest.info("pinch tamamlandi");
        extentTest.info("alan kontrolu tamanlandi");
        ReusableMethods.waitFor(3);

        extentTest.info("navigasyon butonuyla hedef secme ekrani acildi");
        elements.getMainPage().directionsButton.click();
        extentTest.info("navigasyon sayfasi acildi");

        softAssert.assertTrue(elements.getNavigationPage().yourLocationButton.isEnabled());
        softAssert.assertTrue(elements.getNavigationPage().chooseDestinationButton.isEnabled());
        softAssert.assertTrue(elements.getNavigationPage().drivingModeButton.isEnabled());
        softAssert.assertTrue(elements.getNavigationPage().publicTransportModeButton.isEnabled());
        softAssert.assertTrue(elements.getNavigationPage().walkingModeButton.isEnabled());
        softAssert.assertTrue(elements.getNavigationPage().swapStartAndDestination.isEnabled());
        softAssert.assertAll();
        extentTest.pass("navigasyon sayfasindaki butonların erisilebilirligi test edildi");
        ReusableMethods.waitFor(2);

        elements.getNavigationPage().yourLocationButton.click();
        ReusableMethods.waitFor(2);
        elements.getNavigationStartPage().selectOwnLocation.click();
        ReusableMethods.waitFor(2);

        elements.getNavigationPage().chooseDestinationButton.click();
        ReusableMethods.
                enterTextMethod(elements.getNavigationStartPage().chooseDestination,"Trabzon");

        extentTest.info("Başlangıç ve varış noktalari secildi");
        ReusableMethods.waitFor(2);

        extentTest.info("Navigasyon ekranında araç, toplu taşıma, yürüme gibi varyasyonların çıktılarının kontrol edilmesi");
        assertTrue(elements.getNavigationPage().drivingModeButton.isDisplayed());
        assertTrue(elements.getNavigationPage().publicTransportModeButton.isDisplayed());
        assertTrue(elements.getNavigationPage().walkingModeButton.isDisplayed());
        extentTest.pass("navigasyon ekranındaki varyasyonlarin görünürlükleri kontrol edildi.");
        ReusableMethods.waitFor(3);


        extentTest.info("Navigasyonun başlatılması ve yönergelerin kontrol edilip navigasyondan çıkılması.");
        elements.getNavigationPage().startNavigationButton.click();
        extentTest.info("navigasyon baslatildi");

        /*if(elements.getWelcomePage().welcomeMessage.isDisplayed()){
            elements.getWelcomePage().gotItButton.click();
            ReusableMethods.waitFor(2);
            if (elements.getWelcomePage().welcomeMessage.isDisplayed()){
                elements.getWelcomePage().dismissButton.click();
            }
        }else{
            System.out.println("message goruntulenmedi");
        }
        extentTest.info("welcome mesajı gelmesi halinde yapılması gereken düzenlendi");
*/
        ReusableMethods.waitFor(3);

        System.out.println("varış için kalan tahmini süre: "+elements.getNavigationOnGoingPage().timeRemain.getText());
        System.out.println("kalan km ve tahmini varış saati: "+elements.getNavigationOnGoingPage().distanceAndArrival.getText());
        elements.getNavigationOnGoingPage().closeNavigation.click();
        extentTest.info("navigasyondan çıkıldı");

        extentTest.info("Appium kapatıldı");

    }

}
