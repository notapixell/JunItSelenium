package Day12.HomeWork_Excel;

import Utilities.Base;
import org.apache.commons.io.FileUtils;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.io.FileHandler;

import java.io.File;
import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.Date;

/*
Go to n11.com.
Take Full Page Screenshot.
Take Page ScreenShot.
Spesific WebElement ScreenShot
 */
public class Hwork03_ScreenShot2 extends Base {

    @Test
    public void testScreen2 () throws IOException {

        driver.get("https://www.n11.com");

        WebElement annelerGunu = driver.findElement(By.xpath("//a[@title='Anneler Günü'][1]"));
        File source = annelerGunu.getScreenshotAs(OutputType.FILE);
        /*
        annelerGunu bir WebDriver nesnesini temsil eder.
        getScreenshotAs() yöntemi, sayfanın ekran görüntüsünü alır ve OutputType.FILE türünde bir nesne olarak döndürür.
         Bu nesne, ekran görüntüsünün depolandığı dosyanın yolunu temsil eder.

         Daha sonra, bu dosya yolu bir java.io.File nesnesi olarak source değişkenine atanır.
         Bu File nesnesi, ekran görüntüsü dosyasını temsil eder
          ve daha sonra dosya kopyalama veya başka bir işlem yapmak için kullanılabilir.
         */
        String date = new SimpleDateFormat("yyyy-MM-dd-hh-mm-ss").format(new Date());
        System.out.println("date = " + date);

        String path = ".\\test-output\\screenshot"+ date +".png";

        File destination = new File(path);
        FileHandler.copy(source, destination);

    }



}
