package Day04.HomeWork;

import Utilities.Base;
import io.github.bonigarcia.wdm.WebDriverManager;
import org.junit.Assert;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Day04_HomeWork01 extends Base {
    /*/
    Go to http://automationpractice.com/index.php
    When we write an e-mail without the @ sign in the e-mail box and press enter.
    Let's test the "Invalid email address" warning.
     */
    @Test
    public void testInvalidEmail() throws InterruptedException {

        driver.get("http://automationpractice.pl/index.php");
        driver.manage().window().maximize();
        WebElement signLink = driver.findElement(By.xpath("//a[@class='login'] [@title='Log in to your customer account']"));
        signLink.click();
        Thread.sleep(3000);
        WebElement email = driver.findElement(By.xpath("//input[@class='is_required validate account_input form-control'][1]"));
        email.sendKeys("asdgmail.com");
        Thread.sleep(2000);
        email.submit();
        Thread.sleep(3000);
        String error = driver.findElement(By.xpath("//div[@id='create_account_error']//li")).getText();
        Assert.assertEquals("Invalid email address.",error);
        driver.quit();






//
//
//
//
//
//
//        String error = driver.findElement(By.xpath("//div[@id='create_account_error']//li")).getText();
//
//        Assert.assertEquals("Invalid email address.",error);





        //WebElement searchButton = driver.findElement(By.xpath("//button[@class='q-secondary q-button-medium q-button tab button mr-5 left active']"));

        //searchButton.click();
    }


}
