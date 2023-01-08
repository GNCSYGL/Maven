package homework;

import org.junit.Assert;
import org.junit.Test;
import org.openqa.selenium.By;
import utilities.TestBase;

public class H01 extends TestBase {

    /*

     */

    @Test
    public void test01(){
        //Bir class olusturun: IframeOdev
        //https://the-internet.herokuapp.com/iframe  sitesine gidiniz
        driver.get("https://the-internet.herokuapp.com/iframe");

        //sayfadaki toplam iframe sayısını bulunuz.

        //Sayfa basliginda 'Editor' yazını içerdiğini test edelim.
        String actualText = driver.findElement(By.xpath("//h3")).getText();
        String expectedTitle = "Editor";
        Assert.assertTrue(actualText.contains(expectedTitle));
        //Paragrafdaki yaziyi silelim
        //Sonrasinda paragrafa "iframein icindeyim" yazisini yazdıralım
        //Alt kısımdaki yazının 'Elemental Selenium' yazisini içerdiğini test ed
    }



}
