package JavaBasics.ExceptionHandling.UncheckedException;

import java.util.Scanner;

public class ArrayIndexOutOfBoundException extends Throwable {
    public static void main(String[] args) {
        System.out.println("program is Started");

        Scanner sc = new Scanner(System.in);

        int a[] = new int[5];

        System.out.println("Enter a position(0-4)");
        int pos = sc.nextInt();

        System.out.println("Enter a value");
        int val = sc.nextInt();

        a[pos] = val;
        System.out.println(a[pos]);
        System.out.println("Program is Completed");
        System.out.println("Program is exited");
    }
}
