package Day06.HomeWorks;

import Utilities.Base;
import org.junit.Assert;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class CheckBox_homeWork03 extends Base {
    /*
  Go to URL: https://demoqa.com/radio-button
Soruya verilen 3 seçeneğin de seçilme durumlarını doğrulayınız.
Her bir seçenek seçildiğinde aşağıda çıkan text’leri konsolda yazdırınız.
     */

    @Test
    public void test01() {
        driver.get("https://demoqa.com/radio-button");
        driver.manage().window().maximize();
        WebElement yesElement = driver.findElement(By.xpath("//div[@class='custom-control custom-radio custom-control-inline'][1]"));
        WebElement ımpElement = driver.findElement(By.xpath("//div[@class='custom-control custom-radio custom-control-inline'][2]"));
        WebElement no = driver.findElement(By.xpath("//label[@class='custom-control-label disabled']"));

        Assert.assertFalse(yesElement.isSelected());
        Assert.assertFalse(ımpElement.isSelected());
        Assert.assertFalse(no.isSelected());

    }
}
