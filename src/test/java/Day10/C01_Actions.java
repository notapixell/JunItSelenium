package Day10;

import Utilities.Base;
import org.checkerframework.checker.units.qual.K;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;

public class C01_Actions extends Base {

    // https://www.google.com/
    // arama kısmına chatGPT yazınız.

    @Test
    public void test() {

        driver.get("https://www.google.com/");
        WebElement search = driver.findElement(By.name("q"));

        // Mouse hareketlerinde basılı tutma işlemi clickAndHold methodu ile yapılır.
        // basılı tutma işlemi release() methodu ile sonlandırılır.

        // keyDown() klavyede bir tuşa basılı tutmayı sağlar.
        // // keyUp() ise basili tutma islemini sonlandirir

        //search.sendKeys("chatgpt");
        actions.
                moveToElement(search).
                click().
                sendKeys("chat").
                keyDown(Keys.SHIFT).
                sendKeys("gpt").
                keyUp(Keys.SHIFT).
                perform();

    }
}
