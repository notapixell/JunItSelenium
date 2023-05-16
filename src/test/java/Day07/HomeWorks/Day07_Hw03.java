package Day07.HomeWorks;

import Utilities.Base;
import org.junit.Assert;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

import java.util.ArrayList;
import java.util.List;

public class Day07_Hw03 extends Base {
    /*
    Go to URL: https://the-internet.herokuapp.com/dropdown
Create method selectByIndexTest and Select Option 1 using index . //method selectByIndexTest oluşturun ve index kullanarak Seçenek 1'i seçin.
Create method selectByValueTest Select Option 2 by value.
Create method selectByVisibleTextTest Select Option 1 value by visible text.
Create method printAllTest Print all dropdown value.
Verify the dropdown has Option 2 text.
Create method printFirstSelectedOptionTest Print first selected option.
Find the size of the dropdown, Print "Expected Is Not Equal Actual" if there are not 3 elements in the dropdown.
     */

    @Test
    public void testByIndeksText() {
//Create method selectByIndexTest and Select Option 1 using index .
// method selectByIndexTest oluşturun ve index kullanarak Seçenek 1'i seçin.
        driver.get("https://the-internet.herokuapp.com/dropdown");
        WebElement option = driver.findElement(By.id("dropdown"));
        Select select = new Select(option);
        select.selectByIndex(1);
    }

    @Test
    public void selectByValueTest() {
//Create method selectByValueTest Select Option 2 by value.

        driver.get("https://the-internet.herokuapp.com/dropdown");
        WebElement option = driver.findElement(By.id("dropdown"));
        Select select = new Select(option);
        select.selectByValue("2");
    }

    @Test
    public void selectByVisibleTextTest() {
//Create method selectByVisibleTextTest Select Option 1 value by visible text

        driver.get("https://the-internet.herokuapp.com/dropdown");
        WebElement option = driver.findElement(By.id("dropdown"));
        Select select = new Select(option);
        select.selectByVisibleText("Option 1");
    }

    @Test
    public void printAllTest() {
//Create method printAllTest Print all dropdown value.

        driver.get("https://the-internet.herokuapp.com/dropdown");
        WebElement option = driver.findElement(By.id("dropdown"));
        Select select = new Select(option);

        List<WebElement> options = select.getOptions();
        List<String> allDropdown = new ArrayList<String>();
        for (WebElement opt : options) {
            allDropdown.add(opt.getText());
        }
        System.out.println("Tum Secenekler = " + allDropdown); //[Please select an option, Option 1, Option 2]
    }

    //Verify the dropdown has Option 2 text. -->Açılır listede Seçenek 2 metni olduğunu doğrulayın.
    @Test
    public void verifyOption() {
        driver.get("https://the-internet.herokuapp.com/dropdown");

        Select select = new Select(driver.findElement(By.id("dropdown")));

        List<WebElement> options = select.getOptions();

        boolean optionPresent = false;
        for (WebElement option : options) {
            if (option.getText().equals("Option 2")) {
                optionPresent = true;
                break;
            }
        }
        Assert.assertTrue("Option 2 is not found in the dropdown menu", optionPresent);


    }


    @Test
    public void printFirstSelectedOptionTest1() {
        //Create method printFirstSelectedOptionTest Print first selected option.
// Yöntem oluşturun printFirstSelectedOptionTest İlk seçilen seçeneği yazdırın.

        driver.get("https://the-internet.herokuapp.com/dropdown");

        Select select = new Select(driver.findElement(By.id("dropdown")));
        System.out.println(select.getFirstSelectedOption().getText()); //Please select an option

    }



    @Test
    public void findSize() {
        //  Find the size of the dropdown,
        //  Print "Expected Is Not Equal Actual" if there are not 3 elements in the dropdown.

        driver.get("https://the-internet.herokuapp.com/dropdown");
        WebElement option = driver.findElement(By.id("dropdown"));
        Select select = new Select(option);

        List<WebElement> options = select.getOptions();

        System.out.println((options.size() == 3 ? "Expected Is Equal Actual" : "Expected Is Not Equal Actual"));
    }
}
