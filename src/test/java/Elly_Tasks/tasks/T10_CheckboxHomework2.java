package Elly_Tasks.tasks;

import Utilities.TestBase;
import org.junit.Assert;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;




public class T10_CheckboxHomework2 extends TestBase {
/*
    Go to URL: https://demoqa.com/
    Click on Elements.
    Click on Checkbox.
    Verify if Home checkbox is selected.
    Verify that "You have selected" is visible
 */

    @Test
    public void test01() throws InterruptedException {
        driver.get("https://demoqa.com/");
        Thread.sleep(1000);
        driver.findElement(By.xpath("//div[@class='card-body']//h5[text()='Elements']")).click();
        driver.findElement(By.xpath("//span[text()='Check Box']")).click();
        Thread.sleep(1000);
        WebElement homeCheckbox = driver.findElement(By.xpath("//span[@class='rct-checkbox']")); // get Home checkbox
        Assert.assertFalse(homeCheckbox.isSelected());  //Verify if Home checkbox is selected.
        Thread.sleep(1000);
        if (!homeCheckbox.isSelected()) homeCheckbox.click(); //Click on Checkbox.
        Thread.sleep(1000);
        WebElement youHaveSelected = driver.findElement(By.xpath("//div[@id='result']"));
        Assert.assertTrue(youHaveSelected.isDisplayed());  //Verify that "You have selected" is visible
    }

}
//Selected Text : yesRadio
//Selected Text : impressiveRadio
//noRadio is not enabled


