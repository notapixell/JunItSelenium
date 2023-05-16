package Elly_Tasks.tasks;

import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import Utilities.TestBase;

public class T25_ActionsHomework2 extends TestBase {

    /*
    Go to URL: https://rangeslider.js.org/
    Shift 100 units to the right and 100 units to the left on the horizontal axis.
     */
    @Test
    public void dragSliderRihtAndLeft ()
    {
        driver.get("https://rangeslider.js.org/");
        WebElement slider = driver.findElement(By.xpath("//div[@class='rangeslider__handle']"));

        WebElement output = driver.findElement(By.id("js-output"));

        Actions act = new Actions (driver);

        act.dragAndDropBy(slider, 100, 0).perform();
        System.out.println("What Is The Output After Dragging Right? " + output.getText()); //490

        act.dragAndDropBy(slider, -100, 0).perform();
        System.out.println("What Is The Output After Dragging Left? " + output.getText()); //300


    }

}
/*
act.dragAndDropBy(slider, 100, 0).perform();:
 act nesnesinin dragAndDropBy() metodunu kullanarak slider elementini 100 piksel sağa sürükler.
System.out.println("What Is The Output After Dragging Right? " + output.getText());:
slider'ı sağa sürükledikten sonra "js-output" ID'sine sahip elementin değerini yazdırır.
Bu, range slider'ın sağa sürüklenmesiyle değişen değeri gösterir.
act.dragAndDropBy(slider, -100, 0).perform();:
 act nesnesinin dragAndDropBy() metodunu kullanarak slider elementini 100 piksel sola sürükler.
 */