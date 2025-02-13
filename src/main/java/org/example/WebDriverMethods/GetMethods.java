package org.example.WebDriverMethods;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import java.util.Set;

public class GetMethods {
    public static void main(String[] args) throws InterruptedException {
        WebDriver driver = new FirefoxDriver();

        //get() - opens the url on the browser
        driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
        Thread.sleep(5000);

        //getTitle() - returns title of the page
        String title= driver.getTitle();
        System.out.println(title);

        //getCurrentUrl() - returns url of the page
        System.out.println(driver.getCurrentUrl());

        //getpageSource()
       // System.out.println(driver.getPageSource());

        //getWindowHandle()- ID of Single browser window
        String WindowID =  driver.getWindowHandle();
        System.out.println("Window ID "+WindowID);  //dynamic ID: 4fdf10b6-cdce-4be3-9c3c-da4e4df0eefd

        //getWindowHandle()- ID of Multiple browser window
        driver.findElement(By.linkText("OrangeHRM, Inc")).click(); //opens new browser window
        Set<String> WindowIDs = driver.getWindowHandles(); //all are unique ids
        System.out.println(WindowIDs); //[4fdf10b6-cdce-4be3-9c3c-da4e4df0eefd, 2305bf55-ce66-49e4-9fc9-c13b28813395]




        

    }
}
