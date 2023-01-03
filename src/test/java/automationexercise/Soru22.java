package automationexercise;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.time.Duration;

public class Soru22 {

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
    //2. Navigate to url 'http://automationexercise.com'
    //3. Scroll to bottom of page
    //4. Verify 'RECOMMENDED ITEMS' are visible
    // 5. Click on 'Add To Cart' on Recommended product
    //6. Click on 'View Cart' button
    //7. Verify that product is displayed in cart page

    }
}
