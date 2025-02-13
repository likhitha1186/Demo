package org.example.JavascriptExecutor.ScrollingPages;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class ScrollingPagesByPixelNumber {
    public static void main(String[] args) {

        WebDriver driver = new FirefoxDriver();

        driver.get("https://demo.nopcommerce.com/");
        driver.manage().window().maximize();

        JavascriptExecutor js= (JavascriptExecutor) driver; //type casting

        js.executeScript("window.scrollBy(0,2000)", "");
        System.out.println(js.executeScript("return window.pageYOffset;")); //2000




    }
}
