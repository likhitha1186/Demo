package org.example.OptionsClasses;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.firefox.FirefoxOptions;

public class RunTestsIncognitoMode {
    public static void main(String[] args) {

        FirefoxOptions options = new FirefoxOptions();
        options.addArguments("--private");

        WebDriver driver=new FirefoxDriver(options);

       // driver.get("https://google.com/");
         driver.get("https://demo.opencart.com/");

        String act_title= driver.getTitle();
        System.out.println(act_title);
        if(act_title.equals("demo.opencart.com")){
            System.out.println("Test passed");
        }
        else{
            System.out.println("test Failed");
        }
    }
}
