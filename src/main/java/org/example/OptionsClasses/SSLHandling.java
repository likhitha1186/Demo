package org.example.OptionsClasses;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.firefox.FirefoxOptions;

public class SSLHandling {

    public static void main(String[] args) {

        FirefoxOptions options = new FirefoxOptions();
        options.setAcceptInsecureCerts(true); //accept SSL certificates

        WebDriver driver = new FirefoxDriver(options);

        driver.get("https://expired.badssl.com/");

        System.out.println("Title of the page :"+ driver.getTitle()); //privacy error
    }
}
