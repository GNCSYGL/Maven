package ders_sorulari_tekrar;

import org.junit.Assert;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import utilities.TestBase;

public class Soru01 extends TestBase {

    @Test
    public void test01() throws InterruptedException {
        //Manuel
        //Amazon home sayfasina git
        driver.get("https://www.amazon.com");

        //Account & List e uzerinde bekle-mouse over- hover over


        // 1. ACTIONS MOBJESI OLUSTUR
        Actions action = new Actions(driver);
        //2. ELEMANI BUL
        WebElement accountAndList = driver.findElement(By.xpath("(//*[@class='nav-a nav-a-2   nav-progressive-attribute'])[1]"));

        //3. UYGUN ACTIONS METODUNU KULLAN. EN SONDA perform() KULLANMAYI UNUTMA
        action.moveToElement(accountAndList).perform();

        Thread.sleep(3000);
        //acilan pencerede "Account Link"e tikla
        driver.findElement(By.xpath("//*[text()='Account']")).click();

        //Acilan sayfanin title inin "Your Account"oldugunu dogrula
        Assert.assertTrue(driver.getTitle().contains("Your Account"));
        System.out.println(driver.getTitle());
    }
}
