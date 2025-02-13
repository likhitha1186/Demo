package org.example.HandlingWebTables;

import jakarta.persistence.criteria.CriteriaBuilder;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

import java.time.Duration;

public class DynamicPaginationWebTables {
    public static void main(String[] args) throws InterruptedException {
        WebDriver driver = new FirefoxDriver();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));

        driver.get("https://testautomationpractice.blogspot.com/");
        driver.manage().window().maximize();

        // find total number of rows in a table
        int rows = driver.findElements(By.xpath("//table[@id='productTable']//tr")).size(); // for multiple tables in a webpage
        System.out.println("Number of rows: " + rows); //6

        // find total number of columns in a table
        int columns = driver.findElements(By.xpath("//table[@id='productTable']//th")).size();
        System.out.println("Number of columns: " + columns); //4

        /*find the total number of pages. Showing 1 to 10 of 15049 (1505 Pages)
        String text= driver.findElement(By.xpath("//div[contains(text(),'Pages')]")).getText();
        int total_pages= Integer.parseInt(text.substring(text.indexOf("(")+1, text.indexOf("Pages")-1));
        */

        //Repeating pages
        for (int p = 1; p <= 4; p++) {
            if (p > 1) {
                WebElement active_page = driver.findElement(By.xpath("//ul[@class='pagination']//*[text()="+p+"]"));
                active_page.click();
                Thread.sleep(5000);
            }

            //read the data from specific page
            for (int r = 1; r < rows; r++) {

                String ID= driver.findElement(By.xpath("//table[@id='productTable']//tr[" + r + "]//td[1]")).getText();
                System.out.println(ID);

                String Product_Name = driver.findElement(By.xpath("//table[@id='productTable']//tr[" + r + "]//td[2]")).getText();
                System.out.println(Product_Name);

                String Price = driver.findElement(By.xpath("//table[@id='productTable']//tr[" + r + "]//td[3]")).getText();
                System.out.println(Price);

                driver.findElement(By.xpath("//tbody/tr["+r+"]/td[4]/input[1]")).click();

                System.out.println("**********************************");
                Thread.sleep(5000);




            }


        }
    }
}
