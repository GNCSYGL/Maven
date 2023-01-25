package day17;

import org.junit.Test;
import org.openqa.selenium.By;
import utilities.TestBase;

public class C03_JSExecutor_Type extends TestBase {
    /*
    typeTest metotu olustur
    Techpro education ana sayfasina git
     */
    @Test
    public void typeTest(){
//       Techpro education ana sayfasina git
        driver.get("https://www.techproeducation.com");
        waitFor(3);
//        Arama kutusuna QA yaz
        typeWithJS(driver.findElement(By.xpath("//input[@type='search']")),"QA");
    }
}
/*
Diller(Languages):
JAVA, Lamda, xml, SQL, HTML, CSS, …
Frameworks:
JUnit(gorduk), TestNG(Basliyoruz), Cucumber(Ogrenecez)
Design Pattern:
Page Object Model(POM)
Version Control System:
Git, Bitbucket(ucretli, kara ile entegresi daha guzel)
Front End Testing:
Selenium WebDriver
API Testing:
Postman for manual testing, Restful for automation
Backend/Database Testing:
SQL, JDBC
Continuous Integration(CI), Continuous Deployment(CD):
Jenkins
Remote Testing:
Selenium Grid, Jenkins
Arac/Gerecler(Tools)
Selenium WebDriver
Maven
JUnit, TestNG, Cucumber
PostGreSQL
JDBC
IntelliJ, Eclipse, VS Code
JIRA
Jmeter
Postman
Restful API
Jenkins
Selenium Grid
Git, Github, Bitbucket, AWC E2E
 */