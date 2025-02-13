package org.example.JavascriptExecutor.ZoomInZoomOut;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class UsingJs {
    public static void main(String[] args) throws InterruptedException {

        WebDriver driver = new FirefoxDriver();

        driver.get("https://demo.nopcommerce.com/");
        driver.manage().window().maximize();
        Thread.sleep(2000);

        JavascriptExecutor js = (JavascriptExecutor) driver;
        js.executeScript("document.body.style.zoom='50%'"); //set zoom level 50%
        Thread.sleep(2000);
        js.executeScript("document.body.style.zoom='200%'"); // //set zoom level 200%
        Thread.sleep(2000);
    }
}
