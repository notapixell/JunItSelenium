package Day06.HomeWorks;

import Utilities.Base;
import org.junit.Assert;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class CheckBox_homeWork02 extends Base {
    /*
   Go to URL: https://demoqa.com/
Click on Elements.
Click on Checkbox.
Verify if Home checkbox is selected.
Verify that "You have selected" is visible
     */

    @Test
    public void test01() {
        driver.get("https://demoqa.com/");
        driver.manage().window().maximize();
        WebElement elm = driver.findElement(By.xpath("//div[@class='card mt-4 top-card'][1]"));
        elm.click();

        WebElement checkBox = driver.findElement(By.xpath("//li[.='Check Box']"));
        checkBox.click();
        WebElement home = driver.findElement(By.xpath("//span[@class='rct-title']"));
        home.click();
        home.isSelected();

      //  driver.findElement((By.xpath(("//*[text()='You have selected :']")))).isDisplayed();
        WebElement visible = driver.findElement((By.xpath(("//*[text()='You have selected :']"))));
        Assert.assertTrue(visible.isDisplayed());
    }
}
