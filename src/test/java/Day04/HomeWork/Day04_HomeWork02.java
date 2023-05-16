package Day04.HomeWork;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Day04_HomeWork02 {
    /*
    Go to http://www.google.com
Type "Green Mile" in the search box and print the number of results.
Type "Premonition" in the search box and print the number of results.
Type "The Curious Case of Benjamin Button" in the search box and print the number of results.

http:www.google.com adresine gidin,
 arama kutusuna "Green Mile" yazın ve sonuç sayısını yazdırın.
  Arama kutusuna "Premonition" yazın ve sonuç sayısını yazdırın.
 Arama kutusuna "Benjamin Button'ın Tuhaf Hikayesi" yazın ve sonuç sayısını yazdırın.
     */
    @Test
    public void test1() throws InterruptedException {
        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();
        driver.get("http://www.google.com");
        driver.manage().window().maximize();

        WebElement searchBox = driver.findElement(By.xpath("//textarea[@class='gLFyf']"));
        searchBox.sendKeys("Green Mile");
        searchBox.submit();
        Thread.sleep(3000);

        System.out.println(driver.findElement(By.id("result-stats")).getText());
        driver.quit();
    }


    @Test
    public void test2() throws InterruptedException {
        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();
        driver.get("http://www.google.com");
        driver.manage().window().maximize();

        WebElement searchBox = driver.findElement(By.xpath("//textarea[@class='gLFyf']"));
        searchBox.sendKeys("Premonition");
        searchBox.submit();
        Thread.sleep(3000);

        System.out.println(driver.findElement(By.id("result-stats")).getText());
        driver.quit();
    }
    @Test
    public void test3() throws InterruptedException {
        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();
        driver.get("http://www.google.com");
        driver.manage().window().maximize();

        WebElement serachBox = driver.findElement(By.xpath("//textarea[@class ='gLFyf']"));
        serachBox.sendKeys("Benjamin Button'ın Tuhaf Hikayesi");
        serachBox.submit();
        System.out.println("sonuç = " + driver.findElement(By.id("result-stats")).getText());
        driver.quit();
    }

}

