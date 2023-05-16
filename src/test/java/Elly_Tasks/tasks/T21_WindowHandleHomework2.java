package Elly_Tasks.tasks;

import Utilities.Base;
import org.junit.Assert;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;


import java.util.Iterator;
import java.util.Set;



public class T21_WindowHandleHomework2 extends Base {
/*
Go to URL: https://the-internet.herokuapp.com/windows
Verify the text: “Opening a new window”
Verify the title of the page is “The Internet”
Click on the “Click Here” button
Verify the new window title is “New Window”
Go back to the previous window and then verify the title: “The Internet”
 */
@Test
public void windowHandleHeroku() throws InterruptedException {

    driver.get("https://the-internet.herokuapp.com/windows");

   /*  eger kontrolsuz acilan bir tab veya window varsa o zaman sayfalarin window handle degerlerini
   elde etmem gerekir.oncelikle 2.sayfa acilmadan once ilk sayfanin window handle degerini bir String'e atayalim
         */
    String window1Handle = driver.getWindowHandle();
    System.out.println("WINDOW 1 HANDLE : "+window1Handle); //WINDOW 1 HANDLE : CDwindow-C6364CCFF543E3804272C378F607ACA9

    // verifies the text : “Opening a new window”
    String window1Text = driver.findElement(By.xpath("//div[@class='example']//h3")).getText();
    // sayfanin handle degeri geri donus icin saklandi

    Assert.assertEquals("Opening a new window",window1Text);

    // verifies the title of the page is “The Internet”
    Assert.assertEquals("The Internet",driver.getTitle());
    // click on the “Click Here” button
    driver.findElement(By.linkText("Click Here")).click();
    //    driver.findElement(By.xpath("//a[contains(.,'Click')]")).click();
    // verifies the new window title is “New Window”
         /*
        yeni sayfaya gecebilmek icin oncelikle ikinciSayfaWindowHandleDegeri'ni bulmamiz gerekir
        bunun icin driver.getWindowHandles() method'unu kullanarak
        acik olan tum sayfalarin window handle degerlerini alip bir set'e assign ederiz.

        ilk sayfanin window handle degerini zaten biliyoruz Set'deki window handle degerlerini kontrol edip
        ilk sayfanin handle degerine esit olmayan ikinci sayfanin window handle degeridir deriz
         */
    Set<String> allWindowHandles = driver.getWindowHandles();
    System.out.println(allWindowHandles); //[CDwindow-C6364CCFF543E3804272C378F607ACA9, CDwindow-A40DC68D80638F3F107C6BD74BABB177]
    //        We must switch to the 2nd window
    for (String eachHandle : allWindowHandles){
        if (!eachHandle.equals(window1Handle)){//if each handle is NOT equal to window1 handle
            //Then it must be equal to window 2 handle. Then switch to that window
            driver.switchTo().window(eachHandle);

            break;
        } }

    //        DRIVER IS ON WINDOW 2
    String window2Handle = driver.getWindowHandle();   // artik ikinci sayfanin window handle degerini biliyoruz
    // rahatlikla sayfalar arasii gecis yapabiliriz
    String window2Title = driver.getTitle();
    Assert.assertEquals("New Window",window2Title);


    // go back to the previous window and then verifies the title : “The Internet”
    Thread.sleep(2000);
    driver.switchTo().window(window1Handle);
    Assert.assertEquals("The Internet",driver.getTitle());

    Thread.sleep(2000);
    driver.switchTo().window(window2Handle);
    Thread.sleep(2000);
    driver.switchTo().window(window1Handle);
    Thread.sleep(2000);
    driver.switchTo().window(window2Handle);
}

}
