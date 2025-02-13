package JavaBasics.ExceptionHandling.UncheckedException;

public class FinallyBlock3 {
    public static void main(String[] args) {
        System.out.println("Program is Started");

        String s = "null";

        try {
            System.out.println(s.length());
        } catch (Exception e) {
            System.out.println("Exception Handled by the catch() block");
            System.out.println(e.getMessage());
        } finally {
            System.out.println("You entered into finally block");
        }
        System.out.println("Program finished");

    }
}
