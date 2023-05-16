package Day06.HomeWorks;


import Utilities.Base;
import com.beust.ah.A;
import org.junit.Assert;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class RadioButtonHomework extends Base {
    /*
    Go to URL: https://demoqa.com/radio-button
    Soruya verilen 3 seçeneğin de seçilme durumlarını doğrulayınız.
    Her bir seçenek seçildiğinde aşağıda çıkan text’leri konsolda yazdırınız.
     */
    @Test
    public void radioButtons() throws InterruptedException {

        //Go to URL: https://demoqa.com/radio-button
        driver.get("https://demoqa.com/radio-button");

        //Soruya verilen 3 seçeneğin de seçilme durumlarını doğrulayınız.
        //Her bir seçenek seçildiğinde aşağıda çıkan text’leri konsolda yazdırınız.


        WebElement yesRadio = driver.findElement(By.xpath("(//label[@class='custom-control-label'])[1]"));
        WebElement yesImpressive = driver.findElement(By.xpath("(//label[@class='custom-control-label'])[2]"));
        WebElement yesNo = driver.findElement(By.xpath("//label[@class='custom-control-label disabled']"));

        Assert.assertFalse(yesRadio.isSelected());
        Assert.assertFalse(yesImpressive.isSelected());
        Assert.assertFalse(yesNo.isSelected());

        yesRadio.click();
        Thread.sleep(5000);


        Assert.assertFalse(yesRadio.isSelected());
        Assert.assertFalse(yesImpressive.isSelected());
        Assert.assertFalse(yesNo.isSelected());

        WebElement yes = driver.findElement(By.xpath("//p[@class='mt-3']"));
        System.out.println("yes.getText() = " + yes.getText());

        yesImpressive.click();
        Thread.sleep(3000);

        Assert.assertFalse(yesImpressive.isSelected());
        Assert.assertFalse(yesRadio.isSelected());
        Assert.assertFalse(yesNo.isSelected());

        WebElement impressive = driver.findElement(By.xpath("//p[@class='mt-3']"));
        System.out.println("impressive.getText() = " + impressive.getText());


        yesNo.click();
        Thread.sleep(3000);

        Assert.assertFalse(yesNo.isSelected());
        Assert.assertFalse(yesRadio.isSelected());
        Assert.assertFalse(yesImpressive.isSelected());

        System.out.println("yesNo.getText() = " + yesNo.getText());
        driver.quit();


    }
}