package org.example.JavascriptExecutor;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;

import javax.swing.*;

public class SliderAction {
    public static void main(String[] args) {

        WebDriver driver = new FirefoxDriver();

        driver.get(" https://www.jqueryscript.net/demo/Price-Range-Slider-jQuery-UI/");
        driver.manage().window().maximize();

        Actions act = new Actions(driver);

        //minimum slider
        WebElement min_slider = driver.findElement(By.xpath("//div[@id='slider-range']//span[1]")); //minimum slider(starting point of slider)
        System.out.println("Default location of the min slider : " + min_slider.getLocation()); //(59,292)(x,y)
        System.out.println(min_slider.getLocation().getX()); //59 x-axis point
        System.out.println(min_slider.getLocation().getY()); //292 y-axis point
        //increase the value of min_slider
        //act.dragAndDropBy(min_slider, 200, 292).perform();
       //System.out.println("Location of the min slider after moving : " + min_slider.getLocation()); //(257, 292)

        //maximum slider
        WebElement max_slider = driver.findElement(By.xpath("//div[@id='slider-range']//span[2]")); //maximum slider(ending point of slider)
        System.out.println("Default location of the max slider : " + max_slider.getLocation()); //(766, 287)
        System.out.println(max_slider.getLocation().getX()); // 766
        System.out.println(max_slider.getLocation().getY()); // 287
        //increase the value of max_slider
        act.dragAndDropBy(max_slider, -200, 287).perform();
        System.out.println("Location of the max slider after moving : " + max_slider.getLocation()); //(568, 256)




    }
}
