package org.example.WebDriverMethods.WaitCommands;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class SleepCommand {
    public static void main(String[] args) throws InterruptedException {
        WebDriver driver= new FirefoxDriver();

        driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
        Thread.sleep(3000); //sleep()
        driver.findElement(By.xpath("//input[@placeholder='Username']")).sendKeys("Admin");
    }
}


