package program;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.List;
import java.util.concurrent.TimeUnit;

public class CountListItems {
    WebDriver webDriver;

    public CountListItems(){
        System.setProperty("webdriver.chrome.driver","/home/jaseem/seleniumLibs/chromedriver");

        webDriver = new ChromeDriver();
        webDriver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
    }

    public int openWebPage(){
        int items = 0;
        try{
            webDriver.get("file:///home/jaseem/IdeaProjects/SeleniumListItems/src/program/Demo.html");
            System.out.println("Browser Opened!");
            List<WebElement> webElements = webDriver.findElements(By.cssSelector("#car-list > option"));
            for (WebElement w :
                    webElements) {
                System.out.println("Item: " +w.getText());
            }
            System.out.println("Found List Items: " + webElements.size());
            items = webElements.size();
            Thread.sleep(5000);
            webDriver.close();

        }catch (Exception e){
            System.out.println(e.getMessage());
        }
        return items;
    }

}


