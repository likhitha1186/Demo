package org.example.HandlingCheckBoxes;


import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

//handle alert without using switchTo().alert
public class HandleAlertUsingExplicitWait {
    public static void main(String[] args) throws InterruptedException {

        WebDriver driver= new FirefoxDriver();

        WebDriverWait mywait= new WebDriverWait(driver, Duration.ofSeconds(10));

        driver.get("https://the-internet.herokuapp.com/javascript_alerts");
        driver.manage().window().maximize();

        //Normal alert with ok button
        driver.findElement(By.xpath("//button[normalize-space()='Click for JS Alert']")).click();
        Thread.sleep(5000);

        Alert myalert = mywait.until(ExpectedConditions.alertIsPresent()); //capture the alert

        System.out.println(myalert.getText());
        myalert.accept();

    }
}
