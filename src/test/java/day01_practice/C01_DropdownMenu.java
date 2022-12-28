package day01_practice;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import java.time.Duration;

public class C01_DropdownMenu {

    // ...Exercise 1...


    WebDriver driver;

    @Before
    public void setUp(){
        WebDriverManager.chromedriver().setup();
        driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));

    }

    @After
    public void tearDown(){
        driver.close();
    }

    @Test
    public void test01(){
        // https://www.amazon.com/ sayfasina gidin
        driver.get("https://www.amazon.com/");
        // dropdown'dan "Books" secenegini secin
        //dropdown 3 adimda handle edilir:
        //1. Adim Locate edilmeli
        WebElement ddm = driver.findElement(By.xpath("//*[@style='display: block; top: 2.5px;']"));
        //2. Adim Select objesi olusturulur
        Select select = new Select(ddm);
        //3. Adim Opsiyon secilir
        select.selectByVisibleText("Books");
        //select.selectByValue("search-alias=stripbooks-intl-ship");
        //select.selectByIndex(5);
        // arama cubuguna "Java" aratın
        driver.findElement(By.xpath("//input[@id='twotabsearchtextbox']")).sendKeys("java", Keys.ENTER);


        // arama sonuclarinin Java icerdigini test edin
        String java = driver.findElement(By.xpath("//*[@class='sg-col-inner']")).getText();
        Assert.assertTrue(java.contains("Java"));
    }
}
