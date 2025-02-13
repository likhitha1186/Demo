package org.example.HandlingCheckBoxes.HandleAlertsUsingSwitchTo;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class ConfirmationAlert {
    public static void main(String[] args) throws InterruptedException {

        WebDriver driver = new FirefoxDriver();

        driver.get("https://the-internet.herokuapp.com/javascript_alerts");
        driver.manage().window().maximize();

        //Confirmation alert with OK and Cancel Button
        driver.findElement(By.xpath("//button[normalize-space()='Click for JS Confirm']")).click();
        Thread.sleep(5000);

        //driver.switchTo().alert().accept(); //close alert using OK button
        driver.switchTo().alert().dismiss(); //close alert using cancel button
    }
}
//id="manage_cookie_settings_btn"