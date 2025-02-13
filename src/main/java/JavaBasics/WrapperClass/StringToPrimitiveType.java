package JavaBasics.WrapperClass;

public class StringToPrimitiveType {
    public static void main(String[] args) {
        //String -> int
        //String s="welcome"; cannot convert to int.
        String s="123456";
        int i=Integer.parseInt(s);
        System.out.println(i);
        String s1="10", s2="20";
        System.out.println(Integer.parseInt(s1)+Integer.parseInt(s2));

        System.out.println("***************************");

        //String -> double
        String a="325.64";
        double d= Double.parseDouble(a);
        System.out.println(d);
        String d1="10.2",d2="12.8";
        System.out.println(Double.parseDouble(d1)+Double.parseDouble(d2));

        System.out.println("********************************");

        //String -> boolean
        String x= "true", y="welcome"; //other than true, if u pass any string that will return false.
        Boolean b= Boolean.parseBoolean(x);
        Boolean b2= Boolean.parseBoolean(y);
        System.out.println(b);
        System.out.println(b2);

        System.out.println("********************************");


    }
}
