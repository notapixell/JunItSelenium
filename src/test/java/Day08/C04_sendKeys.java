package Day08;

import Utilities.Base;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;

public class C04_sendKeys extends Base {

    @Test
    public void sendKeys() {

        /*
        // https://www.amazon.com/ a git
// Arama kismina herhangi bir kelime yaz
// Aramayi enter a tiklayarak yap
         */

        driver.get("https://www.amazon.com/");
        WebElement searchBox = driver.findElement(By.id("twotabsearchtextbox"));

        searchBox.sendKeys("keyboard");
        searchBox.sendKeys(Keys.ENTER);

        searchBox.sendKeys("keyboard" + Keys.ENTER); // böyle de olur. daha kullanılabilir. best practicks


        // senKeys methoduyla biz klavyemizdeki bulunan bütün tuşlara tıklama imkanımız vardır.
    }

    @Test
    public void clear() throws InterruptedException {

        //element.clear() texti silmedigi zaman sendKeys methodundan yararlanabiliriz.

        // Bu durumda javanin dongulerinden yararlanarak text alanimiz bosalana kadar backspace e tiklayabiliriz


        driver.get("https://the-internet.herokuapp.com/iframe");

        driver.switchTo().frame(0);

        WebElement text = driver.findElement(By.tagName("p"));

        int times = text.getText().length();

        for (int i = 0; i < times; i++) {
            text.sendKeys(Keys.BACK_SPACE);
            Thread.sleep(500);
        }


    }
}
