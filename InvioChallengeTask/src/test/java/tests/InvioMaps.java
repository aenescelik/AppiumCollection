package tests;

import io.appium.java_client.MobileElement;
import io.appium.java_client.MultiTouchAction;
import io.appium.java_client.TouchAction;
import io.appium.java_client.touch.WaitOptions;
import io.appium.java_client.touch.offset.PointOption;
import org.openqa.selenium.Dimension;
import org.testng.Assert;
import org.testng.annotations.Test;
import pages.AllPages;
import utilities.Driver;
import utilities.TestBaseRapor;

import java.awt.*;
import java.time.Duration;

public class InvioMaps extends TestBaseRapor {
    AllPages elements = new AllPages();

//Uygulamanın başlatılması, anasayfa üzerindeki komponent ve textlerin kontrol edilmesi
//Harita üzerinde alan kontrollerinin yapılması
//Navigasyon butonuyla hedef seçme ekranının açılması, buradaki komponentlerin fonksiyonalitesinin kontrol edilmesi
//Kullanıcının seçeceği bir nokta ile navigasyonun başlatılması
//Navigasyon ekranında araç, toplu taşıma, yürüme gibi varyasyonların çıktılarının kontrol edilmesi
//Navigasyonun başlatılması ve yönergelerin kontrol edilip navigasyondan çıkılması.
    @Test
    public void taskTest() throws InterruptedException {
        extentTest=extentReports.createTest("invio maps testi","istenen testler yapildi");
        Driver.getAppiumDriver();
        extentTest.info("uygulama baslatildi");



        elements.getMainPage().searchTextBox.click();
        Thread.sleep(3000);
        String actualText =elements.getSearchPage().searchPageSearchTextBox.getText();
        Assert.assertEquals(actualText,"Search here");
        elements.getSearchPage().searchPageNavigateBack.click();
        extentTest.pass("actual textlerin expected textlere esit oldugu test edildi");
        Thread.sleep(3000);
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
        Thread.sleep(5500);


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
        Thread.sleep (5000);

    }

}
