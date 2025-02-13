package org.example.HandlingWebTables;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

import java.time.Duration;
import java.util.List;

public class StaticTable {
    public static void main(String[] args) {
        WebDriver driver = new FirefoxDriver();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));

        driver.get("https://testautomationpractice.blogspot.com/");
        driver.manage().window().maximize();

        // 1. find total number of rows in a table
        int rows = driver.findElements(By.xpath("//table[@name='BookTable']//tr")).size(); // for multiple tables in a webpage
        System.out.println("Number of rows: " + rows); //7
/*
int rows= driver.findElements(By.tagName("tr")).size();
System.out.println("Number of rows: " +rows.size()); //14 [it will print the total number of rows in a web page][single table in a webpage]
 */
        // 2. find total number of columns in a table
        int columns = driver.findElements(By.xpath("//table[@name='BookTable']//th")).size();
        System.out.println("Number of columns: " + columns); //4
/*
int rows= driver.findElements(By.tagName("th")).size();
System.out.println("Number of rows: " +rows.size()); //8 [it will print the total number of columns in a web page][single table in a webpage]
 */
        // 3. Read data from specific row and column [6th row & 1st column]
        WebElement bookName = driver.findElement(By.xpath("//table[@name='BookTable']//tr[6]//td[1]"));
        System.out.println(bookName.getText()); //Master In Java
        //5th row and 3rd column
        WebElement Subject = driver.findElement(By.xpath("//table[@name='BookTable']//tr[5]//td[3]"));
        System.out.println(Subject.getText()); //Selenium

        //read data from all the rows and column
        System.out.println("BookName"+"\t"+"Author"+"\t"+"Subject"+"\t"+"Price"); // printing the header value

        for (int r = 2; r <= rows; r++)  //repeating the rows. Ignoring the 1st row bcz it contains header
        {
            for (int c = 1; c <= columns; c++)    //repeating the column in every rows
            {
                String value = driver.findElement(By.xpath("//table[@name='BookTable']//tr[" + r + "]//td[" + c + "]")).getText(); //syntax to pass dynamic value[parameter] into the xpath://tr[" + r + "]//td[" + c + "] .
                System.out.print(value+ " \t ");
            }
            System.out.println();

        }
    }


}

