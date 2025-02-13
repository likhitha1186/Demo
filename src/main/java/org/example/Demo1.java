package org.example;
/*
 launch browser
 open url
 validate the title
 close browser
 */
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Demo1 {
    public static void main(String[] args) {
       // ChromeDriver driver = new ChromeDriver();
        System.setProperty("webdriver.gecko.driver","D:\\browserdrivers\\geckodriver.exe" );
        WebDriver driver=new FirefoxDriver();

        driver.get("https://google.com/");
       // driver.get("https://demo.openchart.com/");

       String act_title= driver.getTitle();
       if(act_title.equals("Google")){
           System.out.println("Test passed");
       }
       else{
           System.out.println("test Failed");
       }

     //  driver.close();
   //    driver.quit();

    }
}
