package Day07.HomeWorks;

import Utilities.Base;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

import java.util.ArrayList;
import java.util.List;

public class Day07_Hw04 extends Base {
   /*
   Launch the browser.
 Open "https://demoqa.com/select-menu".
 Select the Old Style Select Menu using the element id.
 Print all the options of the dropdown.
 Select 'Purple' using the index.
 After that, select 'Magenta' using visible text.
 Select an option using value.
 Close the browser.
    */

    @Test
    public void test1() throws InterruptedException {
        //Open "https://demoqa.com/select-menu".
        // Select the Old Style Select Menu using the element id.
        driver.get("https://demoqa.com/select-menu");

        WebElement oldSelectMenu = driver.findElement(By.id("oldSelectMenu"));
        Select select = new Select(oldSelectMenu);

        // Print all the options of the dropdown.

        List<WebElement> options = select.getOptions();

        List<String> selectedOptions = new ArrayList<>();

        for (WebElement x : options) {
            selectedOptions.add(x.getText());
        }
        System.out.println("all the options of the dropdown : " + selectedOptions);
        //Select 'Purple' using the index.
        select.selectByIndex(4);
        Thread.sleep(2000);
        //After that, select 'Magenta' using visible text.
        select.selectByVisibleText("Magenta");
        Thread.sleep(2000);
       // Select an option using value.
        select.selectByValue("6");
    }
}
