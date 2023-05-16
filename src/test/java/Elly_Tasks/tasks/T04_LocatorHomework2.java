package Elly_Tasks.tasks;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.junit.*;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.time.Duration;

public class T04_LocatorHomework2 {
/*
Go to http://www.google.com
Type "Green Mile" in the search box and print the number of results.
Type "Premonition" in the search box and print the number of results.
Type "The Curious Case of Benjamin Button" in the search box and print the number of results.
 */
static WebDriver driver;
    @BeforeClass
    public static void setUp(){
        WebDriverManager.chromedriver().setup();
        driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
    }

    @Before
    public void testtenOnce(){
        driver.get("http://www.google.com");
    }
    @Test
    public void test1(){
        WebElement aramaKutusu = driver.findElement(By.name("q"));
        //aramaKutusu.sendKeys("Green Mile" + Keys.ENTER)
        aramaKutusu.sendKeys("Green Mile");
        aramaKutusu.submit();
    }

    // 5 test , 1 AC, 1 BC,  1 A, 1 B -> 17 test calisir

    @Test
    public void test2(){
        WebElement aramaKutusu = driver.findElement(By.name("q"));   //xpath -> //input[@name ='q']
        aramaKutusu.sendKeys("Premonition" + Keys.ENTER);
    }

    @Test
    public void test3(){
        WebElement aramaKutusu = driver.findElement(By.name("q"));
        aramaKutusu.sendKeys("The Curious Case of Benjamin Button" + Keys.ENTER);
    }

    @After
    public void testtenSonra(){
        WebElement sonucYazisiElementi = driver.findElement(By.xpath("//div[@id ='result-stats']"));
        System.out.println("sonucYazisiElementi.getText() = " + sonucYazisiElementi.getText());
    }

    @AfterClass
    public static void tearDown(){
        driver.quit();
    }


    /*
     /* relative xpath kullanirken ;
    Xpath for unique elements

    //input[@name = 'q']
    //input[@class= 'gLFyf gsfi']
    //input[@autocapitalize= 'off']
    //input[@title='Search']
    (//input)[1]          : Sadece tag name kullanarak xpath yazmak icin
    //*[@*='Search']      : Tag name farketmeksizin attribute ismi ve attribute value kullanarak xpath yazmak icin
    //input[@title]       : Attribute value farketmeksizin tag name ve attribute ismi kullanarak xpath yazmak icin
    //input[@*='Search']  : Attribute name farketmeksizin tag name ve attribute value kullanarak xpath yazmak icin

     */
}
