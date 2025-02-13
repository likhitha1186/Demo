package JavaBasics.ExceptionHandling.UncheckedException;

public class NumberFormatException {
    public static void main(String[] args) {
        System.out.println("program is Started");

        String s = "12345";
        int i = Integer.parseInt(s);
        System.out.println(i);

        String s1 = "welcome"; //NumberFormatException:bcz we have to pass only numbers.
        int i1 = Integer.parseInt(s1);
        System.out.println(i1);


        System.out.println("Program is Completed");
        System.out.println("Program is exited");
    }
}


