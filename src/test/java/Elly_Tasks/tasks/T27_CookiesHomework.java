package Elly_Tasks.tasks;

import Utilities.TestBase;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.Cookie;

import java.util.Set;

public class T27_CookiesHomework extends TestBase {
    /*
        Go to URL: http://facebook.com
        getCookies,
        addCookie,
        deleteCookieNamed,
        deleteAllCookies
     */
    @Before
    public void launchUp() {
        driver.get("http://facebook.com"); // her seferinde bu sayfaya gidecek
    }

    @Test
    public void getCookies() {
        System.out.println("getCookies");

        Set<Cookie> cookie = driver.manage().getCookies();

        for (Cookie c : cookie) {
            System.out.println("****" + c);
        }
    }

    @Test
    public void addCookies() {
        System.out.println("addCookies");
        Cookie name = new Cookie("merhaba", "463879");
        driver.manage().addCookie(name);

        Set<Cookie> cookie = driver.manage().getCookies();

        for (Cookie c : cookie) {
            System.out.println("****" + c);
        }
    }

    @Test
    public void deleteCookies() {
        System.out.println("deleteCookies");
        Cookie name = new Cookie("Selam", "Kardeş");
        driver.manage().deleteCookieNamed("selam");

        Set<Cookie> cookie = driver.manage().getCookies();

        for (Cookie c : cookie) {
            System.out.println("****" + c);
        }
    }
}
