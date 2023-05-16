package Elly_Tasks.tasks;

import org.junit.Assert;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;
import Utilities.TestBase;

import java.util.List;

public class T13_SelectHomework extends TestBase {

    @Test
    public void getOptionsTest() {
        Select select = new Select(driver.findElement(By.id("oldSelectMenu")));

        // Get all the options of the dropdown
        List<WebElement> allOptions = select.getOptions();

        //size test
        System.out.println("options.size() = " + allOptions.size()); //options.size() = 11

        int numberOfDropdownOptions = allOptions.size();
        Assert.assertEquals("Expected Is Not Equal Actual",11,numberOfDropdownOptions);

        //print All test
        for (WebElement eachOption : allOptions){
            System.out.println(eachOption.getText()); //webElement old icin getText dedik
        }

        //verify the dropdown has option "Black"

        boolean flag=false;
        for (WebElement eachOption : allOptions){
            if(eachOption.getText().equals("Black")){
                flag=true;
            }
        }
        Assert.assertTrue(flag);//PASS WHEN flag=true; THIS FAILS WHEN flag=false

        //printFirstSelectedOptionTest
        WebElement firstSelectedOption = select.getFirstSelectedOption();
        System.out.println("Selected Option : "+firstSelectedOption.getText()); //Selected Option : Red

        //select option Yellow
        select.selectByVisibleText("Yellow");
        System.out.println("Now selected : "+select.getFirstSelectedOption().getText()); //Now selected : Yellow

        //NOTE
        List<WebElement> allSelectedOption = select.getAllSelectedOptions();
        // RETURNS ALL OPTIONS IF MULTIPLE SELECTED AS List<WebElement>.
        for (WebElement eachSelectedOption:allSelectedOption){
            System.out.println("Selected Option : "+eachSelectedOption.getText()); //Selected Option : Yellow
        }
    }

}
/*
 //Select elementlerinde info amaciyla kullanilan methodlar
//  select.getAllSelectedOptions(); -> multi selectte secili tum degerleri bize return eden methoddur.
//  select.getFirstSelectedOption(); -> Secili ilk option elementini bize getirir.
//  select.getOptions(); -> select elementinin tum optionlarini liste halinde return eder
//  select.isMultiple(); -> select elementinin multiple secime uygun olup olmadigni bize boolean olarak return eder.

 */

