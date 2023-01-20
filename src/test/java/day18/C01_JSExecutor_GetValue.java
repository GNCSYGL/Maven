package day18;

import org.junit.Test;
import utilities.TestBase;

public class C01_JSExecutor_GetValue extends TestBase {

    /*
    //    *****ODEV*****
    // 1)getValueTest metotu olustur
    // 2)https://www.priceline.com/ a git
    // 3)Tarih kısmındaki Yazili metinleri al ve yazdır
     */

    @Test
    public void getValueTest() {
        driver.get("https://www.priceline.com/");
        getValueByJS("hotelDates");
    }

}
/*
Javascript Executor nedir?
Seleniumdan gelen ve javascript kodlarını calistirmaya yarayan bir interface dir. Normal selenium metotları yeterli olmadıgı durumlarda kullanilabilir.
Ne zaman ve nasıl kullandın?
Normal selenium metotları yeterli olmadıgı durumlarda kullanilabilir. Ornegin, bazı buttonlara tıklamada problem olabiliyor, yada belirli bir web elementin gorunur olacağı sekilde sayfanın kaydırma islemi, yada input kutularindaki değerleri almak icin kullanilabilir.
Sayfayi asagi veya yukarı kaydırma islemi seleniumda nasıl yapılır?
Seleniumdaki Actions yada javascript executor metotları ile kaydırma islemleri yapılabilir. Ornegin, actionslarda page_up, page_down, arrow_up, arrow_down metotlari ile yada js executordaki scrollintoview(true) ile yapılabilir. Ben olusturdugumuz reusable metotlarını kullanarak bu islemlile kolaylıkla yapabiliyorum
Bir kutucukdaki(input) elemanın metni nasıl alınabilir?
Javascript executor ile alabiliriz. Cunki js executor ile attribute degerlerini alma imkanımız var. getText() METORU BU DURUMLARDA CALISMAZ.
Selenium da click yaparken problem yasadigin oldumu?
Bazen yanlis locator, yada bekleme(wait) problemi gibi durumlarda problem yaşadım. Bazen gizli(hidden) elementlere tiklarkende problem yaşadım. Bu durumlarda javascript executor kullandım ve problemi cozdum.
Selenium atomayonunda ne tur problemler yaşadın?
TEKNIK PROBLEMLER :Yanlis locator,bekleme(wait), alert, iframe, pop-up seklindeki reklam bildirimleri,multiple window, hidden elementlere tiklama, …
TAKIMLA ILGILI PROBLEMLER: (Çok gundeme getirilmeme). Developer bazen bulduğum bunları kabul etmiyordu. Cozum: takımla beraber değerlendirip fikir birliğine variyorduk.
 */
/*
JavaScriptExecutor ile input elementindeki değerleri almak için aşağıdaki adımları izleyebilirsiniz:
Web sayfasındaki input elementini locate etmek için WebDriver kullanabilirsiniz. Örneğin, "id" veya "name" attribute'una göre elementi seçebilirsiniz.
JavaScriptExecutor'u kullanarak, input elementinin "value" attribute'unu alabilirsiniz. Örnek olarak aşağıdaki gibi bir kod kullanabilirsiniz:

WebElement element = driver.findElement(By.id("inputId")); JavascriptExecutor js = (JavascriptExecutor) driver; String value = (String) js.executeScript("return arguments[0].value", element);
executeScript metodu ile input elementinin value attribute'unu almış oldunuz.
Not: Bu kod örneği sadece id attribute'una göre elementi seçer. Eğer elementi başka bir yolla seçmek isterseniz, locate etme kodunu değiştirmeniz gerekebilir.
 */