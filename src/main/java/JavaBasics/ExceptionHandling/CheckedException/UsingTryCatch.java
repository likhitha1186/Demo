package JavaBasics.ExceptionHandling.CheckedException;

public class UsingTryCatch {
    public static void main(String[] args)   {
        System.out.println("program started");
        System.out.println("program in progress");

        try{
            Thread.sleep(5000);
        }
        catch(InterruptedException e){
            System.out.println("Exception handled");
            System.out.println(e.getMessage());
        }

        System.out.println("program finished");
        System.out.println("program finished");
    }
}
