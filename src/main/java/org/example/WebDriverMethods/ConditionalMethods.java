package org.example.WebDriverMethods;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class ConditionalMethods {
    public static void main(String[] args) {
        WebDriver driver = new FirefoxDriver();
        driver.get("https://demo.nopcommerce.com/register");
        driver.manage().window().maximize();

        //isDisplayed() - applicable for all type of element
        WebElement logo = driver.findElement(By.xpath("//img[@alt='nopCommerce demo store']"));
        System.out.println("Display status of  logo " + logo.isDisplayed()); //true

        boolean status = driver.findElement(By.xpath("//img[@alt='nopCommerce demo store']")).isDisplayed();
        System.out.println(status); //true

        //isEnabled() -  used for input boxes, drop down, radio button, check boxes as part of validation
        Boolean input = driver.findElement(By.xpath("//input[@id='FirstName']")).isEnabled();
        System.out.println(input); //true

        //isSelected() - used for drop down, radio button
        WebElement male_radio_button = driver.findElement(By.xpath("//input[@id='gender-male']"));
        WebElement female_radio_button = driver.findElement(By.xpath("//input[@id='gender-female']"));

        System.out.println("Before Selection..........");
        System.out.println(male_radio_button.isSelected()); //false
        System.out.println(female_radio_button.isSelected()); //false

        System.out.println("After Selecting male radio button..........");
        male_radio_button.click(); //select male radio button
        System.out.println(male_radio_button.isSelected()); //true
        System.out.println(female_radio_button.isSelected()); //false

        System.out.println("After Selecting female radio button..........");
        female_radio_button.click(); //select female radio button
        System.out.println(male_radio_button.isSelected()); //false
        System.out.println(female_radio_button.isSelected()); //true

       boolean  newsletter = driver.findElement(By.xpath("//input[@id='Newsletter']")).isSelected();
       System.out.println(newsletter); //true


    }
}
