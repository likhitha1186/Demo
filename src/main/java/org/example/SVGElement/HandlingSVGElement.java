package org.example.SVGElement;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class HandlingSVGElement {

    public static void main(String[] args) throws InterruptedException {

        WebDriver driver = new FirefoxDriver();

        driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
        driver.manage().window().maximize();
        Thread.sleep(2000);

        driver.findElement(By.xpath("//input[@placeholder = 'Username']")).sendKeys("Admin");
        driver.findElement(By.xpath("//input[@placeholder = 'Password']")).sendKeys("admin123");
        driver.findElement(By.xpath("//button[normalize-space() = 'Login']")).click();
        Thread.sleep(2000);

        //abs xpath
        // driver.findElement(By.xpath("/html[1]/body[1]/div[1]/div[1]/div[1]/aside[1]/nav[1]/div[2]/ul[1]/li[4]/a[1]/*[name()='svg'][1]")).click(); //NoSuchElementException

        //relative xpath
        // driver.findElement(By.xpath("//a[normalize-space()='Time']")).click();

        //identify SVG element
        //driver.findElement(By.xpath("//a[@class='oxd-main-menu-item active']//*[name()='svg']")).click();
        driver.findElement(By.xpath("//button[@title = 'Timesheets']//*[name()='svg']")).click();
        driver.findElement(By.xpath(""));


    }
}
