package Day04.HomeWork;

import Utilities.Base;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class Day04_HomeWork05 extends Base {
    /*
Navigate to https://testpages.herokuapp.com/styled/indx.html
Click on Calculate under Micro Apps.
Type any number in the first input.
Type any number in the second input.
Click on Calculate.
Get the result.
Print the result.

https:testpages.herokuapp.comstyledindx.html adresine gidin
 Mikro Uygulamalar altında Hesapla'ya tıklayın.
  İlk girişte herhangi bir sayı yazın.
   İkinci girişe herhangi bir sayı yazın.
    Hesapla'ya tıklayın.
Sonucu al. Sonucu yazdırın.
     */
    @Test
    public void test1() throws InterruptedException {


        driver.get("https://testpages.herokuapp.com/styled/index.html");
        driver.manage().window().maximize();
        WebElement calculator = driver.findElement(By.xpath("//a[@id='calculatetest']"));
        calculator.click();
        WebElement number1 = driver.findElement(By.id("number1"));
        number1.sendKeys("100");
        WebElement number2 = driver.findElement(By.id("number2"));
        number2.sendKeys("200");
        WebElement button1 = driver.findElement(By.id("calculate"));
        button1.click();
        WebElement result = driver.findElement(By.id("answer"));
        System.out.println("result.getText() = " + result.getText());
    }


}

