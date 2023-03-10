package day04_maven;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.time.Duration;
import java.util.List;

public class C01_MavenIlkTest {

    public static void main(String[] args) {

        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));

        /*
        1) https://www.amazon.com/ sayfasina gidelim
        2) arama kutusunu locate edelim
        3) “Samsung headphones” ile arama yapalim
        4) Bulunan sonuc sayisini yazdiralim
        5) Ilk urunu tiklayalim
        6) Sayfadaki tum basliklari yazdiralim
         */

       // 1) https://www.amazon.com/ sayfasina gidelim
        driver.get("https://www.amazon.com/");

        // 2) arama kutusunu locate edelim
        WebElement aramaKutusu = driver.findElement(By.xpath("//*[@id='twotabsearchtextbox']"));

        //3) “Samsung headphones” ile arama yapalim
        aramaKutusu.sendKeys("Samsung headphones");//bu satirin sonuna ".Keys.ENTER"'da yazarak arama yaptirabilirdik
        aramaKutusu.submit(); //Enter'a bastik

        //4) Bulunan sonuc sayisini yazdiralim
        WebElement aramSonucu = driver.findElement(By.xpath("//*[@class='a-section a-spacing-small a-spacing-top-small']"));
        System.out.println("Arama sonucu: " + aramSonucu.getText());

        //5) Ilk urunu tiklayalim
        driver.findElement(By.xpath("(//*[@class='s-image'])[1]")).click();

        // 6) Sayfadaki tum basliklari yazdiralim
        List<WebElement> sayfaBasliklariListesi = driver.findElements(By.xpath("//h1"));
        for (WebElement w:sayfaBasliklariListesi){
            System.out.println(w.getText());
        }

        //lambda ıle cozum
//        sayfaBasliklariListesi.forEach(t-> System.out.println(t.getText()));

        //Sayfayi kapatiniz.
        driver.close();




    }
}
