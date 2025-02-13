package org.example.HandlingCheckBoxes.HandleAlertsUsingSwitchTo;


import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class PromptAlert {
    public static void main(String[] args) throws InterruptedException {
        WebDriver driver= new FirefoxDriver();

        driver.get("https://the-internet.herokuapp.com/javascript_alerts");
        driver.manage().window().maximize();

        //prompt alert with Input box
        driver.findElement(By.xpath("//button[normalize-space()='Click for JS Prompt']")).click();
        Thread.sleep(5000);
        Alert myalert=driver.switchTo().alert();
        myalert.sendKeys("Welcome");
        myalert.accept();
    }
}
