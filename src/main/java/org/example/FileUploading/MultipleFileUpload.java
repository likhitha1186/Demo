package org.example.FileUploading;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import java.util.stream.StreamSupport;

public class MultipleFileUpload {

    public static void main(String[] args) {

        WebDriver driver = new FirefoxDriver();

        driver.get("https://davidwalsh.name/demo/multiple-file-upload.php");
        driver.manage().window().maximize();

        //multiple file
        String file1 = "D:\\ddt\\autom8able-mochajs-starter\\.gitignore", file2 = "D:\\ddt\\autom8able-mochajs-starter\\node_modules\\@types\\cookiejar\\LICENSE";

        driver.findElement(By.xpath("//input[@id='filesToUpload']")).sendKeys(file1 + "\n" + file2);

        int filesCount = driver.findElements(By.xpath("//ul[@id=\"fileList\"]//li")).size();

        //validation 1- Number of files
        if (filesCount == 2) {
            System.out.println("File is successfully uploaded");
        }
        else {
            System.out.println("upload failed");
        }

        //validation 2- file names
       if(driver.findElement(By.xpath("//ul[@id='fileList']//li[1]")).getText().equals(".gitignore") &&
               driver.findElement(By.xpath("//ul[@id='fileList']//li[2]")).getText().equals("LICENSE")){
           System.out.println("File names are matching");
       }
       else {
           System.out.println("File names are not matching");
       }



    }
}
