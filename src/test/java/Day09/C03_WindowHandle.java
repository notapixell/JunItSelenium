package Day09;

import Utilities.Base;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WindowType;

import java.util.Iterator;
import java.util.Set;

public class C03_WindowHandle extends Base {
    @Test
    public void WindowHandles() {
        // 1- browser ac
// 2- acilan sekmede https://www.amazon.com/ ac
// 3- yeni sekme olustur
// 4- acilan sekmede https://www.linkedin.com/ ac
// 5- yeni pencere olustur
// 6- acilan pencerede https://opensource-demo.orangehrmlive.com/web/index.php/auth/login sitesini ac
// 7- amazon sekmesine geçerek amazon sekmesini bulunuz.

        driver.get(" https://www.amazon.com/");
        driver.switchTo().newWindow(WindowType.TAB);
        System.out.println("amazon sayfasının window handle değeri = " + driver.getWindowHandle()); // bilgi amaçlı yazıldı

        driver.get("https://www.linkedin.com/");
        System.out.println("linkedin sayfasının window handle değeri = " + driver.getWindowHandle());

        driver.switchTo().newWindow(WindowType.WINDOW);
        driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");

        System.out.println("OrangeHRM sayfasının window handle değeri = " + driver.getWindowHandle());

        Set<String> windowHandles = driver.getWindowHandles();
        Iterator<String> i = windowHandles.iterator();

        while (i.hasNext()) {
            String currentHandle = i.next();
            driver.switchTo().window(currentHandle);
            System.out.println("driver.getWindowHandle() = " + driver.getWindowHandle());

            if (driver.getTitle().toLowerCase().contains("amazon")) {
                break;

            }
        }

        driver.findElement(By.id("twotabsearchtextbox")).sendKeys("merhaba AMAZON");
    }
}
