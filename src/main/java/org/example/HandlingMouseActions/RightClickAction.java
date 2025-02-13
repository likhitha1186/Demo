package org.example.HandlingMouseActions;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Action;
import org.openqa.selenium.interactions.Actions;

import java.time.Duration;

public class RightClickAction {
    public static void main(String[] args) throws InterruptedException {

        WebDriver driver= new FirefoxDriver();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));

        driver.get("http://swisnl.github.io/jQuery-contextMenu/demo.html");
        driver.manage().window().maximize();

        WebElement button = driver.findElement(By.xpath("//span[@class='context-menu-one btn btn-neutral']"));
        Actions act= new Actions(driver);
        //right click action
        act.contextClick(button).perform();
        //click on cut
        driver.findElement(By.xpath("//span[normalize-space()='Cut']")).click();
        Thread.sleep(5000);
        //close alert box
        driver.switchTo().alert().accept();

        /*
        Action myAct= act.contextClick(button).build(); creating and storing an action into a variable
        myAct.perform();  completing the action
         */


    }
}
