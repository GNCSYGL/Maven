package day17;

import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import utilities.TestBase;

import java.io.IOException;

public class C01_JSExecuter_Scroll extends TestBase {

    @Test
    public void scrollIntoViewTest() throws IOException {

        //scrollIntoViewTest metotu olustur
        //Techpro education ana sayfasina git
        driver.get("https://techproeducation.com");
        waitFor(3);

        //We Offer elementi gorunur olacak sekilde uzerine scroll et ve ekran gorunturunu al
        //1. Islem yapmak isteidigin elementi bul
        WebElement weOffer = driver.findElement(By.xpath("//span[.='we offer']"));
        waitFor(3);

        //2. JS executer objesi olustur
        JavascriptExecutor js = (JavascriptExecutor) driver;

        //3. yapmak isteidigm islemi js.executerScript metodu ile yap
        //arguments[0] => ilk parametredeki element
        js.executeScript("arguments[0].scrollIntoView(true);",weOffer);
        waitFor(3);

        //Ayni sayfada Enroll Free elementi gorunur olacak sekilde scroll et ve ekran goruntusunu al
        takeScreenShotOfPage();

        scrollIntoViewJS(driver.findElement(By.xpath("//span[.='Enroll Free Course']")));
        waitFor(3);
        takeScreenShotOfPage();

        //        Ayni sayfada WHY US? elementi gorunur olacak sekilde scroll et ve ekran goruntusunu al
        jsScroll(By.xpath("//h3[.='WHY US?']"));
        waitFor(3);
        takeScreenShotOfPage();
//        Ayni sayfada Enroll Free elementi gorunur olacak sekilde scroll et ve ekran goruntusunu al
        jsScroll(By.xpath("//span[.='Enroll Free Course']"));
        waitFor(3);
        takeScreenShotOfPage();
    }

    private void jsScroll(By xpath) {
    }

}
