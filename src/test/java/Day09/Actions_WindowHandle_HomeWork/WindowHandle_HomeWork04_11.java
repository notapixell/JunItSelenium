package Day09.Actions_WindowHandle_HomeWork;

import Utilities.Base;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.interactions.WheelInput;

import java.util.Iterator;
import java.util.List;
import java.util.Set;

public class WindowHandle_HomeWork04_11 extends Base {
    /*
Go to URL: https://www.toolsqa.com/selenium-webdriver/window-handle-in-selenium/
Print the existing windowHandles ids by clicking all the links on the page.-->sayfadaki tüm bağlantılara tıklayarak mevcut windowHandles kimliklerini yazdırın.
Click on the links that open a new page.
Close other pages other than the home page.
Set the driver back to the main page.
     */

    @Test
    public void windowHandles() {
        driver.get("https://www.toolsqa.com/selenium-webdriver/window-handle-in-selenium/");
        ChromeOptions op = new ChromeOptions();
        op.addArguments("disable-popup-blocking"); //

        String homeId = driver.getWindowHandle();

        List<WebElement> links = driver.findElements(By.xpath("//a[@target='_blank']"));
        System.out.println("links.size() = " + links.size());

        links.get(0).click();
        links.get(1).click();

        Set<String> windows = driver.getWindowHandles();
        Iterator<String> it = windows.iterator();

        while (it.hasNext()) {
            driver.switchTo().window(it.next());
            if (driver.getWindowHandle().equals(homeId)){
                continue;
            }
            driver.close();
        }

    }
}
