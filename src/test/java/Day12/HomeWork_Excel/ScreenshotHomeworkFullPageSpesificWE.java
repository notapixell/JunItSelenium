package Day12.HomeWork_Excel;


import Utilities.TestBase;

import org.apache.commons.io.FileUtils;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebElement;

import java.io.File;
import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.Date;
public class ScreenshotHomeworkFullPageSpesificWE extends TestBase {
    /*
    Go to amazon.com.
    Take Page ScreenShot.
    Spesific WebElement ScreenShot
     */
    @Test
    public void takeFullPageSS() throws IOException {
        driver.get("https://www.amazon.com./");
        TakesScreenshot  ts = (TakesScreenshot) driver;
        File source = ts.getScreenshotAs(OutputType.FILE);
        String date = new SimpleDateFormat("yyyy-MM-dd- hh-mm-ss").format(new Date());
        FileUtils.copyFile(source,new File(".\\test-output\\Screenshots"  + date + ".png"));
    }
    @Test
    public void takeSpesificWESS() throws IOException {
        driver.get("https://www.amazon.com./");
        WebElement amazonBox = driver.findElement(By.xpath("//div/span[@id = 'nav-cart-count']"));
        //TakesScreenshot  ts = (TakesScreenshot) driver;
        File source = amazonBox.getScreenshotAs(OutputType.FILE);
        String date = new SimpleDateFormat("yyyy-MM-dd- hh-mm-ss").format(new Date());
        FileUtils.copyFile(source,new File(".\\test-output\\Screenshots\\amazonBox" + date + ".png"));
    }
}

