package ermanCodeChallenge;

import org.junit.Assert;
import io.github.bonigarcia.wdm.WebDriverManager;
import org.junit.BeforeClass;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

import java.time.Duration;

public class SauceDemoPractice03 {
    //1."https://www.saucedemo.com"Adresinegidin
//        2.Username kutusuna "standard_user"yazdirin
//        3.Password kutusuna "secret_sauce"yazdirin
//        4.Login tusunabasin
//        5.Ilk urunun ismini kaydedin ve bu urunun sayfasina gidin
//        6.Add to Cart butonunabasin
//        7.Alisveris sepetinetiklayin
//        8.Sectiginiz urunun basarili olarak sepete eklendigini controledin
//        9.Sayfayikapatin
    static WebDriver driver;
    Actions actions = new Actions(driver);
    @BeforeClass
    public static void setup (){
        WebDriverManager.chromedriver().setup();
        driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(3));
    }
    //1."https://www.saucedemo.com"Adresinegidin
    @Test
    public void sauceDemoTest() {
        driver.get("https://www.saucedemo.com");
        //        2.Username kutusuna "standard_user"yazdirin
//        3.Password kutusuna "secret_sauce"yazdirin
        WebElement userName = driver.findElement(By.xpath("//input[@id='user-name']"));
        WebElement password = driver.findElement(By.id("password"));
        userName.sendKeys("standard_user");
        password.sendKeys("secret_sauce");
        driver.findElement(By.id("login-button")).click();
        //        5.Ilk urunun ismini kaydedin ve bu urunun sayfasina gidin
        WebElement ilkUrun = driver.findElement(By.xpath("//img[@alt='Sauce Labs Backpack']"));
        ilkUrun.click();
        //        6.Add to Cart butonunabasin
        driver.findElement(By.id("add-to-cart-sauce-labs-backpack")).click();
        //        7.Alisveris sepetinetiklayin
        driver.findElement(By.xpath("//a[@class='shopping_cart_link']")).click();
        //        8.Sectiginiz urunun basarili olarak sepete eklendigini controledin
        WebElement sepet = driver.findElement(By.xpath("//div[text()='Sauce Labs Backpack']"));
        Assert.assertTrue(sepet.isDisplayed());
    }
}