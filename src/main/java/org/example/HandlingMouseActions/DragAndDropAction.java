package org.example.HandlingMouseActions;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;

import javax.swing.*;
import java.time.Duration;

public class DragAndDropAction {

    public static void main(String[] args) {


        WebDriver driver = new FirefoxDriver();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));

        driver.get("https://testautomationpractice.blogspot.com/");
        driver.manage().window().maximize();

        //switch frame
        WebElement frame1= driver.findElement(By.xpath("//div[@class='fauxborder-left main-fauxborder-left']//div[@class='fauxcolumn-outer fauxcolumn-right-outer']"));
        driver.switchTo().frame(frame1);

        WebElement frame2= driver.findElement(By.xpath(" //div[@id='sidebar-right-1']//div[8]"));
        driver.switchTo().frame(frame2);


        Actions act = new Actions(driver);
        WebElement sourceElement = driver.findElement(By.xpath("//div[@id='draggable']"));
        WebElement targetElement = driver.findElement(By.xpath("//div[@id='droppable']"));

        act.dragAndDrop(sourceElement, targetElement).perform();


    }
}
