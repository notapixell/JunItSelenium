package Day03;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.junit.*;

public class C02_FirstTestClass {

    @Before
    public void beforeTestMethod() {
        System.out.println("Browser açma konfigirasyon işlemleri yapıldı");

    }


    @Test
    public void test01() {
        System.out.println("\tTest1 executed...");
    }

    @Test
    public void test02() {
        System.out.println("\t\tTest2 executed...");
    }

    @Test
    @Ignore
    public void test03() {
        System.out.println("\t\tTest2 executed...");
    }
    @After
    public void afterTestMethod() {
        System.out.println("\tBrowser kaptıldı...");
    }

    @BeforeClass //  ***BeforeClass ve Afterclass methodları static olmalıdır.***
    public static void beforeClassMethod() {
        System.out.println("BeforeClass çalıştı...");
    }
    @AfterClass
    public static void afterClassMethod() {
        System.out.println("AfterClass çalıştı...");

    }
}

