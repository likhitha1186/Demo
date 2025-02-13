package org.example;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class HandlingFrames {
    public static void main(String[] args) {
        WebDriver driver= new FirefoxDriver();

        driver.get("https://ui.vision/demo/webtest/frames/");
        driver.manage().window().maximize();

        //switch to iframe-1
        WebElement frame1= driver.findElement(By.xpath("//frame[@src='frame_1.html']"));
        driver.switchTo().frame(frame1);

       driver.findElement(By.xpath("//input[@name='mytext1']")).sendKeys("Welcome");
    }
}
