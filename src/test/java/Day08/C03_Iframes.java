package Day08;

import Utilities.Base;
import org.junit.Assert;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class C03_Iframes extends Base {
/*
Go to URL: https://the-internet.herokuapp.com/iframe
Verify the Bolded text contains “Editor”
Locate the text box
Delete the text in the text box
Type “Hi everyone”
Verify the text Elemental Selenium text is displayed on the page.
 */
@Test
    public void testIframe() throws InterruptedException {
    driver.get("https://the-internet.herokuapp.com/iframe");

    WebElement h3 = driver.findElement(By.xpath("//div[@class='example']"));
    Assert.assertTrue(h3.getText().contains("Editor"));

    driver.switchTo().frame(0);

    WebElement textBox = driver.findElement(By.id("tinymce"));
    Thread.sleep(2000);
    textBox.clear();

    textBox.sendKeys("hı everyone");

    driver.switchTo().parentFrame(); // bir üste çıkar
    // driver.switchTo().defaultContent(); // bütün framelerden çıkar
    WebElement elemntalSelenıum = driver.findElement(By.linkText("Elemental Selenium"));
    Assert.assertTrue(elemntalSelenıum.isDisplayed());

}

}
