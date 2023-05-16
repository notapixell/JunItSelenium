package Day04.HomeWork;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.junit.Assert;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Day04_HomeWork03 {
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
    @Test
    public void test1() throws InterruptedException {
        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();
        driver.get("https://testpages.herokuapp.com/styled/index.html");
        driver.manage().window().maximize();
        driver.findElement(By.id("alerttest")).click();
        System.out.println("driver.getCurrentUrl() = " + driver.getCurrentUrl());
        Thread.sleep(3000);
        driver.navigate().back();
        System.out.println("driver.getCurrentUrl() BACK = " + driver.getCurrentUrl());
        driver.findElement(By.id("basicajax")).click();
        System.out.println("driver.getCurrentUrl() BASICAJAX = " + driver.getCurrentUrl());
        WebElement value = driver.findElement(By.xpath("//input[@type='text']"));
        value.sendKeys("20");
        value.submit();

        WebElement degerId = driver.findElement(By.id("_valueid"));
        String sonucId = degerId.getText();
        Assert.assertEquals(sonucId, "1");
        WebElement languageId = driver.findElement(By.id("_valuelanguage_id"));
        String sonuclanguageId = languageId.getText();
        Assert.assertEquals("1",sonuclanguageId);
        driver.quit();

    }


}

