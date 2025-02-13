package org.example.HandlingCheckBoxes;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

import java.util.List;

public class HandleCheckBoxes {
    public static void main(String[] args) throws InterruptedException {
        WebDriver driver = new FirefoxDriver();

        driver.get("https://testautomationpractice.blogspot.com/");
        driver.manage().window().maximize();

        //1. select specific checkboxes
        // driver.findElement(By.xpath("//label[@for='sunday']")).click();

        //2. select all the checkboxes: capture all the checkbox
        List<WebElement> checkboxes = driver.findElements(By.xpath("//input[@class='form-check-input' and @type='checkbox']"));

//        for(int i=0; i<checkboxes.size();i++){
//            checkboxes.get(i).click();
//        }
//       for(WebElement checkbox : checkboxes){
//           checkbox.click();
//       }

        //3.select last 3 checkboxes: total no of checkboxes-how many checkboxes want to select= starting index. eg:7-3=4(starting index)
//      for(int i=4; i<checkboxes.size(); i++){
//          checkboxes.get(i).click();
//       }

        //4.select first 3 checkboxes:
//       for(int i=0; i<3;i++){
//          checkboxes.get(i).click();
//       }

        //5.unselect checkboxes
        for(int i=0; i<3;i++){
            checkboxes.get(i).click();
        }
        Thread.sleep(5000);
        for(int i=0; i<checkboxes.size();i++){
            if(checkboxes.get(i).isSelected()) {
                checkboxes.get(i).click();
            }
        }
    }

}

