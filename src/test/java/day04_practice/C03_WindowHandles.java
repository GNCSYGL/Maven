package day04_practice;

import org.junit.Assert;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import utilities.TestBase;

import java.util.Set;

public class C03_WindowHandles extends TestBase {

    @Test
    public void test03() {

        // 'https://www.n11.com' adresine gidin
        driver.get("https://www.n11.com");
        String sayfa1Handle = driver.getWindowHandle();

        // arama motoruna 'oppo' yazıp aratın
        WebElement aramaMotoru = driver.findElement(By.xpath("//*[@id='searchData']"));
        aramaMotoru.sendKeys("oppo", Keys.ENTER);

        // ilk ürüne tıklayın
        driver.findElement(By.xpath("(//*[@class='lazy cardImage'])[1]")).click();
        Set<String> windowHandleSeti = driver.getWindowHandles();

        String sayfa2Handle = "";
        for (String each : windowHandleSeti){
            if (!each.equals(sayfa1Handle)){
            }
            sayfa2Handle = each;
        }

        // Basligin 'Oppo' icerdigini test edin.
        driver.switchTo().window(sayfa2Handle);
        WebElement baslik = driver.findElement(By.xpath("//*[@class='proName']"));
        String baslikTest = baslik.getText();
        Assert.assertTrue(baslikTest.contains("Oppo"));

        // ilk sayfaya donun ve Title'ını yazdırın
        driver.switchTo().window(sayfa1Handle);
        System.out.println("Ilk sayfa Title = " + driver.getTitle());

    }
}
