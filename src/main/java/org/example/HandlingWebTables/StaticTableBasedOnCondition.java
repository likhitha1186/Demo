package org.example.HandlingWebTables;

import jakarta.persistence.criteria.CriteriaBuilder;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import java.time.Duration;

public class StaticTableBasedOnCondition {
    public static void main(String[] args) throws InterruptedException {
        WebDriver driver = new FirefoxDriver();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));

        driver.get("https://testautomationpractice.blogspot.com/");
        driver.manage().window().maximize();

        // 1. find total number of rows in a table
        int rows = driver.findElements(By.xpath("//table[@name='BookTable']//tr")).size(); // for multiple tables in a webpage
        System.out.println("Number of rows: " + rows); //7

        // 2. find total number of columns in a table
        int columns = driver.findElements(By.xpath("//table[@name='BookTable']//th")).size();
        System.out.println("Number of columns: " + columns); //4

        // Print BookNames whose author is Amit
        for (int r = 2; r <= rows; r++) {
            String AuthorName = driver.findElement(By.xpath("//table[@name='BookTable']//tr[" + r + "]//td[2]")).getText();
            if (AuthorName.equals("Amit")) {
                String BookName = driver.findElement(By.xpath("//table[@name='BookTable']//tr[" + r + "]//td[1]")).getText();
                System.out.println(BookName);
            }
        }
        Thread.sleep(5000);
        //Print BookNames whose Subject is Java
        for (int r1 = 2; r1 <= rows; r1++) {
            String SubjectName = driver.findElement(By.xpath("//table[@name='BookTable']//tr[" + r1 + "]//td[3]")).getText();
            if (SubjectName.equals("Java") || SubjectName.equals("JAVA")) {
                String BookName1 = driver.findElement(By.xpath("//table[@name='BookTable']//tr[" + r1 + "]//td[1]")).getText();
                System.out.println(BookName1); //Learn Java ,  Master In Java
            }
        }

        //Find total price of all the Book
        int total = 0;
        for (int r2 = 2; r2 <= rows; r2++) {
            String Price = driver.findElement(By.xpath("//table[@name='BookTable']//tr[" + r2 + "]//td[4]")).getText();
            System.out.println(Price); //300 500 300 3000 2000 1000
            //getText():prints string format data
            total = total + Integer.parseInt(Price);
        }
        System.out.println("Total price of the book: " + total); //7100
/*
finding the lowest price:
capture the price and store in the arraylist then sort the element in ascending order. then capture the  1st element.
array.to.sort() method.
blazedemo.com/reserve.php
 */

    }

}

