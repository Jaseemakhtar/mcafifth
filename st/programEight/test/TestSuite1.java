package test;

import org.openqa.selenium.By;
import org.openqa.selenium.InvalidArgumentException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;
import java.util.concurrent.TimeUnit;

/*
*@author: Jaseemakhtar
*
 */

public class TestSuite1 {
    WebDriver driver;

    @BeforeClass
    void init(){
        System.setProperty("webdriver.chrome.driver","C:\\testLib\\chromedriver.exe");
        driver = new ChromeDriver();
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
    }

    @Test
    void openDialog() throws InterruptedException{
        int failed = 0;

        driver.get("file:///C:/Users/Jaseem/IdeaProjects/TestFileUpload/src/FileUploader.html");
        System.out.println("Browser opened!");
        WebElement fileUpload = driver.findElement(By.id("fileUpload"));

        for(int i = 0; i < 11; i++) {
            try {
                //Giving a file name which doesn't exists
                fileUpload.sendKeys("C:\\testLib\\chromedriver" + i + ".exe");
            } catch (InvalidArgumentException e) {
                failed++;
                System.out.println("File not found!");
            }
        }


        //Giving a file name which exists
        fileUpload.sendKeys("C:\\testLib\\chromedriver.exe");
        System.out.println("File found! -> chromedriver.exe" );
        Assert.assertEquals(failed, 11);
        Thread.sleep(700);
        driver.close();

    }
}
