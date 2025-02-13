package org.example.OptionsClasses;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class DisableAutomatedMessageOnScreen {

    public static void main(String[] args) {

        ChromeOptions options = new ChromeOptions();
        options.setExperimentalOption("excludeSwitches", new String[]{"enable-automation"});

        WebDriver driver=new ChromeDriver(options);

        driver.get("https://google.com/");
        // driver.get("https://demo.openchart.com/");

        String act_title= driver.getTitle();
        if(act_title.equals("Google")){
            System.out.println("Test passed");
        }
        else{
            System.out.println("test Failed");
        }
    }
}
