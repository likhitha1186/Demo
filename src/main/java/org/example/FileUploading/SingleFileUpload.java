package org.example.FileUploading;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class SingleFileUpload {

    public static void main(String[] args) {

        WebDriver driver = new FirefoxDriver();

        driver.get("https://davidwalsh.name/demo/multiple-file-upload.php");
        driver.manage().window().maximize();

        //file name: .gitignore
        driver.findElement(By.xpath("//input[@id='filesToUpload']")).sendKeys("D:\\ddt\\autom8able-mochajs-starter\\.gitignore");

        if(driver.findElement(By.xpath("//ul[@id=\"fileList\"]//li")).getText().equals(".gitignore")){
            System.out.println("File is successfully uploaded");
        }
        else {
            System.out.println("upload failed");
        }

    }
}
