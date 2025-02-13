package org.example.JavascriptExecutor.ScrollingPages;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class ScrollingPagesBasedOnCondition {
    public static void main(String[] args) {

        WebDriver driver = new FirefoxDriver();

        driver.get("https://demo.nopcommerce.com/");
        driver.manage().window().maximize();

        JavascriptExecutor js= (JavascriptExecutor) driver; //type casting

        //scroll the page till element is displayed/visible
        //1. capture which elements you are looking for
        WebElement element = driver.findElement(By.xpath("//strong[normalize-space()='News']"));
        js.executeScript("arguments[0].scrollIntoView();", element);
        System.out.println(js.executeScript("return window.pageYOffset;")); //1511




    }
}
