package org.example.OptionsClasses;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.firefox.FirefoxOptions;

import java.io.File;

public class EnableExtensionsAtRunTime {

    public static void main(String[] args) {

        ChromeOptions options = new ChromeOptions();

        File file = new File("path of the CRX file location with name of the file");

        options.addExtensions(file);

        WebDriver driver = new ChromeDriver(options);

        // driver.get("https://google.com/");
        driver.get("https://text-compare.com/");
        driver.manage().window().maximize();


    }
}
