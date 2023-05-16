package Day06.HomeWorks;

import Utilities.Base;
import com.beust.ah.A;
import org.junit.Assert;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class CheckBox_homeWork01 extends Base {
    /*
    Go to https://the-internet.herokuapp.com/checkboxes
Locate the elements of checkboxes.
Then click on checkbox 1 if box is not selected.
Then click on checkbox 2 if box is not selected.
Then verify that checkbox 1 is checked.
     */

    @Test
    public void test01() {
        driver.get("https://the-internet.herokuapp.com/checkboxes");
        driver.manage().window().maximize();
        WebElement checkBox1 = driver.findElement(By.xpath("//input[@type='checkbox'][1]"));
        WebElement checkBox2 = driver.findElement(By.xpath("//input[@type='checkbox'][2]"));

        // Then click on checkbox 1 if box is not selected.
        Assert.assertFalse(checkBox1.isSelected());
        checkBox1.click();
       // Then click on checkbox 2 if box is not selected.
        Assert.assertTrue(checkBox2.isSelected());
        checkBox2.click();

        //Then verify that checkbox 1 is checked.

        Assert.assertTrue(checkBox1.isSelected());

    }
}
