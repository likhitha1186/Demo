package JavaBasics.ExceptionHandling.UncheckedException;

import java.util.Scanner;

public class ArithmeticException {
    public static void main(String[] args) {
        System.out.println("program is Started");

        Scanner sc= new Scanner(System.in);
        System.out.println("Enter a number");
        int num= sc.nextInt();

        System.out.println(100/num); //if num=0


        System.out.println("Program is Completed");
        System.out.println("Program is exited");
    }
}
