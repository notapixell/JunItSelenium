package Elly_Tasks.tasks;

import org.junit.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WindowType;
import Utilities.TestBase;

import java.util.Iterator;
import java.util.Set;

public class T22_WindowsHandleHomework3  extends TestBase {
 /*
    go to url : https://testproject.io/
    Selenium’s 4 newWindow() method to open a new Window for TestProject’s Blog page.
    https://blog.testproject.io/
    */


    @Test
    public void newWindow() {

        // Ana sekmemizde url i ziyaret ediyoruz.
        driver.get("https://testproject.io/");

        // Yeni pencere olusturup o pencereye switch ediyoruz.
        driver.switchTo().newWindow(WindowType.WINDOW);

        // Yeni penceremizde url imizi ziyaret ediyoruz
        driver.get("https://blog.testproject.io/");
    }

    @Test
    public void newTab() {

        // Ana sekmemizden testproject acildi
        driver.get("https://testproject.io/");

        // Yeni bir sekme olusturuldu
        WebDriver newTab = driver.switchTo().newWindow(WindowType.TAB);

        // Yeni sekmeden amazona gidildi
        newTab.get("https://www.amazon.com/");

        //Aktif tab in title i yazdirildi -> Aktif tab imiz = yeni olusturulan tab
        System.out.println(driver.getTitle());

    }

    @Test
    public void handleWindows() {

        // Ana sekmemizde amazon aciliyor
        driver.get("https://www.amazon.com/");

        //String homePageHandle = driver.getWindowHandle();

        // ayni sayfada iken yeni sekme (aynı sayfa degil) boş bir sayfa olarak açılır
        // Yeni bir sekme- tab açtıktan sonra, acilan sayfada linke gider
        driver.switchTo().newWindow(WindowType.TAB);

        //Yeni sekmemizde amazon tr yi actik
        //Yeni bir pencere açtıktan sonra, acilan sayfada linke gider
        driver.get("https://www.amazon.com.tr/");

        //Yeni pencere olusturduk.
        // ayni sayfada iken yeni bir pencere sayfası açmak için bir komut gönderen newWindow(WindowType. WINDOW) 'dir.
        // Bu kod satiri run edilince bos bir sayfa acilir
        driver.switchTo().newWindow(WindowType.WINDOW);

        //Yeni pencerede Google i actik
        ////Yeni bir pencere açtıktan sonra, acilan sayfada linke gider
        driver.get("https://www.google.com/");


        Set<String> handles = driver.getWindowHandles();
        Iterator<String> i = handles.iterator();

        while (i.hasNext()) {
            String currentTab = i.next();
            driver.switchTo().window(currentTab);

            System.out.println(driver.getTitle());


            /* 1. yol
            if (!driver.getWindowHandle().equals(homePageHandle)){
                driver.close();
             }

             */

            /*
             2. yol


            if (!driver.getTitle().contains("Spend")){
                driver.close();
            }
            */

        }

    }
}