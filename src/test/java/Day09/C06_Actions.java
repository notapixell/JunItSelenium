package Day09;

import Utilities.Base;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;

public class C06_Actions extends Base {
    @Test
    public void test(){

        /*
        Go to URL: http://www.dhtmlgoodies.com/scripts/drag-drop-custom/demo-drag-drop-3.html
 Fill in capitals by country.
put ROME to ıtaly
         */


        driver.get("http://www.dhtmlgoodies.com/scripts/drag-drop-custom/demo-drag-drop-3.html");
        WebElement rome = driver.findElement(By.id("box6"));
        WebElement washington = driver.findElement(By.id("box3"));

        WebElement italy = driver.findElement(By.id("box106"));
        WebElement usa = driver.findElement(By.id("box103"));

        Actions action = new Actions(driver);
        action.dragAndDrop(rome,italy).perform();

        // Yontem 2
        // elemente git - tikla ve basili tut - diger elemente git - ve basili tutmayi birak

        action.moveToElement(washington).clickAndHold().moveToElement(usa).release().perform();

    }
}
