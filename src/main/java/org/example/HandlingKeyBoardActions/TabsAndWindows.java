package org.example.HandlingKeyBoardActions;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WindowType;
import org.openqa.selenium.firefox.FirefoxDriver;

public class TabsAndWindows {
    public static void main(String[] args) {

        WebDriver driver = new FirefoxDriver();

        /*
        driver.get("https://www.opencart.com/");
        driver.manage().window().maximize();
        driver.get("https://orangehrm.com/");
         */

        driver.get("https://www.opencart.com/");
        driver.manage().window().maximize();
        driver.switchTo().newWindow(WindowType.TAB); //opens a new tab
        driver.get("https://orangehrm.com/");

        driver.switchTo().newWindow(WindowType.WINDOW); //opens a new browser
        driver.get("https://www.opencart.com/");






    }
}
