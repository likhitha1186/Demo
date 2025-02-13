package org.example.Locators;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

import java.util.List;

public class BasicLocators {
    public static void main(String[] args) {
        WebDriver driver = new FirefoxDriver();

        driver.get("https://demo-opencart.com/"); //smaller window size
        driver.manage().window().maximize(); //maximize the window size

        //name locator
        driver.findElement(By.name("search")).sendKeys("iPhone");

        //id locator
        boolean logoDisplayStatus = driver.findElement(By.id("logo")).isDisplayed();
        System.out.println(logoDisplayStatus);

        //link text & partial link text
        driver.findElement(By.linkText("Tablets")).click(); //link text: we have to provide complete link text. preferred one.
        // driver.findElement(By.partialLinkText("Tab")).click(); //Partial link text: pass some partial text of the link

        //Group of web elements-tagname and class
        //class
        List<WebElement> headerLinks =driver.findElements(By.className("list-inline-item"));
        System.out.println( "Total number of header links: "+headerLinks.size());

        //tagname
        List<WebElement>links=driver.findElements(By.tagName("a"));
        System.out.println("total number of links:"+links.size());

        //capture all the images in the webpage
        List<WebElement> images=driver.findElements(By.tagName("img"));
        System.out.println("List of Images:"+images.size());



         driver.close();


    }
}
