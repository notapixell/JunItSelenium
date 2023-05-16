package Day04.HomeWork;

import Utilities.Base;
import io.github.bonigarcia.wdm.WebDriverManager;
import org.junit.Assert;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Day04_HomeWork04 extends Base {
    /*
https://id.heroku.com/login sayfasına gidiniz.
Bir mail adresi giriniz.
Bir password giriniz.
Login butonuna tıklayınız.
"There was a problem with your login." text görünür ise "Kayıt Yapılamadı" yazdırınız.
Eğer yazı görünür değilse "Kayıt Yapıldı" yazdırınız.
Tüm sayfaları kapatınız.

     */
    @Test
    public void test1() throws InterruptedException {


        driver.get("https://id.heroku.com/login");
        driver.manage().window().maximize();

        WebElement email = driver.findElement(By.id("email"));
        email.sendKeys("ali123@gmail.com");

        WebElement passWord = driver.findElement(By.xpath("//input[@class='form-control password']"));

        passWord.sendKeys("123");

        WebElement login = driver.findElement(By.xpath("//button[@class='btn btn-primary btn-lg btn-block']"));
        login.submit();

        WebElement mesaj = driver.findElement(By.xpath("//div[@class='alert alert-danger']"));
        if (mesaj.isDisplayed()) {
            System.out.println("Kayıt Yapılamadı");
        } else {
            System.out.println("Kayıt yapıldı");
        }

        WebElement gorunenText = driver.findElement(By.xpath("//div[.='There was a problem with your login.']"));
        String s = gorunenText.isDisplayed() ? "kayit yapilamadi " + gorunenText.getText()  : "kayit yapildi..";
        System.out.println("s = " + s);

        driver.quit();
    }


}

