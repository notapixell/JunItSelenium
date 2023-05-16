package Day11;

import Utilities.TestBase;
import org.junit.Assert;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class FileUploadHomework extends TestBase {
    //Go to URL: https://www.monsterindia.com/seeker/registration
    //Upload file.
    /* AUTOMATION STEPS :
     * 1. Do Manual Testing first to understand the functionality
     *   -click on choose file
     *           - locate choose file input
     *   -select a file
     *           - use sendKeys(pathOfFile)
     *   -click upload
     *           -locate upload element and click on it
     *   -verify message : File Uploaded!
     *           -get the text of the message and do assertion
     *
     * //input[@type='file']
     * */
    @Test
    public void uploadFileTest() throws InterruptedException {
        driver.get("https://www.monsterindia.com/seeker/registration");
        String filePath = System.getProperty("user.dir") + System.getProperty("file.separator") + "src/test/java/tests/resources/Top Websites to Practice Coding.pdf";
        System.out.println("filePath = " + filePath);
        WebElement uploadResume = driver.findElement(By.xpath("//input[@type='file']"));
        Thread.sleep(2000);
        uploadResume.sendKeys(filePath);
        Thread.sleep(2000);
        Assert.assertTrue("File is not upload successful", driver.findElement(By.xpath("//div[@class='f15']")).isDisplayed());
    }
}
