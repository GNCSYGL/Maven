package day07;

import org.junit.Assert;
import org.junit.Test;
import org.openqa.selenium.By;
import utilities.TestBase;

public class C05_IFrame extends TestBase {

    @Test
    public void iframeTest(){
        driver.get("https://testcenter.techproeducation.com/index.php?page=iframe");

//        Ana sayfadaki ‘An iframe with a thin black border:’ metninde ‘black border’ yazisinin oldugunu test edelim
        String anaMetin = driver.findElement(By.xpath("//p[.='An iframe with a thin black border:']")).getText();
        String expectedText = "black border";
        Assert.assertTrue(anaMetin.contains(expectedText));

//        Ayrica ‘Applications lists’ yazisinin sayfada oldugunu test edelim
        driver.switchTo().frame(0);//index 0'dan baslar. Ilk Iframe'e switch yapiyoruz.

        String icMetin = driver.findElement(By.xpath("//h1[.='Applications lists']")).getText();
        String expectedText1 = "Applications lists";
        Assert.assertEquals(expectedText1,icMetin);

//       Assert.assertTrue(expectedText1.contains(icMetin)); - Alternatif olarak bu da kullanilabilir.
//        Assert.assertTrue(driver.findElement(By.xpath("//h1[.='Applications lists']")).isDisplayed();

//        Son olarak footer daki ‘Povered By’ yazisini varligini test edilip
//        Ana sayfadaki 'Povered By'yazisini test etmek istiyorum ama driver hala iframe'in icinde iframe
        driver.switchTo().defaultContent();
        String footerText = driver.findElement(By.xpath("(//footer[@class='blog-footer'][1])//p")).getText();
        System.out.println(footerText);
        Assert.assertTrue(footerText.contains("Povered By"));

    }
}

/*
//Bir class olusturun: IframeOdev
//https://the-internet.herokuapp.com/iframe  sitesine gidiniz
//sayfadaki toplam iframe sayısını bulunuz.
//Sayfa basliginda 'Editor' yazını içerdiğini test edelim.
//Paragrafdaki yaziyi silelim
//Sonrasinda paragrafa "iframein icindeyim" yazisini yazdıralım
//Alt kısımdaki yazının 'Elemental Selenium' yazisini içerdiğini test ed
 */












