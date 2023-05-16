package ermanCodeChallenge;

import Utilities.Base;
import org.junit.Assert;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class Task02_11May extends Base {

    //http://www.dhtmlgoodies.com/scripts/drag-drop-custom/demo-drag-drop-3.html sitesine gidin
//Baskentleri ulkelere surukleyip birakin
//Oslo ve Norway in arkaplan renginin yesil oldugunu dogrulayin
    @Test
    public void test() {

        driver.get("http://www.dhtmlgoodies.com/scripts/drag-drop-custom/demo-drag-drop-3.html");

        WebElement oslo = driver.findElement(By.id("box1"));
        WebElement stockholm = driver.findElement(By.id("box2"));
        WebElement washington = driver.findElement(By.id("box3"));
        WebElement copenhagen = driver.findElement(By.id("box4"));
        WebElement seoul = driver.findElement(By.id("box5"));
        WebElement rome = driver.findElement(By.id("box6"));
        WebElement madrid = driver.findElement(By.id("box7"));


        WebElement italy = driver.findElement(By.id("box106"));
        WebElement norway = driver.findElement(By.id("box101"));
        WebElement southKorea = driver.findElement(By.id("box105"));
        WebElement unitedStates = driver.findElement(By.id("box103"));
        WebElement spain = driver.findElement(By.id("box107"));
        WebElement denmark = driver.findElement(By.id("box104"));
        WebElement sweden = driver.findElement(By.id("box102"));

        actions.dragAndDrop(oslo,norway).perform();
        actions.dragAndDrop(stockholm,sweden).perform();
        actions.dragAndDrop(washington,unitedStates).perform();
        actions.dragAndDrop(copenhagen,denmark).perform();
        actions.dragAndDrop(seoul,southKorea).perform();
        actions.dragAndDrop(rome,italy).perform();
        actions.dragAndDrop(madrid,spain).perform();

        //Oslo ve Norway in arkaplan renginin yesil oldugunu dogrulayin

        //background-color: rgb(0, 255, 0)
        System.out.println(oslo.getAttribute("style"));
        Assert.assertTrue(oslo.getAttribute("style").contains("background-color: rgb(0, 255, 0)"));

     //   System.out.println(norway.getAttribute("visibility"));
     //   Assert.assertTrue(oslo.getAttribute("visibility").contains("background-color: rgb(0, 255, 0)"));
    }
}
