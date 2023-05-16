package Day11;

import Utilities.TestBase;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.Cookie;


import java.util.Set;
public class CookiesHomework extends TestBase {
    /*
        Go to URL: http://facebook.com
        getCookies,
        addCookie,
        deleteCookieNamed,
        deleteAllCookies
     */
    @Before
    public void launchUp (){
        driver.get("http://facebook.com");
    }
    @Test
    public void getCookies(){
        System.out.println("get cookies");
        Set <Cookie> cookie = driver.manage().getCookies();
        for (Cookie c:cookie) {
            System.out.println("***" +c);
        }
    }
    @Test
    public void addCookie(){
        System.out.println("add cookies");
        Cookie name = new Cookie("this is my cookie","12345");
        driver.manage().addCookie(name);
        Set <Cookie> cookie = driver.manage().getCookies();
        for (Cookie c:cookie) {
            System.out.println("***" +c);
        }
    }
    @Test
    public void deleteCookieNamed(){
        System.out.println("delete cookie named");
        Cookie name = new Cookie("this is my cookie","12345");
        driver.manage().addCookie(name);
        driver.manage().deleteCookieNamed("this is my cookie");
        Set <Cookie> cookie = driver.manage().getCookies();
        for (Cookie c:cookie) {
            System.out.println("***" +c);
        }
    }
    @Test
    public void deleteAllCookies(){
        System.out.println("delete all cookies");
        Cookie name = new Cookie("this is my cookie","12345");
        driver.manage().addCookie(name);
        driver.manage().deleteAllCookies();
        Set <Cookie> cookie = driver.manage().getCookies();
        for (Cookie c:cookie) {
            System.out.println("***" +c);
        }
        System.out.println(driver.manage().getCookies().size());
    }
}
