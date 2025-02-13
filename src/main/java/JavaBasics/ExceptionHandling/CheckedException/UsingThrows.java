package JavaBasics.ExceptionHandling.CheckedException;

import java.io.FileInputStream;
import java.io.FileNotFoundException;

public class UsingThrows {
    public static void main(String[] args) throws InterruptedException, FileNotFoundException {
        System.out.println("program started");
        System.out.println("program in progress");

        Thread.sleep(5000);
        FileInputStream file = new FileInputStream("C:\\TEXT.txt"); //throws an error: bcz the file is not present in that location
        FileInputStream file1 = new FileInputStream("D:\\java-selenium\\Demo\\.idea\\.gitignore"); //no error: bcz file is present in that location
        System.out.println("program finished");
        System.out.println("program finished");
    }
}
