package Day09.Actions_WindowHandle_HomeWork;

import Utilities.Base;
import org.junit.Assert;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import java.util.Set;

public class WindowHandle_HomeWork03 extends Base {
    /*
Go to URL: https://the-internet.herokuapp.com/windows
Verify the text: “Opening a new window”
Verify the title of the page is “The Internet”
Click on the “Click Here” button
Verify the new window title is “New Window”
Go back to the previous window and then verify the title: “The Internet”
     */

    @Test
    public void test01() {

        driver.get("https://the-internet.herokuapp.com/windows");
        String homePage = driver.getWindowHandle();

//Verify the text: “Opening a new window”
        WebElement wb = driver.findElement(By.xpath("//h3[text()='Opening a new window']"));
        String text = wb.getText();
        System.out.println("text = " + text);
        Assert.assertEquals("Opening a new window", text);

        //Verify the title of the page is “The Internet”

        String title = driver.getTitle();
        System.out.println("title = " + title);
        Assert.assertTrue(title.contains("The Internet"));

        //Click on the “Click Here” button

        driver.findElement(By.xpath("//a[.='Click Here']")).click();

       // Verify the new window title is “New Window”

        WebElement newWindowTitle = driver.findElement(By.xpath("//h3[.='New Window']"));


    }

    @Test
    public void windowHandleTest() {

        driver.get("https://the-internet.herokuapp.com/windows");


        WebElement text = driver.findElement(By.xpath("//h3[.='Opening a new window']"));

        String verifyText = text.getText();

        Assert.assertEquals("Opening a new window", verifyText);
        String homeId = driver.getWindowHandle();
        System.out.println("homeId = " + homeId);


        driver.findElement(By.xpath("//a[.='Click Here']")).click();
        Set<String> windowIds = driver.getWindowHandles();
        for (String newİd : windowIds) {
            if (!newİd.equals(homeId)) {
                driver.switchTo().window(newİd);
            }

        }
        String newTabİd = driver.getWindowHandle();
        System.out.println("newTabİd = " + newTabİd);


        driver.switchTo().window(newTabİd);
        String textNewTab = driver.findElement(By.xpath("//h3[.='New Window']")).getText();

        Assert.assertEquals("New Window", textNewTab);

        driver.switchTo().window(homeId);
        String titleHome = driver.getTitle();

        Assert.assertEquals("The Internet", titleHome);


    }
}
