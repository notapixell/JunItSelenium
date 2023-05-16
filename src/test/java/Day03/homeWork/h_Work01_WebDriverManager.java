package Day03.homeWork;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.junit.Assert;
import org.junit.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class h_Work01_WebDriverManager {
    /*
    • Set Path.
• Create chrome driver.
• Maximize the window.
• Open google home page https://www.google.com/
• Verify that you are Google in the title.
     */
    @Test
    public void assertEqualsTest() {
        // 2 parametre alirsa parametreler karsilastirilir ve esitlerse test passed olur esit degilse AssertionError firlatilir

        WebDriverManager.chromedriver().setup(); // --> Set Path.
        WebDriver driver = new ChromeDriver(); //  --> Create chrome driver.
        driver.manage().window().maximize(); // --> Maximize the window.
        driver.get("https://www.google.com/"); //-- > Open google home page https://www.google.com/
        Assert.assertEquals("Google", driver.getTitle()); //--> Verify that you are Google in the title.
        driver.quit();


//String actuelTitle = driver.getTitle();
// Assert.assertEquals("Google", actuelTitle);


    }
}
