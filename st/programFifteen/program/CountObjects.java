package program;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.List;
import java.util.concurrent.TimeUnit;

public class CountObjects {
    WebDriver webDriver;

    public CountObjects(){
        System.setProperty("webdriver.chrome.driver","/home/jaseem/seleniumLibs/chromedriver");

        webDriver = new ChromeDriver();
        webDriver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
    }

    public int openPageAndCount(){
        int items = 0;

        try {
            webDriver.get("https://github.com/Jaseemakhtar/");
            WebElement rootElement = webDriver.findElement(By.cssSelector("body"));
            List<WebElement> childs = rootElement.findElements(By.xpath(".//*"));
            for (WebElement webElement: childs){
                if(webElement.isDisplayed()){
                    items++;
                    System.out.println(items + " " + webElement.getTagName());
                }
            }

            System.out.println("Total visible items: " + items);
            Thread.sleep(3000);
            webDriver.close();
        }catch (Exception e){
            System.out.println(e.getMessage());
        }


        return items;
    }
}
