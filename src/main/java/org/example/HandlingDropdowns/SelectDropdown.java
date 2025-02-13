package org.example.HandlingDropdowns;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.Select;

import java.time.Duration;
import java.util.List;

public class SelectDropdown {
    public static void main(String[] args) {
        WebDriver driver = new FirefoxDriver();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));

        driver.get("https://testautomationpractice.blogspot.com/");
        driver.manage().window().maximize();

        //capture the dropdown element
        WebElement dropCountryElement = driver.findElement(By.xpath("//select[@id='country']"));
        Select dropCountry = new Select(dropCountryElement); //select class object

        //select the option from the dropdown
        //1. selectByVisibleText()
        //dropCountry.selectByVisibleText("Germany");

        //2. selectByValue(): value is attribute of an element
        //dropCountry.selectByValue("germany");

        //3. selectByIndex(): index start from 0
         dropCountry.selectByIndex(2);

        //capture all the option from the dropdown
        List<WebElement> options =dropCountry.getOptions();
        System.out.println("Number of options in a dropdown: "+options.size());

        //Printing the options
//        for(int i=0; i<options.size(); i++){
//            System.out.println(options.get(i).getText());
//        }
        for(WebElement op: options){
            System.out.println(op.getText());
        }


    }
}
