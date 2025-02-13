package org.example;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

import java.time.Duration;
import java.util.List;

public class MakeMyTrip {
    public static void main(String[] args) throws InterruptedException {

        WebDriver driver = new FirefoxDriver();

        // driver.get("https://www.makemytrip.com/flight/search?itinerary=DEL-BLR-16/01/2025&tripType=O&paxType=A-1_C-0_I-0&intl=false&cabinClass=E&ccde=IN&lang=eng");
        driver.get("https://www.makemytrip.com/");
        driver.manage().window().maximize();
        Thread.sleep(2000);
        //String year="2025", month="January", Date="15";

       /* driver.findElement(By.xpath("//header[@id='widgetHeader']//div[5]")).click();

        driver.findElement(By.xpath("//div[@aria-label='Wednesday, 15 January 2025']//p[contains(text(),'15')]")).click();
        Thread.sleep(5000);

        driver.findElement(By.xpath("//header[@id='widgetHeader']//div[6]")).click();

        driver.findElement(By.xpath(" //div[@aria-label='Sunday, 19 January 2025']//p[contains(text(),'19')]")).click();
        Thread.sleep(5000);
        */

        driver.findElement(By.xpath("//span[@class='commonModal__close']")).click();
        driver.findElement(By.xpath("//span[normalize-space()='Departure']")).click();
        // driver.findElement(By.xpath("//span[contains(text(),'Departure')]")).click();
        // driver.findElement(By.xpath("//span[contains(text(),'Depart')]")).click();

        driver.findElement(By.xpath("//div[@aria-label='Wed Jan 15 2025']//div[@class='dateInnerCell']")).click();

    }
}
