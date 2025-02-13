package org.example.ScreenShots;

import java.io.File;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class FullPageScreenshot {

    public static void main(String[] args) {

        WebDriver driver = new FirefoxDriver();

        driver.get("https://demo.nopcommerce.com/");
        driver.manage().window().maximize();

        TakesScreenshot ts = (TakesScreenshot) driver; //typecasting

        File sourceFile = ts.getScreenshotAs(OutputType.FILE); //getScreenshotAs return file type of object/variable.
        System.out.println(System.getProperty("user.dir")); // //System.getProperty("user.dir"):return current user directory

        // File targetFile = new File("D:\java-selenium\Demo\Screenshot\\fullpage.png");
        File targetFile = new File(System.getProperty("user.dir") + "\\Screenshots\\Fullpage.png"); //we don't know where exactly the sourceFile is located so capture the source file and copy into  our own location.

        sourceFile.renameTo(targetFile); //copy source file to target file


    }
}
