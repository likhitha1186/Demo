package org.example.WebDriverMethods.WaitCommands;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

public class ExplicitWait {
    public static void main(String[] args) {
        WebDriver driver = new FirefoxDriver();

        WebDriverWait mywait = new WebDriverWait(driver, Duration.ofSeconds(10)); //declaration

        driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");

        WebElement txtUsername = mywait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//input[@placeholder='Username']")));
        txtUsername.sendKeys("Admin"); //identification of element is inclusive
        // driver.findElement(By.xpath("//input[@placeholder='Username']")).sendKeys("Admin");

        WebElement txtPassword = mywait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//input[@placeholder='Password']")));
        txtPassword.sendKeys("admin123"); //identification of element is inclusive

        WebElement login = mywait.until(ExpectedConditions.elementToBeClickable(By.xpath(" //button[normalize-space()='Login']")));
        login.click();

    }
}
