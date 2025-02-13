package org.example.HandlingDropdowns;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

import java.time.Duration;
import java.util.List;

public class HiddenDropdown {
    public static void main(String[] args) throws InterruptedException {
        WebDriver driver = new FirefoxDriver();

        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));

        driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
        driver.manage().window().maximize();

        driver.findElement(By.name("username")).sendKeys("Admin");
        driver.findElement(By.name("password")).sendKeys("admin123");
        driver.findElement(By.xpath("//button[normalize-space()='Login']")).click();

        //clicking on PIM
        driver.findElement(By.xpath("//a[normalize-space()='PIM']")).click();

        //clicked on dropdown
        driver.findElement(By.xpath("//div[6]//div[1]//div[2]//div[1]//div[1]//div[1]")).click();
        Thread.sleep(8000);
        //select single option
        //driver.findElement(By.xpath("//span[normalize-space()='Chief Executive Officer']")).click();

        //count number of options
       List<WebElement> options =  driver.findElements(By.xpath("//div[@role='listbox']//span"));
       System.out.println("List of element:"+ options.size()); //28

       //printing options
        for(WebElement op: options){
            System.out.println(op.getText());
        }


    }
}
