package Day04.HomeWork;

import Utilities.Base;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class Day04_HomeWork06 extends Base {
    /*
        https://www.teknosa.com/ adresine gidiniz.
        Arama çubuğuna ‘’oppo’’ yazıp ENTER tıklayınız.
        Sonuç sayısını yazdırınız.
        Çıkan ilk ürüne tıklayınız.
        Sepete ekleyiniz.
        Sepetime gite tıklayınız.
        Konsolda "Sipariş Özeti" WebElement’inin text’ini yazdırınız.
        Alışverişi tamamlayınız.
        Son olarak "Teknosa’ya Hoş Geldiniz" WebElement’inin text’ini yazdırınız.
        Driver’ı kapatınız.
     */
    @Test
    public void test1() throws InterruptedException {

        driver.get("https://www.teknosa.com/");
        driver.manage().window().maximize();
        WebElement searchBox = driver.findElement(By.xpath("//input[@type='text']"));
        searchBox.sendKeys("oppo");
        Thread.sleep(3000);
        searchBox.submit();
        WebElement result = driver.findElement(By.xpath("//div[@class='plp-info']"));
        System.out.println("result.getText() = " + result.getText());

        WebElement ilkUrun = driver.findElement(By.xpath("//a[@class='prd-link gowitPlp-js'][@title='Apple Watch SE GPS 44MM Gece Yarısı Alüminyum Kasa ve Gece Yarısı Spor Kordon']"));
        ilkUrun.click();
        WebElement sepeteEkle = driver.findElement(By.xpath("//button[@id='addToCartButton'][@class='js-add-to-cart js-enable-btn btn btn-primary js-shop_125421653']"));
        sepeteEkle.click();
    }


}

