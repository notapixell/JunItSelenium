package Elly_Tasks.tasks;

import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import Utilities.TestBase;

public class T26_ActionsHomework3 extends TestBase {

/*
    Go to URL: https://foundation.zurb.com/sites/docs/v/5.5.3/components/range_slider.html
    Shift 34 units to the up and 34 units to the down on the vertical axis.
*/

    @Test
    public void dragSliderDown ()
    {
        driver.get("https://foundation.zurb.com/sites/docs/v/5.5.3/components/range_slider.html");
        WebElement slider = driver.findElement(By.cssSelector("div.small-3 span.range-slider-handle"));

        WebElement value = driver.findElement(By.id("sliderOutput2"));

        Actions act = new Actions (driver);
        act.dragAndDropBy(slider, 0, 34).perform();

        System.out.println("What Is The Value After Dragging The Slider Down? " + value.getText()); //32
    }

    @Test
    public void dragSliderUp () {
        driver.get("https://foundation.zurb.com/sites/docs/v/5.5.3/components/range_slider.html");
        WebElement slider = driver.findElement(By.cssSelector("div.small-3 span.range-slider-handle"));

        WebElement value = driver.findElement(By.id("sliderOutput2"));

        Actions act = new Actions(driver);
        act.dragAndDropBy(slider, 0, -34).perform();

        System.out.println("What Is The Value After Dragging The Slider Up? " + value.getText()); //70
    }
}
