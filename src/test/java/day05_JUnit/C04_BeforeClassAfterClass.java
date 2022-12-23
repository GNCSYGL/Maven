package day05_JUnit;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.checkerframework.checker.units.qual.C;
import org.junit.*;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.time.Duration;

public class C04_BeforeClassAfterClass {

    /*
    @BeforeClass ve @AfterClass notasyonlari sadece statik metodlar icin calisir.
    @BeforeClass ve @AfterClass kullanirsak olusturgumuz @Test metodlarinin hepsini ayni anda calistirip en son @AfterClass'i calistiririz.
        Ama sadece @Before ve @After kullanirsak her @Test icin @Before ve @After'i kullanir.
     */

    @BeforeClass
    public static void setUp(){
        System.out.println("Butun @Test'lerden once calisti.");
    }

    @AfterClass
    public static void tearDown(){
        System.out.println("Butun @Test'lerden sonra calisti.");
    }

    @Before
    public void setup01(){
        System.out.println("Her Test'ten once calisir.");
    }
    @After
    public void tearDown01(){
        System.out.println("Her Test'ten sonra calisir.");
    }

    @Test
    public void test01(){
        System.out.println("Test 01");
    }

    @Test
    public void test02(){
        System.out.println("Test 02");
    }
    @Test
    @Ignore//Eger bir testi calistirmak istemezsek bu sekilde @Ignore'u kullanabiliriz.
    public void test03(){
        System.out.println("Test 03");
    }

}
