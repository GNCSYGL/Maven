package day02_practice;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.junit.*;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import java.time.Duration;
import java.util.List;

public class C01_Dropdown {

    WebDriver driver;
    @Before
    public void setUp(){
        WebDriverManager.chromedriver().setup();
        driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));

    }

    @Test
    public void test01() throws InterruptedException {
        // https://the-internet.herokuapp.com/dropdown adresine gidin.
        driver.get("https://the-internet.herokuapp.com/dropdown");

        // Index kullanarak Option 1 seçin ve sectiginiz option'u yazdırın
        //dropdown 3 adimda handle edilir:
        //1- dropdown locate edilir.
        WebElement ddm = driver.findElement(By.xpath("//*[@id='dropdown']"));

        //2- select objesi olusturulur.
        Select select = new Select(ddm);

        //3- opsiyon secilir.
        select.selectByIndex(1);
        String sectigimOpsiyonIndex = select.getFirstSelectedOption().getText();
        System.out.println("Sectigim Opsiyon Index: " + sectigimOpsiyonIndex);;

        Thread.sleep(3000);

        // Value kullanarak Option 2 seçin ve sectiginiz option'u yazdırın
        select.selectByValue("2");
        String sectigimOpsiyonValue = select.getFirstSelectedOption().getText();
        System.out.println("Sectigim Opsiyon Value: " + sectigimOpsiyonValue);

        Thread.sleep(3000);

        // Visible Text kullanarak Option 1 seçin ve sectiginiz option'u yazdırın
        select.selectByVisibleText("Option 1");
        String sectigimOpsiyonVisible = select.getFirstSelectedOption().getText();
        System.out.println("Sectigim Opsiyon Visible Text: " + sectigimOpsiyonVisible);

        // Tüm option'ları yazdırın
        List<WebElement> tumOpsiyonlar = select.getOptions();

        int sayac = 1;
        for (WebElement each : tumOpsiyonlar){
            System.out.println(sayac + ". OPTION " + each.getText());
            sayac++;
        }

        // dropdown'daki optionlarin toplam sayısının 3'e esit oldugunu test edin

        int expected = 3;
        int actual = tumOpsiyonlar.size();
        Assert.assertEquals(expected,actual);

    }

    @After
    public void afterClass(){
        driver.close();
    }
}
