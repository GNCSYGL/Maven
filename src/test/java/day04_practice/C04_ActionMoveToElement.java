package day04_practice;

import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;
import utilities.TestBase;

import java.util.Set;

public class C04_ActionMoveToElement extends TestBase {

    @Test
    public void test04() {

        // https://amazon.com adresine gidiniz
        driver.get("https://amazon.com");

        // sag ust bolumde bulunan dil secenek menusunun acilmasi icin mause'u bu menunun ustune getirelim
        Actions action = new Actions(driver);
        WebElement dilMenusu = driver.findElement(By.xpath("//div[text()='EN']"));
        action.moveToElement(dilMenusu).perform();

        // Change country/region butonuna basiniz
        driver.findElement(By.xpath("//div[@class='icp-mkt-change-lnk']")).click();

        // United States dropdown'undan 'Turkey (Türkiye)' seciniz
        WebElement ddm = driver.findElement(By.xpath("//select[@id='icp-dropdown']"));
        Select select = new Select(ddm);
        select.selectByVisibleText("Turkey (Türkiye)");

        //Dropdown opsiyon listesi "Go to website"butonuna basmamiza engel oldugu icin herhangi bir yere click yaparak
        //dropdown listesinin secilmesini sagladik.
        driver.findElement(By.xpath("//*[text()='Changing country/region website']")).click();

        // Go to website butonuna tiklayiniz
        driver.findElement(By.xpath("//*[@id='icp-save-button']")).click();

        // acilan yeni sayfadanin Title'inin Elektronik icerdigini test ediniz
        Set<String> windowHandleSeti = driver.getWindowHandles();





    }
}
