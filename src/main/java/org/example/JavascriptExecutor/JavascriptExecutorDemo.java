package org.example.JavascriptExecutor;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

import java.time.Duration;

public class JavascriptExecutorDemo {
    public static void main(String[] args) {

        WebDriver driver = new FirefoxDriver();
        // FirefoxDriver driver = new FirefoxDriver();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));

        driver.get("https://testautomationpractice.blogspot.com/");
        driver.manage().window().maximize();

        //driver.findElement(By.id("name")).sendKeys("Likhitha");

        WebElement inputBox = driver.findElement(By.id("name"));
        JavascriptExecutor js = (JavascriptExecutor) driver; //type casting
        // JavascriptExecutor js= driver; //no need of typecasting

        //passing the text into input box - alternative of sendKeys()
        js.executeScript("arguments[0].setAttribute('value','Likhitha')", inputBox);
        //arguments[0]:Predefined array in js. what ever second element we are passing here that element will be stored in arguments[0]

         //driver.findElement(By.xpath("//input[@id='female']")).click();
        WebElement radioButton = driver.findElement(By.xpath("//input[@id='female']"));
        js.executeScript("arguments[0].click()", radioButton);

    }
}
