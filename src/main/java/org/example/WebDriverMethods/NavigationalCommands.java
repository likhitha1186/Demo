package org.example.WebDriverMethods;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import java.net.MalformedURLException;
import java.net.URL;

public class NavigationalCommands {
    public static void main(String[] args) throws MalformedURLException, InterruptedException {
        WebDriver driver = new FirefoxDriver();

        // driver.get("https://demo.nopcommerce.com/");

        //URL url = new URL("https://demo.nopcommerce.com/"); url object format
        //driver.navigate().to(url); url object format

        driver.navigate().to("https://demo.nopcommerce.com/");
        Thread.sleep(3000);
        driver.navigate().to("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");

        driver.navigate().back();
        System.out.println(driver.getCurrentUrl());

        driver.navigate().forward();
        System.out.println(driver.getCurrentUrl());

        driver.navigate().refresh();
    }
}
