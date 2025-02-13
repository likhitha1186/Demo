package org.example.HandlingCheckBoxes.HandleAlertsUsingSwitchTo;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
public class NormalAlert {
    public static void main(String[] args) throws InterruptedException {
        WebDriver driver = new FirefoxDriver();

        driver.get("https://the-internet.herokuapp.com/javascript_alerts");
        driver.manage().window().maximize();

        //Normal alert with ok button
        driver.findElement(By.xpath("//button[normalize-space()='Click for JS Alert']")).click();
        Thread.sleep(5000);
        //driver.switchTo().alert(); //capture the alert window
        //driver.switchTo().alert().accept(); //close the alert window
        Alert myalert = driver.switchTo().alert(); //to perform some operation
        System.out.println(myalert.getText());
        myalert.accept();


    }
}
