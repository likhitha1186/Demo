package org.example;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

import java.util.Date;
import java.util.List;

public class MakeMyTripDatePicker {
    public static void main(String[] args) throws InterruptedException {

        WebDriver driver = new FirefoxDriver();
        driver.get("https://www.makemytrip.com/");
        driver.manage().window().maximize();
        Thread.sleep(2000);

        driver.findElement(By.xpath("//span[@class='commonModal__close']")).click();
        driver.findElement(By.xpath("//span[normalize-space()='Departure']")).click();

        //driver.findElement(By.xpath("//div[@aria-label='Wed Jan 15 2025']//div[@class='dateInnerCell']")).click();
        String month= "May 2025",date= "16";
        while (true){
            String  monthAndYear = driver.findElement(By.xpath("//div[@class='DayPicker-Caption']//div")).getText();
            if(monthAndYear.equals(month) ){
                break;
            }
            driver.findElement(By.xpath("//span[@aria-label='Next Month']")).click();
        }

        List<WebElement> allDates = driver.findElements(By.xpath("//div[@class='DayPicker-Body']//div//p[1]"));
        for(WebElement dt : allDates){
            if(dt.getText().equals(date)){
                dt.click();
                break;
            }

        }






    }
}
