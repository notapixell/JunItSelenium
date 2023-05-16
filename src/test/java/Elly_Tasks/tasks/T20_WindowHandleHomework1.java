package Elly_Tasks.tasks;

import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeOptions;
import Utilities.TestBase;

import java.util.Iterator;
import java.util.List;
import java.util.Set;

public class T20_WindowHandleHomework1 extends TestBase {
    /*
        Go to URL: https://www.toolsqa.com/selenium-webdriver/window-handle-in-selenium/
        Print the existing windowHandles ids by clicking all the links on the page.
        Click on the links that open a new page.
        Close other pages other than the home page.
        Set the driver back to the main page.
     */
    @Test
    public void windowHandles() {
        driver.get("https://www.toolsqa.com/selenium-webdriver/window-handle-in-selenium/");

        ChromeOptions op = new ChromeOptions();
        op.addArguments("disable-popup-blocking");

        //daha sonra kullanabilmek adina ana sayfa id mizi sakliyoruz
        String homePageID = driver.getWindowHandle();

        //yeni sekmeler olusturmak adina target = _blank olan linklerin 2 tanesine tiklayalim
        //sayfada yeni pencere acan linkleri bulmak icin  target = _blank attribute-value olan a (link)
        // taglarini bulalim
        // a[@target='_blank']

        List<WebElement> links = driver.findElements(By.xpath("//a[@target='_blank']"));

        System.out.println("links.size() = " + links.size());
        links.get(0).click();
        links.get(1).click();

        //iterate etmek icin -gezinmek icin tum tab ve window id lerini bir set icinde sakliyoruz
        Set<String> windows = driver.getWindowHandles();

        //gezinme islemi icin iterator objesini olusturuyoruz
        Iterator<String> it = windows.iterator();

        //gezinme islemi
        while(it.hasNext()){
            //her bir gezinilen id kullanilarak o anki sekmeye switch ediyoruz
            driver.switchTo().window(it.next());

            //switch  ettigimiz sayfanin ana sayfa olup olmadigini kontrol ediyoruz
            //ana sayfa ise sekmeyi kapatmiyoruz, degilse kapatiyoruz
            if(driver.getWindowHandle().equals(homePageID)){
                continue;
            }

            driver.close();
        }

    }


}
