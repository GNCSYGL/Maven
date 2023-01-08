package day10;

import org.junit.Assert;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import utilities.TestBase;

public class C02_Actions2 extends TestBase {

    @Test
    public void actions2(){

        //Manuel
        //Amazon home sayfasina git
        driver.get("https://www.amazon.com");

        //Account & List e uzerinde bekle-mouse over- hover over
        // 1. ACTIONS MOBJESI OLUSTUR
        Actions actions = new Actions(driver);

        //2. ELEMANI BUL
        WebElement accountList = driver.findElement(By.id("nav-link-accountList"));
        waitFor(1);
        //3. UYGUN ACTIONS METODUNU KULLAN. EN SONDA perform() KULLANMAYI UNUTMA
        actions.moveToElement(accountList).perform();
        waitFor(3);
        //acilan pencerede "Account Link"e tikla
        driver.findElement(By.linkText("Account")).click();

        //Acilan sayfanin title inin "Your Account"oldugunu dogrula
        Assert.assertTrue(driver.getTitle().contains("Your Account"));




    }
}
