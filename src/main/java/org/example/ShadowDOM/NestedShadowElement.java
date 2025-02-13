package org.example.ShadowDOM;

import org.openqa.selenium.By;
import org.openqa.selenium.SearchContext;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class NestedShadowElement {
    public static void main(String[] args) throws InterruptedException {

        WebDriver driver = new FirefoxDriver();

        driver.get("https://dev.automationtesting.in/shadow-dom");
        driver.manage().window().maximize();

        //This Element is inside 2 nested shadow DOM.
        String cssSelectorForHost1 = "#shadow-root";
        String cssSelectorForHost2 = "#inner-shadow-dom";
        Thread.sleep(1000);
        SearchContext shadow0 = driver.findElement(By.cssSelector("#shadow-root")).getShadowRoot();
        Thread.sleep(1000);
        SearchContext shadow1 = shadow0.findElement(By.cssSelector("#inner-shadow-dom")).getShadowRoot();
        Thread.sleep(1000);
        shadow1.findElement(By.cssSelector("#nested-shadow-element")).click();


    }
}
