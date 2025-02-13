package org.example;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Demo2 {
    public static void main(String[] args) {
        System.setProperty("webdriver.chrome.driver","D:\\browserdrivers\\chromedriver.exe");
        WebDriver driver= new ChromeDriver();

        driver.get("https://demo-opencart.com/");

        String act_title= driver.getTitle();
        if(act_title.equals("Your Store")){
            System.out.println("Test Passed");
        }
        else {
            System.out.println("Test failed");
        }
      //  driver.close();

    }
}
