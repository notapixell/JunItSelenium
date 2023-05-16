package Day08.HomeWorks;

import Utilities.Base;
import org.junit.Assert;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class Day08_Iframe_Untitled_Hwork extends Base {
    /*
    Go to URL: http://demo.automationtesting.in/Alerts.html
Click "Alert with OK" and click 'click the button to display an alert box:’
Accept Alert(I am an alert box!) and print alert on console.
Click "Alert with OK & Cancel" and click 'click the button to display a confirm box’
Cancel Alert  (Press a Button !)
Click "Alert with Textbox" and click 'click the button to demonstrate the prompt box’
And then sendKeys «BootcampCamp» (Please enter your name)
Finally print on console this message "Hello BootcampCamp How are you today" assertion these message.

     */

    @Test
    public void testAlert() {
        driver.get("http://demo.automationtesting.in/Alerts.html");
        driver.findElement(By.xpath("//a[@href='#OKTab']")).click();
        driver.findElement(By.xpath("//button[@class='btn btn-danger']")).click();
        String mesaj = driver.switchTo().alert().getText();
        System.out.println("Alert mesaj = " + mesaj);
        driver.switchTo().alert().accept();


//Click "Alert with OK & Cancel" and click 'click the button to display a confirm box’
        driver.findElement(By.xpath("//a[@href='#CancelTab']")).click();
        driver.findElement(By.xpath("//button[@class='btn btn-primary']")).click();
        driver.switchTo().alert().dismiss();

        //Click "Alert with Textbox" and click 'click the button to demonstrate the prompt box’

        driver.findElement(By.xpath("//a[@href='#Textbox']")).click();
        driver.findElement(By.xpath("//button[@class='btn btn-info']")).click();
        driver.switchTo().alert().sendKeys("BootcampCamp");
        driver.switchTo().alert().accept();

        //Finally print on console this message "Hello BootcampCamp How are you today" assertion these message.
        // Finally print on console this message "Hello BootcampCamp How are you today"

        WebElement message= driver.findElement(By.id("demo1"));
        System.out.println("message = " + message.getText());

        //assertion these message.
        Assert.assertEquals(message.getText(), "Hello BootcampCamp How are you today");

    }
}
