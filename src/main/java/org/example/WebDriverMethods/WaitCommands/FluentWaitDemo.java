package org.example.WebDriverMethods.WaitCommands;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.Wait;
import org.openqa.selenium.support.ui.FluentWait;

import java.time.Duration;

public class FluentWaitDemo {
    public static void main(String[] args) {
        WebDriver driver= new FirefoxDriver();

        //declaration
        Wait<WebDriver> mywait= new FluentWait<WebDriver>(driver)
                .withTimeout(Duration.ofSeconds(30))
                .pollingEvery(Duration.ofSeconds(5))
                .ignoring(NoSuchFieldException.class);


    }
}
