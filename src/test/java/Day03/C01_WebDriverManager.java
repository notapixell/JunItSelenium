package Day03;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class C01_WebDriverManager {
    public static void main(String[] args) {

        // Webdriver manager classı kullanılarak istenilen browserın drıver bınaryleri ototmatik olarak indirilir


        WebDriverManager.chromedriver().setup();

        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("https://www.youtube.com/");











    }

}
