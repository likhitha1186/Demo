package JavaBasics.ExceptionHandling.UncheckedException;

import java.util.Scanner;

public class DontKnowTheException {
    public static void main(String[] args) {
        System.out.println("program is Started");

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number");
        int num = sc.nextInt();
        try {
            System.out.println(100 / num);
        }
       catch (Exception e){
            System.out.println("Handled Exception");
            System.out.println(e.getMessage());
       }
        System.out.println("Program is Completed");
        System.out.println("Program is exited");
    }
}
