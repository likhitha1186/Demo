package org.example.ScreenShots;

import org.openqa.selenium.*;
import org.openqa.selenium.firefox.FirefoxDriver;

import java.io.File;

public class ScreenshotOfSpecificSection {
    public static void main(String[] args) throws InterruptedException {
        WebDriver driver = new FirefoxDriver();

        driver.get("https://demo.nopcommerce.com/");
        driver.manage().window().maximize();

        TakesScreenshot ts = (TakesScreenshot) driver; //typecasting

        WebElement specificElement = driver.findElement(By.xpath("//div[@class='product-grid home-page-product-grid']"));
        File sourceFile = specificElement.getScreenshotAs(OutputType.FILE);
        File targetFile = new File(System.getProperty("user.dir")+"\\Screenshots\\featuredProduct.png");
        sourceFile.renameTo(targetFile);
        Thread.sleep(2000);
        System.out.println("Screenshot taken successfully");

        driver.close();


    }
}
