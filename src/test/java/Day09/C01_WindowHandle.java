package Day09;

import Utilities.Base;
import org.junit.Test;
import org.openqa.selenium.WindowType;

public class C01_WindowHandle extends Base {

    //        driver.getWindowHandle(); -> aktif olan pencere ve sekmemizin window handle (id) degerini bize verir.
//        driver.getWindowHandles(); -> tum pencere ve sekmelerin window handle (id) lerini bir Set olarak bize dondurur.
//        driver.switchTo().window(id); -> window handle degeri id olan pencere veya sekmeye gecis yapmamizi saglar.
//        driver.switchTo().newWindow(TAB); -> Yeni sekme olusturur.
//        driver.switchTo().newWindow(WINDOW); -> Yeni pencere olusturur.







    // 1- browser ac
// 2- acilan sekmede https://www.amazon.com/ ac
// 3- yeni sekme olustur
// 4- acilan sekmede https://www.linkedin.com/ ac
// 5- yeni pencere olustur
// 6- acilan pencerede https://opensource-demo.orangehrmlive.com/web/index.php/auth/login sitesini ac


    @Test
    public void test(){

        driver.get(" https://www.amazon.com/");
        driver.switchTo().newWindow(WindowType.TAB);
        System.out.println("amazon sayfasının window handle değeri = " + driver.getWindowHandle()); // bilgi amaçlı yazıldı

        driver.get("https://www.linkedin.com/");
        System.out.println("linkedin sayfasının window handle değeri = " + driver.getWindowHandle());

        driver.switchTo().newWindow(WindowType.WINDOW);
        driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");

        System.out.println("OrangeHRM sayfasının window handle değeri = " + driver.getWindowHandle());

      //  driver.close();-- > aktif olan pencereyi kaptır. yani en son açılanı kapatır.
       // driver.quit();--> tüm sekme ve pencereleri kapatır.









    }


}
