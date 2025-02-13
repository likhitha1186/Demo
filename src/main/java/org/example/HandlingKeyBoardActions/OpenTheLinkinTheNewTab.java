package org.example.HandlingKeyBoardActions;

import org.checkerframework.checker.units.qual.K;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;

import java.util.ArrayList;
import java.util.List;
import java.util.Set;

public class OpenTheLinkinTheNewTab {
    public static void main(String[] args) throws InterruptedException {

        WebDriver driver = new FirefoxDriver();

        driver.get("https://www.amazon.com/");
        driver.manage().window().maximize();
        Thread.sleep(2000);

        driver.findElement(By.xpath("//input[@class='a-button-input']")).click();

        WebElement register_link = driver.findElement(By.xpath("//span[@id='nav-link-accountList-nav-line-1']"));

        // register_link.click(); the home is lost.

        Actions act = new Actions(driver);

        //Control +  register_link
        act.keyDown(Keys.CONTROL).click(register_link).keyUp(Keys.CONTROL).perform();

        //switching to registration page
        //Set<String> Ids = driver.getWindowHandles(); get Set of String(get() is not present also indexing is not supported). we have to convert Set to List
        List<String> Ids = new ArrayList<>(driver.getWindowHandles());
        driver.switchTo().window(Ids.get(1)); //switch to registration page
        Thread.sleep(2000);

        driver.findElement(By.xpath("//input[@id='ap_email']")).sendKeys("likhi@gmail.com");
        Thread.sleep(2000);

        //switch to home page
        driver.switchTo().window(Ids.get(0));
        Thread.sleep(2000);

       WebElement option = driver.findElement(By.xpath("//input[@id='twotabsearchtextbox']"));
       option.sendKeys("Blanket");

    }
}
