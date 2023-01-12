package automationexercise;

import org.junit.Assert;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import utilities.TestBase;

public class Soru02 extends TestBase {

    @Test
    public void test01() {
        //1. Launch browser
        //2. Navigate to url 'http://automationexercise.com'
        driver.get("https://automationexercise.com");

        //3. Verify that home page is visible successfully
        driver.findElement(By.xpath("//*[@alt='Website for automation practice']"));

        //4. Click on 'Signup / Login' button
        driver.findElement(By.xpath("//*[@href='/login']")).click();

        //5. Verify 'Login to your account' is visible
        String loginToYourAccount = driver.findElement(By.xpath("//*[text()='Login to your account']")).getText();
        Assert.assertTrue(loginToYourAccount.equals("Login to your account"));

        //6. Enter correct email address and password
        driver.findElement(By.xpath("(//*[@name='email'])[1]")).sendKeys("gs@outlook.com" + Keys.TAB,"123456");

        //7. Click 'login' button
        driver.findElement(By.xpath("(//*[@type='submit'])[1]")).click();

        //8. Verify that 'Logged in as username' is visible
        //9. Click 'Delete Account' button
        //10. Verify that 'ACCOUNT DELETED!' is visible

    }
}
