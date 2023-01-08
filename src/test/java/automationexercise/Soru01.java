package automationexercise;

import org.junit.Assert;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import utilities.TestBase;

public class Soru01 extends TestBase {

    @Test
    public void test01(){

        //1. Launch browser
        //2. Navigate to url 'http://automationexercise.com'
        driver.get("https://automationexercise.com");

        //3. Verify that home page is visible successfully - Ana sayfanın başarıyla göründüğünü doğrulayın
        WebElement anasayfa = driver.findElement(By.xpath("//*[@src='/static/images/home/logo.png']"));
        String actualUrl = driver.getCurrentUrl();
        String expectedUrl = "https://automationexercise.com";
        if (actualUrl.equals(expectedUrl)){
            System.out.println("passed");
        }else {
            System.out.println("failed");
        }
        //4. Click on 'Signup / Login' button
        driver.findElement(By.xpath("//*[@href='/login']")).click();

        //5. Verify 'New User Signup!' is visible
        String newUserSignup = driver.findElement(By.xpath("//*[text()='New User Signup!']")).getText();
        System.out.println("newUserSignup = " + newUserSignup);

        //6. Enter name and email address
        driver.findElement(By.cssSelector("input[data-qa='signup-name']")).sendKeys("Gonca");
        driver.findElement(By.cssSelector("input[data-qa='signup-email']")).sendKeys("goncasaygili@gmail.com");
        waitFor(3);

        //7. Click 'Signup' button
        driver.findElement(By.xpath("//*[@type='submit']")).click();

        //8. Verify that 'ENTER ACCOUNT INFORMATION' is visible
        //9. Fill details: Title, Name, Email, Password, Date of birth
        //10. Select checkbox 'Sign up for our newsletter!'
        //11. Select checkbox 'Receive special offers from our partners!'
        //12. Fill details: First name, Last name, Company, Address, Address2, Country, State, City, Zipcode, Mobile Number
        //13. Click 'Create Account button'
        //14. Verify that 'ACCOUNT CREATED!' is visible
        //15. Click 'Continue' button
        //16. Verify that 'Logged in as username' is visible
        //17. Click 'Delete Account' button
        //18. Verify that 'ACCOUNT DELETED!' is visible and click 'Continue' button
    }

}
