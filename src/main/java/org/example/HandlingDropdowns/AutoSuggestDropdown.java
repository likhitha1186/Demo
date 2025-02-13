package org.example.HandlingDropdowns;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

import java.time.Duration;
import java.util.List;

public class AutoSuggestDropdown {
    public static void main(String[] args) throws InterruptedException {
        WebDriver driver = new FirefoxDriver();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));

        driver.get("https://www.google.com/");
        driver.manage().window().maximize();

        driver.findElement(By.name("q")).sendKeys("automation testing"); //search box
        Thread.sleep(5000);

        List<WebElement> options = driver.findElements(By.xpath("//ul[@role='listbox']//li//div[@role='option']"));
        System.out.println(options.size()); //10
        Thread.sleep(5000);

        for (WebElement op : options) {
            System.out.println(op.getText());
            Thread.sleep(5000);
            if (op.getText().equals("automation testing interview questions")) {
                op.click();
            }
        }


    }
}
