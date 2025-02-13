package org.example.HandlingBrokenLinks;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;


import java.net.HttpURLConnection;
import java.net.URL;
import java.util.List;

public class BrokenLinks {
    public static void main(String[] args) {

        WebDriver driver = new FirefoxDriver();

        driver.get("http://www.deadlinkcity.com/");
        driver.manage().window().maximize();

        //1. Capture the Href attribute of every link
        List<WebElement> links = driver.findElements(By.tagName("a"));
        System.out.println("Total number of Links: " + links.size());

        int noOfBrokenLinks = 0;

        for (WebElement link : links) {

            String hrefAttributeValue = link.getAttribute("href");

            if (hrefAttributeValue == null || hrefAttributeValue.isEmpty()) {

                System.out.println("href attribute value is null or empty");
                continue; // if condition is not matching it will print not possible. also for that link it will execute next steps.

            }

            //send the href value to the server or hit url to the server
            try {
                URL linkUrl = new URL(hrefAttributeValue); // converted href value from String to URL format.
                HttpURLConnection connection = (HttpURLConnection) linkUrl.openConnection(); // open connection to the server
                connection.connect(); //connect to server and sent  request to the server

                if (connection.getResponseCode() >= 400) {
                    System.out.println(hrefAttributeValue + "---> Broken Link");
                    noOfBrokenLinks++;
                } else {
                    System.out.println(hrefAttributeValue + "---> Not a broken link");
                }
            } catch (Exception e) {

            }

        }

        System.out.println("Number of Broken Links : " + noOfBrokenLinks); //42

    }
}
