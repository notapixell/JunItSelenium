package Selenium_Pratik;

import Utilities.Base;
import com.github.javafaker.Faker;
import org.junit.Assert;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;

public class Task01 extends Base {
    Faker faker = new Faker();
    String fakemail;
    String fakeFirstName;
    String fakeLastName;
    String fakePassword;


    //Kaynak https://www.techlistic.com/p/selenium-tutorials.html

//    1. Open this url  http://automationpractice.pl/index.php
//    2. Click on sign in link.
//    3. Verify sign in page
//    3. Enter your email address in 'Create and account' section.
//    4. Click on Create an Account button.
//    5. Enter your Personal Information, Address and Contact info.
//    6. Click on Register button.
//    7. Validate that user is created.
//    8. Go to your homepage

    //    1. Open this url  http://automationpractice.pl/index.php


    @Test
    public void signIn() {
        driver.get("http://automationpractice.pl/index.php");

        //    2. Click on sign in link.
        WebElement loginButton = driver.findElement(By.cssSelector(".login"));
        loginButton.click();

        //    3. Verify sign in page
        Assert.assertTrue(driver.getCurrentUrl().contains("my-account"));

        //    4. Enter your email address in 'Create and account' section.
        fakemail = faker.internet().emailAddress();
        WebElement emailCreate = driver.findElement(By.id("email_create"));
        emailCreate.sendKeys(fakemail);
        //    4. Click on Create an Account button.
        WebElement emailSubmit = driver.findElement(By.id("SubmitCreate"));
        emailSubmit.click();

        //    5. Enter your Personal Information, Address and Contact info.

        driver.findElement(By.id("uniform-id_gender1")).click();
        WebElement firstNameInput = driver.findElement(By.id("customer_firstname"));
        WebElement lastNameInput = driver.findElement(By.id("customer_lastname"));
        WebElement passwordInput = driver.findElement(By.id("passwd"));

        WebElement dayInput = driver.findElement(By.id("days"));
        WebElement monthInput = driver.findElement(By.id("months"));
        WebElement yearInput = driver.findElement(By.id("years"));

        fakeFirstName = faker.name().firstName();
        fakeLastName = faker.name().lastName();
        fakePassword = faker.internet().password();
        firstNameInput.sendKeys(fakeFirstName);
        lastNameInput.sendKeys(fakeLastName);
        passwordInput.sendKeys(fakePassword);

        dayInput.sendKeys("1");
        monthInput.sendKeys("January");
        yearInput.sendKeys("2023");

        //6. Click on Register button.
        driver.findElement(By.id("submitAccount")).click();

        //    7. Validate that user is created.
        Assert.assertTrue(driver.findElement(By.xpath("//p[@class='alert alert-success']")).isDisplayed());

        // 8. Go to your homepage

        driver.findElement(By.cssSelector(".icon-home")).click();


    }

    //    Actions Class ile Test Case - Automate 'Search Product' feature of e-commerce website with Selenium.
//    Steps to Automate:
//            1. Open link http://automationpractice.pl/index.php
//            2. Move your cursor over Women's link.
//            3. Click on sub menu 'T-shirts'
//            4. Get Name/Text of the first product displayed on the page.
//            5. Now enter the same product name in the search bar present on top of page and click search button.
//            6. Validate that same product is displayed on searched page with same details which were displayed on T-Shirt's page.
    @Test
    public void searchProduct() {
        signIn();
        Actions actions1 = new Actions(driver);
        WebElement womenTab = driver.findElement(By.xpath("//a[@title='Women']"));


//Click on sub menu 'T-shirts'
        WebElement tshirtButton = driver.findElement(By.xpath("//ul[@class='sf-menu clearfix menu-content sf-js-enabled sf-arrows']/li[1]//a[.='T-shirts']"));
        tshirtButton.click();


        // Get Name/Text of the first product displayed on the page.

    }
}