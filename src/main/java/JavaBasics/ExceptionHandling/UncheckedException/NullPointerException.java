package JavaBasics.ExceptionHandling.UncheckedException;

public class NullPointerException {
    public static void main(String[] args) {
        System.out.println("program is Started");


        String s = "welcome";
        String s1 = "";
        System.out.println(s.length()); //7
        System.out.println(s1.length());//0
        String s2 = null;
        System.out.println(s2.length()); //NullPointerException:bcz null is unknown value

        System.out.println("Program is Completed");
        System.out.println("Program is exited");
    }
}
