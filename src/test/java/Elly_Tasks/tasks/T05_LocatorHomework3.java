package Elly_Tasks.tasks;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.junit.Assert;
import org.junit.BeforeClass;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.time.Duration;

public class T05_LocatorHomework3 {
/*
    Navigate to website  https://testpages.herokuapp.com/styled/index.html
    Under the ORIGINAL CONTENTS
    Click on Alerts
    Print the URL
    Navigate back
    Print the URL
    Click on Basic Ajax
    Print the URL
    Enter value 20 and Enter
    And then verify Submitted Values is displayed open page
    Close driver.
 */

    static WebDriver driver;
    @BeforeClass
    public static void setUp(){
        WebDriverManager.chromedriver().setup();
        driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
        driver.navigate().to("https://testpages.herokuapp.com/styled/index.html");
    }

    @Test
    public void test() throws InterruptedException {

        // Under the  ORIGINAL CONTENTS
        // click on Alerts
        WebElement alert=driver.findElement(By.id("alerts"));
        //xpath -> //a[@id ='c']  //a[.='Alerts']  //a[@id='alerts']
        alert.click();

        // print the URL
        String alertUrl= driver.getCurrentUrl();
        System.out.println("alertUrl = " + alertUrl);

        // navigate back
        driver.navigate().back();

        // print the URL
        String homeUrl=driver.getCurrentUrl();
        System.out.println("homeUrl = " + homeUrl);

        // Click on Basic Ajax
        WebElement basicAjax=driver.findElement(By.id("basicajax"));
        //-> xpath //a[@id='basicajax']    //a[.='Basic Ajax']       linkText  ("Basic Ajax")
        basicAjax.click();

        // print the URL
        String basicAjaxUrl=driver.getCurrentUrl();
        System.out.println("basicAjaxUrl = " + basicAjaxUrl);

        // enter value-> 20 and Enter
        Thread.sleep(1500);            // xpath : //input[@type='text' and @id='lteq30']
        driver.findElement(By.id("lteq30")).sendKeys("20" + Keys.ENTER);

        // and then verify Submitted Values is displayed open page
        boolean verify=driver.findElement(By.xpath("//p[text()='Submitted Values']")).isDisplayed();
        // xpath : //div[@id='_id']//..//p
        //System.out.println( verify ? "Verify test PASS" : "Verify test FAİLED" );
        Assert.assertTrue(verify);
    }
}
