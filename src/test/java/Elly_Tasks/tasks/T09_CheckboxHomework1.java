package Elly_Tasks.tasks;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.time.Duration;
import java.util.List;

public class T09_CheckboxHomework1 {

 /*
    Go to https://the-internet.herokuapp.com/checkboxes
    Locate the elements of checkboxes.
    Then click on checkbox 1 if box is not selected.
    Then click on checkbox 2 if box is not selected.
    Then verify that checkbox 1 is checked.
  */
 WebDriver driver;
    @Before
    public void setUp(){
        WebDriverManager.chromedriver().setup();
        driver = new ChromeDriver();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
        driver.manage().window().maximize();
        driver.get("https://the-internet.herokuapp.com/checkboxes");
    }
    @Test
    public void checkbox() throws InterruptedException {

        // Go to https://the-internet.herokuapp.com/checkboxes

        // Locate the elements of checkboxes
        WebElement checkbox1 = driver.findElement(By.xpath("(//input[@type='checkbox'])[1]"));
        WebElement checkbox2 = driver.findElement(By.xpath("(//input[@type='checkbox'])[2]"));
        // Then click on checkbox1 if box is NOT selected
        Thread.sleep(5000);

        if (!checkbox1.isSelected())  checkbox1.click();
        Thread.sleep(5000);
        // Then click on checkbox2 if box is not selected
        if (!checkbox2.isSelected())  checkbox2.click();

        //  Then verify that checkbox1 is checked.
        Assert.assertTrue(checkbox1.isSelected());  }

    @Test
    public void checkBoxList() {

        List<WebElement> allCheckBoxes = driver.findElements(By.xpath("//input[@type='checkbox']"));

        //Printing the size of checkbox group
        System.out.println(allCheckBoxes.size()); //2

        //Click on specific one
        allCheckBoxes.get(1).click();

        //verify if it is checked or not
        System.out.println(allCheckBoxes.get(0).isSelected()); //false
    }
    @After
    public void tearDown(){
        driver.quit();
    }}


/*
System.out.println(driver.findElement(By.xpath("(//input[@type=\"checkbox\"])[1]")).getLocation());
System.out.println(driver.findElement(By.xpath("(//input[@type=\"checkbox\"])[2]")).getLocation());
 */



