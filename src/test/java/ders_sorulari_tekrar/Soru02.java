package ders_sorulari_tekrar;

import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import utilities.TestBase;

public class Soru02 extends TestBase {

    @Test
    public void test01() throws InterruptedException {
        //https://techproeducation.com/ a git
        driver.get("https://techproeducation.com/");

        //Sayfanin altına doğru gidelim
        Actions action = new Actions(driver);
        action.sendKeys(Keys.PAGE_DOWN).sendKeys(Keys.PAGE_DOWN).sendKeys(Keys.PAGE_DOWN).perform();
        Thread.sleep(2000);

        //Sonra sayfanın üstüne doğru gidelim
        action.sendKeys(Keys.PAGE_UP).sendKeys(Keys.PAGE_UP).sendKeys(Keys.PAGE_UP).perform();

    }
}
