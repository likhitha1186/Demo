package org.example.JavascriptExecutor.ScrollingPages;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class ScrollingPageTillBottom {
    public static void main(String[] args) throws InterruptedException {

        WebDriver driver = new FirefoxDriver();

        driver.get("https://demo.nopcommerce.com/");
        driver.manage().window().maximize();

        JavascriptExecutor js= (JavascriptExecutor) driver; //type casting

        //scroll the page till end of page
        js.executeScript("window.scrollBy(0,document.body.scrollHeight)");
        System.out.println(js.executeScript("return window.pageYOffset;")); //2172
        Thread.sleep(5000);

        //scrolling up to initial position
        js.executeScript("window.scrollBy(0,-document.body.scrollHeight)");




    }
}
