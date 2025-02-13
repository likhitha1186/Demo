package org.example.HandlingDatePickers;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

import java.time.Duration;
import java.util.List;

public class DatePickers {
    public static void main(String[] args) {

        WebDriver driver = new FirefoxDriver();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));

        driver.get("https://jqueryui.com/datepicker/");
        driver.manage().window().maximize();

        //switch to the frame
        driver.switchTo().frame(0);

        //Method1: using sendKeys
        // driver.findElement(By.xpath("//input[@id='datepicker']")).sendKeys("01/13/2025"); //mm/dd/yyyy

        //Method2: using DatePicker
        String year = "2027", month = "May", date = "1";

        driver.findElement(By.xpath("//input[@id='datepicker']")).click(); //opens the date picker

        //select month and year
        while (true) {
            String current_month = driver.findElement(By.xpath("//span[@class='ui-datepicker-month']")).getText(); //actual month
            //System.out.println(current_month);
            String current_year = driver.findElement(By.xpath("//span[@class='ui-datepicker-year']")).getText();

            if (current_month.equals(month) && current_year.equals(year)) {
                break;
            }
            driver.findElement(By.xpath("//span[@class='ui-icon ui-icon-circle-triangle-e']")).click(); //next month and year
            //driver.findElement(By.xpath("//span[@class='ui-icon ui-icon-circle-triangle-w']")).click(); // previous month and year
        }

        //select the date from the datepicker
        List<WebElement> all_dates = driver.findElements(By.xpath("//table[@class='ui-datepicker-calendar']//tbody//tr//td//a"));
        for(WebElement dt: all_dates){
           if (dt.getText().equals(date)){
               dt.click();
               break;
           }

        }


    }
}
