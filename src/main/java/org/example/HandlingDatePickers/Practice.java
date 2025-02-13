package org.example.HandlingDatePickers;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

import java.time.Duration;
import java.util.List;

public class Practice {
    public static void main(String[] args) {

        WebDriver driver = new FirefoxDriver();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));

        driver.get("https://testautomationpractice.blogspot.com/");
        driver.manage().window().maximize();

        //Method2: using DatePicker
        String year = "2027", month = "May", date = "19";

        driver.findElement(By.xpath("//input[@id='start-date']")).sendKeys("15/01/2025"); //opens the date picker



    }
}
