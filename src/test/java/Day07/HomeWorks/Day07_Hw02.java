package Day07.HomeWorks;

import Utilities.Base;
import org.junit.Assert;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class Day07_Hw02 extends Base {
   /*
           Go to URL: https://demoqa.com/select-menu
        Get all the options of the dropdown
        Options size
        Print all test
        Verify the dropdown has option "Black"
        Print FirstSelectedOptionTest
        Select option "Yellow"

        URL'ye gidin: https:demoqa.comselect-menu Açılır menüdeki tüm seçenekleri alın Seçenekler boyutu Tüm testi yazdır
         Açılır listede "Siyah" seçeneğinin olduğunu doğrulayın FirstSelectedOptionTest'i Yazdır "Sarı" seçeneğini seçin
            */

    @Test
    public void testdropdown() {
        driver.get("https://demoqa.com/select-menu");
        WebElement multiSelect = driver.findElement(By.id("oldSelectMenu"));
        Select sc = new Select(multiSelect);
        List<WebElement> options = sc.getOptions();
        List<String> optionvalues = new ArrayList<String>();
        for (WebElement opt : options) {
            optionvalues.add(opt.getText());
        }
        System.out.println(optionvalues.size());
        System.out.println(optionvalues);
        Assert.assertTrue(optionvalues.contains("Black"));
        sc.selectByIndex(3);
    }
}
// List<WebElement> options = sc.getOptions();
//        List<String> optionvalues = options.stream().map(x -> x.getAttribute("2")).collect(Collectors.toList());
//        System.out.println(optionvalues.size()); // 11
//sc.selectByValue("red");
