package Day09;

import Utilities.Base;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;

import javax.swing.*;

public class C04_Actions extends Base {

    // bu zamana kadar kullandığımız aksiyon methodları sendKeys ve clic ten ibaretti.
    // peki bu hareketlerden farklı bir aksiyon yapmak istersek ne yapmalıyız?
   @Test
   /*
     Go to URL: https://demoqa.com/buttons
    Run the buttons on the page using the Actions Class.
    Verify the texts that appear after the buttons are operated.
    */
   public void test01(){

       //Actions objesi ile biz sag click, cift click, element uzerine gelme, scroll, klavye operasyonlari gerceklestirebiliriz.
       // !!!Bu methodlar cagirildiktan sonra perform() methodu cagirilmadigi surece aksiyonlar gerceklesmez!!!
       //Actions objesinde methodlar zincirlenebilir

       driver.get("https://demoqa.com/buttons");
       Actions action = new Actions(driver);

       WebElement doubleClickButton = driver.findElement(By.id("doubleClickBtn"));
       WebElement rightClickButton = driver.findElement(By.id("rightClickBtn"));
       WebElement clickButton = driver.findElement(By.xpath("(//button)[4]"));


     //  action.doubleClick(doubleClickButton).perform();
     //  action.contextClick(rightClickButton).perform();
     //  action.click(clickButton).perform();


       action.
               doubleClick(doubleClickButton).
               contextClick(rightClickButton).
               click(clickButton).
               perform();

// tek tek de perform yapabilirsin, hepsini birden de yapabilirsin
   }







}
