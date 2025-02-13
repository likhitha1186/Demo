package org.example.HandlingDropdowns;


import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

import java.time.Duration;
import java.util.List;

public class BootstrapDropdown {
    public static void main(String[] args) {

        WebDriver driver = new FirefoxDriver();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));

        driver.get("https://www.jquery-az.com/boots/demo.php?ex=63.0_2");
        driver.manage().window().maximize();

        //opens dropdown options
        driver.findElement(By.xpath("//button[contains(@class,'multiselect')]")).click(); //opens dropdown options

        //select single options
        //driver.findElement(By.xpath("//input[@value='HTML']")).click();

        //capture all the options
        List<WebElement> labels =driver.findElements(By.xpath("//ul[contains(@class,'multiselect')]//label"));
        System.out.println(labels.size());

        //printing options from the dropdown
        for(WebElement label : labels){
            System.out.println(label.getText());
        }

        //Select multiple options
        for(WebElement label : labels){
          {
               String option = label.getText();
              if(label.getText().equals("CSS") || label.getText().equals("Java")){
                  label.click();
              }
              if (label.getText().equals("Java")) {
                  label.click();
              }
           }


        }



    }
}
