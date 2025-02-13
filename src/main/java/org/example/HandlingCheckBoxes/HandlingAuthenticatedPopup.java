package org.example.HandlingCheckBoxes;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class HandlingAuthenticatedPopup {
    public static void main(String[] args) {

        WebDriver driver= new FirefoxDriver();

        //driver.get("http://the-internet.herokuapp.com/basic_auth");
        driver.get("http://admin:admin@the-internet.herokuapp.com/basic_auth");
    }
}
