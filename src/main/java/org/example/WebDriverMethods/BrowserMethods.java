package org.example.WebDriverMethods;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class BrowserMethods {
    public static void main(String[] args) throws InterruptedException {
        WebDriver driver= new FirefoxDriver();

        driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
        Thread.sleep(50000);

        driver.findElement(By.linkText("OrangeHRM, Inc")).click();
        Thread.sleep(50000);
        // driver.close(); closes single window browser
        driver.quit();
    }
}
