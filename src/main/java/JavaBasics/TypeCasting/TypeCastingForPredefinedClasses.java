package JavaBasics.TypeCasting;

//A b=(C) d; Syntax for typecasting

public class TypeCastingForPredefinedClasses {
    public static void main(String[] args) {
       /*
        Object o = new String("welcome");
        StringBuffer sb = (StringBuffer) o; //StringBuffer:predefined class available in java.valid as per Rule1&2.Rule3 failed.Bcz there is no relation btw String & StringBuffer

        String s= new String("Hello");
        StringBuffer sb1=(StringBuffer) s; //Rule1 failed


        Object o1 = new String("Welcome");
        StringBuffer sb2 = (StringBuffer) o1; //valid as per Rule1&2. Rule3 failed.Bcz there is no relation btw String & StringBuffer


        Object o2=new String("welcome");
        StringBuffer sb3= (String) 02; //valid as per Rule1. Rule2 failed.


        String s1= new String("welcome");
        StringBuffer sb4=(String) s1; //Rule1 passed. Rule2 failed. bcz after conversion of String we are storing it in StringBuffer.

        Object o3= new String("welcome");
        StringBuffer sb5= (StringBuffer) o3;//valid as per Rule1&2.Rule3 failed.Bcz there is no relation btw String & StringBuffer
       */

        Object o4 = new String("welcome");
        String s2 = (String) o4; //valid as per Rule1,2&3.
        System.out.println(s2);


    }
}
