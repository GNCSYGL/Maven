package practice03;

import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import utilities.TestBase;

public class P05_Actions extends TestBase {
    @Test
    public void test01() {
        // http://szimek.github.io/signature_pad/ sayfasına gidiniz
        driver.get("http://szimek.github.io/signature_pad/");

        // Çıkan ekrana istediğiniz çizgi yada şekli çiziniz
        WebElement yaziTahtasi = driver.findElement(By.xpath("//*[@style='touch-action: none; user-select: none;']"));
        Actions actions = new Actions(driver);
        actions.moveToElement(yaziTahtasi);
        for (int i=1; i<10; i++) {
            actions.sendKeys("=").perform();
        }
        // Çizimden sonra clear butonuna basalım
        // Son olarak sayfayı temizleyiniz


    }
}
