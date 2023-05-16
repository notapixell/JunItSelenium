package Elly_Tasks.tasks;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class T01_WebdrivermanagerHomework {

    /*
• Set Path.
• Create chrome driver.
• Maximize the window.
• Open google home page https://www.google.com/
• Verify that you are Google in the title.
     */
    public static void main(String[] args) {

        WebDriverManager.chromiumdriver().setup();
        WebDriver driver =new ChromeDriver();
        driver.get("https://www.google.com/");

        driver.manage().window().maximize();
        System.out.println("driver.getTitle() = " + driver.getTitle());

        System.out.println(driver.getTitle().equals("Google") ? "Test passed" : "Test failed");
    }



}
