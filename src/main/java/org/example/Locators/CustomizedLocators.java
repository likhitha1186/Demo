package org.example.Locators;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class CustomizedLocators {

    public static void main(String[] args) {
        WebDriver driver = new FirefoxDriver();
        driver.get("https://demo.nopcommerce.com/");
        driver.manage().window().maximize();

        //tag id tag#id
        driver.findElement(By.cssSelector("input#small-searchterms")).sendKeys("T-shirt");//tag and id
        //driver.findElement(By.cssSelector("#small-searchterms")).sendKeys("Shirt"); //without tag

        // tag class tag.classname
        driver.findElement(By.cssSelector("input.search-box-text")).sendKeys("T-shirt");
        //driver.findElement(By.cssSelector(".search-box-text")).sendKeys("Shirt");

        //tag attribute tag[attribute="value"]
        driver.findElement(By.cssSelector("input[placeholder='Search store']")).sendKeys("T-shirts");
        //driver.findElement(By.cssSelector("[placeholder='Search store']")).sendKeys("T-Shirts");

        //tag class attribute tag.classname[attribute="value"]- to differentiate the web elements
        driver.findElement(By.cssSelector("input.search-box-text[name='q']")).sendKeys("T-Shirts");


    }
}
