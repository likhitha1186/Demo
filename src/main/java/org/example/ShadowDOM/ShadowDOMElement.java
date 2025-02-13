package org.example.ShadowDOM;

import org.openqa.selenium.By;
import org.openqa.selenium.SearchContext;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class ShadowDOMElement {

    public static void main(String[] args) throws InterruptedException {

        WebDriver driver = new FirefoxDriver();

        driver.get("https://books-pwakit.appspot.com/ ");
        driver.manage().window().maximize();

        //This Element is inside single shadow DOM.
        String cssSelectorForHost1 = "book-app[apptitle='BOOKS']";
        Thread.sleep(1000);

        //Handle shadow DOM element.
        SearchContext shadow = driver.findElement(By.cssSelector("book-app[apptitle='BOOKS']")).getShadowRoot();
        Thread.sleep(1000);
        // driver.findElement(By.cssSelector("#input")).sendKeys("WELCOME"); //throws NoSuchElementException. 1st we need to capture Root Shadow, from that we need to extract element.
        shadow.findElement(By.cssSelector("#input")).sendKeys("WELCOME");
    }
}
