package day10;

import org.junit.Assert;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import utilities.TestBase;

public class C01_Actions1 extends TestBase {

    @Test
    public void rightClick(){

        driver.get("https://the-internet.herokuapp.com/context_menu");

        //1. ACTIONS METODU OLUSTUR
        Actions actions = new Actions(driver);

        //2.ELEMENTI BULALIM
       WebElement kutu = driver.findElement(By.id("hot-spot"));

       //kutuya sag tiklatin
        actions.contextClick(kutu).perform();//TUM ACTIONS'LAR actions OBJESI ILE BASLAR perform() ILE BITER

        //Allert; te cikan yazinin "You selected a context menu"oldugunu gorelim
        //Object olusturmak wait gerektiren durumlarda makul
        Assert.assertEquals("You selected a context menu",driver.switchTo().alert().getText());

        //Tamam diyerek allert'u kapatalim.
        driver.switchTo().alert().accept();

    //Class: Actions1
    //https://the-internet.herokuapp.com/context_menu  sitesine gidin
    //Kutuya sag tıklayın
    //Alert’te cikan yazinin “You selected a context menu” oldugunu
    //test edin
    //Tamam diyerek alert’i kapatın

        /*
        1.Adım: Actions class’ta bir object oluşturulur.
        Actions actions= new Actions(driver);
        2. Adım: Üzerinde çalışmak istediğiniz WebElement
        öğesini bulunur.
        WebElement element = driver.findElement(locator);
        3.Adim : perform() kullanarak bu webelement üzerinde action gerçekleştirilir.
         */
    }
}
