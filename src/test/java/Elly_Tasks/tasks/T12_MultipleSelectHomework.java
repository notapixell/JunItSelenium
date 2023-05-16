package Elly_Tasks.tasks;

import org.junit.Assert;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;
import Utilities.TestBase;

import java.util.List;

public class T12_MultipleSelectHomework extends TestBase {
    /*
    Go to URL: https://demoqa.com/select-menu
    Select options in Standard multiple select
     */
@Test
public void multipleSelectTest(){
    driver.get("https://demoqa.com/select-menu");
    WebElement cars = driver.findElement(By.xpath("//select[@name = 'cars']"));
    Select select = new Select(cars);
    select.selectByValue("volvo");
    select.selectByVisibleText("Saab");
    select.selectByValue("opel");
    select.selectByIndex(3);
}

    @Test
    public void multipleSelectTest2() throws InterruptedException {
        driver.get("https://demoqa.com/select-menu");
        WebElement cars = driver.findElement(By.xpath("//select[@name = 'cars']"));
        Select select = new Select(cars);

        if(select.isMultiple()) {
            select.selectByIndex(1);
            Thread.sleep(2000);
            select.selectByIndex(2);
            Thread.sleep(2000);
            select.selectByValue("opel");
            Thread.sleep(2000);

        }
    }
    }
