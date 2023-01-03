package day07;

import org.junit.Assert;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import utilities.TestBase;

public class C04_PromptAlert extends TestBase {

    @Test
    public void sendKeysMethod() throws InterruptedException {
        driver.get("https://testcenter.techproeducation.com/index.php?page=javascript-alerts");

        //    3. butona tıklayın,
        driver.findElement(By.xpath("//*[@onclick='jsPrompt()']")).click();

        //    uyarıdaki metin kutusuna isminizi yazin,
        driver.switchTo().alert().sendKeys("Gonca");
        Thread.sleep(5000);

        //    OK butonuna tıklayın
        driver.switchTo().alert().accept();
        Thread.sleep(5000);

        //    ve result mesajında isminizin görüntülendiğini doğrulayın.
        String actualResult = driver.findElement(By.id("result")).getText();//gercek deger
        String expectedResult = "Gonca";//beklenen deger
        Assert.assertTrue(expectedResult.contains(expectedResult));
    }

}
