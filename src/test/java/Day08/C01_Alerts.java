package Day08;

import Utilities.Base;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import java.util.List;

public class C01_Alerts extends Base {

    @Test
    public void testAlert() {
        driver.get("https://the-internet.herokuapp.com/javascript_alerts");

        // click for JS alert butonuna tıkla.
        driver.findElement(By.xpath("//button[@onclick='jsAlert()']"));
        List<WebElement> buttons = driver.findElements(By.tagName("button"));
        buttons.get(0).click();

        // alertteki ok butonuna tıkla
        driver.switchTo().alert().accept();
        //Js confrim butonuna tıkla
        buttons.get(1).click();
        // alertteki cancel butonuna tıkla
        driver.switchTo().alert().dismiss();
        // JS promt butonuna tıklaa
        buttons.get(2).click();
        // alerte karl ortıs yaz ve ok e tıkla
        driver.switchTo().alert().sendKeys("karl ortis");
        driver.switchTo().alert().accept();
    }


}
