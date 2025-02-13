package org.example.OptionsClasses;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.firefox.FirefoxOptions;

public class HeadlessTesting {
    public static void main(String[] args) {

        //before creating the driver
        FirefoxOptions options = new FirefoxOptions();
        options.addArguments("--headless=new");

        WebDriver driver=new FirefoxDriver(options);

        driver.get("https://google.com/");
        // driver.get("https://demo.openchart.com/");

        String act_title= driver.getTitle();
        if(act_title.equals("Google")){
            System.out.println("Test passed");
        }
        else{
            System.out.println("test Failed");
        }    }

}
