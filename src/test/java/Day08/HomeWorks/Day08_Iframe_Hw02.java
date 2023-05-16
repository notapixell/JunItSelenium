package Day08.HomeWorks;

import Utilities.Base;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class Day08_Iframe_Hw02 extends Base {
    /*
    Go to URL: http://demo.guru99.com/test/guru99home/
Find the number of iframes on the page.--> Sayfadaki iframe sayısını bulun.
Link to the fourth iframe (JMeter Made Easy) (https://www.guru99.com/live selenium project.html) click here.
Exit the iframe and return to the main page.
     */

    @Test
    public void test() {
        driver.get("http://demo.guru99.com/test/guru99home/");
        //ifame arattir html den
        int iframeNumber = driver.findElements(By.tagName("iframe")).size();
        System.out.println("iframeNumber = " + iframeNumber); //iframeNumber = ....
        driver.switchTo().frame("a077aa5e");
        driver.findElement(By.xpath("/html/body/a")).click();
        //iframe den cikip ana sayfaya donunuz
        driver.switchTo().defaultContent();

    }
}
