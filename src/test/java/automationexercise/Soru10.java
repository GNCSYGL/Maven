package automationexercise;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

import java.time.Duration;
import java.util.List;

public class Soru10 {

    WebDriver driver;

    @Before
     public void setup(){

        WebDriverManager.chromedriver().setup();
        driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
    }

    @Test
    public void test01() {
        //1. Launch browser
        //2. Navigate to url 'https://automationexercise.com' - 'https://automationexercise.com' url'sine gidin
        driver.get("https://automationexercise.com");

        //3. Verify that home page is visible successfully - Ana sayfanın başarıyla göründüğünü doğrulayın
        String actualUrl = driver.getCurrentUrl();
        String expectedUrl = "https://automationexercise.com/";
        Assert.assertEquals(expectedUrl,actualUrl);

//        //4. Scroll down to footer  -  Altbilgiye doğru aşağı kaydır
//
//        Actions actions1 = new Actions(driver);


        //5. Verify text 'SUBSCRIPTION' - 'SUBSCRIPTION' metnini doğrulayın
        WebElement subscription = driver.findElement(By.xpath("//*[text()='Subscription']"));
        String subscriptionDogrulama = subscription.getText();
        System.out.println("subscriptionDogrulama = " + subscriptionDogrulama);

        //6. Enter email address in input and click arrow button - Girişte e-posta adresini girin ve ok düğmesine tıklayın
       driver.findElement(By.xpath("//*[@id='susbscribe_email']")).sendKeys("gonca@gmail.com",Keys.ENTER);

        //7. Verify success message 'You have been successfully subscribed!' is visible - Başarı mesajını doğrulayın 'Başarıyla abone oldunuz!' görünür
        String basariMelsaji = driver.findElement(By.xpath("//*[@class='col-md-9 form-group hide']")).getText();
        System.out.println(basariMelsaji);


    }
}
