package org.example.Locators;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Xpath {
    public static void main(String[] args) {
        WebDriver driver = new FirefoxDriver();
        driver.get("https://demo-opencart.com/");
        driver.manage().window().maximize();

        //xpath with single attribute
        //driver.findElement(By.xpath("//input[@placeholder='Search']")).sendKeys("Laptops");

        //with multiple attribute
        //driver.findElement(By.xpath("//input[@name='search'][@placeholder='Search']")).sendKeys("Laptops");

        //with "and" "or" operators - all the attribute should be true.
        //driver.findElement(By.xpath("//input[@name='search' and @placeholder='Search']")).sendKeys("Laptops");
        //driver.findElement(By.xpath("//input[@name='Search' or @placeholder='Search']")).sendKeys("Laptops");

        //with inner text- text()
        driver.findElement(By.xpath("//*[text()='Laptops & Notebooks']")).click();
        boolean displaystatus = driver.findElement(By.xpath("//h2[text()='Cameras']")).isDisplayed();
        System.out.println(displaystatus);
        //capture the text value of  displaystatus method
        String value = driver.findElement(By.xpath("//h2[text()='Cameras']")).getText();
        System.out.println(value);

        //with contains()
        driver.findElement(By.xpath("//input[contains(@placeholder, 'Sea')]")).sendKeys("laptops");

        //chained xpath
       boolean imagestatus = driver.findElement(By.xpath("//*[@id='logo']/a/img")).isDisplayed();
       System.out.println(imagestatus);


    }
}
