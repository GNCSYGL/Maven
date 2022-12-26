package day06;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import java.time.Duration;
import java.util.List;

public class C01_Dropdown {
    WebDriver driver;

    //Eger test sinifinda birden fazla @Test metod olusturulmussa @Before kullanilir
    @Before
    public void setup(){
        WebDriverManager.chromedriver().setup();
        driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
        // Given Kullanici https://testcenter.techproeducation.com/index.php?page=dropdown sayfasindayken
        driver.get("https://testcenter.techproeducation.com/index.php?page=dropdown");

    }

    @Test
    public void selectByIndexTest(){

       //1. adim Locate dropdown element
        WebElement year = driver.findElement(By.xpath("//select[@id='year']"));
       //2. adim Select objesi olusitur.
        Select yearDropdown = new Select(year);
        //3. adim Select objesini kullanarak 3 farkli sekilde secim yapilabilir.
        yearDropdown.selectByIndex(22);//secenek sirasi (sifirdan baslar) 2000 yilini secmek istiyoruz.

        // Dogum yilini, dogum ayini ve dogum gununu su sekilde secer: 2000, January, 10

        //Ay secimi
        WebElement ay = driver.findElement(By.xpath("//select[@id='month']"));
        Select ayDropdown = new Select(ay);
        ayDropdown.selectByValue("0");//option in value degeri ile secim yapilabilir. January seceneginin value degeri "0" dir

        //Gun secimi: selectByVisibleTest
        WebElement gun = driver.findElement(By.id("day"));
        Select gunDropdown = new Select(gun);
        gunDropdown.selectByVisibleText("10");// case sensitive(buyuk kucuk harf duyarlidir)

    }

    @Test
    public void printAllTest(){

//        Tum eyalet isimlerini consola yazdiralim
        WebElement state = driver.findElement(By.xpath("//select[@id='state']"));
        Select stateDropdown = new Select(state);
        List<WebElement> stateList = stateDropdown.getOptions();
//       for (WebElement eachState : stateList){
//           System.out.println(eachState.getText());
//       }
        stateList.stream().forEach(t-> System.out.println(t.getText()));
    }

    @Test
    public void getSelectedOptionsTest(){
        //State dropdownindaki varsayilan secili secenegin "Select a State" oldugunu verify edelim.
        WebElement state = driver.findElement(By.xpath("//select[@id='state']"));
        Select stateDropdown = new Select(state);

//        WebElement varsayilanElement = stateDropdown.getFirstSelectedOption();
//        String varsayilanElementText = varsayilanElement.getText();

        String varsayilanText = stateDropdown.getFirstSelectedOption().getText();
        Assert.assertEquals("Select a State", varsayilanText);
    }

    @After
    public void tearDown(){
        driver.close();
    }




        /*
        1. What is dropdown? Dropdown nedir?
        Dropdown liste olusturmak icin kullanilir.

        2. How to handle dropdown elements? Dropdown nasil automate edilir?
        -Dropdown'i Locate ederiz
        -Select objecti'i olustururum
        -Select objecti'i ile istedigim secenegi secerim
        NOT: Select object'i olusturma nedenim, dropdownlarin Select class'i ile olusturulmasi

         3. Tum dropdown seneklerini nasil print ederiz?
         -Tum dropdown elementlelrini getOptions() metodu ile listeye koyariz.
         Sonra listeyi loop ile yazdirabiliriz.

         4. Bir secenegin secili olup olmadigini otomate etmek icin ne yapilir?
         Ornek: Gun olarak 10'u sectik ama ya secilmediyse?
         getFirstSelectedOption() secili olan secenegi return eder.
         */

}
