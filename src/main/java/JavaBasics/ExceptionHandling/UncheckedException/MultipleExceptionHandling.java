package JavaBasics.ExceptionHandling.UncheckedException;

import java.util.Scanner;

public class MultipleExceptionHandling {
    public static void main(String[] args) {
        System.out.println("program is Started");

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number");
        int num = sc.nextInt();
        try {
            System.out.println(100 / num); //ArithmeticException: if num=0
        }
        catch (java.lang.NumberFormatException e){
          System.out.println("Handled Exception");
          System.out.println(e.getMessage());
        }
        catch(java.lang.NullPointerException e) {
            System.out.println("Handled Exception");
            System.out.println(e.getMessage());
        }
        catch (java.lang.ArithmeticException e) {
            System.out.println("Handled Exception");
            System.out.println(e.getMessage());
        }
        System.out.println("Program is Completed");
        System.out.println("Program is exited");
    }
}
