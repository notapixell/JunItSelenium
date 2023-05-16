package ermanCodeChallenge;

import Utilities.Base;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;

import java.sql.Driver;


// https://testpages.herokuapp.com/styled/events/javascript-events.html sayfasina gidin
//Butun butonlari trigger edin
public class Task01_11May extends Base {

    @Test
    public void test01_11May() {
        driver.get("https://testpages.herokuapp.com/styled/events/javascript-events.html ");
        WebElement onBlurButton = driver.findElement((By.id("onblur")));
        WebElement onClickButton = driver.findElement((By.id("onclick")));
        WebElement onContextMenuButton = driver.findElement((By.id("oncontextmenu")));
        WebElement onDoubleClickButton = driver.findElement((By.id("ondoubleclick")));
        WebElement onFocusButton = driver.findElement((By.id("onfocus")));
        WebElement onKeyDownButton = driver.findElement((By.id("onkeydown")));
        WebElement onKeyUpButton = driver.findElement((By.id("onkeyup")));
        WebElement onKeyPressButton = driver.findElement((By.id("onkeypress")));
        WebElement onMouseOverButton = driver.findElement((By.id("onmouseover")));
        WebElement onMouseLeaveButton = driver.findElement((By.id("onmouseleave")));
        WebElement onMouseDownButton = driver.findElement((By.id("onmousedown")));

        onBlurButton.click();onClickButton.click();

        onClickButton.click();
       /*
       actions.contextClick(onContextmenuButton).
                doubleClick(onDoubleclickButton).
                click(onFocusButton).
                click(onKeydownButton).
                sendKeys(Keys.ENTER).
                click(onKeyUpButton).
                click(onKeyUpButton).sendKeys(Keys.ENTER).
                click(onKeypressButton).sendKeys(Keys.ENTER).
                moveToElement(onMouseoverButton).
                moveToElement(onMouseleaveButton).
                moveToElement(onMousedownButton).perform();
        */

        onBlurButton.click();
        onClickButton.click();
        onClickButton.click();

        actions.contextClick(onContextMenuButton);
        actions.doubleClick(onContextMenuButton);
              actions.
                      doubleClick(onDoubleClickButton).
                click(onFocusButton).
                click(onKeyDownButton).
                sendKeys(Keys.ENTER).
                click(onKeyUpButton).sendKeys(Keys.ENTER).
                click(onKeyPressButton).sendKeys(Keys.ENTER).
                moveToElement(onMouseOverButton).
                moveToElement(onMouseLeaveButton).
                moveToElement(onMouseOverButton).
                click(onMouseDownButton).perform();

    }


}
