package Day07.HomeWorks;

import Utilities.Base;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

import java.util.List;
import java.util.stream.Collectors;

public class Day07_Hw01 extends Base {
    //Go to URL: https://demoqa.com/select-menu
    //Select options in Standard multiple select -->Standart çoklu seçimde seçenekleri belirleyin

    @Test
    public void testSelect() throws InterruptedException {
        driver.get("https://demoqa.com/select-menu");
        WebElement cars = driver.findElement(By.id("cars"));
        Select select = new Select(cars);
        select.selectByIndex(3);
        System.out.println(select.getFirstSelectedOption().getText());
        Thread.sleep(2000);
        select.selectByValue("saab");
        Thread.sleep(2000);
        select.selectByVisibleText("Opel");


        List<WebElement> options = select.getOptions();
        List<String> optionvalues = options.stream().map(x -> x.getAttribute("value")).collect(Collectors.toList());
        System.out.println(optionvalues);// [volvo, saab, opel, audi]
    }

    @Test
    public void multipleSelectTest2() throws InterruptedException {
        driver.get("https://demoqa.com/select-menu");
        WebElement cars = driver.findElement(By.xpath("//select[@name = 'cars']"));
        Select select = new Select(cars);
        if (select.isMultiple()) {
            select.selectByIndex(1);
            Thread.sleep(2000);
            select.selectByIndex(2);
            Thread.sleep(2000);
            select.selectByValue("opel");
            Thread.sleep(2000);
        }
    }
}
