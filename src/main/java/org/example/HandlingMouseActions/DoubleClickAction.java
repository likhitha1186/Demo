package org.example.HandlingMouseActions;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;

import java.time.Duration;

public class DoubleClickAction {

    public static void main(String[] args) {
        WebDriver driver= new FirefoxDriver();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));

        driver.get("https://testautomationpractice.blogspot.com/");
        driver.manage().window().maximize();

        /*switch to frame
        WebElement frame= driver.findElement(By.xpath("//div[@id='sidebar-right-1']"));
        driver.switchTo().frame(frame);

         */

        WebElement box1 = driver.findElement(By.xpath("//input[@id='field1']"));
        WebElement box2 = driver.findElement(By.xpath("//input[@id='field2']"));
        WebElement copyButton = driver.findElement(By.xpath("//button[normalize-space()='Copy Text']"));

        /*clear box1
        box1.clear();
        box1.sendKeys("Welcome");
        sometimes getText() unable to fetch the text that time we can use getAttribute("attribute_name")
         */

        //double click action on the button
        Actions act= new Actions(driver);
        act.doubleClick(copyButton).perform();

        /*validation: box2 should contains same  text.
        if(box2.getText().equals(box1.getText())){
            System.out.println("Text copied");
        }
        else {
            System.out.println("Error");
        }

*/


    }
}
