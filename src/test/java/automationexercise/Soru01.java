package automationexercise;

import org.junit.Assert;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
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
        driver.findElement(By.cssSelector("input[data-qa='signup-email']")).sendKeys("gsaygili@gmail.com");
        waitFor(3);

        //7. Click 'Signup' button
        driver.findElement(By.xpath("//*[@data-qa='signup-button']")).click();

        //8. Verify that 'ENTER ACCOUNT INFORMATION' is visible
        String actuelEAI = driver.findElement(By.xpath("//h2[@class='title text-center']")).getText();
        String expectedEAI = "ENTER ACCOUNT INFORMATION";
        Assert.assertTrue(actuelEAI.equals(expectedEAI));

        //9. Fill details: Title, Name, Email, Password, Date of birth
        driver.findElement(By.id("id_gender2")).click();
        driver.findElement(By.id("name"));
        driver.findElement(By.id("password")).sendKeys("1234");
        driver.findElement(By.xpath("//*[@id='days']")).sendKeys("22");
        driver.findElement(By.xpath("//*[@id='months']")).sendKeys("September");
        driver.findElement(By.xpath("//*[@id='years']")).sendKeys("1988" + Keys.TAB + Keys.ENTER + Keys.TAB + Keys.ENTER);


//        //10. Select checkbox 'Sign up for our newsletter!'
//        driver.findElement(By.xpath("//*[@id='newsletter']")).click();
//
//        //11. Select checkbox 'Receive special offers from our partners!'
//        driver.findElement(By.xpath("//*[@id='optin']")).click();

        //12. Fill details: First name, Last name, Company, Address, Address2, Country, State, City, Zipcode, Mobile Number
        driver.findElement(By.xpath("//*[@id='first_name']"))
                .sendKeys("GNC",Keys.TAB,"SYGL",Keys.TAB,"ISTANBUL",Keys.TAB,"Maltepe",Keys.TAB,"IST",
                        Keys.TAB,"Canada",Keys.TAB,"Cnd",Keys.TAB,"C",Keys.TAB,"12345",Keys.TAB,"05365897454");

        //13. Click 'Create Account button'
        driver.findElement(By.xpath("//*[@data-qa='create-account']")).click();

        //14. Verify that 'ACCOUNT CREATED!' is visible
        String accountCreated = driver.getTitle();
        String expectedCreated = "ACCOUNT CREATED!";
        Assert.assertTrue(accountCreated.equals(expectedCreated));

        //15. Click 'Continue' button
        //16. Verify that 'Logged in as username' is visible
        //17. Click 'Delete Account' button
        //18. Verify that 'ACCOUNT DELETED!' is visible and click 'Continue' button
    }

}
