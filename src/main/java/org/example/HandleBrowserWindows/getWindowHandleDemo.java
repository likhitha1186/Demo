package org.example.HandleBrowserWindows;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;


import java.time.Duration;
import java.util.ArrayList;
import java.util.List;
import java.util.Set;

public class getWindowHandleDemo {
    public static void main(String[] args) throws InterruptedException {
        WebDriver driver = new FirefoxDriver();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));

        driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
        driver.manage().window().maximize();

        driver.findElement(By.xpath("//a[normalize-space()='OrangeHRM, Inc']")).click();

        Set<String> windowIDs = driver.getWindowHandles();

     /*  //approach1
        List<String> windowList = new ArrayList<>(windowIDs);
        String parentID= windowList.get(0);
        String childID= windowList.get(1);

       System.out.println( driver.getTitle()); //driver focus on the parent browser

        //switch to parent window
        driver.switchTo().window(childID);
        Thread.sleep(2000);
        System.out.println( driver.getTitle()); // on child window

        //switch to parent window
        driver.switchTo().window(parentID);
        System.out.println(driver.getTitle());
        */

        //Approach 2: through looping statements
        for(String winID:windowIDs){
         String title  =   driver.switchTo().window(winID).getTitle();
         System.out.println(title);
         if(title.equals("OrangeHRM")){
             System.out.println(driver.getCurrentUrl());
         }
         else {
             System.out.println(driver.getCurrentUrl());
         }
        }



    }
}
