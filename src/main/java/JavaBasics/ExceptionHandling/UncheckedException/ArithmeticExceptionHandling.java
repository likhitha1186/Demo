package JavaBasics.ExceptionHandling.UncheckedException;


import java.util.Scanner;

public class ArithmeticExceptionHandling {
    public static void main(String[] args) {
        System.out.println("program is Started");

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number");
        int num = sc.nextInt();
        try {
            System.out.println(100 / num); //ArithmeticException: if num=0
        } catch (java.lang.ArithmeticException e) {
            System.out.println("Invalid data");

        }

        System.out.println("Program is Completed");
        System.out.println("Program is exited");
    }
}
