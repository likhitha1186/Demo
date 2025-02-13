package org.example.HandlingDropdowns;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.Select;

import java.time.Duration;
import java.util.List;

public class SelectDD {
    public static void main(String[] args) {

        WebDriver driver= new FirefoxDriver();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));

        driver.get("https://demo.nopcommerce.com/register?returnUrl=%2Fcomputers");
        driver.manage().window().maximize();

       WebElement dobDropdown = driver.findElement(By.xpath("//select[@name='DateOfBirthDay']"));
       Select dayDropdown= new Select(dobDropdown);

       dayDropdown.selectByValue("1");

       List<WebElement> count= dayDropdown.getOptions();
       System.out.println(count.size());

       for(WebElement cnt: count){
           System.out.println(cnt.getText());
       }
    }
}
