package Elly_Tasks.tasks;

import Utilities.TestBase;
import org.junit.Assert;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;


import java.util.List;


public class T11_RadioButtonHomework extends TestBase {
    /*
    Go to URL: https://demoqa.com/radio-button
    Soruya verilen 3 seçeneğin de seçilme durumlarını doğrulayınız.
    Her bir seçenek seçildiğinde aşağıda çıkan text’leri konsolda yazdırınız.
     */
    @Test
    public void test01() {

        driver.get("https://demoqa.com/radio-button");

        List<WebElement> rButtons = driver.findElements(By.xpath("//input[@name='like']"));
        for (WebElement rButton : rButtons) {
            String selectedId = rButton.getAttribute("id");
            if (!rButton.isEnabled()) {
                System.out.println(selectedId + " is not enabled");
                continue;
            }
            rButton.sendKeys(Keys.SPACE);
            if (rButton.isSelected()) {
                System.out.println("Selected Text : " + selectedId);
            }
            Assert.assertTrue(selectedId + " is selected", rButton.isSelected());
        }
    }
}

// getAttribute() : Belirtilen bir Web Element’in attribute değerini alır.
// Parametre olarak String kullanır ve sonucu olarak bir String değeri döndürür.






