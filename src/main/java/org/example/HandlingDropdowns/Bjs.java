package org.example.HandlingDropdowns;

import org.hibernate.internal.DynamicFilterAliasGenerator;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

import java.time.Duration;
import java.util.List;

public class Bjs {
    public static void main(String[] args) throws InterruptedException {
        WebDriver driver= new FirefoxDriver();

        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));

        driver.get("http://bjs.com");
        driver.manage().window().maximize();

        driver.findElement(By.xpath("//input[@placeholder='What are you looking for today?']")).sendKeys("water");
        Thread.sleep(5000);

        List<WebElement> list =driver.findElements(By.xpath("//div[@class='list list-group']//b"));
        System.out.println(list.size());

        for(WebElement li : list){
            System.out.println(li.getText());
           if(li.getText().equals("bottled water")){
               li.click();
           }
        }

    }
}
