package Elly_Tasks.tasks;

import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import Utilities.TestBase;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class T18_IframeHomework1 extends TestBase {
    /*
    https://www.jqueryscript.net/demo/Easy-iFrame-based-Twitter-Emoji-Picker-Plugin-jQuery-Emoojis/ sitesine gidiniz.
    Web sitesini maximize yapınız.
    İkinci emojiye tıklayınız.
    Tüm ikinci emoji öğelerine tıklayınız.
    Parent iframe geri dönünüz.
    Formu doldurun (Formu istediğiniz metinlerle doldurun) apply button’a basınız
     */

    @Test
    public void test() throws InterruptedException {
        driver.get("https://www.jqueryscript.net/demo/Easy-iFrame-based-Twitter-Emoji-Picker-Plugin-jQuery-Emoojis/");
        WebElement iframe = driver.findElement(By.xpath("//iframe[@id = 'emoojis']"));
        driver.switchTo().frame(iframe);
        //driver.switchTo().frame("emoojis");

        // (//span[@class= 'mdl-tabs__ripple-container mdl-js-ripple-effect'])[2]  ya da //a[contains(@href, 'nature')]

        driver.findElement(By.xpath("//a[contains(@href, 'nature')]")).click(); //2nd emojiye tikladik..
        List<WebElement> emojiOgeler = driver.findElements(By.xpath("//div[@id = 'nature']//div"));
        emojiOgeler.stream().forEach(WebElement::click);

        driver.switchTo().parentFrame();

        List<WebElement> textList = driver.findElements(By.xpath("//input[@class= 'mdl-textfield__input']"));
        List<String> text = new ArrayList<>(Arrays.asList("Bir", "iframe", "sorusu",
                "bu", "kadar", "eglenceli", "olabilir", "sizce de ", "oyle degil mi ?", "", ""));

        for (int i = 0; i < textList.size(); i++) {
            textList.get(i).sendKeys(text.get(i));
        }
        Thread.sleep(2000);

        driver.findElement(By.xpath("//button[@id ='send']")).click();
    }

}
